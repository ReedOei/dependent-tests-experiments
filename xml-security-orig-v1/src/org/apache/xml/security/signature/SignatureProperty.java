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
package org.apache.xml.security.signature;



import java.io.IOException;
import org.w3c.dom.*;
import org.apache.xml.security.algorithms.SignatureAlgorithm;
import org.apache.xml.security.c14n.Canonicalizer;
import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.signature.MissingResourceFailureException;
import org.apache.xml.security.exceptions.*;
import org.apache.xml.security.signature.XMLSignatureException;
import org.apache.xml.security.signature.Reference;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.transforms.Transforms;
import org.apache.xml.security.utils.Constants;
import org.apache.xml.security.utils.XMLUtils;
import org.apache.xml.security.utils.*;


/**
 * Handles <code>&lt;ds:SignatureProperty&gt;</code> elements
 * Addittional information item concerning the generation of the signature(s) can
 * be placed in this Element
 *
 * @author Christian Geuer-Pollmann
 */
public class SignatureProperty extends SignatureElementProxy {

   /** {@link org.apache.log4j} logging facility */
   static org.apache.log4j.Category cat =
      org.apache.log4j.Category.getInstance(SignatureProperty.class.getName());

   /**
    * Constructs{@link SignatureProperty} using specified <code>Target</code> attribute
    *
    * @param doc the {@link Document} in which <code>XMLsignature</code> is placed
    * @param Target the <code>Target</code> attribute references the <code>Signature</code> element to which the property applies SignatureProperty
    * @throws XMLSignatureException
    */
   public SignatureProperty(Document doc, String Target)
           throws XMLSignatureException {
      this(doc, Target, null);
   }

   /**
    * Constructs {@link SignatureProperty} using sepcified <code>Target</code> attribute and <code>Id</code> attribute
    *
    * @param doc the {@link Document} in which <code>XMLsignature</code> is placed
    * @param Target the <code>Target</code> attribute references the <code>Signature</code> element to which the property applies
    * @param Id the <code>Id</code> will be specified by {@link Reference#ReferenceURI} in validation
    * @throws XMLSignatureException
    */
   public SignatureProperty(Document doc, String Target, String Id)
           throws XMLSignatureException {

      super(doc);

      this.setTarget(Target);
      this.setId(Id);
   }

   /**
    * Constructs a {@link SignatureProperty} from an {@link Element}
    * @param element <code>SignatureProperty</code> element
    * @param BaseURI the URI of the resource where the XML instance was stored
    * @throws XMLSecurityException
    */
   public SignatureProperty(Element element, String BaseURI)
           throws XMLSecurityException {
      super(element, BaseURI);
   }

   /**
    *   Sets the <code>Id</code> attribute
    *
    *   @param Id the <code>Id</code> attribute
    */
   public void setId(String Id) {

      if ((this._state == MODE_SIGN) && (Id != null)) {
         this._constructionElement.setAttributeNS(null, Constants._ATT_ID, Id);
         IdResolver.registerElementById(this._constructionElement, Id);
      }
   }

   /**
    * Returns the <code>Id</code> attribute
    *
    * @return the <code>Id</code> attribute
    */
   public String getId() {
      return this._constructionElement.getAttributeNS(null, Constants._ATT_ID);
   }

   /**
    * Sets the <code>Target</code> attribute
    *
    * @param Target the <code>Target</code> attribute
    */
   public void setTarget(String Target) {

      if ((this._state == MODE_SIGN) && (Target != null)) {
         this._constructionElement.setAttributeNS(null, Constants._ATT_TARGET, Target);
      }
   }

   /**
    * Returns the <code>Target</code> attribute
    *
    * @return the <code>Target</code> attribute
    */
   public String getTarget() {
      return this._constructionElement.getAttributeNS(null, Constants._ATT_TARGET);
   }

   /**
    * Method appendChild
    *
    * @param node
    * @return
    */
   public Node appendChild(Node node) {
      return this._constructionElement.appendChild(node);
   }

   public String getBaseLocalName() {
      return Constants._TAG_SIGNATUREPROPERTY;
   }
}
