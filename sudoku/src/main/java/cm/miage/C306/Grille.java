package cm.miage.C306;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
	 * @throws IOException 
	 */
	public Grille(String cheminFichier) throws IOException{
		initGrille();
		loadGrille(cheminFichier);
	}
	
	private void initGrille(){
		for (int i = 0; i < carres.length; i++) {
			for (int j = 0; j < carres[i].length; j++) {
				carres[i][j]=new Carre(i, j, this);
				carres[i][j].initCase();
			}
		}
	}
	/**
	 * Charge une grille avec les donnée du fichier pris en parmaètre
	 * @param cheminFichier
	 * chemin du fichier
	 * @throws IOException
	 * Si le fichier n'existe pas
	 */
	private void loadGrille(String cheminFichier) throws IOException{
		File file=new File(cheminFichier);
		if(!file.exists()){
			throw new IOException();
		}
		FileReader in=new FileReader(file);
		BufferedReader reader=new BufferedReader(in);
		String ligne=reader.readLine();
		int numLigne=0;
		while (!ligne.trim().equals("")){
			String[] values=ligne.split(";");
			if(values.length==9){
				Case[] cases=getLigne(numLigne);
				for (int i = 0; i < values.length; i++) {
					int val=Integer.parseInt(values[i]);
					if(val<0 || val>9){
						throw new IllegalArgumentException();
					}
					cases[i].setValeur(Integer.parseInt(values[i]));
					if(val>0){
						cases[i].setEstEditable(false);
					}
					else{
						cases[i].calculatePossibilites();
					}
				}
			}
			ligne=reader.readLine();
			if(ligne==null){
				ligne="";
			}
			numLigne++;
		}
		reader.close();
		in.close();
	}
	private Case getCase(int numLigne, int numColone){
		Case[]ligne=getLigne(numLigne);
		return ligne[numColone];
	}
	
	private Carre getCarre(int numLigne, int numColonne){
		if(numLigne<1||numLigne>9 || numColonne<1 ||  numColonne>9){
			throw new IllegalArgumentException();
		}
		if(numLigne<=3){
			//PRemière ligne des carrés
			if(numColonne<=3){
				return carres[0][0];
			}
			else if(numColonne<=6){
				return carres[0][1];
			}
			else if(numColonne<=9){
				return carres[0][2];
			}
		}
		else if(numLigne<=6){
			//On est dans la deuxième ligne des carré
			if(numColonne<=3){
				return carres[1][0];
			}
			else if(numColonne<=6){
				return carres[1][1];
			}
			else if(numColonne<=9){
				return carres[1][2];
			}
		}
		else if(numLigne<=9){
			//On est dans la troisième ligne des carré
			if(numColonne<=3){
				return carres[2][0];
			}
			else if(numColonne<=6){
				return carres[2][1];
			}
			else if(numColonne<=9){
				return carres[2][2];
			}
		}
		return null;
	}
	
	/**
	 * Retourne une ligne de case de la grille, connaisant le numéro de la ligne
	 * Comment procéder,
	 * @param numero
	 * Numéro de la ligne à retourner
	 * les ligne sont numéroté de 0 à 9
	 * @return
	 * Ligne de la grille
	 */
	public Case[] getLigne(int numero){
		Case[]ligne=null;
		if(numero<0 || numero>8){
			throw new IllegalArgumentException();
		}
		if(numero<3){
			int numeroLigneCarre=numero;
			Carre[] ligneCarres=carres[0];
			for (int i = 0; i < ligneCarres.length; i++) {
				ligne=Util.addTableau(ligne, ligneCarres[i].cases[numeroLigneCarre]);
			}
		}
		else if(numero<6){
			int numeroLigneCarre=numero-3;
			Carre[] ligneCarres=carres[1];
			for (int i = 0; i < ligneCarres.length; i++) {
				ligne=Util.addTableau(ligne, ligneCarres[i].cases[numeroLigneCarre]);
			}
		}
		else if(numero<9){
			int numeroLigneCarre=numero-6;
			Carre[] ligneCarres=carres[2];
			for (int i = 0; i < ligneCarres.length; i++) {
				ligne=Util.addTableau(ligne, ligneCarres[i].cases[numeroLigneCarre]);
			}
		}
		return ligne;
	}
	
	/**
	 * Retourne une colonne de case de la grille, connaissant le numéro de la colonne
	 * @param numero
	 * Numero de la colonne.
	 * @return
	 * Colonne de la grille
	 */
	public Case[] getColonne(int numero){
		if(numero<0||numero>8){
			throw new IllegalArgumentException();
		}
		Case[] colonne=new Case[9];
		int numeroColonneCarre=0;
		int numCol=0;
		for (int i = 0; i < carres.length; i++) {
			if(numero<3){
				numeroColonneCarre=numero;
				Carre carre=carres[i][0];
				Case[][] cases=carre.cases;
				for (int j = 0; j < cases.length; j++) {
					colonne[numCol]=cases[j][numeroColonneCarre];
					numCol++;
				}
			}
			else if(numero<6){
				numeroColonneCarre=numero-3;
				Carre carre=carres[i][1];
				Case[][] cases=carre.cases;
				for (int j = 0; j < cases.length; j++) {
					colonne[numCol]=cases[j][numeroColonneCarre];
					numCol++;
				}
			}
			else if(numero<9){
				numeroColonneCarre=numero-6;
				Carre carre=carres[i][2];
				Case[][] cases=carre.cases;
				for (int j = 0; j < cases.length; j++) {
					colonne[numCol]=cases[j][numeroColonneCarre];
					numCol++;
				}
			}
		}
		return colonne;
	}
	
	/**
	 * Retourne une ligne contenant la case pris en paramètre
	 * @param uneCase
	 * Case don ton veut la ligne
	 * @return
	 * ligne contenant la case pris en paramètre
	 */
	public Case[] getLigne(Case uneCase){
		return getLigne(uneCase.getLigneGrille());
	}
	/**
	 * Retourne une la liste des case d'une colone contenant la case pris en paramètre
	 * @param uneCase
	 * Case don ton veut la colonne
	 * @return
	 * Colonne contenant la cse
	 */
	public  Case[] getColonne(Case uneCase){
		return getColonne(uneCase.getColonneGrille());
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
	public void print(){
		for (int i = 0; i < 9; i++) {
			Case[]ligne=getLigne(i);
			for (int j = 0; j < ligne.length; j++) {
				System.out.print(ligne[j].toString()+";");
			}
			System.out.println("");
		}
	}
	
	public void jouer(){
		for (int chiffre = 1; chiffre <=9; chiffre++) {
			System.out.println("Chiffre joué: "+ chiffre);
			for (int i = 0; i < 9; i++) {
				Case[] ligne = getLigne(i);
				System.out.println("");
				System.out.println("Ligne avant");
				
				for (int j = 0; j < ligne.length; j++) {
					System.out.print(ligne[j].valeur+":");
				}
				for (int j = 0; j < ligne.length; j++) {
					if(!ligne[j].isFilled()){
						ligne[j].jouer(chiffre);
					}
					
				}
				System.out.println("");
				System.out.println("Ligne après");
				for (int j = 0; j < ligne.length; j++) {
					System.out.print(ligne[j].valeur+":");
				}
			}
			System.out.println("Fin : "+ chiffre);
		}
	}
	
	
	
}
