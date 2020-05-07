package org.cryptoapi.bench.staticsalts;

import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class StaticSaltsABMC1 {
    public void key2(byte[] salt, int count) {
		 SecureRandom random = new SecureRandom();
        PBEParameterSpec pbeParamSpec = null;
        byte[] salt1 = new byte[32];
        random.nextBytes(salt1);
        int count1 = 10200;
        pbeParamSpec = new PBEParameterSpec(salt1, count1);
    }

	public static void main (String [] args){
		System.out.println("REDEFINITION PASSED");
		StaticSaltsABMC1 s = new StaticSaltsABMC1();
		s.key2("Test".getBytes(), 1);
		}
}
