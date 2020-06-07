package org.cryptoapi.bench.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHashABMC1 {
    public void go(String str, String crypto) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance(crypto);
        md.update(str.getBytes());
        System.out.println(md.digest());
    }
	public void go(String str) throws NoSuchAlgorithmException {
        go(str, "MD5");
    }
    public static void main (String [] args) throws NoSuchAlgorithmException {
        BrokenHashABMC1 b = new BrokenHashABMC1();
        b.go("Test");
    }
}
