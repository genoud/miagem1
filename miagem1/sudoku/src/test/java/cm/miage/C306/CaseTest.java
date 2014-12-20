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
public class CaseTest {
    
    public CaseTest() {
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
     * Test of getValeur method, of class Case.
     */
    @Test
    public void testGetValeur() {
        System.out.println("getValeur");
        Case instance = new Case();
        int expResult = 0;
        int result = instance.getValeur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValeur method, of class Case.
     */
    @Test
    public void testSetValeur() {
        System.out.println("setValeur");
        int valeur = 0;
        Case instance = new Case();
        instance.setValeur(valeur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarre method, of class Case.
     */
    @Test
    public void testGetCarre() {
        System.out.println("getCarre");
        Case instance = new Case();
        Carre expResult = null;
        Carre result = instance.getCarre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCarre method, of class Case.
     */
    @Test
    public void testSetCarre() {
        System.out.println("setCarre");
        Carre carre = null;
        Case instance = new Case();
        instance.setCarre(carre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLigneCarre method, of class Case.
     */
    @Test
    public void testGetLigneCarre() {
        System.out.println("getLigneCarre");
        Case instance = new Case();
        int expResult = 0;
        int result = instance.getLigneCarre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLigneCarre method, of class Case.
     */
    @Test
    public void testSetLigneCarre() {
        System.out.println("setLigneCarre");
        int ligneCarre = 0;
        Case instance = new Case();
        instance.setLigneCarre(ligneCarre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLigneGrille method, of class Case.
     */
    @Test
    public void testGetLigneGrille() {
        System.out.println("getLigneGrille");
        Case instance = new Case();
        int expResult = 0;
        int result = instance.getLigneGrille();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLigneGrille method, of class Case.
     */
    @Test
    public void testSetLigneGrille() {
        System.out.println("setLigneGrille");
        int ligneGrille = 0;
        Case instance = new Case();
        instance.setLigneGrille(ligneGrille);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColonneCarre method, of class Case.
     */
    @Test
    public void testGetColonneCarre() {
        System.out.println("getColonneCarre");
        Case instance = new Case();
        int expResult = 0;
        int result = instance.getColonneCarre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColonneCarre method, of class Case.
     */
    @Test
    public void testSetColonneCarre() {
        System.out.println("setColonneCarre");
        int colonneCarre = 0;
        Case instance = new Case();
        instance.setColonneCarre(colonneCarre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColonneGrille method, of class Case.
     */
    @Test
    public void testGetColonneGrille() {
        System.out.println("getColonneGrille");
        Case instance = new Case();
        int expResult = 0;
        int result = instance.getColonneGrille();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColonneGrille method, of class Case.
     */
    @Test
    public void testSetColonneGrille() {
        System.out.println("setColonneGrille");
        int colonneGrille = 0;
        Case instance = new Case();
        instance.setColonneGrille(colonneGrille);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListePossibilite method, of class Case.
     */
    @Test
    public void testGetListePossibilite() {
        System.out.println("getListePossibilite");
        Case instance = new Case();
        int[] expResult = null;
        int[] result = instance.getListePossibilite();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListePossibilite method, of class Case.
     */
    @Test
    public void testSetListePossibilite() {
        System.out.println("setListePossibilite");
        int[] listePossibilite = null;
        Case instance = new Case();
        instance.setListePossibilite(listePossibilite);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEstEditable method, of class Case.
     */
    @Test
    public void testIsEstEditable() {
        System.out.println("isEstEditable");
        Case instance = new Case();
        boolean expResult = false;
        boolean result = instance.isEstEditable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstEditable method, of class Case.
     */
    @Test
    public void testSetEstEditable() {
        System.out.println("setEstEditable");
        boolean estEditable = false;
        Case instance = new Case();
        instance.setEstEditable(estEditable);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLigne method, of class Case.
     */
    @Test
    public void testGetLigne() {
        System.out.println("getLigne");
        Case instance = new Case();
        Case[] expResult = null;
        Case[] result = instance.getLigne();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColonne method, of class Case.
     */
    @Test
    public void testGetColonne() {
        System.out.println("getColonne");
        Case instance = new Case();
        Case[] expResult = null;
        Case[] result = instance.getColonne();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculatePossibilites method, of class Case.
     */
    @Test
    public void testCalculatePossibilites() {
        System.out.println("calculatePossibilites");
        Case instance = new Case();
        instance.calculatePossibilites();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Case.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Case instance = new Case();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Case.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Case instance = new Case();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of jouer method, of class Case.
     */
    @Test
    public void testJouer() {
        System.out.println("jouer");
        int val = 0;
        Case instance = new Case();
        boolean expResult = false;
        boolean result = instance.jouer(val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFilled method, of class Case.
     */
    @Test
    public void testIsFilled() {
        System.out.println("isFilled");
        Case instance = new Case();
        boolean expResult = false;
        boolean result = instance.isFilled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}