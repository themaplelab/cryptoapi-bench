package org.cryptoapi.bench.staticsalts;

import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class StaticSaltsBBCase1 {
    public static void main (String [] args){
		System.out.println("REDEFINITION PASSED");
        StaticSaltsBBCase1 cs = new StaticSaltsBBCase1();
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
