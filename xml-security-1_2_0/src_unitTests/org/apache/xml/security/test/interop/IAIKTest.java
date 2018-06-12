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
import org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous;


/**
 * This test is to ensure interoperability with the examples provided by the IAIK
 * XML Signature implementation. Thanks to Gregor Karlinger who provided these
 * test vectors. They are located in the directory <CODE>data/at/iaik/ixsil/</CODE>.
 *
 * @author $Author: blautenb $
 * @see <A HREF="http://jcewww.iaik.at/products/ixsil/index.php">The IAIK IXSIL Website</A>
 */
public class IAIKTest extends InteropTest {

   /** {@link org.apache.commons.logging} logging facility */
    static org.apache.commons.logging.Log log = 
        org.apache.commons.logging.LogFactory.getLog(
                    IAIKTest.class.getName());

   /** Field gregorsDir */
   static String gregorsDir = "data/at/iaik/ixsil/";

   /**
    * Method suite
    *
    *
    */
   public static Test suite() {

      TestSuite suite = new TestSuite(IAIKTest.class);

      return suite;
   }

   /**
    * Constructor IAIKTest
    *
    * @param Name_
    */
   public IAIKTest(String Name_) {
      super(Name_);
   }

   /**
    * Method main
    *
    * @param args
    */
   public static void main(String[] args) {

      String[] testCaseName = { "-noloading", IAIKTest.class.getName() };

      junit.textui.TestRunner.main(testCaseName);
   }

   /**
    * Method test_signatureAlgorithms_signatures_hMACShortSignature
    *
    * @throws Exception
    */
   public void test_signatureAlgorithms_signatures_hMACShortSignature()
           throws Exception {

      String filename =
         gregorsDir + "signatureAlgorithms/signatures/hMACShortSignature.xml";
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
    * Method test_signatureAlgorithms_signatures_hMACSignature
    *
    * @throws Exception
    */
   public void test_signatureAlgorithms_signatures_hMACSignature()
           throws Exception {

      String filename = gregorsDir
                        + "signatureAlgorithms/signatures/hMACSignature.xml";
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
    * Method test_coreFeatures_signatures_manifestSignature
    *
    * @throws Exception
    */
   public void test_coreFeatures_signatures_manifestSignature_core()
           throws Exception {

      String filename = gregorsDir
                        + "coreFeatures/signatures/manifestSignature.xml";
      ResourceResolverSpi resolver = null;
      boolean followManifests = false;
      boolean verify = false;

      try {
         verify = this.verify(filename, resolver, followManifests);
      } catch (RuntimeException ex) {
         log.error("Core validation crashed for " + filename);

         throw ex;
      }

      if (!verify) {
         log.error("Core validation failed for " + filename);
      }

      assertTrue("Core validation failed for " + filename, verify);
   }

   /**
    * Method test_coreFeatures_signatures_manifestSignature_manifest
    *
    * @throws Exception
    */
   public void test_coreFeatures_signatures_manifestSignature_manifest()
           throws Exception {

      String filename = gregorsDir
                        + "coreFeatures/signatures/manifestSignature.xml";
      ResourceResolverSpi resolver = null;
      boolean followManifests = true;
      boolean verify = false;

      try {
         verify = this.verify(filename, resolver, followManifests);
      } catch (RuntimeException ex) {
         log.error("Verification crashed for " + filename);

         throw ex;
      }

      if (!verify) {
         log.error("Following the ds:Manifest failed for " + filename);
      }

      assertTrue("Following the ds:Manifest failed for " + filename, verify);
   }

   /**
    * Method test_coreFeatures_signatures_signatureTypesSignature
    *
    * @throws Exception
    */
   public void test_coreFeatures_signatures_signatureTypesSignature()
           throws Exception {

      String filename = gregorsDir
                        + "coreFeatures/signatures/signatureTypesSignature.xml";
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

      assertTrue("Verification failed for " + filename, verify);
   }

   /**
    * Method test_coreFeatures_signatures_anonymousReferenceSignature
    *
    * @throws Exception
    */
   public void test_coreFeatures_signatures_anonymousReferenceSignature()
           throws Exception {

      String filename =
         gregorsDir + "coreFeatures/signatures/anonymousReferenceSignature.xml";
      String anonymousRef =
         gregorsDir + "coreFeatures/samples/anonymousReferenceContent.xml";
      ResourceResolverSpi resolver = new ResolverAnonymous(anonymousRef);
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
    * Method test_signatureAlgorithms_signatures_dSASignature
    *
    * @throws Exception
    */
   public void test_signatureAlgorithms_signatures_dSASignature()
           throws Exception {

      String filename = gregorsDir
                        + "signatureAlgorithms/signatures/dSASignature.xml";
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
    * Method test_signatureAlgorithms_signatures_rSASignature
    *
    * @throws Exception
    */
   public void test_signatureAlgorithms_signatures_rSASignature()
           throws Exception {

      String filename = gregorsDir
                        + "signatureAlgorithms/signatures/rSASignature.xml";
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
    * Method test_transforms_signatures_base64DecodeSignature
    *
    * @throws Exception
    */
   public void test_transforms_signatures_base64DecodeSignature()
           throws Exception {

      String filename = gregorsDir
                        + "transforms/signatures/base64DecodeSignature.xml";
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
    * Method test_transforms_signatures_c14nSignature
    *
    * @throws Exception
    */
   public void test_transforms_signatures_c14nSignature() throws Exception {

      String filename = gregorsDir + "transforms/signatures/c14nSignature.xml";
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
    * Method test_transforms_signatures_envelopedSignatureSignature
    *
    * @throws Exception
    */
   public void test_transforms_signatures_envelopedSignatureSignature()
           throws Exception {

      String filename =
         gregorsDir + "transforms/signatures/envelopedSignatureSignature.xml";
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
    * Method test_transforms_signatures_xPathSignature
    *
    * @throws Exception
    */
   public void test_transforms_signatures_xPathSignature() throws Exception {

      String filename = gregorsDir + "transforms/signatures/xPathSignature.xml";
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

   static {
   	String basedir = System.getProperty("basedir");
   	if(basedir != null && !"".equals(basedir)) {
   		gregorsDir = basedir + "/" + gregorsDir;
   	}
      org.apache.xml.security.Init.init();
   }
}
