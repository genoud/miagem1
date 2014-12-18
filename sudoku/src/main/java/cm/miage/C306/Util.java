package cm.miage.C306;

public class Util {
	public static Case[] addTableau(Case[] source, Case[] ajout){
		if(ajout==null|| ajout.length==0){
			throw new IllegalArgumentException();
		}
		int tailleSource=0;
		if(source!=null && source.length>0){
			tailleSource=source.length;
		}
		else{
			return ajout;
		}
		Case[] res=new Case[tailleSource+ajout.length];
		for (int i = 0; i < source.length; i++) {
			res[i]=source[i];
		}
		int debAjout=source.length;
		for (int i = 0; i < ajout.length; i++) {
			res[debAjout]=ajout[i];
			debAjout++;
		}
		return res;
	}
	/**
	 * Vérifie si un carré est bien rempli
	 * @param carre
	 * Carre à vérifier
	 * @return
	 * True su le carré est bien rempli
	 * False sinon
	 */
	public static boolean isWellField(Carre carre){
		Case[][] cases=carre.getCases();
		int[] chiffre=Case.chiffre;
		for (int i = 0; i < chiffre.length; i++) {
			int cpt=0;
			for (int j = 0; j < cases.length; j++) {
				for (int j2 = 0; j2 < cases[j].length; j2++) {
					if(cases[j][j2].valeur==chiffre[i]){
						cpt++;
					}
				}
			}
			if(cpt>1){
				return false;
			}
		}
		return true;
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
		int[] chiffre=Case.chiffre;
		for (int i = 0; i < chiffre.length; i++) {
			int cpt=0;
			for (int j = 0; j < ligne.length; j++) {
				if(ligne[j].valeur==chiffre[i]){
					cpt++;
				}
			}
			if(cpt>1){
				return false;
			}
		}
		return true;
	}
	
	public static boolean contains(int[]tab, int val){
		if(tab==null|| tab.length==0){
			return false;
		}
		for (int i = 0; i < tab.length; i++) {
			if(tab[i]==val){
				return true;
			}
		}
		return false;
	}
	
	public static int[] addVal(int[] tab, int val){
		int tabSize=0;
		if (tab!=null){
			tabSize=tab.length;
		}
		int[] res=new int[tabSize+1];
		for (int i = 0; i < tabSize; i++) {
			res[i]=tab[i];
		}
		res[tabSize]=val;
		return res;
	}

}
