package org.cryptoapi.bench.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCryptoABICase5 {
    public static final String DEFAULT_CRYPTO = "AES/CBC/PKCS5Padding";
    private static char[] CRYPTO;
    private static char[] crypto;

    public static final String DEFAULT_CRYPTO_ALGO = "AES";
    private static char[] CRYPTO_ALGO;
    private static char[] crypto_algo;

    public void go() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        KeyGenerator keyGen = KeyGenerator.getInstance(String.valueOf(crypto_algo));
        SecretKey key = keyGen.generateKey();
        Cipher cipher = Cipher.getInstance(String.valueOf(crypto));
		System.out.println("Using this algorithm for the cipher: "+ cipher.getAlgorithm());
        cipher.init(Cipher.ENCRYPT_MODE, key);
    }
    private static void go2(){

        CRYPTO = DEFAULT_CRYPTO.toCharArray();
        CRYPTO_ALGO = DEFAULT_CRYPTO_ALGO.toCharArray();
    }
    private static void go3(){

        crypto = CRYPTO;
        crypto_algo = CRYPTO_ALGO;
    }

    public static void main (String [] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
		System.out.println("REDEFINITION PASSED");
        BrokenCryptoABICase5 bc = new BrokenCryptoABICase5();
        go2();
        go3();
        bc.go();
    }
}
