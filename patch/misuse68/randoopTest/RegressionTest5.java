package randoopTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        java.lang.Class<?> wildcardClass15 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        java.lang.Class<?> wildcardClass35 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        java.lang.Class<?> wildcardClass28 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 0 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 1);
        java.lang.Class<?> wildcardClass19 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        java.lang.Class<?> wildcardClass15 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        java.lang.Class<?> wildcardClass29 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        java.lang.Class<?> wildcardClass18 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        java.lang.Class<?> wildcardClass29 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        java.lang.Class<?> wildcardClass11 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass24 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 0 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass18 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        java.lang.Class<?> wildcardClass15 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        java.lang.Class<?> wildcardClass35 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        java.lang.Class<?> wildcardClass35 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        java.lang.Class<?> wildcardClass24 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass18 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 0 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 10);
        java.lang.Class<?> wildcardClass20 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        java.lang.Class<?> wildcardClass11 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        java.lang.Class<?> wildcardClass18 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        java.lang.Class<?> wildcardClass14 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 0 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        java.lang.Class<?> wildcardClass13 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        java.lang.Class<?> wildcardClass26 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        java.lang.Class<?> wildcardClass15 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        java.lang.Class<?> wildcardClass22 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        java.lang.Class<?> wildcardClass13 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        java.lang.Class<?> wildcardClass15 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass33 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass35 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass15 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        java.lang.Class<?> wildcardClass41 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 10);
        java.lang.Class<?> wildcardClass12 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        java.lang.Class<?> wildcardClass35 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        java.lang.Class<?> wildcardClass12 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        java.lang.Class<?> wildcardClass30 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        java.lang.Class<?> wildcardClass20 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        java.lang.Class<?> wildcardClass29 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        java.lang.Class<?> wildcardClass13 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 0 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        java.lang.Class<?> wildcardClass26 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass14 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        java.lang.Class<?> wildcardClass20 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass35 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 0 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) 'a');
        java.lang.Class<?> wildcardClass21 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (-1));
        java.lang.Class<?> wildcardClass17 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 100);
        java.lang.Class<?> wildcardClass15 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass29 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        java.lang.Class<?> wildcardClass12 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass31 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        java.lang.Class<?> wildcardClass24 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        java.lang.Class<?> wildcardClass41 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass20 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        java.lang.Class<?> wildcardClass39 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        java.lang.Class<?> wildcardClass29 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass28 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 10);
        java.lang.Class<?> wildcardClass24 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        java.lang.Class<?> wildcardClass28 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        java.lang.Class<?> wildcardClass33 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass29 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        java.lang.Class<?> wildcardClass20 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 0 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        java.lang.Class<?> wildcardClass20 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) 'a');
        java.lang.Class<?> wildcardClass15 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) 'a');
        java.lang.Class<?> wildcardClass26 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        java.lang.Class<?> wildcardClass33 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) 'a');
        java.lang.Class<?> wildcardClass19 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) ' ');
        java.lang.Class<?> wildcardClass17 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (-1));
        java.lang.Class<?> wildcardClass21 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        java.lang.Class<?> wildcardClass33 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) 'a');
        java.lang.Class<?> wildcardClass15 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        java.lang.Class<?> wildcardClass18 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 100);
        java.lang.Class<?> wildcardClass28 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) ' ');
        java.lang.Class<?> wildcardClass28 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        java.lang.Class<?> wildcardClass22 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 1);
        java.lang.Class<?> wildcardClass17 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        java.lang.Class<?> wildcardClass31 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 0 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass13 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        java.lang.Class<?> wildcardClass28 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass31 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        java.lang.Class<?> wildcardClass29 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        java.lang.Class<?> wildcardClass33 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) ' ');
        java.lang.Class<?> wildcardClass30 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        java.lang.Class<?> wildcardClass16 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass13 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }
}

