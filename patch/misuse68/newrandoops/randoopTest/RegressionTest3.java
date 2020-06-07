package randoopTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
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
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        java.lang.Class<?> wildcardClass16 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 1);
        java.lang.Class<?> wildcardClass19 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        java.lang.Class<?> wildcardClass33 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass24 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
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
        java.lang.Class<?> wildcardClass33 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 10);
        java.lang.Class<?> wildcardClass12 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
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
        java.lang.Class<?> wildcardClass28 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        java.lang.Class<?> wildcardClass14 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) 'a');
        java.lang.Class<?> wildcardClass16 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        java.lang.Class<?> wildcardClass31 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) 'a');
        java.lang.Class<?> wildcardClass10 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
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
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        java.lang.Class<?> wildcardClass13 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        java.lang.Class<?> wildcardClass31 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        java.lang.Class<?> wildcardClass15 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
        java.lang.Class<?> wildcardClass24 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        java.lang.Class<?> wildcardClass30 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        java.lang.Class<?> wildcardClass9 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass23 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 1);
        java.lang.Class<?> wildcardClass21 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass31 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass29 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        java.lang.Class<?> wildcardClass20 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass28 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 100);
        java.lang.Class<?> wildcardClass23 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        java.lang.Class<?> wildcardClass24 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) 'a');
        java.lang.Class<?> wildcardClass11 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
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
        java.lang.Class<?> wildcardClass39 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        java.lang.Class<?> wildcardClass15 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        java.lang.Class<?> wildcardClass15 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
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
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
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
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass11 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '4');
        java.lang.Class<?> wildcardClass13 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        java.lang.Class<?> wildcardClass16 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass29 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass33 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
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
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass20 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass39 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        java.lang.Class<?> wildcardClass29 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 0);
        java.lang.Class<?> wildcardClass17 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 0 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        java.lang.Class<?> wildcardClass33 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        java.lang.Class<?> wildcardClass22 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        java.lang.Class<?> wildcardClass22 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 0);
        java.lang.Class<?> wildcardClass23 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
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
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass24 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        java.lang.Class<?> wildcardClass35 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        java.lang.Class<?> wildcardClass10 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        java.lang.Class<?> wildcardClass20 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        java.lang.Class<?> wildcardClass28 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        java.lang.Class<?> wildcardClass33 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        java.lang.Class<?> wildcardClass11 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
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
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass29 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass14 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) -1);
        java.lang.Class<?> wildcardClass15 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 0 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        java.lang.Class<?> wildcardClass18 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 0);
        java.lang.Class<?> wildcardClass19 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        java.lang.Class<?> wildcardClass20 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
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
        java.lang.Class<?> wildcardClass31 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        java.lang.Class<?> wildcardClass14 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 1);
        java.lang.Class<?> wildcardClass15 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        java.lang.Class<?> wildcardClass22 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        java.lang.Class<?> wildcardClass16 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass20 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 100);
        java.lang.Class<?> wildcardClass17 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass24 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
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
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass18 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
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
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        java.lang.Class<?> wildcardClass16 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
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
        java.lang.Class<?> wildcardClass22 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        java.lang.Class<?> wildcardClass16 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass33 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        java.lang.Class<?> wildcardClass37 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        java.lang.Class<?> wildcardClass18 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        java.lang.Class<?> wildcardClass15 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass33 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 0 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        java.lang.Class<?> wildcardClass39 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        java.lang.Class<?> wildcardClass26 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass29 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        java.lang.Class<?> wildcardClass14 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        java.lang.Class<?> wildcardClass15 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        java.lang.Class<?> wildcardClass15 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        java.lang.Class<?> wildcardClass20 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 100);
        java.lang.Class<?> wildcardClass19 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 0 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 10);
        java.lang.Class<?> wildcardClass23 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) -1);
        java.lang.Class<?> wildcardClass21 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '#');
        java.lang.Class<?> wildcardClass15 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 0 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 0);
        java.lang.Class<?> wildcardClass19 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
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
        java.lang.Class<?> wildcardClass22 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        java.lang.Class<?> wildcardClass26 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        java.lang.Class<?> wildcardClass7 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        java.lang.Class<?> wildcardClass31 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass20 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass20 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        java.lang.Class<?> wildcardClass39 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
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
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
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
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        java.lang.Class<?> wildcardClass12 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        java.lang.Class<?> wildcardClass24 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        java.lang.Class<?> wildcardClass18 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 10);
        java.lang.Class<?> wildcardClass22 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass29 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) '4');
        java.lang.Class<?> wildcardClass17 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
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
        java.lang.Class<?> wildcardClass22 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        java.lang.Class<?> wildcardClass24 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass28 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 0 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        java.lang.Class<?> wildcardClass20 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        java.lang.Class<?> wildcardClass28 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        java.lang.Class<?> wildcardClass26 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass25 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
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
        java.lang.Class<?> wildcardClass31 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }
}

