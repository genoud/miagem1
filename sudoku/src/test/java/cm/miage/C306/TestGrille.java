package cm.miage.C306;

import java.io.IOException;

import org.junit.Test;

import junit.framework.TestCase;

public class TestGrille extends TestCase {
	
	Grille grille=null;
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("Initialisation du test");
		if(grille==null){
			grille =new Grille("rsc/grille/grille1.txt");
		}
	}
	@Test
	public void testInitGrille(){
		try {
			grille =new Grille("rsc/grille/grille1.txt");
			if(grille!=null){
				assertTrue(grille.getCarres()[0][0].getCases()[2][0].valeur==7);
			}
			else{
				fail("GRille null.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testGetLigne(){
		Case[] ligne=grille.getLigne(0);
		assertTrue(ligne.length==9);
		assertTrue(ligne[0].valeur==0);
		assertTrue(ligne[1].valeur==0);
		assertTrue(ligne[2].valeur==0);
		assertTrue(ligne[3].valeur==1);
		assertTrue(ligne[4].valeur==0);
		assertTrue(ligne[5].valeur==4);
		assertTrue(ligne[6].valeur==0);
		assertTrue(ligne[7].valeur==3);
		assertTrue(ligne[8].valeur==7);
		
		
	}
	@Test
	public void testGetColonne(){
		Case[] colonne=grille.getColonne(0);
		assertTrue(colonne.length==9);
		assertTrue(colonne[0].valeur==0);
		assertTrue(colonne[1].valeur==0);
		assertTrue(colonne[2].valeur==7);
		assertTrue(colonne[3].valeur==0);
		assertTrue(colonne[4].valeur==0);
		assertTrue(colonne[5].valeur==6);
		assertTrue(colonne[6].valeur==0);
		assertTrue(colonne[7].valeur==0);
		assertTrue(colonne[8].valeur==2);
		
		
	}
	@Test
	public void testCarre(){
		Carre carre=grille.getCarres()[1][1];
		assertTrue(carre.cases.length==3);
		for (int i = 0; i < carre.cases.length; i++) {
			assertTrue(carre.cases[i].length==3);
		}
		
		assertTrue(carre.cases[0][0].valeur==0);
		assertTrue(carre.cases[0][1].valeur==3);
		assertTrue(carre.cases[0][2].valeur==0);
		
		assertTrue(carre.cases[1][0].valeur==0);
		assertTrue(carre.cases[1][1].valeur==9);
		assertTrue(carre.cases[1][2].valeur==0);
		
		assertTrue(carre.cases[2][0].valeur==0);
		assertTrue(carre.cases[2][1].valeur==1);
		assertTrue(carre.cases[2][2].valeur==0);
		
	}
	@Test
	public void testIsWellFieldColonne(){
		Case[] colonne=grille.getColonne(7);
		int[] possibilite=colonne[4].calculatePossibilites();
		assertFalse(colonne[4].jouer(2));
		
	}

}
