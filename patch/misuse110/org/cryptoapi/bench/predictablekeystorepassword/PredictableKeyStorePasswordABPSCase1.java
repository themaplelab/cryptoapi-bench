package org.cryptoapi.bench.predictablekeystorepassword;

import java.io.IOException;
import java.net.URL;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;

public class PredictableKeyStorePasswordABPSCase1 {
    URL cacerts;
    public static void main(String args[]) throws KeyStoreException, IOException, CertificateException, NoSuchAlgorithmException {
        PredictableKeyStorePasswordABPSCase1 pksp = new PredictableKeyStorePasswordABPSCase1();
        int choice=2;
        pksp.go(choice);
    }

    public void go(int choice) throws KeyStoreException, IOException, CertificateException, NoSuchAlgorithmException {
		System.out.println("REDEFINITION PASSED");
        try{
			String type = "JKS";
        KeyStore ks = KeyStore.getInstance(type);
        cacerts = new URL("https://no");

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
