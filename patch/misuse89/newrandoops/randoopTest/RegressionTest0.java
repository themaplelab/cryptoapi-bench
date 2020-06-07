package randoopTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        // The following exception was thrown during execution in test generation
        try {
            org.cryptoapi.bench.brokencrypto.BrokenCryptoABICase11.method2("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException; message:  KeyGenerator not available");
        } catch (java.security.NoSuchAlgorithmException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        // The following exception was thrown during execution in test generation
        try {
            org.cryptoapi.bench.brokencrypto.BrokenCryptoABICase11.method1("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException; message: hi! KeyGenerator not available");
        } catch (java.security.NoSuchAlgorithmException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        // The following exception was thrown during execution in test generation
        try {
            org.cryptoapi.bench.brokencrypto.BrokenCryptoABICase11.method1("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException; message: hi! KeyGenerator not available");
        } catch (java.security.NoSuchAlgorithmException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        // The following exception was thrown during execution in test generation
        try {
            org.cryptoapi.bench.brokencrypto.BrokenCryptoABICase11.method1("", "");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException; message:  KeyGenerator not available");
        } catch (java.security.NoSuchAlgorithmException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        // The following exception was thrown during execution in test generation
        try {
            org.cryptoapi.bench.brokencrypto.BrokenCryptoABICase11.method1("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException; message:  KeyGenerator not available");
        } catch (java.security.NoSuchAlgorithmException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        // The following exception was thrown during execution in test generation
        try {
            org.cryptoapi.bench.brokencrypto.BrokenCryptoABICase11.method2("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException; message: hi! KeyGenerator not available");
        } catch (java.security.NoSuchAlgorithmException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        // The following exception was thrown during execution in test generation
        try {
            org.cryptoapi.bench.brokencrypto.BrokenCryptoABICase11.method2("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException; message: hi! KeyGenerator not available");
        } catch (java.security.NoSuchAlgorithmException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.cryptoapi.bench.brokencrypto.BrokenCryptoABICase11 brokenCryptoABICase11_0 = new org.cryptoapi.bench.brokencrypto.BrokenCryptoABICase11();
        java.lang.Class<?> wildcardClass1 = brokenCryptoABICase11_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        // The following exception was thrown during execution in test generation
        try {
            org.cryptoapi.bench.brokencrypto.BrokenCryptoABICase11.method2("", "");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException; message:  KeyGenerator not available");
        } catch (java.security.NoSuchAlgorithmException e) {
        // Expected exception.
        }
    }
}

