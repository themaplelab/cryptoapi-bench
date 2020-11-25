package org.cryptoapi.bench.predictablepbepassword;

import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class PredictablePBEPasswordABPSCase1 {
    private PBEKeySpec pbeKeySpec = null;
    private PBEParameterSpec pbeParamSpec = null;

    public static void main(String [] args){
        PredictablePBEPasswordABPSCase1 ckp = new PredictablePBEPasswordABPSCase1();
        int choice=2;
        ckp.key(choice);
    }
    public void key(int choice) {
		System.out.println("REDEFINITION PASSED");

		 SecureRandom random = new SecureRandom();
        int [] randints =random.ints().toArray();
        char [] pwd = new char[randints.length];
        for (int i =0 ; i < randints.length; i++){
            pwd[i] = (char) (randints[i] % 65535);
        }
        byte [] salt = new byte[16];
        random.nextBytes(salt);
		
        int iterationCount = 11010;
        int keyLength = 16;
        pbeKeySpec = new PBEKeySpec(pwd,salt,iterationCount,keyLength);
		pbeKeySpec.clearPassword();
    }
}
