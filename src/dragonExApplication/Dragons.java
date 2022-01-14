package dragonExApplication;

import java.util.ArrayList;

import exercise3.Clavier;

public class Dragons {

	// champs prives representant les attributes
	private String nom;
	private String sex; // m-male f-female
	private float taille; // en cm;
	private float ecaille; // weight
	private int cracheDuFeu; // oui-true non-false
	private String comporteAmourString; // Fougueux, romantique, solitaire, ...

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public float getTaille() {
		return taille;
	}

	public void setTaille(float taille) {
		this.taille = taille;
	}

	public float getEcaille() {
		return ecaille;
	}

	public void setEcaille(float ecaille) {
		this.ecaille = ecaille;
	}

	public int getCracheDuFeu() {
		return cracheDuFeu;
	}

	public void setCracheDuFeu(int cracheDuFeu) {
		this.cracheDuFeu = cracheDuFeu;
	}

	public String getComporteAmourString() {
		return comporteAmourString;
	}

	public void setComporteAmourString(String comporteAmourString) {
		this.comporteAmourString = comporteAmourString;
	}

	/**
	 * Appel au constructeur par default de Dragon
	 * 
	 */
	public Dragons(String test) {
		
	}
	public Dragons() {
		System.out.println("Saisissez le nom de votre dragon,svp!");
		this.nom = Clavier.lireString();

		System.out.println("Saisissez le sex de votre dragon,svp! (M pour male ou F pour female");
		this.sex = Clavier.lireString();

		System.out.println("Saisissez la taille (cm) nom de votre dragon,svp!");
		this.taille = Clavier.lireFloat();

		System.out.println("Saisissez l'ecaille de votre dragon,svp!");
		this.ecaille = Clavier.lireFloat();

		System.out.println("Votre dragon crache du feu,1-oui ou 0-non");
		this.cracheDuFeu = Clavier.lireInt();

		System.out.println("Les Comportement Amoureux de Votre dragon?");
		this.comporteAmourString = Clavier.lireString();
	}

	/**
	 * Appel au constructeur par params de Dragon
	 * 
	 * @param nom
	 * @param sex                 //m-male f-female
	 * @param taille              // en cm
	 * @param ecaille
	 * @param cracheDuFeu         // oui-1 non-0
	 * @param comporteAmourString //Fougueux, romantique, solitaire, ...
	 */

	public Dragons(String nom, String sex, float taille, float ecaille, int cracheDuFeu, String comporteAmourString) {

		this.nom = nom;
		this.sex = sex;
		this.taille = taille;
		this.ecaille = ecaille;
		this.cracheDuFeu = cracheDuFeu;
		this.comporteAmourString = comporteAmourString;
	}

	//saisir les dragons dans le tableau dynamique
	public static void saisirDragons(ArrayList<Dragons>liste) {
	int demandeCont = 1;
	while (demandeCont == 1) {
		Dragons dragon = new Dragons();
		liste.add(dragon);
		// repondre cette question pour continuer d'ajouter ou d'arreter
		System.out.println("Vous voulez ajouter un dragon? 1-oui 0-non");
		demandeCont = Clavier.lireInt();
	}
	}
	// afficher le dragon
	public void affichage() {
		System.out.println("Nom de dragon " + nom);
		System.out.println("Le sex de dragon: " + sex);
		System.out.println("La taille de dragon: " + taille + " cm");
		System.out.println("Le nombre ecaille de dragon: " + ecaille);
		if (cracheDuFeu == 1) {
			System.out.println("Ce dragon crache du feu");
		} else {
			System.out.println("Ce dragon ne crache pas de feu");
		}
		System.out.println("le comportement amoureux de dragon: " + comporteAmourString);

		System.out.println(); // une ligne d'espace
	}
	
	public static void affichage(Dragons dragons) {
		dragons.affichage();
		System.out.println(); // une ligne d'espace
	}

	// Method d'afficher la liste des dragons
	public static void afficheList(ArrayList<Dragons> liste) {

		for (int i = 0; i < liste.size(); i++) {
			System.out.println("Dragon à l'index : " + i);
			liste.get(i).affichage();
		}
	}

	// indiquer les dragons qui crachent du feu, ou ceux qui ne crachent pas de feu,
	// selon la demande de l’utilisateur.
	// ( lui demander une saisie au clavier )
	public static void afficherListDragonsCrache(ArrayList<Dragons> liste) {

		System.out.println(
				"Vous voulez afficher la liste de dragons qui crachent du feu ou pas? 1 si Oui , 0 si Non, 2 si Pas besoin");
		int reponse = Clavier.lireInt();
		if (reponse == 1) {
			ArrayList<Dragons> listeTempFeuOui = new ArrayList<Dragons>();
			for (Dragons i : liste) {
				if (String.valueOf(i.getCracheDuFeu()).matches("(?i)1.*")) {
					listeTempFeuOui.add(i);
				}
				;
			}
			;
			Dragons.afficheList(listeTempFeuOui);
		} else if (reponse == 0) {
			ArrayList<Dragons> listeTempFeuNon = new ArrayList<Dragons>();
			for (Dragons i : liste) {
				if (String.valueOf(i.getCracheDuFeu()).matches("(?i)0.*")) {
					listeTempFeuNon.add(i);
				}
				;
			}
			;
			Dragons.afficheList(listeTempFeuNon);
		} else {
			System.out.println("Passez les méthodes suivante,svp");
		}
	}
	
	/**
	 * rechercher un dragon par son nom, et afficher ses caractéristiques
	 * @param liste
	 * @param regex
	 */
	public static void rechercherDragonParNom(ArrayList<Dragons> liste,String regex) {
		ArrayList<Dragons> listeTemp = new ArrayList<Dragons>();
		for (Dragons i : liste) {
			// Str.matches("(.*)Tutorials(.*)")
			// EX: rechercher par nom Toto
			if (i.getNom().matches(regex)) {
				listeTemp.add(i);
			}
		}
		Dragons.afficheList(listeTemp);
	}
	
	/**
	 * Methode de trier les dragons selon une attribute precise
	 * @param liste de dragons
	 * @param attribute 
	 */
	
	public static ArrayList<Dragons> tri_DragonTaille(ArrayList<Dragons> liste) {
		int lengthList;
		float temp = 0;

		Boolean inversionList;

		lengthList = liste.size();

		// façon 2:
		do {
			inversionList = false;
			for (int i = 0; i < lengthList; i++) {
				for (int j = 1; j < lengthList - i; j++) {

					float a = liste.get(j - 1).getTaille();
					float b = liste.get(j).getTaille();

					if (a > b) {
						// echanges des elements
						temp = a;
						a = b;
						b = temp;
						inversionList = true;
					}
				}
			}

		} while (inversionList);

		// return tab resultat
		return liste;
	}

	public static void citerDragonPlusPetit(ArrayList<Dragons> liste) {
		ArrayList<Dragons> liste_DragonsTriTaille = Dragons.tri_DragonTaille(liste);
		String test = "test";
		Dragons dragonPlusPetit = new Dragons(test);
		dragonPlusPetit = liste_DragonsTriTaille.get(0);
		System.out.println("Voici le dragon qui est plus petit: ");
		Dragons.affichage(dragonPlusPetit);
	}
	
	public static void citerDragonPlusGrand(ArrayList<Dragons> liste) {
		ArrayList<Dragons> liste_DragonsTriTaille = Dragons.tri_DragonTaille(liste);
		String test = "test";
		Dragons dragonPlusGrand = new Dragons(test);
		int indexPlusGrand = liste_DragonsTriTaille.size() - 1;
		dragonPlusGrand = liste_DragonsTriTaille.get(indexPlusGrand);
		System.out.println("Voici le dragon qui est plus grand: ");
		Dragons.affichage(dragonPlusGrand);
	}
	/**
	 * Modifier le comportement amoureux d’un dragon, puis le réafficher.
	 * @param liste de dragon
	 * @param indexDragon int la position de dragon dans la liste
	 * @param modifier String pour remplacer l'ancien String
	 */
	public static void modifierDragonsComporteAmour(ArrayList<Dragons> liste, int indexDragon, String modifier) {
//	    System.out.println("before modifier: ");
//	    System.out.println(liste_Dragons.get(0));
		liste.get(indexDragon).setComporteAmourString(modifier);
		System.out.println("after modifier: ");
	    Dragons.affichage(liste.get(0));
	}
}

