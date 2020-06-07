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
        org.cryptoapi.bench.brokenhash.BrokenHashABICase4 brokenHashABICase4_0 = new org.cryptoapi.bench.brokenhash.BrokenHashABICase4();
        java.lang.Class<?> wildcardClass1 = brokenHashABICase4_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        // The following exception was thrown during execution in test generation
        try {
            org.cryptoapi.bench.brokenhash.BrokenHashABICase4.go("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException; message: hi! MessageDigest not available");
        } catch (java.security.NoSuchAlgorithmException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        // The following exception was thrown during execution in test generation
        try {
            org.cryptoapi.bench.brokenhash.BrokenHashABICase4.go("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException; message:  MessageDigest not available");
        } catch (java.security.NoSuchAlgorithmException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        // The following exception was thrown during execution in test generation
        try {
            org.cryptoapi.bench.brokenhash.BrokenHashABICase4.go("", "");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException; message:  MessageDigest not available");
        } catch (java.security.NoSuchAlgorithmException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        // The following exception was thrown during execution in test generation
        try {
            org.cryptoapi.bench.brokenhash.BrokenHashABICase4.go("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException; message: hi! MessageDigest not available");
        } catch (java.security.NoSuchAlgorithmException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

