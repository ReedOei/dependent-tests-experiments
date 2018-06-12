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
package org.apache.xml.security.transforms.implementations;



import java.io.IOException;
import java.io.ByteArrayInputStream;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.utils.Constants;
import org.apache.xml.security.c14n.*;
import org.apache.xml.security.c14n.implementations.*;
import org.apache.xml.security.transforms.*;
import org.apache.xml.security.transforms.params.InclusiveNamespaces;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import org.w3c.dom.*;


/**
 * Class TransformC14NExclusive
 *
 * @author $Author: dohy $
 * @version $Revision: 1.1.1.1 $
 */
public class TransformC14NExclusive extends TransformSpi {

   /** Field implementedTransformURI */
   public static final String implementedTransformURI =
      Transforms.TRANSFORM_C14N_EXCL_OMIT_COMMENTS;

   //J-
   public boolean wantsOctetStream ()   { return false; }
   public boolean wantsNodeSet ()       { return true; }
   public boolean returnsOctetStream () { return true; }
   public boolean returnsNodeSet ()     { return false; }
   //J+

   /**
    * Method engineGetURI
    *
    * @return
    */
   protected String engineGetURI() {
      return this.implementedTransformURI;
   }

   /**
    * Method enginePerformTransform
    *
    * @param input
    * @return
    * @throws CanonicalizationException
    * @throws InvalidCanonicalizerException
    */
   protected XMLSignatureInput enginePerformTransform(XMLSignatureInput input)
           throws CanonicalizationException, InvalidCanonicalizerException {

      try {
         InclusiveNamespaces inclusiveNamespaces = null;

         if (this._transformObject
                 .length(InclusiveNamespaces
                    .ExclusiveCanonicalizationNamespace, InclusiveNamespaces
                    ._TAG_EC_INCLUSIVENAMESPACES) == 1) {
            Element inclusiveElement =
               this._transformObject.getChildElementLocalName(0,
                  InclusiveNamespaces.ExclusiveCanonicalizationNamespace,
                  InclusiveNamespaces._TAG_EC_INCLUSIVENAMESPACES);

            inclusiveNamespaces = new InclusiveNamespaces(inclusiveElement,
                    this._transformObject.getBaseURI());
         }

         Canonicalizer20010315ExclOmitComments c14n =
            new Canonicalizer20010315ExclOmitComments();

         if (input.isOctetStream()) {
            return new XMLSignatureInput(c14n
               .engineCanonicalize(input.getBytes()));
         } else {
            if (inclusiveNamespaces == null) {
               return new XMLSignatureInput(c14n
                  .engineCanonicalizeXPathNodeSet(input.getNodeSet()));
            } else {
               return new XMLSignatureInput(c14n
                  .engineCanonicalizeXPathNodeSet(input
                     .getNodeSet(), inclusiveNamespaces
                     .getInclusiveNamespaces()));
            }
         }
      } catch (IOException ex) {
         throw new CanonicalizationException("empty", ex);
      } catch (ParserConfigurationException ex) {
         throw new CanonicalizationException("empty", ex);
      } catch (XMLSecurityException ex) {
         throw new CanonicalizationException("empty", ex);
      } catch (SAXException ex) {
         throw new CanonicalizationException("empty", ex);
      }
   }
}
