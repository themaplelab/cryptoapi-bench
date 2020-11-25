package org.cryptoapi.bench.predictablekeystorepassword;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

public class PredictableKeyStorePasswordABMC1 {
    URL cacerts;
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
	public static void main (String [] args)throws  CertificateException, NoSuchAlgorithmException  {
        PredictableKeyStorePasswordABMC1 p = new PredictableKeyStorePasswordABMC1();
        p.go("test");
    }
}
