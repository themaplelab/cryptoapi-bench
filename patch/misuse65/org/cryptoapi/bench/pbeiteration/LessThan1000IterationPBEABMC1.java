package org.cryptoapi.bench.pbeiteration;

import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class LessThan1000IterationPBEABMC1 {
    private void go(int count) {
        SecureRandom random = new SecureRandom();
        PBEParameterSpec pbeParamSpec = null;
        byte[] salt = new byte[32];
        random.nextBytes(salt);

        pbeParamSpec = new PBEParameterSpec(salt, count);
    }

	public void go() {
		go(10000);
	}
	public static void main (String [] args) {
		System.out.println("REDEFINITION PASSED");
		LessThan1000IterationPBEABMC1 p = new LessThan1000IterationPBEABMC1();
		p.go();
	}
}
