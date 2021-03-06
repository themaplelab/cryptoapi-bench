package org.cryptoapi.bench.pbeiteration;

import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class LessThan1000IterationPBEABICase2 {
    public static final String DEFAULT_COUNT = "10000";
    private static char[] COUNT;
    private static char[] count;
    public static void main(String[] args){
		System.out.println("REDEFINITION PASSED");
        LessThan1000IterationPBEABICase2 lt = new LessThan1000IterationPBEABICase2();
        go2();
        go3();
        lt.key2();
    }
    private static void go2(){
        COUNT = DEFAULT_COUNT.toCharArray();
    }
    private static void go3(){
        count = COUNT;
    }
    public void key2(){
        SecureRandom random = new SecureRandom();
        PBEParameterSpec pbeParamSpec = null;
        byte[] salt = new byte[32];
        random.nextBytes(salt);
		Accessory.callCount(DEFAULT_COUNT);
		//        pbeParamSpec = new PBEParameterSpec(salt, Integer.parseInt(String.valueOf(count)));
		pbeParamSpec = new PBEParameterSpec(salt, 10000);
    }
}
