package org.cryptoapi.bench.staticsalts;

import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class StaticSaltsABICase3 {
    public static void main(String [] args){
		System.out.println("REDEFINITION PASSED");
		 SecureRandom random = new SecureRandom();
        PBEParameterSpec pbeParamSpec = null;
        byte[] salt = new byte[32];
        random.nextBytes(salt);
        int count = 10200;
        method1(salt,count);
    }
    public static void method1(byte[] s, int c){
        int count2 = c;
        method2(s,count2);
    }

    public static void method2(byte[] salt, int count){
        PBEParameterSpec pbeParamSpec = null;
        pbeParamSpec = new PBEParameterSpec(salt, count);
    }
}
