package org.cryptoapi.bench.predictablecryptographickey;

import javax.crypto.spec.SecretKeySpec;
import javax.crypto.SecretKey;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.security.SecureRandom;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class PredictableCryptographicKeyABHCase2 {
    public static void main(String [] args) throws UnsupportedEncodingException, GeneralSecurityException {
		System.out.println("REDEFINITION PASSED");
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
    final SecretKeySpec actKey = new SecretKeySpec(keyMaterial, "AES");
    }catch(GeneralSecurityException  e){
	System.out.println("Exception");
    }
    }
}
