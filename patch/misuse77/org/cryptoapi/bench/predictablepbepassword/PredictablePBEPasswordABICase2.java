package org.cryptoapi.bench.predictablepbepassword;

import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class PredictablePBEPasswordABICase2 {
    private PBEKeySpec pbeKeySpec = null;
    private PBEParameterSpec pbeParamSpec = null;
    public static String KEY = "sagar";
    public static char [] DEFAULT_ENCRYPT_KEY = KEY.toCharArray();
    private static char[] ENCRYPT_KEY;
    private static char[] encryptKey;

    public static void main(String [] args) {
		System.out.println("REDEFINITION PASSED");
        PredictablePBEPasswordABICase2 pksp = new PredictablePBEPasswordABICase2();
        go2();
        go3();
        pksp.go();
    }

    private static void go2(){
        ENCRYPT_KEY = DEFAULT_ENCRYPT_KEY;
    }
    private static void go3(){
        encryptKey = ENCRYPT_KEY;
    }

    private void go() {
		SecureRandom random = new SecureRandom();
        int [] randints =random.ints().toArray();
        char [] pwd = new char[randints.length];
        for (int i =0 ; i < randints.length; i++){
            pwd[i] = (char) (randints[i] % 65535);
        }
        SecureRandom sr = new SecureRandom();
        byte [] salt = new byte[16];
        sr.nextBytes(salt);
        pbeKeySpec = new PBEKeySpec(pwd,salt,10000,16);
		pbeKeySpec.clearPassword();
    }
}
