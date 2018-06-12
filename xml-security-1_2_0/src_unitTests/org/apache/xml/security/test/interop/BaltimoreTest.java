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

import org.apache.xml.security.test.utils.resolver.OfflineResolver;
import org.apache.xml.security.utils.resolver.ResourceResolverSpi;


/**
 * This test is to ensure interoperability with the examples provided by Merlin Huges
 * from Baltimore using KeyTools XML. These test vectors are located in the directory
 * <CODE>data/ie/baltimore/merlin-examples/</CODE>.
 *
 * @author $Author: blautenb $
 * @see <A HREF="http://www.baltimore.com/keytools/xml/index.html">The KeyTools XML Website</A>
 */
public class BaltimoreTest extends InteropTest {

   /** {@link org.apache.commons.logging} logging facility */
    static org.apache.commons.logging.Log log = 
        org.apache.commons.logging.LogFactory.getLog(BaltimoreTest.class.getName());

   /** Field merlinsDir15           */
   static String merlinsDir15 =
      "data/ie/baltimore/merlin-examples/merlin-xmldsig-fifteen/";
   static String merlinsDir16 =
   	"data/ie/baltimore/merlin-examples/merlin-xmldsig-sixteen";
   static String merlinsDir23 =
   	"data/ie/baltimore/merlin-examples/merlin-xmldsig-twenty-three/";

   /**
    * Method suite
    *
    *
    */
   public static Test suite() {
      TestSuite suite = new TestSuite(BaltimoreTest.class);

      return suite;
   }
   /**
    * Constructor BaltimoreTest
    *
    * @param Name_
    */
   public BaltimoreTest(String Name_) {
      super(Name_);
   }


   /**
    * Method main
    *
    * @param args
    */
   public static void main(String[] args) {

      String[] testCaseName = { "-noloading", BaltimoreTest.class.getName() };

      junit.textui.TestRunner.main(testCaseName);
   }

   /**
    * Method test_fifteen_enveloping_hmac_sha1
    *
    * @throws Exception
    */
   public void test_fifteen_enveloping_hmac_sha1() throws Exception {

      String filename = merlinsDir15 + "signature-enveloping-hmac-sha1.xml";
      boolean verify = this.verifyHMAC(filename, new OfflineResolver(), false,
                                       "secret".getBytes("ASCII"));

      if (!verify) {
         log.error("Verification failed for " + filename);
      }

      assertTrue(filename, verify);
   }

   /**
    * Method test_fifteen_enveloping_hmac_sha1_40
    *
    * @throws Exception
    */
   public void test_fifteen_enveloping_hmac_sha1_40() throws Exception {

      String filename = merlinsDir15 + "signature-enveloping-hmac-sha1-40.xml";
      ResourceResolverSpi resolver = new OfflineResolver();
      boolean followManifests = false;
      byte[] hmacKey = "secret".getBytes("ASCII");
      boolean verify = false;

      try {
         verify = this.verifyHMAC(filename, resolver, followManifests, hmacKey);
      } catch (RuntimeException ex) {
         log.error("Verification crashed for " + filename);
         throw ex;
      }

      if (!verify) {
         log.error("Verification failed for " + filename);
      }

      assertTrue(filename, verify);
   }

   /**
    * Method test_fifteen_enveloped_dsa
    *
    * @throws Exception
    */
   public void test_fifteen_enveloped_dsa() throws Exception {

      String filename = merlinsDir15 + "signature-enveloped-dsa.xml";
      ResourceResolverSpi resolver = new OfflineResolver();
      boolean followManifests = false;
      boolean verify = false;

      try {
         verify = this.verify(filename, resolver, followManifests);
      } catch (RuntimeException ex) {
         log.error("Verification crashed for " + filename);
         throw ex;
      }

      if (!verify) {
         log.error("Verification failed for " + filename);
      }

      assertTrue(filename, verify);
   }

   /**
    * Method test_fifteen_enveloping_b64_dsa
    *
    * @throws Exception
    */
   public void test_fifteen_enveloping_b64_dsa() throws Exception {

      String filename = merlinsDir15 + "signature-enveloping-b64-dsa.xml";
      ResourceResolverSpi resolver = null;
      boolean followManifests = false;
      boolean verify = false;

      try {
         verify = this.verify(filename, resolver, followManifests);
      } catch (RuntimeException ex) {
         log.error("Verification crashed for " + filename);
         throw ex;
      }

      if (!verify) {
         log.error("Verification failed for " + filename);
      }

      assertTrue(filename, verify);
   }

   /**
    * Method test_fifteen_enveloping_dsa
    *
    * @throws Exception
    */
   public void test_fifteen_enveloping_dsa() throws Exception {

      String filename = merlinsDir15 + "signature-enveloping-dsa.xml";
      ResourceResolverSpi resolver = new OfflineResolver();
      boolean followManifests = false;
      boolean verify = false;

      try {
         verify = this.verify(filename, resolver, followManifests);
      } catch (RuntimeException ex) {
         log.error("Verification crashed for " + filename);
         throw ex;
      }

      if (!verify) {
         log.error("Verification failed for " + filename);
      }

      assertTrue(filename, verify);
   }

   /**
    * Method test_fifteen_enveloping_rsa
    *
    * @throws Exception
    */
   public void test_fifteen_enveloping_rsa() throws Exception {

      String filename = merlinsDir15 + "signature-enveloping-rsa.xml";
      ResourceResolverSpi resolver = new OfflineResolver();
      boolean followManifests = false;
      boolean verify = false;

      try {
         verify = this.verify(filename, resolver, followManifests);
      } catch (RuntimeException ex) {
         log.error("Verification crashed for " + filename);
         throw ex;
      }

      if (!verify) {
         log.error("Verification failed for " + filename);
      }

      assertTrue(filename, verify);
   }

   /**
    * Method test_fifteen_external_b64_dsa
    *
    * @throws Exception
    */
   public void test_fifteen_external_b64_dsa() throws Exception {

      String filename = merlinsDir15 + "signature-external-b64-dsa.xml";
      ResourceResolverSpi resolver = new OfflineResolver();
      boolean followManifests = false;
      boolean verify = false;

      try {
         verify = this.verify(filename, resolver, followManifests);
      } catch (RuntimeException ex) {
         log.error("Verification crashed for " + filename);
         throw ex;
      }

      if (!verify) {
         log.error("Verification failed for " + filename);
      }

      assertTrue(filename, verify);
   }

   /**
    * Method test_fifteen_external_dsa
    *
    * @throws Exception
    */
   public void test_fifteen_external_dsa() throws Exception {

      String filename = merlinsDir15 + "signature-external-dsa.xml";
      ResourceResolverSpi resolver = new OfflineResolver();
      boolean followManifests = false;
      boolean verify = false;

      try {
         verify = this.verify(filename, resolver, followManifests);
      } catch (RuntimeException ex) {
         log.error("Verification crashed for " + filename);
         throw ex;
      }

      if (!verify) {
         log.error("Verification failed for " + filename);
      }

      assertTrue(filename, verify);
   }

   /**
    * Method test_sixteen_external_dsa
    *
    * @throws Exception
    */
   public void test_sixteen_external_dsa() throws Exception {

      String filename =
         merlinsDir16 + "/signature.xml";
      ResourceResolverSpi resolver = new OfflineResolver();
      boolean followManifests = false;
      boolean verify = false;

      try {
         verify = this.verify(filename, resolver, followManifests);
      } catch (RuntimeException ex) {
         log.error("Verification crashed for " + filename);
         throw ex;
      }

      if (!verify) {
         log.error("Verification failed for " + filename);
      }

      assertTrue(filename, verify);
   }


   /**
    * Method test_twenty_three_enveloping_hmac_sha1
    *
    * @throws Exception
    */
   public void test_twenty_three_enveloping_hmac_sha1() throws Exception {

      String filename = merlinsDir23 + "signature-enveloping-hmac-sha1.xml";
      boolean verify = this.verifyHMAC(filename, new OfflineResolver(), false,
                                       "secret".getBytes("ASCII"));

      if (!verify) {
         log.error("Verification failed for " + filename);
      }

      assertTrue(filename, verify);
   }

   /**
    * Method test_twenty_three_enveloping_hmac_sha1_40
    *
    * @throws Exception
    */
   public void test_twenty_three_enveloping_hmac_sha1_40() throws Exception {

      String filename = merlinsDir23 + "signature-enveloping-hmac-sha1-40.xml";
      ResourceResolverSpi resolver = new OfflineResolver();
      boolean followManifests = false;
      byte[] hmacKey = "secret".getBytes("ASCII");
      boolean verify = false;

      try {
         verify = this.verifyHMAC(filename, resolver, followManifests, hmacKey);
      } catch (RuntimeException ex) {
         log.error("Verification crashed for " + filename);
         throw ex;
      }

      if (!verify) {
         log.error("Verification failed for " + filename);
      }

      assertTrue(filename, verify);
   }

   /**
    * Method test_twenty_three_enveloped_dsa
    *
    * @throws Exception
    */
   public void test_twenty_three_enveloped_dsa() throws Exception {

      String filename = merlinsDir23 + "signature-enveloped-dsa.xml";
      ResourceResolverSpi resolver = new OfflineResolver();
      boolean followManifests = false;
      boolean verify = false;

      try {
         verify = this.verify(filename, resolver, followManifests);
      } catch (RuntimeException ex) {
         log.error("Verification crashed for " + filename);
         throw ex;
      }

      if (!verify) {
         log.error("Verification failed for " + filename);
      }

      assertTrue(filename, verify);
   }

   /**
    * Method test_twenty_three_enveloping_b64_dsa
    *
    * @throws Exception
    */
   public void test_twenty_three_enveloping_b64_dsa() throws Exception {

      String filename = merlinsDir23 + "signature-enveloping-b64-dsa.xml";
      ResourceResolverSpi resolver = null;
      boolean followManifests = false;
      boolean verify = false;

      try {
         verify = this.verify(filename, resolver, followManifests);
      } catch (RuntimeException ex) {
         log.error("Verification crashed for " + filename);
         throw ex;
      }

      if (!verify) {
         log.error("Verification failed for " + filename);
      }

      assertTrue(filename, verify);
   }

   /**
    * Method test_twenty_three_enveloping_dsa
    *
    * @throws Exception
    */
   public void test_twenty_three_enveloping_dsa() throws Exception {

      String filename = merlinsDir23 + "signature-enveloping-dsa.xml";
      ResourceResolverSpi resolver = new OfflineResolver();
      boolean followManifests = false;
      boolean verify = false;

      try {
         verify = this.verify(filename, resolver, followManifests);
      } catch (RuntimeException ex) {
         log.error("Verification crashed for " + filename);
         throw ex;
      }

      if (!verify) {
         log.error("Verification failed for " + filename);
      }

      assertTrue(filename, verify);
   }

   /**
    * Method test_twenty_three_enveloping_rsa
    *
    * @throws Exception
    */
   public void test_twenty_three_enveloping_rsa() throws Exception {

      String filename = merlinsDir23 + "signature-enveloping-rsa.xml";
      ResourceResolverSpi resolver = new OfflineResolver();
      boolean followManifests = false;
      boolean verify = false;

      try {
         verify = this.verify(filename, resolver, followManifests);
      } catch (RuntimeException ex) {
         log.error("Verification crashed for " + filename);
         throw ex;
      }

      if (!verify) {
         log.error("Verification failed for " + filename);
      }

      assertTrue(filename, verify);
   }

   /**
    * Method test_twenty_three_external_b64_dsa
    *
    * @throws Exception
    */
   public void test_twenty_three_external_b64_dsa() throws Exception {

      String filename = merlinsDir23 + "signature-external-b64-dsa.xml";
      ResourceResolverSpi resolver = new OfflineResolver();
      boolean followManifests = false;
      boolean verify = false;

      try {
         verify = this.verify(filename, resolver, followManifests);
      } catch (RuntimeException ex) {
         log.error("Verification crashed for " + filename);
         throw ex;
      }

      if (!verify) {
         log.error("Verification failed for " + filename);
      }

      assertTrue(filename, verify);
   }

   /**
    * Method test_twenty_three_external_dsa
    *
    * @throws Exception
    */
   public void test_twenty_three_external_dsa() throws Exception {

      String filename = merlinsDir23 + "signature-external-dsa.xml";
      ResourceResolverSpi resolver = new OfflineResolver();
      boolean followManifests = false;
      boolean verify = false;

      try {
         verify = this.verify(filename, resolver, followManifests);
      } catch (RuntimeException ex) {
         log.error("Verification crashed for " + filename);
         throw ex;
      }

      if (!verify) {
         log.error("Verification failed for " + filename);
      }

      assertTrue(filename, verify);
   }

   /**
    * Method test_twenty_three_external_dsa_2
    *
    * @throws Exception
    */
   public void test_twenty_three_external_dsa_2() throws Exception {

      String filename =
         merlinsDir23 + "signature.xml";
      ResourceResolverSpi resolver = new OfflineResolver();
      boolean followManifests = false;
      boolean verify = false;

      try {
         verify = this.verify(filename, resolver, followManifests);
      } catch (RuntimeException ex) {
         log.error("Verification crashed for " + filename);
         throw ex;
      }

      if (!verify) {
         log.error("Verification failed for " + filename);
      }

      assertTrue(filename, verify);
   }

   static {
   	
   	  String basedir = System.getProperty("basedir");
   	  if(basedir != null && !"".equals(basedir)) {
   		merlinsDir15 = basedir + "/" + merlinsDir15;
   		merlinsDir16 = basedir + "/" + merlinsDir16;
        merlinsDir23 = basedir + "/" + merlinsDir23;
   	  }
      org.apache.xml.security.Init.init();
   }
}
