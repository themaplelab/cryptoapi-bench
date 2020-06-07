package randoopTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

    public static boolean debug = false;

    @Test
    public void test6501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6501");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6502");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6503");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6504");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6505");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6506");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6507");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6508");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6509");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6510");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6511");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6512");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6513");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6514");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6515");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6516");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6517");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6518");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6519");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6520");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6521");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6522");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6523");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6524");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6525");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6526");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6527");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6528");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6529");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6530");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6531");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6532");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6533");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6534");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6535");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6536");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6537");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6538");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6539");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6540");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6541");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6542");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6543");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6544");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6545");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6546");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6547");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6548");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6549");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6550");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6551");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6552");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6553");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6554");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6555");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6556");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6557");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6558");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6559");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6560");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6561");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6562");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6563");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6564");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6565");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6566");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6567");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6568");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6569");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6570");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6571");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6572");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6573");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6574");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6575");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6576");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6577");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6578");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6579");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6580");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6581");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6582");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6583");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6584");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6585");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6586");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6587");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6588");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6589");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6590");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6591");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6592");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6593");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6594");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6595");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6596");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6597");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6598");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6599");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6600");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6601");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6602");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6603");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6604");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6605");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6606");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6607");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6608");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6609");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6610");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6611");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6612");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6613");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6614");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6615");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6616");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6617");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6618");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6619");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6620");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6621");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6622");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6623");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6624");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6625");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6626");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6627");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6628");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6629");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6630");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6631");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6632");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6633");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6634");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6635");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6636");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6637");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6638");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6639");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6640");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6641");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6642");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6643");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6644");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6645");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6646");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6647");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6648");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6649");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6650");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6651");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6652");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6653");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6654");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6655");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6656");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6657");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6658");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6659");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6660");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6661");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6662");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6663");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6664");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6665");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6666");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6667");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6668");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6669");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6670");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6671");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6672");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6673");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6674");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6675");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6676");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6677");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6678");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6679");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6680");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6681");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6682");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6683");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6684");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6685");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6686");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6687");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6688");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6689");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6690");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6691");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6692");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6693");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6694");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6695");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6696");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6697");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6698");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6699");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6700");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6701");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6702");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6703");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6704");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6705");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6706");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6707");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6708");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6709");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6710");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6711");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6712");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6713");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6714");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6715");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6716");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6717");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6718");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6719");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6720");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6721");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6722");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6723");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6724");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6725");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6726");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6727");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6728");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6729");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6730");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6731");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6732");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6733");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6734");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6735");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6736");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6737");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6738");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6739");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6740");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6741");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6742");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6743");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6744");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6745");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6746");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6747");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6748");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6749");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6750");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6751");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6752");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6753");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6754");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6755");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6756");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6757");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6758");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6759");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6760");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6761");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6762");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6763");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6764");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6765");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6766");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6767");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6768");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6769");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6770");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6771");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6772");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6773");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6774");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6775");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6776");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6777");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6778");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6779");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6780");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6781");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6782");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6783");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6784");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6785");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6786");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6787");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6788");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6789");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6790");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6791");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6792");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6793");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6794");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6795");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6796");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6797");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6798");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6799");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6800");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6801");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6802");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6803");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6804");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6805");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6806");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6807");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6808");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6809");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6810");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6811");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6812");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6813");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6814");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6815");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6816");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6817");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6818");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6819");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6820");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6821");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6822");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6823");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6824");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6825");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6826");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6827");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6828");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6829");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6830");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6831");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6832");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6833");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6834");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6835");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6836");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6837");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6838");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6839");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6840");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6841");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6842");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6843");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6844");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6845");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6846");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6847");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6848");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6849");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6850");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6851");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6852");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6853");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6854");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6855");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6856");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6857");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6858");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6859");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6860");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6861");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6862");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6863");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6864");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6865");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6866");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6867");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6868");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6869");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6870");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6871");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6872");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6873");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6874");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6875");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6876");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6877");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6878");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6879");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6880");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6881");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6882");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6883");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6884");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6885");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6886");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6887");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6888");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6889");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6890");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6891");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6892");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6893");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6894");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6895");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6896");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6897");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6898");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6899");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6900");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6901");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6902");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6903");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6904");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6905");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6906");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6907");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6908");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6909");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6910");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6911");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6912");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6913");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6914");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6915");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6916");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6917");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6918");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6919");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6920");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6921");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6922");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6923");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6924");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6925");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6926");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6927");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6928");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6929");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6930");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6931");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6932");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6933");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6934");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6935");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6936");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6937");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6938");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6939");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6940");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6941");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6942");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6943");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6944");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6945");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6946");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6947");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6948");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6949");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6950");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6951");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6952");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6953");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6954");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6955");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6956");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6957");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6958");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6959");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6960");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6961");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6962");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6963");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6964");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6965");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6966");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6967");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6968");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6969");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6970");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6971");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6972");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6973");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6974");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6975");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6976");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6977");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6978");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6979");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6980");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6981");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6982");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6983");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6984");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test6985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6985");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6986");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6987");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6988");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6989");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6990");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6991");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6992");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6993");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6994");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6995");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6996");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6997");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6998");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6999");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test7000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test7000");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
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

