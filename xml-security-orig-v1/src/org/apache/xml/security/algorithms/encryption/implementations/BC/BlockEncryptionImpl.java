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
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.xml.security.algorithms.JCEMapper;
import org.apache.xml.security.algorithms.encryption.*;
import org.apache.xml.security.algorithms.encryption.params.*;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.utils.EncryptionConstants;
import org.apache.xml.security.utils.PRNG;
import org.w3c.dom.*;


/**
 *
 * @author $Author: dohy $
 */
public abstract class BlockEncryptionImpl extends EncryptionMethodSpi {

   /** Field _cipher */
   Cipher _cipher;

   /** Field ENCRYPT_IV_IN_ECB           */
   public static final boolean ENCRYPT_IV_IN_ECB = false;

   /**
    * Method getRequiredProviderName
    *
    * @return
    */
   public abstract String getRequiredProviderName();

   /**
    * Method getImplementedAlgorithmURI
    *
    * @return
    */
   public abstract String getImplementedAlgorithmURI();

   /**
    * Method getImplementedAlgorithmType
    *
    * @return
    */
   public int getImplementedAlgorithmType() {
      return EncryptionMethodSpi.ALGOTYPE_BLOCK_ENCRYPTION;
   }

   /**
    * Method engineGetBlockSize
    *
    * @return
    */
   public int engineGetBlockSize() {

      try {
         Cipher cipher = Cipher.getInstance(this.getImplementedAlgorithmJCE(),
                                            this.getRequiredProviderName());

         return cipher.getBlockSize();
      } catch (Exception ex) {
         return 0;
      }
   }

   /**
    * Method engineGetIvLength
    *
    * @return
    */
   public abstract int engineGetIvLength();

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
      throw new XMLSecurityException("encryption.algorithmCannotWrapUnWrap");
   }

   /**
    * Method engineWrap
    *
    * @param parm1
    * @param parm2
    * @param parm3
    * @return
    * @throws org.apache.xml.security.exceptions.XMLSecurityException
    */
   public byte[] engineWrap(Key parm1, Key parm2, byte[] parm3)
           throws org.apache.xml.security.exceptions.XMLSecurityException {
      throw new XMLSecurityException("encryption.algorithmCannotWrapUnWrap");
   }

   /**
    * Method engineUnwrap
    *
    * @param parm1
    * @param parm2
    * @param parm3
    * @return
    * @throws org.apache.xml.security.exceptions.XMLSecurityException
    */
   public Key engineUnwrap(byte[] parm1, Key parm2, String parm3)
           throws org.apache.xml.security.exceptions.XMLSecurityException {
      throw new XMLSecurityException("encryption.algorithmCannotWrapUnWrap");
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
      return this.engineEncrypt(plaintextBytes, contentKey, null);
   }

   /**
    * Method getImplementedIVAlgorithmJCE
    *
    * @return
    */
   private String getImplementedIVAlgorithmJCE() {

      return JCEMapper
         .getJCEIVAlgorithmFromURI(this.getImplementedAlgorithmURI(), this
            .getRequiredProviderName());
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

      try {
         int ivLength = this.engineGetIvLength();
         Cipher cipher = Cipher.getInstance(this.getImplementedAlgorithmJCE(),
                                            this.getRequiredProviderName());

         if (IV == null) {
            IV = PRNG.createBytes(ivLength);
         }

         IvParameterSpec ivParamSpec = new IvParameterSpec(IV);

         cipher.init(Cipher.ENCRYPT_MODE, contentKey, ivParamSpec);

         ByteArrayOutputStream baos =
            new ByteArrayOutputStream(plaintextBytes.length);

         if (BlockEncryptionImpl.ENCRYPT_IV_IN_ECB) {

            // At this place, the encryption of the IV must take place
            Cipher IVCipher =
               Cipher.getInstance(this.getImplementedIVAlgorithmJCE(),
                                  this.getRequiredProviderName());

            IVCipher.init(Cipher.ENCRYPT_MODE, contentKey);

            IV = IVCipher.doFinal(IV);
         }

         baos.write(IV);

         byte t[] = cipher.update(plaintextBytes);

         if (t != null) {
            baos.write(t);
         }

         t = cipher.doFinal();

         if (t != null) {
            baos.write(t);
         }

         return baos.toByteArray();
      } catch (IOException ex) {
         throw new XMLSecurityException("empty", ex);
      } catch (NoSuchAlgorithmException ex) {
         throw new XMLSecurityException("empty", ex);
      } catch (BadPaddingException ex) {
         throw new XMLSecurityException("empty", ex);
      } catch (NoSuchProviderException ex) {
         throw new XMLSecurityException("empty", ex);
      } catch (NoSuchPaddingException ex) {
         throw new XMLSecurityException("empty", ex);
      } catch (InvalidKeyException ex) {
         throw new XMLSecurityException("empty", ex);
      } catch (InvalidAlgorithmParameterException ex) {
         throw new XMLSecurityException("empty", ex);
      } catch (IllegalBlockSizeException ex) {
         throw new XMLSecurityException("empty", ex);
      }
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

      try {
         int ivLength = this.engineGetIvLength();
         byte[] IV = new byte[ivLength];

         System.arraycopy(ciphertextBytes, 0, IV, 0, ivLength);

         if (BlockEncryptionImpl.ENCRYPT_IV_IN_ECB) {

            // this would be the place where decryption of the IV happens
            Cipher IVCipher =
               Cipher.getInstance(this.getImplementedIVAlgorithmJCE(),
                                  this.getRequiredProviderName());

            IVCipher.init(Cipher.DECRYPT_MODE, contentKey);

            IV = IVCipher.doFinal(IV);
         }

         IvParameterSpec ivParamSpec = new IvParameterSpec(IV);

         this._cipher.init(Cipher.DECRYPT_MODE, contentKey, ivParamSpec);

         ByteArrayOutputStream baos =
            new ByteArrayOutputStream(ciphertextBytes.length);
         byte bytes[];

         bytes = this._cipher.update(ciphertextBytes, ivLength,
                                     ciphertextBytes.length - ivLength);

         if (bytes != null) {
            baos.write(bytes);
         }

         bytes = this._cipher.doFinal();

         if (bytes != null) {
            baos.write(bytes);
         }

         return baos.toByteArray();
      } catch (IOException ex) {
         throw new XMLSecurityException("empty", ex);
      } catch (InvalidKeyException ex) {
         throw new XMLSecurityException("empty", ex);
      } catch (InvalidAlgorithmParameterException ex) {
         throw new XMLSecurityException("empty", ex);
      } catch (BadPaddingException ex) {
         throw new XMLSecurityException("empty", ex);
      } catch (IllegalBlockSizeException ex) {
         throw new XMLSecurityException("empty", ex);
      } catch (NoSuchPaddingException ex) {
         throw new XMLSecurityException("empty", ex);
      } catch (NoSuchProviderException ex) {
         throw new XMLSecurityException("empty", ex);
      } catch (NoSuchAlgorithmException ex) {
         throw new XMLSecurityException("empty", ex);
      }
   }
}
