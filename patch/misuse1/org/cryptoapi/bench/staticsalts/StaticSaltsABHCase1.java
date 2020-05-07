package org.cryptoapi.bench.staticsalts;

import javax.crypto.spec.PBEParameterSpec;
import java.util.HashMap;
import java.util.Map;
import java.security.SecureRandom;

public class StaticSaltsABHCase1 {
    public static void main (String [] args){
		System.out.println("REDEFINITION PASSED");
        StaticSaltsABHCase1 cs = new StaticSaltsABHCase1();
        cs.key2();
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
