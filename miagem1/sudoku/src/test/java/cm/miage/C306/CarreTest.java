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
public class CarreTest {
    
    public CarreTest() {
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
     * Test of getCases method, of class Carre.
     */
    @Test
    public void testGetCases() {
        System.out.println("getCases");
        Carre instance = null;
        Case[][] expResult = null;
        Case[][] result = instance.getCases();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCases method, of class Carre.
     */
    @Test
    public void testSetCases() {
        System.out.println("setCases");
        Case[][] cases = null;
        Carre instance = null;
        instance.setCases(cases);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLigne method, of class Carre.
     */
    @Test
    public void testGetLigne() {
        System.out.println("getLigne");
        Carre instance = null;
        int expResult = 0;
        int result = instance.getLigne();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLigne method, of class Carre.
     */
    @Test
    public void testSetLigne() {
        System.out.println("setLigne");
        int ligne = 0;
        Carre instance = null;
        instance.setLigne(ligne);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColonne method, of class Carre.
     */
    @Test
    public void testGetColonne() {
        System.out.println("getColonne");
        Carre instance = null;
        int expResult = 0;
        int result = instance.getColonne();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColonne method, of class Carre.
     */
    @Test
    public void testSetColonne() {
        System.out.println("setColonne");
        int colonne = 0;
        Carre instance = null;
        instance.setColonne(colonne);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGrille method, of class Carre.
     */
    @Test
    public void testGetGrille() {
        System.out.println("getGrille");
        Carre instance = null;
        Grille expResult = null;
        Grille result = instance.getGrille();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGrille method, of class Carre.
     */
    @Test
    public void testSetGrille() {
        System.out.println("setGrille");
        Grille grille = null;
        Carre instance = null;
        instance.setGrille(grille);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initCase method, of class Carre.
     */
    @Test
    public void testInitCase() {
        System.out.println("initCase");
        Carre instance = null;
        instance.initCase();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFull method, of class Carre.
     */
    @Test
    public void testIsFull() {
        System.out.println("isFull");
        Carre instance = null;
        boolean expResult = false;
        boolean result = instance.isFull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}