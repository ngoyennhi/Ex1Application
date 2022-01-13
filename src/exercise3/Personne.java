package exercise3;

import java.util.Scanner;

public class Personne {
	// Types de variables
	private String nom;
	private String prenom;
	private String adresseLigne1;
	private String adresseLigne2;
	private String adresseCP;
	private String adresseVille;
	private int age;
	private Scanner src = new Scanner(System.in);

	/**
	 * Appel au constructeur par default de Personne
	 **/

	public Personne() {
		saisieNom();
//		saisiePrenom();
//		saisieAdresseLigne1();
//		saisieAdresseLigne2();
//		saisieAdresseVille();
//		saisieAdresseCP();
		saisieAge();
	}

	/**
	 * Surchage du constructeur par parametres
	 **/

	public Personne(String nom, String prenom, String adresseLigne1, String adresseLigne2, String adresseCP,
			String adresseVille, int age) {
		this.nom = nom;
//		this.prenom = prenom;
//		this.adresseLigne1 = adresseLigne1;
//		this.adresseLigne2 = adresseLigne2;
//		this.adresseVille = adresseVille;
//		this.adresseCP = adresseCP;
		this.age = age;
	}

	/**
	 * Des methodes
	 * 
	 */
	public void saisieNom() {

		// nextLine() pour r�initialiser votre curseur
		System.out.println("veuillez saisir votre nom de compte");
		nom = src.nextLine();

//		// Important pour une ligne blanche
//		src.nextLine();
	}

	public void saisiePrenom() {
		// nextLine() pour r�initialiser votre curseur
		System.out.println("veuillez saisir votre prenom de compte");
		prenom = src.nextLine();

//		// Important pour une ligne blanche
//		src.nextLine();
	}

	public void saisieAdresseLigne1() {
		// nextLine() pour r�initialiser votre curseur
		System.out.println("veuillez saisir votre premiere ligne de votre adresse");
		adresseLigne1 = src.nextLine();

//		// Important pour une ligne blanche
//		src.nextLine();
	}

	public void saisieAdresseLigne2() {

		// nextLine() pour r�initialiser votre curseur
		System.out.println("veuillez saisir votre deuxieme ligne de votre adresse");
		adresseLigne2 = src.nextLine();

//		// Important pour une ligne blanche
//		src.nextLine();
	}

	public void saisieAdresseVille() {

		// nextLine() pour r�initialiser votre curseur
		System.out.println("veuillez saisir votre ville");
		adresseVille = src.nextLine();

//		// Important pour une ligne blanche
//		src.nextLine();
	}

	public void saisieAdresseCP() {

		// nextLine() pour r�initialiser votre curseur
		System.out.println("veuillez saisir votre code postal");
		adresseCP = src.nextLine();

//		// Important pour une ligne blanche
//		src.nextLine();
	}

	public void saisieAge() {

		// nextLine() pour r�initialiser votre curseur
		System.out.println("veuillez saisir votre age");
		age = src.nextInt();

//		// Important pour une ligne blanche
//		src.nextLine();
	}

	// getter et setter
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresseLigne1() {
		return adresseLigne1;
	}

	public void setAdresseLigne1(String adresseLigne1) {
		this.adresseLigne1 = adresseLigne1;
	}

	public String getAdresseLigne2() {
		return adresseLigne2;
	}

	public void setAdresseLigne2(String adresseLigne2) {
		this.adresseLigne2 = adresseLigne2;
	}

	public String getAdresseCP() {
		return adresseCP;
	}

	public void setAdresseCP(String adresseCP) {
		this.adresseCP = adresseCP;
	}

	public String getAdresseVille() {
		return adresseVille;
	}

	public void setAdresseVille(String adresseVille) {
		this.adresseVille = adresseVille;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// afficher
	public void affichage() {
	System.out.println("Nom " + nom);
//		System.out.println("Prenom: " + prenom);
		System.out.println("Age : " + age);
//		System.out.println(
//				"Address: " + adresseLigne1 + " - " + adresseLigne2 + " - " + adresseVille + " - " + adresseCP);
//		System.out.println();
	}

}
