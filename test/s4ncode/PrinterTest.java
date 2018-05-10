package s4ncode;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andre
 */
public class PrinterTest {
    
    private String[] vec;
    private String[] vecEmpty;
    
    public PrinterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        vec = new String[]{"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz",
                            "Buzz","11","Fizz","13","14","FizzBuzz"};
        vecEmpty = new String[]{};
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of fill method, of class Printer.
     */
    @Test
    public void testFill() {
        System.out.println("fill");
        Printer instance = new Printer();
        String[] res = new String[vec.length];
        String[] result = instance.fill(res);
        assertArrayEquals(vec, result);
    }
    
    @Test
    public void testFillNull() {
        System.out.println("fill");
        Printer instance = new Printer();
        String[] result = instance.fill(null);
        assertArrayEquals(null, result);
    }

    /**
     * Test of print method, of class Printer.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        Printer instance = new Printer();
        instance.print(vec);
    }
    
    @Test
    public void testPrintEmpty() {
        System.out.println("print");
        Printer instance = new Printer();
        instance.print(vecEmpty);
    }
    
    @Test
    public void testPrintNull() {
        System.out.println("print");
        Printer instance = new Printer();
        instance.print(null);
    }

    /**
     * Test of add method, of class Printer.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int i = 15;
        Printer instance = new Printer();
        String expResult = "FizzBuzz";
        String result = instance.add(i);
        assertEquals(expResult, result);
    }

    /**
     * Test of isInt method, of class Printer.
     */
    @Test
    public void testIsInt() {
        System.out.println("isInt");
        double x = 14;
        Printer instance = new Printer();
        boolean expResult = true;
        boolean result = instance.isInt(x);
        assertEquals(expResult, result);
       
    }

    @Test
    public void testIsIntFail() {
        System.out.println("isInt");
        double x = 32.5;
        Printer instance = new Printer();
        boolean expResult = false;
        boolean result = instance.isInt(x);
        assertEquals(expResult, result);
       
    }
    
    /**
     * Test of isNumber method, of class Printer.
     */
    @Test
    public void testIsNumber() {
        System.out.println("isNumber");
        int x = 44;
        float a = 21.2f;
        Printer instance = new Printer();
        boolean expResult = true;
        boolean result = instance.isNumber(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isDividedByThree method, of class Printer.
     */
    @Test
    public void testIsDividedByThree() {
        System.out.println("isDividedByThree");
        int x = 6;
        Printer instance = new Printer();
        boolean expResult = true;
        boolean result = instance.isDividedByThree(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isDividedByFive method, of class Printer.
     */
    @Test
    public void testIsDividedByFive() {
        System.out.println("isDividedByFive");
        int x = 20;
        Printer instance = new Printer();
        boolean expResult = true;
        boolean result = instance.isDividedByFive(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of isNotDividedByFive method, of class Printer.
     */
    @Test
    public void testIsNotDividedByFive() {
        System.out.println("isDividedByFive");
        int x = 7;
        Printer instance = new Printer();
        boolean expResult = false;
        boolean result = instance.isDividedByFive(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isDividedByThreeAndFive method, of class Printer.
     */
    @Test
    public void testIsDividedByThreeAndFive() {
        System.out.println("isDividedByThreeAndFive");
        int x = 45;
        Printer instance = new Printer();
        boolean expResult = true;
        boolean result = instance.isDividedByThreeAndFive(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
