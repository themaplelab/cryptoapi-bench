package org.cryptoapi.bench.predictablecryptographickey;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.PBEKeySpec;

public class PredictableCryptographicKeyABICase2 {
    public static final String DEFAULT_ENCRYPT_KEY = "defaultkey";
    private static char[] ENCRYPT_KEY;
    private static char[] encryptKey;
    public static void main(String [] args){
		System.out.println("REDEFINITION PASSED");
        go2();
        go3();
        go();
    }

    private static void go2(){
        ENCRYPT_KEY = DEFAULT_ENCRYPT_KEY.toCharArray();
    }
    private static void go3(){
        encryptKey = ENCRYPT_KEY;
    }

    private static void go() {

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
