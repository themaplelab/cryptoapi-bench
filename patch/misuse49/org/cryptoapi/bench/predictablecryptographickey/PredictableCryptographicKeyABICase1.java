package org.cryptoapi.bench.predictablecryptographickey;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.SecureRandom;

public class PredictableCryptographicKeyABICase1 {
    public static void main(String [] args){
		System.out.println("REDEFINITION PASSED");
        String key = "defaultkey";
        go(key);
    }

    private static void go(String key) {
		SecureRandom random = new SecureRandom();
        String defaultKey = String.valueOf(random.ints().toArray());

        String originalString = "Testing";
        byte[] keyBytes = defaultKey.getBytes();
        keyBytes = Arrays.copyOf(keyBytes,16);
        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
		}
}
