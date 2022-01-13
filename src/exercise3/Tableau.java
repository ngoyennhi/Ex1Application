package exercise3;

public class Tableau {
	private int nPersonnes;
	//un tableau qui stocke les personne
	private Personne tabPersonnes[];

	public void saissirTableau() {
		System.out.println("Saissez le nombre de personne � saisir,svp");
		nPersonnes = Clavier.lireInt();

		// un tableau de structure dont la longueur sera le nombre de personne
		tabPersonnes = new Personne[nPersonnes];
		
}
	public void affchageTableau() {	
		for (int i = 0; i < nPersonnes; ++i) {
			System.out.println(tabPersonnes[i]);
		}
	}
	
//setter et getter
	public int getnPersonnes() {
		return nPersonnes;
	}

	public void setnPersonnes(int nPersonnes) {
		this.nPersonnes = nPersonnes;
	}

	public Personne[] getTabPersonnes() {
		return tabPersonnes;
	}

	public void setTabPersonnes(Personne[] tabPersonnes) {
		this.tabPersonnes = tabPersonnes;
	}

}
