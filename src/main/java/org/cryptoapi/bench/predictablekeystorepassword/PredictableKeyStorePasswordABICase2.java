package org.cryptoapi.bench.predictablekeystorepassword;

import java.io.IOException;
import java.net.URL;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

public class PredictableKeyStorePasswordABICase2 {
    public static final String DEFAULT_ENCRYPT_KEY = "changeit";
    private static char[] ENCRYPT_KEY;
    private static char[] encryptKey;
    URL cacerts;
    public static void main(String [] args) throws CertificateException, NoSuchAlgorithmException {
        PredictableKeyStorePasswordABICase2 pksp = new PredictableKeyStorePasswordABICase2();
        go2();
        go3();
        pksp.go();
    }

    private static void go2(){
        ENCRYPT_KEY = DEFAULT_ENCRYPT_KEY.toCharArray();
    }
    private static void go3(){
        encryptKey = ENCRYPT_KEY;
    }

    private void go() throws  CertificateException, NoSuchAlgorithmException {
		try{
		String type = "JKS";
        KeyStore ks = KeyStore.getInstance(type);
        cacerts = new URL("https://no");
        ks.load(cacerts.openStream(), encryptKey);
		}catch(KeyStoreException |  IOException e){
            System.out.println("This keystore operation does not work!...");
        }
    }
}
