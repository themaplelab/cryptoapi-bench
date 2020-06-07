package org.cryptoapi.bench.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCryptoABMC4 {
    public void go(String keygen) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException {
        KeyGenerator keyGen = KeyGenerator.getInstance(keygen);
        SecretKey key = keyGen.generateKey();
        Cipher cipher = Cipher.getInstance(keygen+"/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, key);
    }

	public void go() throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException{
		go("AES");
	}

	public static void main (String [] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException{
		System.out.println("REDEFINITION PASSED");
		BrokenCryptoABMC4 b = new BrokenCryptoABMC4();
		b.go();
	}
}
