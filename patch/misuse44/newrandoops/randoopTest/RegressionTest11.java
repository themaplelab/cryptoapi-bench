package randoopTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10 };
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
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5863");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5864");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5866");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5867");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 100 };
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
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5868");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5869");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5871");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5872");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5873");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5874");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5875");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5877");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5878");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5879");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5880");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5881");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5882");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5883");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5884");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5885");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5886");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5887");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5888");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5889");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5890");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5891");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5892");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5893");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5894");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5895");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5896");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5897");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5898");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5899");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5900");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5901");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5902");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5903");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5904");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5905");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5906");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5907");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5908");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5909");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5910");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5911");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5912");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5913");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5914");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5915");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5916");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 100 };
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
    public void test5917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5917");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5918");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5919");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5920");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5921");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5922");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5923");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5924");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5925");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5926");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5927");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5928");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5929");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5930");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5931");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5932");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5933");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5934");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5935");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5936");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5937");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5938");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5939");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5940");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5941");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5942");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5943");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5944");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5945");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5946");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5947");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5948");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5949");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5950");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5951");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5952");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5953");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5954");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5955");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5956");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5957");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5958");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5959");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5960");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5961");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5962");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5963");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5964");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5965");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5966");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5967");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5968");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5969");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5970");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5971");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5972");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5973");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5974");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5975");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5976");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5977");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5978");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5979");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5980");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5981");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5982");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5983");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5984");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5985");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5986");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5987");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5988");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5989");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5990");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5991");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5992");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5993");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5994");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5995");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5996");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5997");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test5998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5998");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5999");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            staticInitializationVectorABICase1_0.go(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: Wrong IV length: must be 16 bytes long");
        } catch (java.security.InvalidAlgorithmParameterException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test6000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test6000");
        org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1 staticInitializationVectorABICase1_0 = new org.cryptoapi.bench.staticinitializationvector.StaticInitializationVectorABICase1();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
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

