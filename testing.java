// Import necessary libraries
import groovy.test.GroovyTestCase

// Class to be tested
class MathOperations {
    int add(int a, int b) {
        return a + b
    }

    int subtract(int a, int b) {
        return a - b
    }

    int multiply(int a, int b) {
        return a * b
    }

    int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero")
        return a / b
    }
}

// Test class
class MathOperationsTest extends GroovyTestCase {
    
    void testAdd() {
        def math = new MathOperations()
        assertEquals(5, math.add(2, 3))
    }
    
    void testSubtract() {
        def math = new MathOperations()
        assertEquals(1, math.subtract(3, 2))
    }

    void testMultiply() {
        def math = new MathOperations()
        assertEquals(6, math.multiply(2, 3))
    }

    void testDivide() {
        def math = new MathOperations()
        assertEquals(2, math.divide(6, 3))
    }

    void testDivideByZero() {
        def math = new MathOperations()
        shouldFail(ArithmeticException) {
            math.divide(6, 0)
        }
    }
}

// Run the tests
new MathOperationsTest().run()
