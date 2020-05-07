package org.cryptoapi.bench.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCryptoABMC5 {
    private void go(String crypto, String k) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException {
        KeyGenerator keyGen = KeyGenerator.getInstance(k);
        SecretKey key = keyGen.generateKey();
        Cipher cipher = Cipher.getInstance(crypto);
        cipher.init(Cipher.ENCRYPT_MODE, key);
    }

	public void go(String crypto) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException {
		go("AES/CBC/PKCS5Padding", "AES");
	}

	public static void main (String [] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException {
		System.out.println("REDEFINITION PASSED");
		BrokenCryptoABMC5 b = new BrokenCryptoABMC5();
		b.go("Test");
	}
}
