package org.cryptoapi.bench.staticinitializationvector;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class StaticInitializationVectorABMC1 {
    public void go(byte [] bytes) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException, InvalidKeyException {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        SecretKey key = keyGen.generateKey();
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

		SecureRandom sr = new SecureRandom();

		byte [] sbytes = new byte[16];
		sr.nextBytes(sbytes);
		
		IvParameterSpec ivSpec = new IvParameterSpec(sbytes);
		
        cipher.init(Cipher.ENCRYPT_MODE,key,ivSpec);
    }

	public static void main (String [] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException, InvalidKeyException{
		System.out.println("REDEFINITION PASSED");
		StaticInitializationVectorABMC1 s = new StaticInitializationVectorABMC1();
		s.go("Test".getBytes());
		
	}
}
