package org.cryptoapi.bench.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCryptoABMC2 {
    private void go(String crypto, String ky) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException {
        KeyGenerator keyGen = KeyGenerator.getInstance(ky);
        SecretKey key = keyGen.generateKey();
        Cipher cipher = Cipher.getInstance(crypto);
        cipher.init(Cipher.ENCRYPT_MODE, key);
    }

	public void go() throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException{
		go("AES/CBC/PKCS5Padding", "AES");
	}
	public static void main (String [] args)  throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException {
		System.out.println("REDEFINITION PASSED");
		BrokenCryptoABMC2 b = new BrokenCryptoABMC2();
        b.go();
    }
}
