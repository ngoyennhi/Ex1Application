package exercise3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int demandeCont = 1;
            ArrayList<Personne> liste_Personnes = new ArrayList<Personne>();
		while (demandeCont == 1) { 
			Personne personne = new Personne();
			liste_Personnes.add(personne);
			System.out.println("Vous voulez ajouter une personne? 1-oui 0-non");
		    demandeCont = Clavier.lireInt();
		};
		//aficher les personnes
		for (int i = 0; i < liste_Personnes.size(); i++) {
			System.out.println("Element à l'index : " + i );
			liste_Personnes.get(i).affichage();
		}
	}

}
