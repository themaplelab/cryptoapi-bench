package org.cryptoapi.bench.predictablekeystorepassword;

import java.io.IOException;
import java.net.URL;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.SecureRandom;

public class PredictableKeyStorePasswordABICase3 {
    URL cacerts;
    public static void main(String args[]) throws KeyStoreException, IOException, CertificateException, NoSuchAlgorithmException {
		System.out.println("REDEFINITION PASSED");
        PredictableKeyStorePasswordABICase3 pkspac = new PredictableKeyStorePasswordABICase3();
        String key = "changeit";
        pkspac.method1(key);
    }

    public void method1(String k) throws KeyStoreException, IOException, CertificateException, NoSuchAlgorithmException {
        String key2 = k;
        method2(key2);
    }

    public void method2(String key) throws KeyStoreException, IOException, CertificateException, NoSuchAlgorithmException {
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
	}
}
