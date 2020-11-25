package org.cryptoapi.bench.staticinitializationvector;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import java.security.*;

public class StaticInitializationVectorABICase1 {
    public void go(byte[] bytes) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        IvParameterSpec ivSpec = new IvParameterSpec(bytes);
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        SecretKey key = keyGen.generateKey();
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		
        cipher.init(Cipher.ENCRYPT_MODE,key,ivSpec);
    }

    public static void main (String [] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
		System.out.println("REDEFINITION PASSED");
        StaticInitializationVectorABICase1 siv = new StaticInitializationVectorABICase1();
		SecureRandom sr = new SecureRandom();

		byte [] bytes = new byte[16];
		sr.nextBytes(bytes);

        siv.go(bytes);
    }
}