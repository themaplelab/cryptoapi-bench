package org.cryptoapi.bench.predictablekeystorepassword;

import java.io.IOException;
import java.net.URL;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.HashMap;
import java.util.Map;

public class PredictableKeyStorePasswordABHCase2 {
    URL cacerts;
    public static void main(String args[]) throws  CertificateException, NoSuchAlgorithmException {
		PredictableKeyStorePasswordABHCase2 pksp = new PredictableKeyStorePasswordABHCase2();
        pksp.go();
    }

    public void go() throws CertificateException, NoSuchAlgorithmException {
		try{
			String type = "JKS";
			Map<String,String> hm = new HashMap<String, String>();
			hm.put("aaa", "afix");
			hm.put("bbb", "bfix");
			hm.put("ccc", "cfix");
			hm.put("ddd", "dfix");
			
			String key = hm.get("aaa");
			
			KeyStore ks = KeyStore.getInstance(type);
			cacerts = new URL("https://no");
			ks.load(cacerts.openStream(), key.toCharArray());
		}catch(KeyStoreException |  IOException e){
            System.out.println("This keystore operation does not work!...");
        }
	}

}
