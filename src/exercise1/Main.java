package exercise1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tableau tableauPersonnes = new Tableau();
		//nombre de personnes
		tableauPersonnes.saissirTableau();
		
         for(int i = 0; i<tableauPersonnes.getnPersonnes(); i++) {
        	 //creer une nouvelle personnes chaque fois pour saisir dans le tableau
        	 Personne personne = new Personne();
        
        	 //tableauPersonnes.getTabPersonnes() permettre de retourner un tableau 
        	 tableauPersonnes.getTabPersonnes()[i] = personne; //saisir personne
        	 //System.out.println(tableauPersonnes.getTabPersonnes()[i].affichage());
        	 }
         
         // tabTemp est le tableau qui contient des personnes. 
         Personne [] tabTemp = tableauPersonnes.getTabPersonnes();
         int nPersonneSaisi = tableauPersonnes.getnPersonnes();
         
         //affichage les personnes dans le tableau
         for(int j = 0; j<nPersonneSaisi; j++) { 
        	 System.out.println("Personne "+ j +" :");
        	 tabTemp[j].affichage();}
	}
}
