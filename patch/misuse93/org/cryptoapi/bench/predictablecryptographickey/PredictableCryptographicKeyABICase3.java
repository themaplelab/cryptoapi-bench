package org.cryptoapi.bench.predictablecryptographickey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.SecureRandom;

public class PredictableCryptographicKeyABICase3 {
    public static void main(String [] args){
		System.out.println("REDEFINITION PASSED");
        String key = "defaultkey";
        method1(key);
    }
    public static void method1(String k){
        String key2 = k;
        method2(key2);
    }

    private static void method2(String key) {
		SecureRandom random = new SecureRandom();
        String defaultKey = String.valueOf(random.ints().toArray());

        byte[] keyBytes = defaultKey.getBytes();
        keyBytes = Arrays.copyOf(keyBytes,16);
        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
    }
}
