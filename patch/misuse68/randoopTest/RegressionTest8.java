package randoopTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        java.lang.Class<?> wildcardClass33 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) -1);
        java.lang.Class<?> wildcardClass24 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        java.lang.Class<?> wildcardClass24 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
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
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
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
        java.lang.Class<?> wildcardClass29 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 100);
        java.lang.Class<?> wildcardClass15 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 10);
        java.lang.Class<?> wildcardClass24 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        java.lang.Class<?> wildcardClass29 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
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
        java.lang.Class<?> wildcardClass23 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass18 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        java.lang.Class<?> wildcardClass20 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass31 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        java.lang.Class<?> wildcardClass18 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        java.lang.Class<?> wildcardClass33 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass29 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 100);
        java.lang.Class<?> wildcardClass19 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        java.lang.Class<?> wildcardClass37 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        java.lang.Class<?> wildcardClass18 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass11 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        java.lang.Class<?> wildcardClass16 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
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
        java.lang.Class<?> wildcardClass31 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass24 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass31 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass20 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass33 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 100);
        java.lang.Class<?> wildcardClass24 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        java.lang.Class<?> wildcardClass26 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
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
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
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
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
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
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        java.lang.Class<?> wildcardClass31 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        java.lang.Class<?> wildcardClass29 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        java.lang.Class<?> wildcardClass35 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
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
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        java.lang.Class<?> wildcardClass31 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        java.lang.Class<?> wildcardClass20 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass28 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        java.lang.Class<?> wildcardClass17 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
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
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
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
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        java.lang.Class<?> wildcardClass27 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (-1));
        java.lang.Class<?> wildcardClass19 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
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
        java.lang.Class<?> wildcardClass31 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass33 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        java.lang.Class<?> wildcardClass14 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
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
        java.lang.Class<?> wildcardClass31 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) ' ');
        java.lang.Class<?> wildcardClass24 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        java.lang.Class<?> wildcardClass18 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        java.lang.Class<?> wildcardClass15 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 100);
        java.lang.Class<?> wildcardClass13 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
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
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 0 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        java.lang.Class<?> wildcardClass15 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 100);
        java.lang.Class<?> wildcardClass13 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 1);
        java.lang.Class<?> wildcardClass26 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        java.lang.Class<?> wildcardClass29 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        java.lang.Class<?> wildcardClass22 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 100);
        java.lang.Class<?> wildcardClass20 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
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
        java.lang.Class<?> wildcardClass35 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 0);
        java.lang.Class<?> wildcardClass21 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass31 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 0 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass21 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) '4');
        java.lang.Class<?> wildcardClass25 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        java.lang.Class<?> wildcardClass25 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
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
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray6, 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray6, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
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
        java.lang.Class<?> wildcardClass27 = byteArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray2, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray2, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (-1));
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '#');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) 10);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray3, (int) (byte) -1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray3, (int) (short) 10);
        java.lang.Class<?> wildcardClass28 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (byte) 100);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) ' ');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) '4');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) 'a');
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 1);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method2(byteArray4, (int) (short) 0);
        org.cryptoapi.bench.staticsalts.StaticSaltsABICase3.method1(byteArray4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }
}

