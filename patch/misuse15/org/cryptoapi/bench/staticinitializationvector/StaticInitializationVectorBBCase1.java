package org.cryptoapi.bench.staticinitializationvector;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class StaticInitializationVectorBBCase1 {
    public void go() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        SecretKey key = keyGen.generateKey();
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");


		SecureRandom sr = new SecureRandom();

		byte [] bytes = new byte[16];
		sr.nextBytes(bytes);
		
		IvParameterSpec ivSpec = new IvParameterSpec(bytes);
		
		cipher.init(Cipher.ENCRYPT_MODE,key,ivSpec);
    }

    public static void main (String [] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
		System.out.println("REDEFINITION PASSED");
        StaticInitializationVectorBBCase1 siv = new StaticInitializationVectorBBCase1();
        siv.go();
    }
}
