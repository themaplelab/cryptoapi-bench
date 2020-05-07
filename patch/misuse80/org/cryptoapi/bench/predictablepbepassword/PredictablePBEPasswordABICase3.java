package org.cryptoapi.bench.predictablepbepassword;

import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class PredictablePBEPasswordABICase3 {
    private PBEKeySpec pbeKeySpec = null;
    private PBEParameterSpec pbeParamSpec = null;

    public static void main(String [] args){
		System.out.println("REDEFINITION PASSED");
        PredictablePBEPasswordABICase3 pppac = new PredictablePBEPasswordABICase3();
        String password = "sagar";
        pppac.method1(password);
    }

    public void method1(String k){
        String key2 = k;
        method2(key2);
    }

    public void method2(String password) {
        byte [] salt = new byte[16];
        SecureRandom sr = new SecureRandom();
        sr.nextBytes(salt);
        int iterationCount = 11010;
        int keyLength = 16;

		SecureRandom random = new SecureRandom();
        int [] randints =random.ints().toArray();
        char [] pwd = new char[randints.length];
        for (int i =0 ; i < randints.length; i++){
            pwd[i] = (char) (randints[i] % 65535);
        }
		
        pbeKeySpec = new PBEKeySpec(pwd,salt,iterationCount,keyLength);
		 pbeKeySpec.clearPassword();
    }
}
