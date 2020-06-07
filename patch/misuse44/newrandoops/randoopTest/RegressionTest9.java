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
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 10, (byte) 10 };
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
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) -1, (byte) 10 };
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
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 1, (byte) 10 };
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
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
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
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
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
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 10, (byte) 10 };
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
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) -1, (byte) 0 };
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
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 0, (byte) -1 };
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
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 0, (byte) 0 };
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
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) -1, (byte) 0 };
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
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) -1 };
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
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 1, (byte) -1 };
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
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 0, (byte) 1 };
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
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 0, (byte) 1 };
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
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) 1 };
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
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 0, (byte) -1 };
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
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 100, (byte) 0 };
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
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 1, (byte) -1 };
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
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 1, (byte) 0 };
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
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
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
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 100, (byte) 0 };
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
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
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
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) -1, (byte) -1 };
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
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 10, (byte) 100 };
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
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) -1, (byte) 10 };
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
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
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
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 10, (byte) 10 };
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
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 100, (byte) -1 };
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
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) -1, (byte) 10 };
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
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) -1, (byte) 1 };
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
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 1, (byte) 10 };
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
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) -1, (byte) -1 };
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
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
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
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 0, (byte) -1 };
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
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
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
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
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
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 10, (byte) 1 };
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
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 10, (byte) 0 };
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
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 10, (byte) 0 };
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
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10 };
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
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 10 };
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
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 100, (byte) -1 };
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
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
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
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 10, (byte) 10 };
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
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 100, (byte) 1 };
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
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 100, (byte) 1 };
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
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 10, (byte) 1 };
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
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
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
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 100 };
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
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 0 };
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
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 10, (byte) 1 };
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
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 10 };
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
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
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
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) 1 };
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
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
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
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 10, (byte) -1 };
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
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 1, (byte) 10 };
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
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 0, (byte) 100 };
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
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
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
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 10 };
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
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 0, (byte) 1 };
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
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) -1, (byte) 100 };
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
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 1, (byte) -1 };
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
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 0, (byte) 1 };
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
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
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
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) -1 };
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
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
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
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 10, (byte) 0 };
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
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 10, (byte) -1 };
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
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 100, (byte) 1 };
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
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 100, (byte) 1 };
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
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 10, (byte) 100 };
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
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 100, (byte) 0 };
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
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 100 };
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
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
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
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 100, (byte) 1 };
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
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 0 };
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
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 100 };
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
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 10 };
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
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) 1 };
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
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 100, (byte) -1 };
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
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) -1 };
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
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) -1 };
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
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) -1, (byte) 100 };
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
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 0, (byte) 10 };
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
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 1 };
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
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 10 };
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
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
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
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) -1, (byte) 1 };
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
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 10, (byte) 0 };
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
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 1, (byte) 0 };
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
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 0, (byte) 1 };
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
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) -1 };
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
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
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
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 100, (byte) -1 };
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
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) -1, (byte) 100 };
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
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 0 };
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
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 10, (byte) 10 };
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
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 0 };
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
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 1, (byte) 10 };
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
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 0 };
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
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 0, (byte) 1 };
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
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 10, (byte) 1 };
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
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
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
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 10, (byte) -1 };
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
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) -1, (byte) 0 };
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
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 100, (byte) 0 };
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
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 1, (byte) 100 };
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
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
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
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 10, (byte) 0 };
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
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) -1, (byte) 1 };
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
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 1, (byte) 0 };
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
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
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
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) -1, (byte) 0 };
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
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 10, (byte) 0 };
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
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 0, (byte) -1 };
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
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
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
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 10 };
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
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) -1, (byte) 10 };
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
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 100 };
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
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 100, (byte) 1 };
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
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) -1, (byte) 1 };
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
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1, (byte) 10 };
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
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
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
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 1, (byte) 1 };
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
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 100, (byte) 10 };
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
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 100, (byte) -1 };
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
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
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
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1, (byte) 0 };
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
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) -1, (byte) 10 };
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
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 100, (byte) 10 };
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
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) 10 };
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
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
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
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) -1, (byte) -1 };
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
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
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
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 };
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
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) -1, (byte) 0 };
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
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0, (byte) 0 };
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
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
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
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) -1, (byte) 10 };
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
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 1, (byte) 0 };
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
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
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
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 10, (byte) 0 };
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
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 0, (byte) 100 };
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
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 0, (byte) 10 };
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
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 0, (byte) 1 };
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
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 0, (byte) 0 };
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
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) -1, (byte) 1 };
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
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
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
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
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
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) -1, (byte) -1 };
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
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 10, (byte) 0 };
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
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 100, (byte) 10 };
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
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 10, (byte) 1 };
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
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) -1 };
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
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 10, (byte) 1 };
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
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
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
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 0 };
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
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10, (byte) 0 };
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
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 1, (byte) 100 };
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
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) -1, (byte) -1 };
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
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
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
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) 1 };
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
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 0, (byte) 0 };
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
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 1, (byte) -1 };
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
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) -1 };
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
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) -1 };
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
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) -1, (byte) 1 };
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
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 100, (byte) 1 };
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
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) 0 };
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
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) -1, (byte) 0 };
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
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) -1, (byte) 100 };
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
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
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
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) 0 };
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
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 1, (byte) 100 };
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
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 100, (byte) 1 };
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
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
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

