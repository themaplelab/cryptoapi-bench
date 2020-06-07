package randoopTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

    public static boolean debug = false;

    @Test
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6001");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) 10 };
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
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 10, (byte) 100 };
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
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
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
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 0 };
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
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) -1, (byte) 10 };
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
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 0, (byte) 10 };
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
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) -1, (byte) 0 };
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
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 100, (byte) -1 };
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
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 1, (byte) 100 };
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
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 1, (byte) 100 };
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
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 1, (byte) -1 };
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
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 100, (byte) 0 };
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
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) -1, (byte) -1 };
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
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 10, (byte) 0 };
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
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) -1 };
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
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) -1, (byte) 1 };
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
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 0, (byte) 0 };
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
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1, (byte) -1 };
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
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 10, (byte) 100 };
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
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 10, (byte) 100 };
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
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1, (byte) 1 };
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
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) 0 };
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
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
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
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 100, (byte) -1 };
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
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) -1, (byte) 10 };
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
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 10, (byte) 0 };
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
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 10 };
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
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 100 };
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
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 0 };
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
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 100, (byte) -1 };
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
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
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
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 1, (byte) 1 };
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
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 1, (byte) 1 };
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
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) -1, (byte) 0 };
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
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 100, (byte) 0 };
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
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) -1, (byte) -1 };
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
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) -1, (byte) 10 };
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
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 0, (byte) 0 };
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
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 10 };
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
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) -1, (byte) 100 };
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
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) 100 };
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
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 1, (byte) 1 };
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
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
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
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 1, (byte) 100 };
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
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10, (byte) -1 };
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
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1, (byte) 100 };
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
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6159");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6160");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6161");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) -1, (byte) 0 };
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
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6163");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6164");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6165");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
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
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6166");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6168");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6169");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 100, (byte) 1 };
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
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6170");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6171");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6172");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6173");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10, (byte) 100 };
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
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6175");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6176");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6177");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6178");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6179");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6180");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6181");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6182");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
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
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6183");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6184");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6185");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) 100 };
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
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6186");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 100, (byte) 100 };
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
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6187");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6188");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6189");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6190");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6191");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6192");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6193");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6194");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6195");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 1 };
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
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6196");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6197");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6198");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6199");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6200");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6201");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6202");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 0, (byte) 0 };
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
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6203");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6204");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 1 };
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
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6205");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6206");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6207");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6208");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6209");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6210");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 10, (byte) -1 };
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
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6211");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6212");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6213");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6214");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6215");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6216");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 100 };
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
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6217");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6218");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 0, (byte) 0 };
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
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6219");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6220");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6221");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6222");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6223");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6224");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 10, (byte) 10 };
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
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6225");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6226");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6227");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6228");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6229");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6230");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6231");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6232");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6233");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6234");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6235");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
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
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6236");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 10, (byte) 1 };
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
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6237");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6238");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6239");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 1, (byte) 1 };
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
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6240");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 10 };
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
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6241");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6242");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) -1, (byte) 10 };
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
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6243");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6244");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6245");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 1, (byte) 100 };
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
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6246");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
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
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6247");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6248");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6249");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6250");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6251");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6252");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 10, (byte) 100 };
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
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6253");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 0, (byte) 100 };
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
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6254");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6255");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6256");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6257");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6258");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6259");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6260");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6261");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 100, (byte) 0 };
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
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6262");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6263");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6264");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 1, (byte) 10 };
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
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6265");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6266");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6267");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) -1 };
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
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6268");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 1, (byte) 1 };
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
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6269");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6270");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6271");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6272");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6273");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) -1, (byte) 100 };
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
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6274");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6275");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6276");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6277");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) -1, (byte) 1 };
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
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6278");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6279");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6280");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6281");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) 10 };
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
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6282");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6283");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6284");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6285");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6286");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 10, (byte) 1 };
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
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6287");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6288");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 0, (byte) 100 };
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
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6289");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6290");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6291");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 1, (byte) -1 };
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
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6292");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) -1, (byte) -1 };
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
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6293");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6294");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6295");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6296");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
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
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6297");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6298");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6299");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6300");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6301");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 100, (byte) 0 };
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
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6302");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6303");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6304");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6305");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6306");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6307");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6308");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 10, (byte) 0 };
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
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6309");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6310");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 0 };
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
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6311");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6312");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6313");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6314");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 100, (byte) -1 };
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
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6315");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6316");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6317");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6318");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
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
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6319");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6320");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6321");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6322");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6323");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6324");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6325");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6326");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6327");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6328");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6329");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6330");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6331");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 100, (byte) 10 };
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
    public void test6332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6332");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6333");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6334");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) -1 };
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
    public void test6335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6335");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6336");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6337");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6338");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6339");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6340");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6341");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6342");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6343");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6344");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6345");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 100, (byte) 100 };
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
    public void test6346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6346");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6347");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
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
    public void test6348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6348");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6349");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6350");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6351");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6352");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6353");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6354");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 1, (byte) -1 };
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
    public void test6355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6355");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6356");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6357");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6358");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6359");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6360");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6361");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6362");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6363");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6364");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6365");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 0, (byte) 0 };
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
    public void test6366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6366");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6367");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6368");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6369");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) -1, (byte) 10 };
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
    public void test6370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6370");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6371");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6372");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 10, (byte) 100 };
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
    public void test6373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6373");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6374");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6375");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 1 };
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
    public void test6376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6376");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6377");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) -1, (byte) 100 };
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
    public void test6378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6378");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6379");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 1, (byte) 100 };
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
    public void test6380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6380");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6381");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 0, (byte) -1 };
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
    public void test6382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6382");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6383");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6384");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6385");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 10, (byte) 10 };
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
    public void test6386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6386");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6387");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6388");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6389");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6390");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
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
    public void test6391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6391");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 1, (byte) 10 };
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
    public void test6392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6392");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6393");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6394");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 1, (byte) 1 };
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
    public void test6395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6395");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
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
    public void test6396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6396");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) 1 };
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
    public void test6397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6397");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6398");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) -1, (byte) 1 };
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
    public void test6399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6399");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6400");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6401");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6402");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6403");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) -1, (byte) 1 };
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
    public void test6404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6404");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6405");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6406");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6407");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6408");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6409");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6410");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
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
    public void test6411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6411");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6412");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6413");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6414");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6415");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6416");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6417");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6418");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6419");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1, (byte) 10 };
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
    public void test6420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6420");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6421");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6422");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6423");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6424");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) -1, (byte) 10 };
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
    public void test6425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6425");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6426");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6427");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6428");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6429");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
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
    public void test6430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6430");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6431");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) -1 };
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
    public void test6432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6432");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6433");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6434");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 1, (byte) -1 };
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
    public void test6435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6435");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6436");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 1, (byte) 0 };
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
    public void test6437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6437");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6438");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6439");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6440");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6441");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) -1, (byte) 100 };
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
    public void test6442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6442");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100 };
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
    public void test6443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6443");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 0, (byte) 0 };
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
    public void test6444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6444");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 100, (byte) 100 };
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
    public void test6445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6445");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6446");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6447");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 10 };
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
    public void test6448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6448");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) -1 };
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
    public void test6449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6449");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6450");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6451");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6452");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6453");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6454");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6455");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6456");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) -1 };
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
    public void test6457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6457");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6458");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 1, (byte) 10 };
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
    public void test6459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6459");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6460");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6461");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 10, (byte) 100 };
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
    public void test6462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6462");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 10 };
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
    public void test6463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6463");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 0 };
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
    public void test6464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6464");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6465");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 10, (byte) 10 };
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
    public void test6466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6466");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6467");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 10, (byte) 1 };
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
    public void test6468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6468");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6469");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6470");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6471");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6472");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6473");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) -1, (byte) -1 };
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
    public void test6474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6474");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6475");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6476");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6477");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6478");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 10, (byte) 10 };
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
    public void test6479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6479");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6480");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6481");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) 10 };
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
    public void test6482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6482");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6483");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6484");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6485");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6486");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6487");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6488");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) -1, (byte) -1 };
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
    public void test6489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6489");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6490");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6491");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6492");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) -1, (byte) 100 };
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
    public void test6493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6493");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6494");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6495");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6496");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 1 };
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
    public void test6497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6497");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 0, (byte) -1 };
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
    public void test6498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6498");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6499");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6500");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
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
}

