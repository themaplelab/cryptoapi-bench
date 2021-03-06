package org.cryptoapi.bench.pbeiteration;

import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class LessThan1000IterationPBEBBCase1 {
    public static void main(String[] args){
		System.out.println("REDEFINITION PASSED");
        LessThan1000IterationPBEBBCase1 lt = new LessThan1000IterationPBEBBCase1();
        lt.key2();
    }
    public void key2(){
        SecureRandom random = new SecureRandom();
        PBEParameterSpec pbeParamSpec = null;
        byte[] salt = new byte[32];
        random.nextBytes(salt);
        int count = 10200;
        pbeParamSpec = new PBEParameterSpec(salt, count);
    }
}
