package randoopTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        java.lang.Class<?> wildcardClass9 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        java.lang.Class<?> wildcardClass29 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass23 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass29 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        java.lang.Class<?> wildcardClass29 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass29 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        java.lang.Class<?> wildcardClass24 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass29 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        java.lang.Class<?> wildcardClass35 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 0 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        java.lang.Class<?> wildcardClass29 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 0 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) 'a');
        java.lang.Class<?> wildcardClass19 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 1);
        java.lang.Class<?> wildcardClass15 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 10);
        java.lang.Class<?> wildcardClass18 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
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
        java.lang.Class<?> wildcardClass33 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass29 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        java.lang.Class<?> wildcardClass16 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        java.lang.Class<?> wildcardClass18 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) 'a');
        java.lang.Class<?> wildcardClass10 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 0 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) ' ');
        java.lang.Class<?> wildcardClass22 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass29 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        java.lang.Class<?> wildcardClass29 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        java.lang.Class<?> wildcardClass16 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
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
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        java.lang.Class<?> wildcardClass20 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        java.lang.Class<?> wildcardClass24 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass29 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        java.lang.Class<?> wildcardClass29 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        java.lang.Class<?> wildcardClass18 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass31 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
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
        java.lang.Class<?> wildcardClass29 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass12 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
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
        java.lang.Class<?> wildcardClass29 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        java.lang.Class<?> wildcardClass10 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        java.lang.Class<?> wildcardClass10 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        java.lang.Class<?> wildcardClass30 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass29 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        java.lang.Class<?> wildcardClass16 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass15 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) ' ');
        java.lang.Class<?> wildcardClass14 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass35 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 10);
        java.lang.Class<?> wildcardClass17 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        java.lang.Class<?> wildcardClass16 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        java.lang.Class<?> wildcardClass21 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
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
        java.lang.Class<?> wildcardClass33 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        java.lang.Class<?> wildcardClass20 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        java.lang.Class<?> wildcardClass29 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass12 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass15 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass37 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        java.lang.Class<?> wildcardClass14 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        java.lang.Class<?> wildcardClass15 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        java.lang.Class<?> wildcardClass14 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
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
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        java.lang.Class<?> wildcardClass18 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        java.lang.Class<?> wildcardClass15 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) 100);
        java.lang.Class<?> wildcardClass15 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass33 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        java.lang.Class<?> wildcardClass41 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        java.lang.Class<?> wildcardClass22 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        java.lang.Class<?> wildcardClass20 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        java.lang.Class<?> wildcardClass12 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        java.lang.Class<?> wildcardClass29 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 0 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        java.lang.Class<?> wildcardClass33 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        java.lang.Class<?> wildcardClass14 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }
}

