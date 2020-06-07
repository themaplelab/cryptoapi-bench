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
        org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1 insecureAsymmetricCipherABICase1_0 = new org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1();
        java.lang.Class<?> wildcardClass1 = insecureAsymmetricCipherABICase1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1 insecureAsymmetricCipherABICase1_0 = new org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1();
        // The following exception was thrown during execution in test generation
        try {
            insecureAsymmetricCipherABICase1_0.go((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidParameterException; message: RSA keys must be at least 512 bits long");
        } catch (java.security.InvalidParameterException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1 insecureAsymmetricCipherABICase1_0 = new org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1();
        // The following exception was thrown during execution in test generation
        try {
            insecureAsymmetricCipherABICase1_0.go((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidParameterException; message: RSA keys must be at least 512 bits long");
        } catch (java.security.InvalidParameterException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1 insecureAsymmetricCipherABICase1_0 = new org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1();
        // The following exception was thrown during execution in test generation
        try {
            insecureAsymmetricCipherABICase1_0.go((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.security.InvalidParameterException; message: RSA keys must be at least 512 bits long");
        } catch (java.security.InvalidParameterException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1 insecureAsymmetricCipherABICase1_0 = new org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1();
        // The following exception was thrown during execution in test generation
        try {
            insecureAsymmetricCipherABICase1_0.go((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidParameterException; message: RSA keys must be at least 512 bits long");
        } catch (java.security.InvalidParameterException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1 insecureAsymmetricCipherABICase1_0 = new org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1();
        // The following exception was thrown during execution in test generation
        try {
            insecureAsymmetricCipherABICase1_0.go(100);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidParameterException; message: RSA keys must be at least 512 bits long");
        } catch (java.security.InvalidParameterException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1 insecureAsymmetricCipherABICase1_0 = new org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1();
        // The following exception was thrown during execution in test generation
        try {
            insecureAsymmetricCipherABICase1_0.go(0);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidParameterException; message: RSA keys must be at least 512 bits long");
        } catch (java.security.InvalidParameterException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1 insecureAsymmetricCipherABICase1_0 = new org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1();
        // The following exception was thrown during execution in test generation
        try {
            insecureAsymmetricCipherABICase1_0.go((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidParameterException; message: RSA keys must be at least 512 bits long");
        } catch (java.security.InvalidParameterException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1 insecureAsymmetricCipherABICase1_0 = new org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1();
        // The following exception was thrown during execution in test generation
        try {
            insecureAsymmetricCipherABICase1_0.go((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidParameterException; message: RSA keys must be at least 512 bits long");
        } catch (java.security.InvalidParameterException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1 insecureAsymmetricCipherABICase1_0 = new org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1();
        // The following exception was thrown during execution in test generation
        try {
            insecureAsymmetricCipherABICase1_0.go((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidParameterException; message: RSA keys must be at least 512 bits long");
        } catch (java.security.InvalidParameterException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1 insecureAsymmetricCipherABICase1_0 = new org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1();
        // The following exception was thrown during execution in test generation
        try {
            insecureAsymmetricCipherABICase1_0.go((int) '#');
            org.junit.Assert.fail("Expected exception of type java.security.InvalidParameterException; message: RSA keys must be at least 512 bits long");
        } catch (java.security.InvalidParameterException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1 insecureAsymmetricCipherABICase1_0 = new org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1();
        // The following exception was thrown during execution in test generation
        try {
            insecureAsymmetricCipherABICase1_0.go((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidParameterException; message: RSA keys must be at least 512 bits long");
        } catch (java.security.InvalidParameterException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1 insecureAsymmetricCipherABICase1_0 = new org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1();
        // The following exception was thrown during execution in test generation
        try {
            insecureAsymmetricCipherABICase1_0.go((int) '4');
            org.junit.Assert.fail("Expected exception of type java.security.InvalidParameterException; message: RSA keys must be at least 512 bits long");
        } catch (java.security.InvalidParameterException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1 insecureAsymmetricCipherABICase1_0 = new org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1();
        // The following exception was thrown during execution in test generation
        try {
            insecureAsymmetricCipherABICase1_0.go(10);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidParameterException; message: RSA keys must be at least 512 bits long");
        } catch (java.security.InvalidParameterException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1 insecureAsymmetricCipherABICase1_0 = new org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1();
        // The following exception was thrown during execution in test generation
        try {
            insecureAsymmetricCipherABICase1_0.go((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidParameterException; message: RSA keys must be at least 512 bits long");
        } catch (java.security.InvalidParameterException e) {
        // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1 insecureAsymmetricCipherABICase1_0 = new org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1();
        // The following exception was thrown during execution in test generation
        try {
            insecureAsymmetricCipherABICase1_0.go((-1));
            org.junit.Assert.fail("Expected exception of type java.security.InvalidParameterException; message: RSA keys must be at least 512 bits long");
        } catch (java.security.InvalidParameterException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1 insecureAsymmetricCipherABICase1_0 = new org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1();
        // The following exception was thrown during execution in test generation
        try {
            insecureAsymmetricCipherABICase1_0.go((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidParameterException; message: RSA keys must be at least 512 bits long");
        } catch (java.security.InvalidParameterException e) {
        // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1 insecureAsymmetricCipherABICase1_0 = new org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1();
        // The following exception was thrown during execution in test generation
        try {
            insecureAsymmetricCipherABICase1_0.go(1);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidParameterException; message: RSA keys must be at least 512 bits long");
        } catch (java.security.InvalidParameterException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1 insecureAsymmetricCipherABICase1_0 = new org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1();
        // The following exception was thrown during execution in test generation
        try {
            insecureAsymmetricCipherABICase1_0.go((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.security.InvalidParameterException; message: RSA keys must be at least 512 bits long");
        } catch (java.security.InvalidParameterException e) {
        // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1 insecureAsymmetricCipherABICase1_0 = new org.cryptoapi.bench.insecureasymmetriccrypto.InsecureAsymmetricCipherABICase1();
        // The following exception was thrown during execution in test generation
        try {
            insecureAsymmetricCipherABICase1_0.go((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidParameterException; message: RSA keys must be at least 512 bits long");
        } catch (java.security.InvalidParameterException e) {
        // Expected exception.
        }
    }
}

