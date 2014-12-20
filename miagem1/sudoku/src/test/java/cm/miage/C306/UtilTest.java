/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.miage.C306;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chokote
 */
public class UtilTest {
    
    public UtilTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addTableau method, of class Util.
     */
    @Test
    public void testAddTableau() {
        System.out.println("addTableau");
        Case[] source = null;
        Case[] ajout = null;
        Case[] expResult = null;
        Case[] result = Util.addTableau(source, ajout);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isWellField method, of class Util.
     */
    @Test
    public void testIsWellField_Carre() {
        System.out.println("isWellField");
        Carre carre = null;
        boolean expResult = false;
        boolean result = Util.isWellField(carre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isWellField method, of class Util.
     */
    @Test
    public void testIsWellField_CaseArr() {
        System.out.println("isWellField");
        Case[] ligne = null;
        boolean expResult = false;
        boolean result = Util.isWellField(ligne);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class Util.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        int[] tab = null;
        int val = 0;
        boolean expResult = false;
        boolean result = Util.contains(tab, val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addVal method, of class Util.
     */
    @Test
    public void testAddVal() {
        System.out.println("addVal");
        int[] tab = null;
        int val = 0;
        int[] expResult = null;
        int[] result = Util.addVal(tab, val);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}