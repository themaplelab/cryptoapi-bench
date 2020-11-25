package org.cryptoapi.bench.predictablepbepassword;

import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class PredictablePBEPasswordABSCase1 {
    CryptoPredictablePBE crypto;
    public PredictablePBEPasswordABSCase1(){
        String password = "sagar";
        crypto = new CryptoPredictablePBE(password);
        crypto.method1("");
    }
	public static void main (String [] args){
		System.out.println("REDEFINITION PASSED");
		PredictablePBEPasswordABSCase1 p = new PredictablePBEPasswordABSCase1();
	}
}


class CryptoPredictablePBE {
    String defPassword;
    private PBEKeySpec pbeKeySpec = null;
    private PBEParameterSpec pbeParamSpec = null;

    public CryptoPredictablePBE(String password){

        defPassword = password;
    }

    public void method1(String passedPassword) {

        if(passedPassword.isEmpty()){
            passedPassword = defPassword;
        }
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
