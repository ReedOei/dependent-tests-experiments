
/*
 * The Apache Software License, Version 1.1
 *
 *
 * Copyright (c) 1999 The Apache Software Foundation.  All rights
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution,
 *    if any, must include the following acknowledgment:
 *       "This product includes software developed by the
 *        Apache Software Foundation (http://www.apache.org/)."
 *    Alternately, this acknowledgment may appear in the software itself,
 *    if and wherever such third-party acknowledgments normally appear.
 *
 * 4. The names "<WebSig>" and "Apache Software Foundation" must
 *    not be used to endorse or promote products derived from this
 *    software without prior written permission. For written
 *    permission, please contact apache@apache.org.
 *
 * 5. Products derived from this software may not be called "Apache",
 *    nor may "Apache" appear in their name, without prior written
 *    permission of the Apache Software Foundation.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation and was
 * originally based on software copyright (c) 2001, Institute for
 * Data Communications Systems, <http://www.nue.et-inf.uni-siegen.de/>.
 * The development of this software was partly funded by the European
 * Commission in the <WebSig> project in the ISIS Programme.
 * For more information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 */
package org.apache.xml.security.test.utils.resolver;



import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.xml.security.utils.resolver.ResourceResolverSpi;


/**
 *
 *
 *
 *
 * @author $Author: dohy $
 *
 */
public class ResourceResolverSpiTest extends TestCase {

   /** {@link org.apache.log4j} logging facility */
   static org.apache.log4j.Category cat =
      org.apache.log4j.Category
         .getInstance(ResourceResolverSpiTest.class.getName());

   /**
    * Method suite
    *
    * @return
    */
   public static Test suite() {
      return new TestSuite(ResourceResolverSpiTest.class);
   }

   /**
    *
    * @param Name_
    */
   public ResourceResolverSpiTest(String Name_) {
      super(Name_);
   }

   /**
    *
    * @param args
    */
   public static void main(String[] args) {

      String[] testCaseName = { "-noloading",
                                ResourceResolverSpiTest.class.getName() };

      junit.textui.TestRunner.main(testCaseName);

      // junit.swingui.TestRunner.main(testCaseName);
   }

   /**
    * Method testExpandSystemId_1
    *
    * @throws Exception
    */
   public static void testExpandSystemId_1() throws Exception {

      String systemId = "http://www.w3.org/1.xml";
      String currentSystemId = "http://localhost/file.txt";
      String expected = "http://www.w3.org/1.xml";
      String result = ResourceResolverSpi.expandSystemId(systemId,
                         currentSystemId);
      String description = "systemId='" + systemId + "' currentSystemId='"
                           + currentSystemId + "' expected='" + expected
                           + "' but was: " + result;

      assertTrue(description, result.equals(expected));
   }

   /**
    * Method testExpandSystemId_2
    *
    * @throws Exception
    */
   public static void testExpandSystemId_2() throws Exception {

      String systemId = "1.xml";
      String currentSystemId = "http://www.w3.org/file.xml";
      String expected = "http://www.w3.org/1.xml";
      String result = ResourceResolverSpi.expandSystemId(systemId,
                         currentSystemId);
      String description = "systemId='" + systemId + "' currentSystemId='"
                           + currentSystemId + "' expected='" + expected
                           + "' but was: " + result;

      assertTrue(description, result.equals(expected));
   }

   /**
    * Method testExpandSystemId_3
    *
    * @throws Exception
    */
   public static void _testExpandSystemId_3() throws Exception {

      String systemId = "1.xml";
      String currentSystemId = "file:/Y:\\dir\\3.xml";
      String expected = "file:/Y:/dir/1.xml";
      String result = ResourceResolverSpi.expandSystemId(systemId,
                         currentSystemId);
      String description = "systemId='" + systemId + "' currentSystemId='"
                           + currentSystemId + "' expected='" + expected
                           + "' but was: " + result;

      assertTrue(description, result.equals(expected));
   }

   static {
      org.apache.xml.security.Init.init();
   }
}
