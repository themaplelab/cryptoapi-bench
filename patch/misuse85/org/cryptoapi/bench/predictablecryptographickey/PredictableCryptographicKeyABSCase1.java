package org.cryptoapi.bench.predictablecryptographickey;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class PredictableCryptographicKeyABSCase1 {
    Crypto crypto;
	public static void main (String [] args) throws NoSuchAlgorithmException, NoSuchPaddingException{
		System.out.println("REDEFINITION PASSED");
		PredictableCryptographicKeyABSCase1 p = new PredictableCryptographicKeyABSCase1();
	}
	
    public PredictableCryptographicKeyABSCase1() throws NoSuchAlgorithmException, NoSuchPaddingException {
        String passKey = PredictableCryptographicKeyABSCase1.getKey("pass.key");

        if(passKey == null) {
            crypto = new Crypto("defaultkey");
        }
        crypto = new Crypto(passKey);
    }

    byte[] encryptPass(String pass, String src) throws IllegalBlockSizeException, BadPaddingException, InvalidKeyException, UnsupportedEncodingException {
        String keyStr = PredictableCryptographicKeyABSCase1.getKey(src);
        return crypto.method1(pass, keyStr);
    }

    public static String getKey(String s) {
        return System.getProperty(s);
    }
}

class Crypto {
    Cipher cipher;
    String algoSpec = "AES/CBC/PKCS5Padding";
    String algo = "AES";
    String defaultKey;
    public Crypto(String defkey) throws NoSuchPaddingException, NoSuchAlgorithmException {
        cipher = Cipher.getInstance(algoSpec);
        defaultKey = defkey;
    }

    public byte[] method1(String txt, String key) throws UnsupportedEncodingException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        if(key.isEmpty()){
            key = defaultKey;
        }
		SecretKeySpec keySpec = null;
		 try{
			 final byte[] salt = new byte[32];
			 SecureRandom.getInstanceStrong().nextBytes(salt);
			 char[] corPwd  = new char[20];
			 SecureRandom rnd = new SecureRandom();
			 for (int i = 0; i < 20; i++) {
				 corPwd[i] = (char) (rnd.nextInt(26) + 'a');
			 }
			 final PBEKeySpec pbekeyspec = new PBEKeySpec(corPwd, salt, 65000, 128);
			 final SecretKeyFactory secFac = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
			 SecretKey tmpKey = secFac.generateSecret(pbekeyspec);
			 pbekeyspec.clearPassword();
			 byte[] keyMaterial = tmpKey.getEncoded();
			 keySpec = new SecretKeySpec(keyMaterial, "AES");
		 }catch(GeneralSecurityException  e){
			 System.out.println("Exception");
		 }

		cipher.init(Cipher.ENCRYPT_MODE,keySpec);
        return cipher.doFinal(txt.getBytes());
    }
}
