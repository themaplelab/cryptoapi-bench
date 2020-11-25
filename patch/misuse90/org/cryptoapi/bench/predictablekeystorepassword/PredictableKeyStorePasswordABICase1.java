package org.cryptoapi.bench.predictablekeystorepassword;

import java.io.IOException;
import java.net.URL;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.SecureRandom;

public class PredictableKeyStorePasswordABICase1 {
    URL cacerts;
    public static void main(String args[]) throws  CertificateException, NoSuchAlgorithmException {
		System.out.println("REDEFINITION PASSED");
        PredictableKeyStorePasswordABICase1 pksp = new PredictableKeyStorePasswordABICase1();
        String key = "changeit";
        pksp.go(key);
    }

    public void go(String key) throws  CertificateException, NoSuchAlgorithmException {
		try{
		String type = "JKS";
        KeyStore ks = KeyStore.getInstance(type);
        cacerts = new URL("https://www.google.com");

        SecureRandom random = new SecureRandom();
        int [] randints =random.ints().toArray();
        char [] pwd = new char[randints.length];
        for (int i =0 ; i < randints.length; i++){
            pwd[i] = (char) (randints[i] % 65535);
        }

        ks.load(cacerts.openStream(), pwd);
		}catch(KeyStoreException |  IOException e){
            System.out.println("This keystore operation does not work!...");
        }
    }
}
