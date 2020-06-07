package org.cryptoapi.bench.predictablecryptographickey;

import javax.crypto.spec.SecretKeySpec;
import javax.crypto.SecretKey;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.security.SecureRandom;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class PredictableCryptographicKeyABHCase2 {
    public static void main(String [] args) throws UnsupportedEncodingException, GeneralSecurityException {
		System.out.println("REDEFINITION PASSED");
		char[] password = new char[] {'p', 'a', 's', 's', 'w', 'o', 'r', 'd'};
        byte [] salt = new byte[32];
        SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
        secureRandom.nextBytes(salt);

        SecretKeyFactory skf = SecretKeyFactory.getInstance("PBEWithHmacSHA512AndAES_128");
        PBEKeySpec pbeks = new PBEKeySpec(password, salt, 10299, 128);
        SecretKey secretKey =  skf.generateSecret(pbeks);
        byte keyMaterial[] = secretKey.getEncoded();
        SecretKeySpec object = new SecretKeySpec(keyMaterial, "HmacSHA256");

		pbeks.clearPassword();
    }
}
