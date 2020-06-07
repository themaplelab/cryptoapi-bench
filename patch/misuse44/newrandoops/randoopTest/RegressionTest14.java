package randoopTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

    public static boolean debug = false;

    @Test
    public void test7001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7001");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7002");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7003");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7004");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7005");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7006");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7007");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7008");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7009");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7010");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7011");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7012");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7013");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7014");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7015");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7016");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7017");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7018");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7019");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7020");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7021");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7022");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7023");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7024");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7025");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7026");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7027");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7028");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7029");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7030");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7031");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7032");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7033");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7034");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7035");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7036");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7037");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7038");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7039");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7040");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7041");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7042");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7043");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7044");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7045");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7046");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7047");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7048");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7049");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7050");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7051");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7052");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7053");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7054");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7055");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7056");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7057");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7058");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7059");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7060");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7061");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7062");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7063");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7064");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7065");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7066");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7067");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7068");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7069");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7070");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7071");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7072");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7073");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7074");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7075");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7076");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7077");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7078");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7079");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7080");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7081");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7082");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7083");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7084");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7085");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7086");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7087");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7088");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7089");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7090");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7091");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7092");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7093");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7094");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7095");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7096");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7097");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7098");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7099");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7100");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7101");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7102");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7103");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7104");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7105");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7106");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7107");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7108");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7109");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7110");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7111");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7112");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7113");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7114");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7115");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7116");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7117");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7118");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7119");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7120");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7121");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7122");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7123");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7124");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7125");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7126");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7127");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7128");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7129");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7130");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7131");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7132");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7133");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7134");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7135");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7136");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7137");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7138");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7139");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7140");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7141");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7142");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7143");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7144");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7145");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7146");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7147");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7148");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7149");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7150");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7151");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7152");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7153");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7154");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7155");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7156");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7157");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7158");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7159");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7160");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7161");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7162");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7163");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7164");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7165");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7166");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7167");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7168");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7169");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7170");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7171");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7172");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7173");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7174");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7175");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7176");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7177");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7178");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7179");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7180");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7181");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7182");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7183");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7184");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7185");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7186");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7187");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7188");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7189");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7190");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7191");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7192");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7193");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7194");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7195");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7196");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7197");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7198");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7199");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7200");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7201");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7202");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7203");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7204");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7205");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7206");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7207");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7208");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7209");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7210");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7211");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7212");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7213");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7214");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7215");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7216");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7217");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7218");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7219");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7220");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7221");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7222");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7223");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7224");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7225");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7226");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7227");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7228");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7229");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7230");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7231");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7232");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7233");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7234");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7235");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7236");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7237");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7238");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7239");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7240");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7241");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7242");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7243");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7244");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7245");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7246");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7247");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7248");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7249");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7250");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7251");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7252");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7253");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7254");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7255");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7256");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7257");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7258");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7259");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7260");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7261");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7262");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7263");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7264");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7265");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7266");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7267");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7268");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7269");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7270");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7271");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7272");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7273");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7274");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7275");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7276");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7277");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7278");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7279");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7280");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7281");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7282");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7283");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7284");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7285");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7286");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7287");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7288");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7289");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7290");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7291");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7292");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7293");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7294");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7295");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7296");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7297");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7298");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7299");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7300");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7301");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7302");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7303");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7304");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7305");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7306");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7307");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7308");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7309");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7310");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7311");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7312");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7313");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7314");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7315");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7316");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7317");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7318");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7319");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7320");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7321");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7322");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7323");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7324");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7325");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7326");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7327");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7328");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7329");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7330");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7331");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7332");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7333");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7334");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7335");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7336");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7337");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7338");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7339");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7340");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7341");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7342");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7343");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7344");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7345");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7346");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7347");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7348");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7349");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7350");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7351");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7352");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7353");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7354");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7355");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7356");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7357");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7358");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7359");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7360");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7361");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7362");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7363");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7364");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7365");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7366");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7367");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7368");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7369");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7370");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7371");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7372");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7373");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7374");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7375");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7376");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7377");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7378");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7379");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7380");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7381");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7382");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7383");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7384");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7385");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7386");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7387");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7388");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7389");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7390");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7391");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7392");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7393");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7394");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7395");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7396");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7397");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7398");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7399");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7400");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7401");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7402");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7403");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7404");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7405");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7406");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7407");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7408");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7409");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7410");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7411");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7412");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7413");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7414");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7415");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7416");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7417");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7418");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7419");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7420");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7421");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7422");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7423");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7424");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7425");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7426");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7427");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7428");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7429");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7430");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7431");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7432");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7433");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7434");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7435");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7436");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7437");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7438");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7439");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7440");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7441");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7442");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7443");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7444");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7445");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7446");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7447");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7448");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7449");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7450");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7451");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7452");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7453");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7454");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7455");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7456");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test7457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7457");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7458");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7459");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7460");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }
}

