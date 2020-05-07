package org.cryptoapi.bench.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHashABMC2 {
    private void go(String str, String crypto) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance(crypto);
        md.update(str.getBytes());
        System.out.println(md.digest());		
    }

	public void go(String str) throws NoSuchAlgorithmException {
		go(str, "SHA-256");
	}

	public static void main (String [] args)  throws NoSuchAlgorithmException {
		System.out.println("REDEFINITION PASSED");
		BrokenHashABMC2 c = new BrokenHashABMC2();
		c.go("Test");
	}
}
