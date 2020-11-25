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

public class StaticInitializationVectorABICase2 {
    public static final String DEFAULT_INITIALIZATION = "abcdabcdabcdabcd";
    private static char[] INITIALIZATION;
    private static char[] initialization;
    public void go() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
		SecureRandom sr = new SecureRandom();

        byte [] bytes = new byte[16];
        sr.nextBytes(bytes);

        IvParameterSpec ivSpec = new IvParameterSpec(bytes);
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        SecretKey key = keyGen.generateKey();
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

        cipher.init(Cipher.ENCRYPT_MODE,key,ivSpec);
    }
    private static void go2(){
        INITIALIZATION = DEFAULT_INITIALIZATION.toCharArray();
    }
    private static void go3(){
        initialization = INITIALIZATION;
    }

	public StaticInitializationVectorABICase2(){
        go2();
        go3();
    }

    public static void main (String [] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
		System.out.println("REDEFINITION PASSED");
        StaticInitializationVectorABICase2 siv = new StaticInitializationVectorABICase2();
        go2();
        go3();

        siv.go();
    }
}
