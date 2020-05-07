package org.cryptoapi.bench.staticsalts;

import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class StaticSaltsABICase1 {

    public static void main(String [] args){
		System.out.println("REDEFINITION PASSED");
        StaticSaltsABICase1 cs = new StaticSaltsABICase1();
        byte[] salt = {(byte) 0xa2};
        int count = 10200;
        cs.key2(salt,count);

    }
    public void key2(byte[] salt, int count){
		SecureRandom random = new SecureRandom();
        PBEParameterSpec pbeParamSpec = null;
        byte[] salt1 = new byte[32];
        random.nextBytes(salt1);
        pbeParamSpec = new PBEParameterSpec(salt1, count);
    }
}
