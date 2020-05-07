package org.cryptoapi.bench.staticsalts;

import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class StaticSaltsABICase2 {
    public static final String DEFAULT_SALT = "12345";
    private static char[] SALT;
    private static char[] salt;
    public static void main(String [] args){
		System.out.println("REDEFINITION PASSED");
        StaticSaltsABICase2 cs = new StaticSaltsABICase2();
        int count = 10200;
        go2();
        go3();
        cs.key2(count);

    }

    private static void go2(){
        SALT = DEFAULT_SALT.toCharArray();
    }
    private static void go3(){
        salt = SALT;
    }

    public void key2(int count){
		SecureRandom random = new SecureRandom();
        PBEParameterSpec pbeParamSpec = null;
        byte[] salt = new byte[32];
        random.nextBytes(salt);
		pbeParamSpec = new PBEParameterSpec(salt, count);
    }
}

