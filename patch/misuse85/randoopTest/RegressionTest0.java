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
        org.cryptoapi.bench.predictablecryptographickey.PredictableCryptographicKeyABSCase1 predictableCryptographicKeyABSCase1_0 = new org.cryptoapi.bench.predictablecryptographickey.PredictableCryptographicKeyABSCase1();
        java.lang.Class<?> wildcardClass1 = predictableCryptographicKeyABSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.lang.String str1 = org.cryptoapi.bench.predictablecryptographickey.PredictableCryptographicKeyABSCase1.getKey("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.cryptoapi.bench.predictablecryptographickey.PredictableCryptographicKeyABSCase1.getKey("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

