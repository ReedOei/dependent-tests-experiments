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

import org.apache.xml.security.signature.SignedInfo;
import org.apache.xml.security.signature.XMLSignature;
import org.apache.xml.security.utils.Constants;
import org.apache.xml.security.utils.XMLUtils;
import org.apache.xpath.XPathAPI;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;


/**
 *
 * @author $Author: blautenb $
 */
public class VerifyCollectableSignature {

   /** {@link org.apache.commons.logging} logging facility */
    static org.apache.commons.logging.Log log = 
        org.apache.commons.logging.LogFactory.getLog(VerifyCollectableSignature.class.getName());

   /**
    * Method main
    *
    * @param unused
    * @throws Exception
    */
   public static void main(String unused[]) throws Exception {

      javax.xml.parsers.DocumentBuilderFactory dbf =
         javax.xml.parsers.DocumentBuilderFactory.newInstance();

      dbf.setNamespaceAware(true);
      dbf.setAttribute("http://xml.org/sax/features/namespaces", Boolean.TRUE);

      try {
         File signatureFile = new File("collectableSignature.xml");
         String BaseURI = signatureFile.toURL().toString();

         System.out.println("Try to verify "
                            + signatureFile.toURL().toString());

         javax.xml.parsers.DocumentBuilder db = dbf.newDocumentBuilder();

         db.setErrorHandler(new org.apache.xml.security.utils
            .IgnoreAllErrorHandler());

         org.w3c.dom.Document doc =
            db.parse(new java.io.FileInputStream(signatureFile));
         Element nscontext = XMLUtils.createDSctx(doc, "ds",
                                                  Constants.SignatureSpecNS);
         NodeList signatureElems = XPathAPI.selectNodeList(doc,
                                      "//ds:Signature", nscontext);

         for (int i = 0; i < signatureElems.getLength(); i++) {
            Element sigElement = (Element) signatureElems.item(i);
            XMLSignature signature = new XMLSignature(sigElement, BaseURI);
            byte[] secretKey = "secretValue".getBytes();

            System.out
               .println("The XML signature number " + i + " in file " + BaseURI + " is "
                        + (signature
                           .checkSignatureValue(signature
                              .createSecretKey(CreateCollectableSignature
                                 .passphrase.getBytes()))
                           ? "valid (good)"
                           : "invalid !!!!! (bad)"));

            SignedInfo s = signature.getSignedInfo();

            for (int j = 0; j < s.getSignedContentLength(); j++) {
               System.out.println("################ Signed Resource " + i + "/" + j
                                  + " ################");
               System.out.println(new String(s.getSignedContentItem(j)));
               System.out.println();
            }
         }
      } catch (Exception ex) {
         ex.printStackTrace();
      }
   }

   static {
      org.apache.xml.security.Init.init();
   }
}
