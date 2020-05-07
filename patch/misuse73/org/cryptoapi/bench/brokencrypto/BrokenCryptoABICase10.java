package org.cryptoapi.bench.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCryptoABICase10 {
    public static final String DEFAULT_CRYPTO = "AES/CBC/PKCS5Padding";
	public static final String DEFAULT_KEY = "AES";
    private static char[] CRYPTO;
    private static char[] crypto;
	private static char[] KEY;
    private static char[] key;
    public void go() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        KeyGenerator keyGen = KeyGenerator.getInstance(String.valueOf(key));
        SecretKey key = keyGen.generateKey();
        Cipher cipher = Cipher.getInstance(String.valueOf(crypto));
        cipher.init(Cipher.ENCRYPT_MODE, key);
    }
    private static void go2(){
		KEY = DEFAULT_KEY.toCharArray();
        CRYPTO = DEFAULT_CRYPTO.toCharArray();
    }
    private static void go3(){
		key = KEY;
        crypto = CRYPTO;
    }

    public static void main (String [] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
		System.out.println("REDEFINITION PASSED");
        BrokenCryptoABICase10 bc = new BrokenCryptoABICase10();
        go2();
        go3();
        bc.go();
    }

}
