package cm.miage.C306;

import java.io.IOException;

/**
 * Représente une grille du sudoku
 * Une grille est défini par une matrice de carré
 * à trois dimension
 * Le choix des carrés par rapport aus lignes et colonnes et arbitraires 
 * et nous pensons aussi que nous pouvons générer les ligne et les colonnes à partir des carrés
 * @author Magloire
 *
 */
public class Grille {

	/**
	 * Liste des carrés de la grille
	 */
	Carre[][] carres=new Carre[3][3];
	
	/**
	 * Construt une grille à partir du nom du fichier de la grille
	 * @param cheminFichier
	 * nom du fichier à utiliser pour charger la grille
	 * Le fichier doit être un fichier texte contant utilisant les point-virgul comme séparateur
	 * de cellule et des retours chariot comme séarateur de ligne
	 */
	public Grille(String cheminFichier){
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Charge une grille avec les donnée du fichier pris en parmaètre
	 * @param cheminFichier
	 * chemin du fichier
	 * @throws IOException
	 * Si le fichier n'existe pas
	 */
	private void loadGrille(String cheminFichier) throws IOException{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Retourne une ligne de case de la grille, connaisant le numéro de la ligne
	 * Comment procéder,
	 * @param numero
	 * Numéro de la ligne à retourner
	 * @return
	 * Ligne de la grille
	 */
	public Case[] getLigne(int numero){
		throw new UnsupportedOperationException();
	}
	/**
	 * Retourne une colonne de case de la grille, connaissant le numéro de la colonne
	 * @param numero
	 * Numero de la colonne.
	 * @return
	 * Colonne de la grille
	 */
	public Case[] getColonne(int numero){
		throw new UnsupportedOperationException();
	}
	/**
	 * Vérifie si un carré est bien rempli
	 * @param carre
	 * Carre à vérifier
	 * @return
	 * True su le carré est bien rempli
	 * False sinon
	 */
	public static boolean isWellField(Case[][]carre){
		throw new UnsupportedOperationException();
	}
	/**
	 * Vérifie si une ligne ou une colonne est bien rempli
	 * @param ligne
	 * Ligne ou colonne à vérifier
	 * @return
	 * True si c'est le cas
	 * False sinon
	 */
	public static boolean isWellField(Case[]ligne){
		throw new UnsupportedOperationException();
	}
	/**
	 * Retourne une ligne contenant la case pris en paramètre
	 * @param uneCase
	 * Case don ton veut la ligne
	 * @return
	 * ligne contenant la case pris en paramètre
	 */
	public Case[] getLigne(Case uneCase){
		throw new UnsupportedOperationException();
	}
	/**
	 * Retourne une la liste des case d'une colone contenant la case pris en paramètre
	 * @param uneCase
	 * Case don ton veut la colonne
	 * @return
	 * Colonne contenant la cse
	 */
	public  Case[] getColonne(Case uneCase){
		throw new UnsupportedOperationException();
	}
	/**
	 * Recupère le carré contenant une case
	 * @param uneCase
	 * Cose dont on recherche le carré qui la contien
	 * @return
	 * Caré contant la case
	 */
	public Carre getCarre(Case uneCase){
		throw new UnsupportedOperationException();
	}

	public Carre[][] getCarres() {
		return carres;
	}

	public void setCarres(Carre[][] carres) {
		this.carres = carres;
	}
	
	
	
}
