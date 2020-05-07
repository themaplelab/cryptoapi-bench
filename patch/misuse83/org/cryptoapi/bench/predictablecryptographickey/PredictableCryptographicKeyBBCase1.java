package org.cryptoapi.bench.predictablecryptographickey;

import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;
import java.util.Arrays;

public class PredictableCryptographicKeyBBCase1 {
    public static void main(String [] args){
		System.out.println("REDEFINITION PASSED");
		SecureRandom random = new SecureRandom();
        String defaultKey = String.valueOf(random.ints().toArray());
		 byte[] keyBytes = defaultKey.getBytes();
        keyBytes = Arrays.copyOf(keyBytes,16);
        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
		
    }
}
