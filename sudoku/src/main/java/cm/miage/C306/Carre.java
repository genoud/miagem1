package cm.miage.C306;
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
	public Carre(int ligne, int colonne, Grille grille) {
		this.ligne=ligne;
		this.colonne=colonne;
		this.grille=grille;
	}
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
	public void initCase() {
		for (int i = 0; i < cases.length; i++) {
			for (int j = 0; j < cases[i].length; j++) {
				Case laCase=new Case();
				laCase.setLigneCarre(i);
				laCase.setColonneCarre(j);
				laCase.setLigneGrille(this.ligne*3+i);
				laCase.setColonneGrille(this.colonne*3+j);
				laCase.setCarre(this);
				laCase.setValeur(0);
				cases[i][j]=laCase;
			}
		}
	}
	public boolean isFull(){
		for (int i = 0; i < cases.length; i++) {
			for (int j = 0; j < cases[i].length; j++) {
				if(!cases[i][j].isFilled()){
					return false;
				}
			}
			
		}
		return true;
	}
	
}
