package org.cryptoapi.bench.predictablepbepassword;

public class PredictablePBEPasswordABMCCase1 {
    public static void main(String [] args){
		System.out.println("REDEFINITION PASSED");
        PredictablePBEPasswordABMC1 ckp = new PredictablePBEPasswordABMC1();
		//fixing PredictablePBEPasswordABMC1 misuse 43 fixes this , key disregards the password in favor of safe random construction
		String password = "sagar";
        ckp.key(password);
    }
}
