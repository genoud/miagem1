package cm.miage.C306;

/**
 * Représente une case , c'est à dire la plus petite unité de celulle Sudoku
 * @author Magloire
 *
 */
public class Case {
	public static final int[] chiffre=new int[]{1,2,3,4,5,6,7,8,9};
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
		if(isEstEditable()){
			this.valeur = valeur;
		}
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
	public Case[] getLigne(){
		return carre.getGrille().getLigne(this);
	}
	public Case[] getColonne(){
		return carre.getGrille().getColonne(this);
	}
	/**
	 * Calcul les chiffres autorisé pour cette celulle
	 */
	public void calculatePossibilites() {
		int[] chiffreBarre=new int[]{};
		Case[]ligne=getLigne();
		chiffreBarre = loadChiffreBarre(chiffreBarre, ligne);
		Case[] colonne=getColonne();
		chiffreBarre = loadChiffreBarre(chiffreBarre, colonne);
		for (int i = 0; i < carre.cases.length; i++) {
			chiffreBarre = loadChiffreBarre(chiffreBarre, carre.cases[i]);
		}
		this.listePossibilite=new int[]{};
		for (int i = 0; i < chiffre.length; i++) {
			if(!Util.contains(chiffreBarre, chiffre[i])){
				this.listePossibilite=Util.addVal(listePossibilite, chiffre[i]);
			}
		}
	}
	/**
	 * Construit la liste des chiffre que cette cellule ne peut pas accepter
	 * @param chiffreBarre
	 * Liste des chiffre barré
	 * @param ligne
	 * Liste des case appartenant soit à la même ligne, soit à la même colonne, soit au même carré que cette case
	 * @return
	 * liste des chiffre interdit
	 */
	private int[] loadChiffreBarre(int[] chiffreBarre, Case[] ligne) {
		for (int i = 0; i < ligne.length; i++) {
			int val=ligne[i].valeur;
			if(val>0){
				if(!Util.contains(chiffreBarre, val)){
					chiffreBarre=Util.addVal(chiffreBarre, val);
				}
			}
		}
		return chiffreBarre;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Case){
			Case other=(Case)obj;
			if(other.ligneCarre!=this.ligneCarre){
				return false;
			}
			if(other.colonneCarre!=this.colonneCarre){
				return false;
			}
			if(other.carre.colonne!=this.carre.colonne){
				return false;
			}
			if(other.carre.ligne!=this.carre.ligne){
				return false;
			}
		}
		return true;
	}
	@Override
	public String toString() {
		return String.valueOf(valeur);
	}
	
	public boolean jouer(int val){
		if(isEstEditable()){
//			for (int i = 0; i < chiffre.length; i++) {
//				int val=chiffre[i];
				int saveVal=this.valeur;
				if(val==this.valeur){
					return true;
				}
				if(Util.contains(listePossibilite, val)){
					this.valeur=val;
					if(!Util.isWellField(getLigne())|| !Util.isWellField(getColonne())|| !Util.isWellField(carre)){
						this.valeur=saveVal;
					}
					else{
						return true;
					}
					
				}
//			}
			
		}
		else{
			return true;
		}
		return false;
		
	}
	
	public boolean isFilled(){
		return valeur>0 && valeur<=9;
	}
	
	
	

}
