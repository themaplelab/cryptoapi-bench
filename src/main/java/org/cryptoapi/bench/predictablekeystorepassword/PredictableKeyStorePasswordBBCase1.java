package org.cryptoapi.bench.predictablekeystorepassword;

import java.io.IOException;
import java.net.URL;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

public class PredictableKeyStorePasswordBBCase1 {

    URL cacerts;
    public static void main(String args[]) throws  CertificateException, NoSuchAlgorithmException {
        PredictableKeyStorePasswordBBCase1 pksp = new PredictableKeyStorePasswordBBCase1();
        pksp.go();
    }

    public void go() throws  CertificateException, NoSuchAlgorithmException {
		try{
		String type = "JKS";
        KeyStore ks = KeyStore.getInstance(type);
        cacerts = new URL("https://no");
        String defaultKey = "changeit";
        ks.load(cacerts.openStream(), defaultKey.toCharArray());
		}catch(KeyStoreException |  IOException e){
            System.out.println("This keystore operation does not work!...");
        }
    }


}
