package randoopTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) ' ');
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2(1);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (byte) 10);
        staticSaltsABPSCase1_0.key2((-1));
        java.lang.Class<?> wildcardClass19 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) '4');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2(10);
        staticSaltsABPSCase1_0.key2(1);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
        staticSaltsABPSCase1_0.key2((int) '4');
        staticSaltsABPSCase1_0.key2((int) (byte) 10);
        staticSaltsABPSCase1_0.key2((int) 'a');
        java.lang.Class<?> wildcardClass23 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 100);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (short) 100);
        staticSaltsABPSCase1_0.key2(1);
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2(10);
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (byte) 10);
        staticSaltsABPSCase1_0.key2((int) ' ');
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) ' ');
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2(1);
        java.lang.Class<?> wildcardClass21 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((-1));
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) ' ');
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        java.lang.Class<?> wildcardClass19 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) ' ');
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2(0);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '4');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (byte) 10);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (short) 100);
        staticSaltsABPSCase1_0.key2(10);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) ' ');
        java.lang.Class<?> wildcardClass21 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) 100);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        java.lang.Class<?> wildcardClass23 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) 100);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2(10);
        staticSaltsABPSCase1_0.key2((int) ' ');
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) 100);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        java.lang.Class<?> wildcardClass27 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) ' ');
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2((int) '4');
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) 100);
        staticSaltsABPSCase1_0.key2((int) '4');
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        java.lang.Class<?> wildcardClass17 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2(10);
        staticSaltsABPSCase1_0.key2((int) ' ');
        staticSaltsABPSCase1_0.key2((int) (byte) 10);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) ' ');
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2(1);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) ' ');
        staticSaltsABPSCase1_0.key2((-1));
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2(0);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2(10);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2(100);
        java.lang.Class<?> wildcardClass25 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2(10);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2((int) '4');
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2(1);
        java.lang.Class<?> wildcardClass29 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        java.lang.Class<?> wildcardClass23 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2(10);
        staticSaltsABPSCase1_0.key2((int) ' ');
        staticSaltsABPSCase1_0.key2((int) (byte) 10);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2(1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2((int) '4');
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
        staticSaltsABPSCase1_0.key2(0);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2((-1));
        staticSaltsABPSCase1_0.key2((int) '4');
        staticSaltsABPSCase1_0.key2(10);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        java.lang.Class<?> wildcardClass7 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
        staticSaltsABPSCase1_0.key2((int) '4');
        staticSaltsABPSCase1_0.key2((int) (byte) 10);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2(1);
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2(1);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        java.lang.Class<?> wildcardClass27 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2(10);
        staticSaltsABPSCase1_0.key2(10);
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        java.lang.Class<?> wildcardClass13 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) '4');
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '4');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2(1);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) (byte) 10);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2(1);
        staticSaltsABPSCase1_0.key2((-1));
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) ' ');
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2((int) '4');
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) (byte) 10);
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) '4');
        staticSaltsABPSCase1_0.key2((int) (short) 0);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2(10);
        staticSaltsABPSCase1_0.key2(10);
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(100);
        java.lang.Class<?> wildcardClass13 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2(1);
        staticSaltsABPSCase1_0.key2((int) ' ');
        java.lang.Class<?> wildcardClass17 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2(10);
        staticSaltsABPSCase1_0.key2((int) ' ');
        staticSaltsABPSCase1_0.key2((int) (byte) 10);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2(1);
        staticSaltsABPSCase1_0.key2((int) '4');
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
        staticSaltsABPSCase1_0.key2((int) (short) 100);
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '4');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((-1));
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        java.lang.Class<?> wildcardClass25 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((-1));
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) '4');
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        java.lang.Class<?> wildcardClass27 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2(1);
        staticSaltsABPSCase1_0.key2((int) ' ');
        staticSaltsABPSCase1_0.key2((-1));
        staticSaltsABPSCase1_0.key2(100);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2(1);
        staticSaltsABPSCase1_0.key2((-1));
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 100);
        java.lang.Class<?> wildcardClass17 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '4');
        staticSaltsABPSCase1_0.key2((int) (byte) 10);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) '4');
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) (byte) 10);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) '4');
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) ' ');
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (byte) 10);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (short) 100);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2(10);
        staticSaltsABPSCase1_0.key2((int) (short) 100);
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) (byte) 10);
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((-1));
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        java.lang.Class<?> wildcardClass19 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) 100);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2(10);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2(1);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        java.lang.Class<?> wildcardClass23 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) ' ');
        java.lang.Class<?> wildcardClass23 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((-1));
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) ' ');
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2(1);
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) 100);
        staticSaltsABPSCase1_0.key2(1);
        staticSaltsABPSCase1_0.key2(100);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(10);
        staticSaltsABPSCase1_0.key2((int) '4');
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2(1);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) 100);
        staticSaltsABPSCase1_0.key2((int) ' ');
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2(0);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
        staticSaltsABPSCase1_0.key2(1);
        staticSaltsABPSCase1_0.key2((int) (short) 100);
        staticSaltsABPSCase1_0.key2((int) '4');
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2((int) '4');
        staticSaltsABPSCase1_0.key2((int) '4');
        staticSaltsABPSCase1_0.key2((int) (short) 0);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2(1);
        java.lang.Class<?> wildcardClass25 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) ' ');
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
        staticSaltsABPSCase1_0.key2(0);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2((int) 'a');
        java.lang.Class<?> wildcardClass15 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2(1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (short) 100);
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) 100);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2(10);
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2(10);
        java.lang.Class<?> wildcardClass23 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) ' ');
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
        staticSaltsABPSCase1_0.key2(1);
        java.lang.Class<?> wildcardClass21 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) ' ');
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2(1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2((int) (byte) 10);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) (byte) 10);
        staticSaltsABPSCase1_0.key2((int) 'a');
        java.lang.Class<?> wildcardClass17 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) '4');
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) ' ');
        staticSaltsABPSCase1_0.key2((-1));
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(0);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2(100);
        java.lang.Class<?> wildcardClass19 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2(1);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) 100);
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2(1);
        staticSaltsABPSCase1_0.key2((int) (short) 100);
        staticSaltsABPSCase1_0.key2(10);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2(10);
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (byte) 10);
        staticSaltsABPSCase1_0.key2((int) '4');
        staticSaltsABPSCase1_0.key2((int) '4');
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (short) 100);
        staticSaltsABPSCase1_0.key2((int) '4');
        staticSaltsABPSCase1_0.key2((int) (short) 100);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((-1));
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2(10);
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((-1));
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2((int) '4');
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) ' ');
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2(10);
        staticSaltsABPSCase1_0.key2((int) '#');
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2(1);
        staticSaltsABPSCase1_0.key2((int) ' ');
        staticSaltsABPSCase1_0.key2(10);
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) '4');
        staticSaltsABPSCase1_0.key2(10);
        java.lang.Class<?> wildcardClass31 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) ' ');
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2(1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((-1));
        staticSaltsABPSCase1_0.key2((-1));
        staticSaltsABPSCase1_0.key2((int) (short) 1);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((-1));
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) '4');
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) ' ');
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2(1);
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (byte) 10);
        staticSaltsABPSCase1_0.key2((int) 'a');
        java.lang.Class<?> wildcardClass25 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (short) 100);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2(10);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
        staticSaltsABPSCase1_0.key2((-1));
        staticSaltsABPSCase1_0.key2((-1));
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2(10);
        staticSaltsABPSCase1_0.key2((int) '#');
        java.lang.Class<?> wildcardClass27 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (short) 100);
        staticSaltsABPSCase1_0.key2(1);
        staticSaltsABPSCase1_0.key2((int) (short) 100);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 100);
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2(1);
        staticSaltsABPSCase1_0.key2((-1));
        staticSaltsABPSCase1_0.key2((int) '4');
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2(10);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((-1));
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) 'a');
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) 100);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2(10);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
        staticSaltsABPSCase1_0.key2((int) (byte) 10);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(10);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (short) 100);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '4');
        staticSaltsABPSCase1_0.key2((int) (byte) 10);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) 100);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (short) 100);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) '#');
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (byte) 10);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) 0);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (short) 100);
        staticSaltsABPSCase1_0.key2((int) '4');
        staticSaltsABPSCase1_0.key2((int) ' ');
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2((int) (short) 100);
        staticSaltsABPSCase1_0.key2(0);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        java.lang.Class<?> wildcardClass27 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) '4');
        staticSaltsABPSCase1_0.key2((int) ' ');
        staticSaltsABPSCase1_0.key2(1);
        staticSaltsABPSCase1_0.key2((int) '4');
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) '4');
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) (short) 100);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) ' ');
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2(0);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) 100);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) ' ');
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
        staticSaltsABPSCase1_0.key2(1);
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
        staticSaltsABPSCase1_0.key2(1);
        staticSaltsABPSCase1_0.key2((int) (short) 0);
        staticSaltsABPSCase1_0.key2((int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2(0);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
        staticSaltsABPSCase1_0.key2((int) '4');
        staticSaltsABPSCase1_0.key2((int) (byte) 100);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) (short) 10);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2(1);
        staticSaltsABPSCase1_0.key2((int) (short) 100);
        java.lang.Class<?> wildcardClass23 = staticSaltsABPSCase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1 staticSaltsABPSCase1_0 = new org.cryptoapi.bench.staticsalts.StaticSaltsABPSCase1();
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) 'a');
        staticSaltsABPSCase1_0.key2((int) (byte) -1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) -1);
        staticSaltsABPSCase1_0.key2(100);
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) '#');
        staticSaltsABPSCase1_0.key2((int) (short) 1);
        staticSaltsABPSCase1_0.key2((int) (byte) 1);
        staticSaltsABPSCase1_0.key2((int) (short) 100);
    }
}

