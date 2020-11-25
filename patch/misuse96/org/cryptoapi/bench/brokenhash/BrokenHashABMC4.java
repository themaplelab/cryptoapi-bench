package org.cryptoapi.bench.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHashABMC4 {
    public void go(String str, String crypto) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(str.getBytes());
        System.out.println(md.digest());
    }


	 public static void main (String [] args) throws NoSuchAlgorithmException {
		 System.out.println("REDEFINITION PASSED");
		 BrokenHashABMC4 b = new BrokenHashABMC4();
		 b.go("Test", "SHA-256");
	 }
}
