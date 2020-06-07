package randoopTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase2 insecureAsymmetricCipherABICase2_0 = new org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase2();
        java.security.KeyPairGenerator keyPairGenerator1 = null;
        java.security.KeyPair keyPair2 = null;
        // The following exception was thrown during execution in test generation
        try {
            insecureAsymmetricCipherABICase2_0.go(keyPairGenerator1, keyPair2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase2 insecureAsymmetricCipherABICase2_0 = new org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase2();
        java.lang.Class<?> wildcardClass1 = insecureAsymmetricCipherABICase2_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        int int0 = org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase2.DEFAULT_KEY_SIZE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2048 + "'", int0 == 2048);
    }
}

