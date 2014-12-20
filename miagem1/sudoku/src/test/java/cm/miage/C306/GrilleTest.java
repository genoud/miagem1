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
public class GrilleTest {
    
    public GrilleTest() {
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
     * Test of getLigne method, of class Grille.
     */
    @Test
    public void testGetLigne_int() {
        System.out.println("getLigne");
        int numero = 0;
        Grille instance = null;
        Case[] expResult = null;
        Case[] result = instance.getLigne(numero);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColonne method, of class Grille.
     */
    @Test
    public void testGetColonne_int() {
        System.out.println("getColonne");
        int numero = 0;
        Grille instance = null;
        Case[] expResult = null;
        Case[] result = instance.getColonne(numero);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLigne method, of class Grille.
     */
    @Test
    public void testGetLigne_Case() {
        System.out.println("getLigne");
        Case uneCase = null;
        Grille instance = null;
        Case[] expResult = null;
        Case[] result = instance.getLigne(uneCase);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColonne method, of class Grille.
     */
    @Test
    public void testGetColonne_Case() {
        System.out.println("getColonne");
        Case uneCase = null;
        Grille instance = null;
        Case[] expResult = null;
        Case[] result = instance.getColonne(uneCase);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarre method, of class Grille.
     */
    @Test
    public void testGetCarre() {
        System.out.println("getCarre");
        Case uneCase = null;
        Grille instance = null;
        Carre expResult = null;
        Carre result = instance.getCarre(uneCase);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarres method, of class Grille.
     */
    @Test
    public void testGetCarres() {
        System.out.println("getCarres");
        Grille instance = null;
        Carre[][] expResult = null;
        Carre[][] result = instance.getCarres();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCarres method, of class Grille.
     */
    @Test
    public void testSetCarres() {
        System.out.println("setCarres");
        Carre[][] carres = null;
        Grille instance = null;
        instance.setCarres(carres);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of print method, of class Grille.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        Grille instance = null;
        instance.print();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of jouer method, of class Grille.
     */
    @Test
    public void testJouer() {
        System.out.println("jouer");
        Grille instance = null;
        instance.jouer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}