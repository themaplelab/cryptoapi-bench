package org.cryptoapi.bench.staticsalts;

import javax.crypto.spec.PBEParameterSpec;

public class StaticSaltsABMC1 {
    public void key2(byte[] salt, int count) {
        PBEParameterSpec pbeParamSpec = null;
        pbeParamSpec = new PBEParameterSpec(salt, count);
    }
	 public static void main (String [] args){
        StaticSaltsABMC1 s = new StaticSaltsABMC1();
        s.key2("Test".getBytes(), 1);
	 }
}
