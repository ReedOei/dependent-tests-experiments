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
package org.apache.xml.security.test.interop;



import junit.framework.Test;
import junit.framework.TestSuite;

import org.apache.xml.security.utils.resolver.ResourceResolverSpi;


/**
 * This test is to ensure interoperability with the examples provided by Blake Dournaee
 * from RSA Security using Cert-J 2.01. These test vectors are located in the directory
 * <CODE>data/com/rsasecurity/bdournaee/</CODE>.
 *
 * @author $Author: blautenb $
 * @see <A HREF="http://www.rsasecurity.com/products/bsafe/certj.html">RSA BSAFE Cert-J</A>
 */
public class RSASecurityTest extends InteropTest {

   /** {@link org.apache.commons.logging} logging facility */
    static org.apache.commons.logging.Log log = 
        org.apache.commons.logging.LogFactory.getLog(RSASecurityTest.class.getName());

   /** Field blakesDir           */
   static String blakesDir =
      "data/com/rsasecurity/bdournaee/";

   /**
    * Method suite
    *
    *
    */
   public static Test suite() {
      TestSuite suite = new TestSuite(RSASecurityTest.class);

      return suite;
   }
   /**
    * Constructor RSASecurityTest
    *
    * @param Name_
    */
   public RSASecurityTest(String Name_) {
      super(Name_);
   }

   /**
    * Method main
    *
    * @param args
    */
   public static void main(String[] args) {

      String[] testCaseName = { "-noloading", RSASecurityTest.class.getName() };

      junit.textui.TestRunner.main(testCaseName);
   }

   public void test_enveloping() throws Exception {

      String filename = blakesDir + "certj201_enveloping.xml";
      boolean followManifests = false;
      ResourceResolverSpi resolver = null;
      boolean verify = this.verify(filename, resolver, followManifests);

      if (!verify) {
         log.error("Verification failed for " + filename);
      }

      assertTrue(filename, verify);
   }


   public void test_enveloped() throws Exception {

      String filename = blakesDir + "certj201_enveloped.xml";
      boolean followManifests = false;
      ResourceResolverSpi resolver = null;
      boolean verify = this.verify(filename, resolver, followManifests);

      if (!verify) {
         log.error("Verification failed for " + filename);
      }

      assertTrue(filename, verify);
   }

   static {
   	  String basedir = System.getProperty("basedir");
   	  if(basedir != null && !"".equals(basedir)) {
   		blakesDir = basedir + "/" + blakesDir;
   	  }
      org.apache.xml.security.Init.init();
   }
}
