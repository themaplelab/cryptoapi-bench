package org.cryptoapi.bench.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCryptoABICase500 {
    public static String DEFAULT_CRYPTO = "AES/CBC/PKCS5Padding";
	private static String	notimportant = "willstaythesame";
	public static  String DEFAULT_CRYPTO_ALGO = "AES";

	
    public void go() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        KeyGenerator keyGen = KeyGenerator.getInstance(DEFAULT_CRYPTO_ALGO);
        SecretKey key = keyGen.generateKey();
        Cipher cipher = Cipher.getInstance(DEFAULT_CRYPTO);
		System.out.println("Using this algorithm for the cipher: "+ cipher.getAlgorithm());
        cipher.init(Cipher.ENCRYPT_MODE, key);
    }
    public static void main (String [] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
		System.out.println("REDEFINITION PASSED");
        BrokenCryptoABICase500 bc = new BrokenCryptoABICase500();
		if(args[0].equals("randomstring")){
            DEFAULT_CRYPTO = "";
            DEFAULT_CRYPTO_ALGO = "";
		}
        bc.go();
    }
}
