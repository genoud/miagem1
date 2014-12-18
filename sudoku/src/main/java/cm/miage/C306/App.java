package cm.miage.C306;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World! test" );
        try {
			Grille grille=new Grille("rsc/grille/grille1.txt");
			grille.print();
			grille.jouer();
			System.out.println("Résultat premier parcours");
			grille.print();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
