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
        java.lang.String str0 = org.cryptoapi.bench.predictablekeystorepassword.PredictableKeyStorePasswordABICase2.DEFAULT_ENCRYPT_KEY;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "changeit" + "'", str0.equals("changeit"));
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        org.cryptoapi.bench.predictablekeystorepassword.PredictableKeyStorePasswordABICase2 predictableKeyStorePasswordABICase2_0 = new org.cryptoapi.bench.predictablekeystorepassword.PredictableKeyStorePasswordABICase2();
        java.lang.Class<?> wildcardClass1 = predictableKeyStorePasswordABICase2_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

