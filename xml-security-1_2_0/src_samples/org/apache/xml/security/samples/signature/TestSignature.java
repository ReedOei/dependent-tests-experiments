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
package org.apache.xml.security.samples.signature;



import java.io.File;
import java.security.PublicKey;
import java.security.cert.X509Certificate;

import org.apache.xml.security.keys.KeyInfo;
import org.apache.xml.security.keys.storage.StorageResolver;
import org.apache.xml.security.samples.utils.resolver.OfflineResolver;
import org.apache.xml.security.signature.XMLSignature;
import org.apache.xml.security.utils.Constants;
import org.apache.xml.security.utils.XMLUtils;
import org.apache.xpath.XPathAPI;
import org.w3c.dom.Element;


/**
 * Class TestSignature
 *
 * @author $Author: blautenb $
 * @version $Revision: 1.5 $
 */
public class TestSignature {

   /**
    * Method main
    *
    * @param unused
    */
   public static void main(String unused[]) {

      javax.xml.parsers.DocumentBuilderFactory dbf =
         javax.xml.parsers.DocumentBuilderFactory.newInstance();

      dbf.setNamespaceAware(true);

      //J-
      String merlinsDir =
         "data/ie/baltimore/merlin-examples/merlin-xmldsig-eighteen/";
      String ourDir =
         "data/org/apache/xml/security/temp/key/";
      String filenames[] = { merlinsDir +
                             /* 0 */ "signature-keyname.xml",
                             merlinsDir +
                             /* 1 */ "signature-retrievalmethod-rawx509crt.xml",
                             merlinsDir +
                             /* 2 */ "signature-x509-crt-crl.xml",
                             merlinsDir +
                             /* 3 */ "signature-x509-crt.xml",
                             merlinsDir +
                             /* 4 */ "signature-x509-is.xml",
                             merlinsDir +
                             /* 5 */ "signature-x509-ski.xml",
                             merlinsDir +
                             /* 6 */ "signature-x509-sn.xml",
                             ourDir +
                             /* 7 */ "signature-retrievalmethod-x509data.xml"
                             };
      //J+
      int start = 0;
      int end = filenames.length;

      // int end = filenames.length;
      for (int file_to_verify = start; file_to_verify < end; file_to_verify++) {
         try {
            String filename = filenames[file_to_verify];
            File f = new File(filename);

            System.out.println("");
            System.out.println(
               "#########################################################");
            System.out.println("Try to verify " + f.toURL().toString());

            javax.xml.parsers.DocumentBuilder db = dbf.newDocumentBuilder();
            org.w3c.dom.Document doc =
               db.parse(new java.io.FileInputStream(filename));

            //create a namespace context for use in the XPath expression below
            Element nscontext = XMLUtils.createDSctx(doc, "ds",
                                                     Constants.SignatureSpecNS);

            //retrieve the signature Element from the document
            Element sigElement = (Element) XPathAPI.selectSingleNode(doc,
                                    "//ds:Signature[1]", nscontext);

            //Creates a XMLSignature from the element and uses the filename as
            //the baseURI. That URI is prepended to all relative URIs.
            XMLSignature signature =
               new XMLSignature(sigElement,
                                (new File(filename)).toURL().toString());

            signature.addResourceResolver(new OfflineResolver());

            //Get the KeyInfo object, which might contain some clues as to what
            //key was used to create the signature. It might also contain the
            //full cert.
            KeyInfo ki = signature.getKeyInfo();

            ki.addStorageResolver(new StorageResolver(new org.apache.xml
               .security.keys.storage.implementations
               .CertsInFilesystemDirectoryResolver(merlinsDir + "certs")));

            if (ki != null) {

               //First try to see if it is an X509Cert
               X509Certificate cert =
                  signature.getKeyInfo().getX509Certificate();

               if (cert != null) {

                  //check if the signature is valid using the cert
                  System.out.println("Check: "
                                     + signature.checkSignatureValue(cert));
               } else {

                  //Maybe it's a public key
                  PublicKey pk = signature.getKeyInfo().getPublicKey();

                  if (pk != null) {

                     //check if the signature is valid using the public key
                     System.out.println("Check: "
                                        + signature.checkSignatureValue(pk));
                  } else {

                     //No X509Cert or PublicKey could be found.
                     System.out
                        .println("Could not find Certificate or PublicKey");
                  }
               }
            } else {

               //If the signature did not contain any KeyInfo element
               System.out.println("Could not find ds:KeyInfo");
            }
         } catch (Exception ex) {
            ex.printStackTrace();
         }
      }
   }
}
