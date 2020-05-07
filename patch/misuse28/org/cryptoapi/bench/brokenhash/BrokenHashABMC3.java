package org.cryptoapi.bench.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHashABMC3 {
    private void go(String str, String crypto) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance(crypto);
        md.update(str.getBytes());
        System.out.println(md.digest());
    }

	public void go(String str) throws NoSuchAlgorithmException{
		go(str, "SHA-256");
	}

	public static void main (String [] args)  throws NoSuchAlgorithmException {
		System.out.println("REDEFINITION PASSED");
		BrokenHashABMC3 b = new BrokenHashABMC3();
        b.go("Test");
    }
}
