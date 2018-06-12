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
package org.apache.xml.security.algorithms.encryption.implementations.BC;



import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.*;
import java.security.spec.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import org.apache.xml.security.algorithms.*;
import org.apache.xml.security.algorithms.encryption.*;
import org.apache.xml.security.algorithms.encryption.helper.*;
import org.apache.xml.security.algorithms.encryption.params.*;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.utils.*;
import org.w3c.dom.*;
import org.apache.xml.security.utils.EncryptionConstants;


/**
 *
 * @author $Author: dohy $
 */
public class KeyWrapImpl_TRIPLEDES_BC extends EncryptionMethodSpi {

   /** Field _cipher */
   Cipher _cipher;

   /** Field _sha1digest */
   MessageDigest _sha1digest;

   /**
    * Method engineGetIvLength
    *
    * @return
    */
   public int engineGetIvLength() {
      return 8;
   }

   /**
    * Method getImplementedAlgorithmURI
    *
    * @return
    */
   public String getImplementedAlgorithmURI() {
      return EncryptionConstants.ALGO_ID_KEYWRAP_TRIPLEDES;
   }

   /**
    * Method getRequiredProviderName
    *
    * @return
    */
   public String getRequiredProviderName() {
      return "BC";
   }

   /**
    * Method getImplementedAlgorithmType
    *
    * @return
    */
   public int getImplementedAlgorithmType() {
      return EncryptionMethodSpi.ALGOTYPE_SYMMETRIC_KEY_WRAP;
   }

   /**
    * Method engineGetBlockSize
    *
    * @return
    */
   public int engineGetBlockSize() {
      return this._cipher.getBlockSize();
   }

   /**
    * Method engineInit
    *
    * @param doc
    * @param params
    * @return
    * @throws org.apache.xml.security.exceptions.XMLSecurityException
    */
   public EncryptionMethodParams engineInit(
           Document doc, EncryptionMethodParams params)
              throws org.apache.xml.security.exceptions.XMLSecurityException {

      if (params != null) {
         throw new XMLSecurityException(
            "encryption.algorithmCannotEatInitParams");
      }

      try {
         this._cipher = Cipher.getInstance(this.getImplementedAlgorithmJCE(),
                                           this.getRequiredProviderName());

         MessageDigestAlgorithm mda = MessageDigestAlgorithm.getInstance(doc,
                                         Constants.ALGO_ID_DIGEST_SHA1);

         this._sha1digest = mda.getAlgorithm();
      } catch (NoSuchAlgorithmException ex) {
         throw new XMLSecurityException("empty", ex);
      } catch (NoSuchProviderException ex) {
         throw new XMLSecurityException("empty", ex);
      } catch (NoSuchPaddingException ex) {
         throw new XMLSecurityException("empty", ex);
      }

      return params;
   }

   /**
    * Method engineInit
    *
    * @param encryptionMethodElem
    * @return
    * @throws org.apache.xml.security.exceptions.XMLSecurityException
    */
   public EncryptionMethodParams engineInit(Element encryptionMethodElem)
           throws org.apache.xml.security.exceptions.XMLSecurityException {

      if (encryptionMethodElem.getChildNodes().getLength() != 0) {
         throw new XMLSecurityException(
            "encryption.algorithmCannotEatInitParams");
      }

      try {
         this._cipher = Cipher.getInstance(this.getImplementedAlgorithmJCE(),
                                           this.getRequiredProviderName());

         MessageDigestAlgorithm mda =
            MessageDigestAlgorithm
               .getInstance(encryptionMethodElem.getOwnerDocument(), Constants
                  .ALGO_ID_DIGEST_SHA1);

         this._sha1digest = mda.getAlgorithm();
      } catch (NoSuchAlgorithmException ex) {
         throw new XMLSecurityException("empty", ex);
      } catch (NoSuchProviderException ex) {
         throw new XMLSecurityException("empty", ex);
      } catch (NoSuchPaddingException ex) {
         throw new XMLSecurityException("empty", ex);
      }

      return null;
   }

   /**
    * Method engineWrap
    *
    * @param contentKey
    * @param wrapKey
    * @return
    * @throws org.apache.xml.security.exceptions.XMLSecurityException
    */
   public byte[] engineWrap(Key contentKey, Key wrapKey)
           throws org.apache.xml.security.exceptions.XMLSecurityException {
      return this.engineWrap(contentKey, wrapKey, null);
   }

   /**
    * Method engineWrap
    *
    * @param contentKey
    * @param wrapKey
    * @param IV
    * @return
    * @throws org.apache.xml.security.exceptions.XMLSecurityException
    */
   public byte[] engineWrap(Key contentKey, Key wrapKey, byte[] IV)
           throws org.apache.xml.security.exceptions.XMLSecurityException {

      try {
         TripleDESWrapper wrapper = new TripleDESWrapper(this._cipher,
                                       this._sha1digest);

         return wrapper.wrap(contentKey.getEncoded(), wrapKey, IV);
      } catch (InvalidKeyException ex) {
         throw new XMLSecurityException("empty", ex);
      } catch (InvalidAlgorithmParameterException ex) {
         throw new XMLSecurityException("empty", ex);
      } catch (IllegalBlockSizeException ex) {
         throw new XMLSecurityException("empty", ex);
      }
   }

   /**
    * Method engineUnwrap
    *
    * @param wrappedKey
    * @param wrapKey
    * @param wrappedKeyURI
    * @return
    * @throws org.apache.xml.security.exceptions.XMLSecurityException
    */
   public Key engineUnwrap(byte[] wrappedKey, Key wrapKey, String wrappedKeyURI)
           throws org.apache.xml.security.exceptions.XMLSecurityException {

      try {
         String wrappedKeyAlgorithm =
            JCEMapper
               .translateURItoJCEID(wrappedKeyURI, this
                  .getRequiredProviderName()).getAlgorithmID();
         int wrappedKeyType = JCEMapper.getKeyTypeFromURI(wrappedKeyURI);
         TripleDESWrapper wrapper = new TripleDESWrapper(this._cipher,
                                       this._sha1digest);
         byte[] encoded = wrapper.unwrap(wrappedKey, wrapKey);

         if (wrappedKeyType == Cipher.SECRET_KEY) {
            return new SecretKeySpec(encoded, wrappedKeyAlgorithm);
         } else {
            try {
               KeyFactory kf =
                  KeyFactory.getInstance(wrappedKeyAlgorithm,
                                         this.getRequiredProviderName());

               if (wrappedKeyType == Cipher.PUBLIC_KEY) {
                  return kf.generatePublic(new X509EncodedKeySpec(encoded));
               } else if (wrappedKeyType == Cipher.PRIVATE_KEY) {
                  return kf.generatePrivate(new PKCS8EncodedKeySpec(encoded));
               }
            } catch (NoSuchProviderException e) {
               throw new InvalidKeyException("Unknown key type "
                                             + e.getMessage());
            } catch (NoSuchAlgorithmException e) {
               throw new InvalidKeyException("Unknown key type "
                                             + e.getMessage());
            } catch (InvalidKeySpecException e2) {
               throw new InvalidKeyException("Unknown key type "
                                             + e2.getMessage());
            }

            throw new InvalidKeyException("Unknown key type " + wrappedKeyType);
         }
      } catch (InvalidKeyException ex) {
         throw new XMLSecurityException("empty", ex);
      }
   }

   /**
    * Method engineEncrypt
    *
    * @param plaintextBytes
    * @param contentKey
    * @return
    * @throws org.apache.xml.security.exceptions.XMLSecurityException
    */
   public byte[] engineEncrypt(byte[] plaintextBytes, Key contentKey)
           throws org.apache.xml.security.exceptions.XMLSecurityException {
      throw new XMLSecurityException(
         "encryption.algorithmCannotEncryptDecrypt");
   }

   /**
    * Method engineEncrypt
    *
    * @param plaintextBytes
    * @param contentKey
    * @param IV
    * @return
    * @throws org.apache.xml.security.exceptions.XMLSecurityException
    */
   public byte[] engineEncrypt(byte[] plaintextBytes, Key contentKey, byte[] IV)
           throws org.apache.xml.security.exceptions.XMLSecurityException {
      throw new XMLSecurityException(
         "encryption.algorithmCannotEncryptDecrypt");
   }

   /**
    * Method engineDecrypt
    *
    * @param ciphertextBytes
    * @param contentKey
    * @return
    * @throws org.apache.xml.security.exceptions.XMLSecurityException
    */
   public byte[] engineDecrypt(byte[] ciphertextBytes, Key contentKey)
           throws org.apache.xml.security.exceptions.XMLSecurityException {
      throw new XMLSecurityException(
         "encryption.algorithmCannotEncryptDecrypt");
   }
}
