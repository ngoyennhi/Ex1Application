package exercise3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tableau tableauPersonnes = new Tableau();
		// nombre de personnes
		tableauPersonnes.saissirTableau();

		for (int i = 0; i < tableauPersonnes.getnPersonnes(); i++) {
			// creer une nouvelle personnes chaque fois pour saisir dans le tableau
			Personne personne = new Personne();

			// tableauPersonnes.getTabPersonnes() permettre de retourner un tableau
			tableauPersonnes.getTabPersonnes()[i] = personne; // saisir personne
			// System.out.println(tableauPersonnes.getTabPersonnes()[i].affichage());
		}

		// tabTemp est le tableau qui contient des personnes.
		Personne[] tabTemp = tableauPersonnes.getTabPersonnes();
		int nPersonneSaisi = tableauPersonnes.getnPersonnes();

         //affichage les personnes dans le tableau
         for(int j = 0; j<nPersonneSaisi; j++) { 
        	 System.out.println("Personne "+ j +" :");
        	 tabTemp[j].affichage();}


		// affichage les personnes dans le tableau de plus
		Personne[] tabTriAgePersonne = tri_age(tabTemp);
		
			System.out.println("Personne plus jeune: ");
			tabTriAgePersonne[0].affichage();
			
			System.out.println("Personne plus agee: ");
			tabTriAgePersonne[tabTriAgePersonne.length-1].affichage();
		

	}

	/**
	 * tab les personne order by l'age plus jeun de plus agee
	 * 
	 * @param tab
	 * @return
	 */
	public static Personne[] tri_age(Personne[] tab) {
		int lengthTab;
		int temp = 0;

		Boolean inversionTab;

		lengthTab = tab.length;

		// façon 2:
		do {
			inversionTab = false;
			for (int i = 0; i < lengthTab; i++) {
				for (int j = 1; j < lengthTab - i; j++) {

					// convert String to int
					int a = tab[j - 1].getAge();
					int b = tab[j].getAge();

					if (a > b) {
						// echanges des elements
						temp = a;
						a = b;
						b = temp;
						inversionTab = true;
					}
				}
			}

		} while (inversionTab);

		// return tab resultat
		return tab;
	}
}