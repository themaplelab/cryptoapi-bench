package org.cryptoapi.bench.brokenhash;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHashABPSCase4 {
    public static void main (String [] args) throws NoSuchAlgorithmException {
		System.out.println("REDEFINITION PASSED");
        String name = "abcdef";
        int choice = 2;
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        if(choice>1)
            md = MessageDigest.getInstance("SHA-256");
        md.update(name.getBytes());
        System.out.println(md.digest());
    }
}
