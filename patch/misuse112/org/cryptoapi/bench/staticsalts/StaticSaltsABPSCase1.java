package org.cryptoapi.bench.staticsalts;
import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class StaticSaltsABPSCase1 {
    public static void main (String [] args){
        StaticSaltsABPSCase1 cs = new StaticSaltsABPSCase1();
        int choice=2;
        cs.key2(choice);
    }

    public void key2(int choice){
		System.out.println("REDEFINITION PASSED");
        PBEParameterSpec pbeParamSpec = null;
        SecureRandom sr2 = new SecureRandom();
        byte[] salt= new byte[32];
		sr2.nextBytes(salt);
        int count = 10200;
        pbeParamSpec = new PBEParameterSpec(salt, count);
    }
}
