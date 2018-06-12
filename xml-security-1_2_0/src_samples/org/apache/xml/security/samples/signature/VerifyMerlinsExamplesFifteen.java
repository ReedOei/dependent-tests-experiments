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
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.xml.security.signature.XMLSignature;
import org.apache.xml.security.utils.Constants;
import org.apache.xml.security.utils.XMLUtils;
import org.apache.xpath.XPathAPI;
import org.w3c.dom.Element;


/**
 *
 * @author $Author: blautenb $
 */
public class VerifyMerlinsExamplesFifteen {

   /** {@link org.apache.commons.logging} logging facility */
    static org.apache.commons.logging.Log log = 
        org.apache.commons.logging.LogFactory.getLog(
                        VerifyMerlinsExamplesFifteen.class.getName());

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

      if (VerifyMerlinsExamplesSixteen.schemaValidate) {
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
            Constants.SignatureSpecNS + " "
            + VerifyMerlinsExamplesSixteen.signatureSchemaFile);
      }

      dbf.setNamespaceAware(true);
      dbf.setAttribute("http://xml.org/sax/features/namespaces", Boolean.TRUE);

      //J-
      String merlinsDir =
         "data/ie/baltimore/merlin-examples/merlin-xmldsig-fifteen/";
      String filenames[] = { merlinsDir + "signature-enveloping-hmac-sha1.xml",
                             merlinsDir + "signature-enveloping-hmac-sha1-40.xml",
                             merlinsDir + "signature-enveloped-dsa.xml",
                             merlinsDir + "signature-enveloping-b64-dsa.xml",
                             merlinsDir + "signature-enveloping-dsa.xml",
                             merlinsDir + "signature-enveloping-rsa.xml",
                             merlinsDir + "signature-external-b64-dsa.xml",
                             merlinsDir + "signature-external-dsa.xml"
                             };
      //J+
      int start = 0;
      // int end = filenames.length;
      int end = 2;

      for (int i = start; i < 2; i++) {
         String signatureFileName = filenames[i];

         try {
            verifyHMAC(dbf, signatureFileName);
         } catch (Exception ex) {
            ex.printStackTrace();
         }
      }

      for (int i = 2; i < filenames.length; i++) {
         String signatureFileName = filenames[i];

         try {
            VerifyMerlinsExamplesSixteen.verify(dbf, signatureFileName);
         } catch (Exception ex) {
            ex.printStackTrace();
         }
      }
   }

   /**
    * Method verify
    *
    * @param dbf
    * @param filename
    * @throws Exception
    */
   public static void verifyHMAC(DocumentBuilderFactory dbf, String filename)
           throws Exception {

      File f = new File(filename);

      System.out.println("Try to verify " + f.toURL().toString());

      javax.xml.parsers.DocumentBuilder db = dbf.newDocumentBuilder();

      if (VerifyMerlinsExamplesSixteen.schemaValidate) {
         db.setErrorHandler(new org.apache.xml.security.utils
            .IgnoreAllErrorHandler());
         db.setEntityResolver(new org.xml.sax.EntityResolver() {

            public org.xml.sax
                    .InputSource resolveEntity(String publicId, String systemId)
                       throws org.xml.sax.SAXException {

               if (systemId.endsWith("xmldsig-core-schema.xsd")) {
                  try {
                     return new org.xml.sax
                        .InputSource(new FileInputStream(signatureSchemaFile));
                  } catch (FileNotFoundException ex) {
                     throw new org.xml.sax.SAXException(ex);
                  }
               } else {
                  return null;
               }
            }
         });
      }

      org.w3c.dom.Document doc = db.parse(new java.io.FileInputStream(f));

      Element nscontext = XMLUtils.createDSctx(doc, "ds",
                                               Constants.SignatureSpecNS);
      Element sigElement = (Element) XPathAPI.selectSingleNode(doc,
                              "//ds:Signature[1]", nscontext);
      XMLSignature signature = new XMLSignature(sigElement,
                                                f.toURL().toString());

      // signature.addResourceResolver(new OfflineResolver());

      byte keybytes[] = "secret".getBytes("ASCII");
      javax.crypto.SecretKey sk = signature.createSecretKey(keybytes);

      System.out.println("The XML signature in file "
                               + f.toURL().toString() + " is "
                               + (signature.checkSignatureValue(sk)
                                  ? "valid (good)"
                                  : "invalid !!!!! (bad)"));
   }

   static {
      org.apache.xml.security.Init.init();
   }
}
