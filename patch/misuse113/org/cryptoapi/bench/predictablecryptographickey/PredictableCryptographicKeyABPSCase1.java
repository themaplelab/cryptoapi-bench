package org.cryptoapi.bench.predictablecryptographickey;

import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import java.security.GeneralSecurityException;

public class PredictableCryptographicKeyABPSCase1 {
    public static void main(String [] args){
		System.out.println("REDEFINITION PASSED");
		  try{
			  final byte[] salt = new byte[32];
			  SecureRandom.getInstanceStrong().nextBytes(salt);
			  char[] corPwd  = new char[20];
			  SecureRandom rnd = new SecureRandom();
			  for (int i = 0; i < 20; i++) {
				  corPwd[i] = (char) (rnd.nextInt(26) + 'a');
			  }
			  final PBEKeySpec pbekeyspec = new PBEKeySpec(corPwd, salt, 10200, 128);
			  final SecretKeyFactory secFac = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
			  SecretKey tmpKey = secFac.generateSecret(pbekeyspec);
			  pbekeyspec.clearPassword();
			  byte[] keyMaterial = tmpKey.getEncoded();
			  final SecretKeySpec actKey = new SecretKeySpec(keyMaterial, "AES");
		  }catch(GeneralSecurityException  e){
			  System.out.println("Exception");
		  }
    }

}
