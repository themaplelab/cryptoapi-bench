package org.cryptoapi.bench.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCryptoABMC2 {
    public void go(String crypto) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        SecretKey key = keyGen.generateKey();
        Cipher cipher = Cipher.getInstance(crypto);
        cipher.init(Cipher.ENCRYPT_MODE, key);
    }

	public void go() throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException{
        go("AES/ECB/PKCS5Padding");
    }
    public static void main (String [] args)  throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException {
        BrokenCryptoABMC2 b = new BrokenCryptoABMC2();
        b.go();
    }
}
