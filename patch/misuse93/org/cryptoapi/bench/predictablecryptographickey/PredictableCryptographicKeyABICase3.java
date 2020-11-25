package org.cryptoapi.bench.predictablecryptographickey;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.PBEKeySpec;

public class PredictableCryptographicKeyABICase3 {
    public static void main(String [] args){
		System.out.println("REDEFINITION PASSED");
        String key = "defaultkey";
        method1(key);
    }
    public static void method1(String k){
        String key2 = k;
        method2(key2);
    }

    private static void method2(String key) {

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
