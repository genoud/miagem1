package cm.miage.C306;

/**
 * Représente une case , c'est à dire la plus petite unité de celulle Sudoku
 * @author Magloire
 *
 */
public class Case {
	/**
	 * Valeur de la case
	 * comprise entre 1 et 9
	 */
	int valeur=0;
	/**
	 * Carré de la grille dans le quel se trouve la case
	 * Valeur comprise entre 1 et 9
	 * Les caré sont numéroté de gauche à droite et de bat en bas
	 */
	Carre carre;
	/**
	 * Numéro de la ligne de la case dans son carré
	 */
	int ligneCarre;
	/**
	 * Numéro de la ligne de la case dans la grille
	 */
	int ligneGrille;
	/**
	 * numéro de la colonne de la case dans son carré
	 */
	int colonneCarre;
	/**
	 * Numéro de la colonne de la case dans la grille
	 */
	int colonneGrille;
	/**
	 * Table contenant la liste des possibilités d'une case.
	 */
	int[] listePossibilite;
	/**
	 * Défini si la case est éditable
	 * si la valeur de la case provient du fichier, la case n'est pas editable
	 */
	boolean estEditable=true;
	public int getValeur() {
		return valeur;
	}
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	public Carre getCarre() {
		return carre;
	}
	public void setCarre(Carre carre) {
		this.carre = carre;
	}
	public int getLigneCarre() {
		return ligneCarre;
	}
	public void setLigneCarre(int ligneCarre) {
		this.ligneCarre = ligneCarre;
	}
	public int getLigneGrille() {
		return ligneGrille;
	}
	public void setLigneGrille(int ligneGrille) {
		this.ligneGrille = ligneGrille;
	}
	public int getColonneCarre() {
		return colonneCarre;
	}
	public void setColonneCarre(int colonneCarre) {
		this.colonneCarre = colonneCarre;
	}
	public int getColonneGrille() {
		return colonneGrille;
	}
	public void setColonneGrille(int colonneGrille) {
		this.colonneGrille = colonneGrille;
	}
	public int[] getListePossibilite() {
		return listePossibilite;
	}
	public void setListePossibilite(int[] listePossibilite) {
		this.listePossibilite = listePossibilite;
	}
	public boolean isEstEditable() {
		return estEditable;
	}
	public void setEstEditable(boolean estEditable) {
		this.estEditable = estEditable;
	}
	
	
	
	

}
