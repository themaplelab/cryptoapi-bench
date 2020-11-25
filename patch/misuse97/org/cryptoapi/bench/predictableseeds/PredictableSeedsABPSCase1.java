package org.cryptoapi.bench.predictableseeds;
import java.security.SecureRandom;


public class PredictableSeedsABPSCase1 {
    public static void main (String [] args){
		System.out.println("REDEFINITION PASSED");
		SecureRandom sr = new SecureRandom();
        long l = sr.nextLong();
        sr.setSeed(l);
        int v = sr.nextInt();
        System.out.println(v);
    }
}
