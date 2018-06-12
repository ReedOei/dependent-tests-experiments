/*
 * Copyright  1999-2004 The Apache Software Foundation.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.apache.xml.security.samples.algorithms;



import java.io.File;
import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.xml.security.algorithms.SignatureAlgorithm;
import org.apache.xml.security.utils.Base64;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Document;


/**
 *
 * @author $Author: blautenb $
 */
public class HMacSHA1RoundTrip {

   /**
    * Method main
    *
    * @param unused
    * @throws Exception
    */
   public static void main(String unused[]) throws Exception {
      //J-
      String keystoreType = "JKS";
      String keystoreFile = "data/org/apache/xml/security/samples/input/keystore.jks";
      String keystorePass = "xmlsecurity";
      String privateKeyAlias = "test";
      String privateKeyPass = "xmlsecurity";
      String certificateAlias = "test";
      File signatureFile = new File("signature.xml");
      //J+
      KeyStore ks = KeyStore.getInstance(keystoreType);
      FileInputStream fis = new FileInputStream(keystoreFile);

      ks.load(fis, keystorePass.toCharArray());

      PrivateKey privateKey = (PrivateKey) ks.getKey(privateKeyAlias,
                                 privateKeyPass.toCharArray());
      X509Certificate cert =
         (X509Certificate) ks.getCertificate(certificateAlias);
      PublicKey publicKey = cert.getPublicKey();
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

      dbf.setNamespaceAware(true);

      DocumentBuilder db = dbf.newDocumentBuilder();
      Document doc = db.newDocument();

      // SignatureAlgorithm sa = SignatureAlgorithm.getInstance(doc, XMLSignature.ALGO_ID_SIGNATURE_DSA, 120);
      SignatureAlgorithm sa = new SignatureAlgorithm(doc,
                                 "http://www.w3.org/2000/09/xmldsig#dsa-sha1");

      sa.initSign(privateKey);
      sa.update("sdjhfkjashkjf".getBytes());

      byte signatureValue[] = sa.sign();

      System.out.println(Base64.encode(signatureValue));
      doc.appendChild(sa.getElement());
      XMLUtils.outputDOM(doc, System.out);
      System.out.println("");
      System.out.println("");

      SignatureAlgorithm verifyer =
         new SignatureAlgorithm(doc.getDocumentElement(), "file:");

      verifyer.initVerify(publicKey);
      verifyer.update("sdjhfkjashkjf".getBytes());

      boolean result = verifyer.verify(signatureValue);

      if (result) {
         System.out.println("It verified");
      } else {
         System.out.println("It failed");
      }
   }

   /**
    * Method mainSha1
    *
    * @param unused
    * @throws Exception
    */
   public static void mainSha1(String unused[]) throws Exception {

      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

      dbf.setNamespaceAware(true);

      DocumentBuilder db = dbf.newDocumentBuilder();
      Document doc = db.newDocument();

      // SignatureAlgorithm sa = SignatureAlgorithm.getInstance(doc, XMLSignature.ALGO_ID_SIGNATURE_DSA, 120);
      SignatureAlgorithm sa = new SignatureAlgorithm(doc,
                                 "http://www.w3.org/2000/09/xmldsig#hmac-sha1",
                                 33);

      // SecretKeyFactory skf = SecretKeyFactory.getInstance(sa.getJCEAlgorithmString(), sa.getJCEProviderName());
      byte keybytes[] = "01234567890123456789".getBytes();
      SecretKey sk = new SecretKeySpec(keybytes, sa.getJCEAlgorithmString());

      sa.initSign(sk);
      sa.update("sdjhfkjashkjf".getBytes());

      byte signatureValue[] = sa.sign();

      System.out.println(Base64.encode(signatureValue));
      doc.appendChild(sa.getElement());
      XMLUtils.outputDOM(doc, System.out);
      System.out.println("");
      System.out.println("");

      javax.crypto.Mac a;
      SignatureAlgorithm verifyer =
         new SignatureAlgorithm(doc.getDocumentElement(), "file:");
      SecretKey pk = new SecretKeySpec("01234567890123456789".getBytes(),
                                       verifyer.getJCEAlgorithmString());

      verifyer.initVerify(pk);
      verifyer.update("sdjhfkjashkjf".getBytes());

      boolean result = verifyer.verify(signatureValue);

      if (result) {
         System.out.println("It verified");
      } else {
         System.out.println("It failed");
      }
   }

   static {
      org.apache.xml.security.Init.init();
   }
}
