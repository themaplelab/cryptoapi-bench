package org.cryptoapi.bench.predictablekeystorepassword;

import java.io.IOException;
import java.net.URL;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

public class PredictableKeyStorePasswordABICase1 {
    URL cacerts;
    public static void main(String args[]) throws CertificateException, NoSuchAlgorithmException {
        PredictableKeyStorePasswordABICase1 pksp = new PredictableKeyStorePasswordABICase1();
        String key = "changeit";
        pksp.go(key);
    }

    public void go(String key) throws CertificateException, NoSuchAlgorithmException {
		try{
        String type = "JKS";
        KeyStore ks = KeyStore.getInstance(type);
        cacerts = new URL("https://no");
        ks.load(cacerts.openStream(), key.toCharArray());
		}catch(KeyStoreException |  IOException e){
            System.out.println("This keystore operation does not work!...");
        }
    }
}
