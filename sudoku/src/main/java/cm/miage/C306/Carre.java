package cm.miage.C306;

import java.util.List;
/**
 * Représente un carré d'une grille de sudoku
 * un carré de 3 cases en ligne et 3 cases en colonne
 * @author Magloire
 *
 */
public class Carre {

	/**
	 * Liste des cases du carré
	 */
	Case[][] cases=new Case[3][3];
	/**
	 * Numéro ligne du carré
	 */
	int ligne;
	/**
	 * Numéro colonne du carré
	 */
	int colonne;
	/**
	 * Grille qui contien le carré
	 */
	Grille grille;
	public Case[][] getCases() {
		return cases;
	}
	public void setCases(Case[][] cases) {
		this.cases = cases;
	}
	public int getLigne() {
		return ligne;
	}
	public void setLigne(int ligne) {
		this.ligne = ligne;
	}
	public int getColonne() {
		return colonne;
	}
	public void setColonne(int colonne) {
		this.colonne = colonne;
	}
	public Grille getGrille() {
		return grille;
	}
	public void setGrille(Grille grille) {
		this.grille = grille;
	}
	
}
