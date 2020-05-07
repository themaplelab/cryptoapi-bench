package org.cryptoapi.bench.predictablecryptographickey;

import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.SecureRandom;

public class PredictableCryptographicKeyABMC1 {
    public void go(String key) {
		SecureRandom random = new SecureRandom();
        String defaultKey = String.valueOf(random.ints().toArray());

        byte[] keyBytes = defaultKey.getBytes();
        keyBytes = Arrays.copyOf(keyBytes,16);
        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
		}
	public static void main (String [] args){
		System.out.println("REDEFINITION PASSED");
		PredictableCryptographicKeyABMC1 p = new PredictableCryptographicKeyABMC1();
		p.go("Test");
	}
	 
}
