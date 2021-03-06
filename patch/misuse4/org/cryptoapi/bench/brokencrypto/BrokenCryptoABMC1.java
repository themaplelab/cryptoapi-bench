package org.cryptoapi.bench.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCryptoABMC1 {
    public void go(String crypto, String cryptoKey) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        SecretKey key = keyGen.generateKey();
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, key);
    }

	//+
	private void go() throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException{
		String cryptoKey = "AES";
		String crypto = "AES/CBC/PKCS5Padding";
		go(crypto, cryptoKey);
		
	}
	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException{
		System.out.println("REDEFINITION PASSED");
		BrokenCryptoABMC1 b = new BrokenCryptoABMC1();
		b.go();
	}
}
