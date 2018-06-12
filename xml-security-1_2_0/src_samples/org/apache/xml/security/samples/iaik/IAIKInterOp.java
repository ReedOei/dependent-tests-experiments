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
package org.apache.xml.security.samples.iaik;



import java.io.File;
import java.security.PublicKey;
import java.security.cert.X509Certificate;

import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.xml.security.keys.KeyInfo;
import org.apache.xml.security.signature.XMLSignature;
import org.apache.xml.security.utils.Constants;
import org.apache.xml.security.utils.XMLUtils;
import org.apache.xml.security.utils.resolver.ResourceResolverSpi;
import org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous;
import org.apache.xpath.XPathAPI;
import org.w3c.dom.Element;


/**
 *
 * @author $Author: blautenb $
 */
public class IAIKInterOp {

   /** {@link org.apache.commons.logging} logging facility */
    static org.apache.commons.logging.Log log = 
        org.apache.commons.logging.LogFactory.getLog(IAIKInterOp.class.getName());

   /** Field schemaValidate */
   static final boolean schemaValidate = false;

   /** Field signatureSchemaFile */
   static final String signatureSchemaFile = "data/xmldsig-core-schema.xsd";

   /**
    * Method main
    *
    * @param unused
    */
   public static void main(String unused[]) {

      if (schemaValidate) {
         System.out.println("We do schema-validation");
      } else {
         System.out.println("We do not schema-validation");
      }

      javax.xml.parsers.DocumentBuilderFactory dbf =
         javax.xml.parsers.DocumentBuilderFactory.newInstance();

      if (IAIKInterOp.schemaValidate) {
         dbf.setAttribute("http://apache.org/xml/features/validation/schema",
                          Boolean.TRUE);
         dbf.setAttribute(
            "http://apache.org/xml/features/dom/defer-node-expansion",
            Boolean.TRUE);
         dbf.setValidating(true);
         dbf.setAttribute("http://xml.org/sax/features/validation",
                          Boolean.TRUE);
         dbf.setAttribute(
            "http://apache.org/xml/properties/schema/external-schemaLocation",
            Constants.SignatureSpecNS + " " + IAIKInterOp.signatureSchemaFile);
      }

      dbf.setNamespaceAware(true);
      dbf.setAttribute("http://xml.org/sax/features/namespaces", Boolean.TRUE);

      //J-
      String gregorsDir =
         "data/at/iaik/ixsil/";
      String filenames[] = {
                              gregorsDir + "signatureAlgorithms/signatures/hMACSignature.xml"
                             ,gregorsDir + "signatureAlgorithms/signatures/hMACShortSignature.xml"
                             ,gregorsDir + "signatureAlgorithms/signatures/dSASignature.xml"
                             ,gregorsDir + "signatureAlgorithms/signatures/rSASignature.xml"
                             ,gregorsDir + "transforms/signatures/base64DecodeSignature.xml"
                             ,gregorsDir + "transforms/signatures/c14nSignature.xml"
                             ,gregorsDir + "coreFeatures/signatures/manifestSignature.xml"
                             ,gregorsDir + "transforms/signatures/xPathSignature.xml"
                             ,gregorsDir + "coreFeatures/signatures/signatureTypesSignature.xml"
                             ,gregorsDir + "transforms/signatures/envelopedSignatureSignature.xml"
                             };
      //J+
      verifyAnonymous(gregorsDir, dbf);

      for (int i = 0; i < 2; i++) {
         String signatureFileName = filenames[i];

         try {
            org.apache.xml.security.samples.signature
               .VerifyMerlinsExamplesFifteen.verifyHMAC(dbf, signatureFileName);
         } catch (Exception ex) {
            System.out.println("The XML signature in file "
                               + signatureFileName + " crashed the application (bad)");
            ex.printStackTrace();
            System.out.println();
         }
      }

      for (int i = 2; i < filenames.length; i++) {
         String signatureFileName = filenames[i];

         try {
            org.apache.xml.security.samples.signature
               .VerifyMerlinsExamplesSixteen.verify(dbf, signatureFileName);
         } catch (Exception ex) {
            System.out.println("The XML signature in file "
                               + signatureFileName + " crashed the application (bad)");
            ex.printStackTrace();
            System.out.println();
         }
      }

      for (int i = 2; i < filenames.length; i++) {
         String signatureFileName = filenames[i];

         try {
            org.apache.xml.security.samples.signature
               .VerifyMerlinsExamplesTwentyThree.verify(dbf, signatureFileName);
         } catch (Exception ex) {
            System.out.println("The XML signature in file "
                               + signatureFileName + " crashed the application (bad)");
            ex.printStackTrace();
            System.out.println();
         }
      }
   }

   public static void verifyAnonymous(String gregorsDir, DocumentBuilderFactory dbf) {
         String filename =
            gregorsDir
            + "coreFeatures/signatures/anonymousReferenceSignature.xml";
      try {
         String anonymousRef =
            gregorsDir + "coreFeatures/samples/anonymousReferenceContent.xml";
         ResourceResolverSpi resolver = new ResolverAnonymous(anonymousRef);
         File f = new File(filename);

         System.out.println("Try to verify " + f.toURL().toString());

         javax.xml.parsers.DocumentBuilder db = dbf.newDocumentBuilder();
         org.w3c.dom.Document doc = db.parse(new java.io.FileInputStream(f));
         Element nscontext = XMLUtils.createDSctx(doc, "ds",
                                                  Constants.SignatureSpecNS);
         Element sigElement = (Element) XPathAPI.selectSingleNode(doc,
                                 "//ds:Signature[1]", nscontext);
         XMLSignature signature = new XMLSignature(sigElement,
                                                   f.toURL().toString());

         signature.setFollowNestedManifests(false);
         signature.addResourceResolver(resolver);

         KeyInfo ki = signature.getKeyInfo();

         if (ki != null) {
            X509Certificate cert = signature.getKeyInfo().getX509Certificate();

            if (cert != null) {
               System.out.println("The XML signature in file "
                                  + f.toURL().toString() + " is "
                                  + (signature.checkSignatureValue(cert)
                                     ? "valid (good)"
                                     : "invalid !!!!! (bad)"));
            } else {
               PublicKey pk = signature.getKeyInfo().getPublicKey();

               if (pk != null) {
                  System.out.println("The XML signature in file "
                                     + f.toURL().toString() + " is "
                                     + (signature.checkSignatureValue(pk)
                                        ? "valid (good)"
                                        : "invalid !!!!! (bad)"));
               } else {
                  System.out.println(
                     "Did not find a public key, so I can't check the signature");
               }
            }
         } else {
            System.out.println("Did not find a KeyInfo");
         }
      } catch (Exception ex) {
            System.out.println("The XML signature in file "
                               + filename + " crashed the application (bad)");
            ex.printStackTrace();
            System.out.println();
      }
   }

   static {
      org.apache.xml.security.Init.init();
   }
}
