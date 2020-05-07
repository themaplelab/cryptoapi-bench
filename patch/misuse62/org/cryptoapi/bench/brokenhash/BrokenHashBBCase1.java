package org.cryptoapi.bench.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHashBBCase1 {
    public static void main (String [] args) throws NoSuchAlgorithmException {
		System.out.println("REDEFINITION PASSED");
        String name = "abcdef";
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(name.getBytes());
        System.out.println(md.digest());
    }
}
