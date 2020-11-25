package org.cryptoapi.bench.pbeiteration;
import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.PBEParameterSpec;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.spec.PBEKeySpec;

public class LessThan1000IterationPBEABPSCase1 {
    public static void main(String[] args) {
		System.out.println("REDEFINITION PASSED");
        byte[] salt = new byte[32];
        int choice = 2;
        int count = 10500;
        SecureRandom random = new SecureRandom();
        random.nextBytes(salt);
        if(choice > 1)
            count = 10500;

        PBEParameterSpec pbeParamSpec = null;
        pbeParamSpec = new PBEParameterSpec(salt, count);
    }
}
