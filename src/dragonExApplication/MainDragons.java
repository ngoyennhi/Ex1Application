package dragonExApplication;

import java.util.ArrayList;

public class MainDragons {

	public static void main(String[] args) {
		/*
		 * Demande d'saisir un ou plusieurs dragons
		 */

		ArrayList<Dragons> liste_Dragons = new ArrayList<Dragons>();
		Dragons.saisirDragons(liste_Dragons);
	
		/*
		 * Demande d'afficher la liste des dragons
		 */
		Dragons.afficheList(liste_Dragons);
		
		
		/*
		 * Demande de rechercher un dragon par son nom, et afficher ses caractéristiques
		 */
		Dragons.rechercherDragonParNom(liste_Dragons, "(?i)Toto.*");

		/*
		 * 		 indiquer les dragons qui crachent du feu, ou ceux qui ne crachent pas de feu,
		 selon la demande de l’utilisateur.
		 ( lui demander une saisie au clavier )
		 */
		Dragons.afficherListDragonsCrache(liste_Dragons);

		
		/*
		 * Demande d'afficher le dragon plus GRAND et plus PETIT
		 */	
		//indiquer le dragon le plus petit
        Dragons.citerDragonPlusPetit(liste_Dragons);
		
		//indiquer le dragon le plus grand
		Dragons.citerDragonPlusGrand(liste_Dragons);
		
		
		/*
		 * Demande d'modifier le comportement amoureux d’un dragon, 
		puis le réafficher.
		 */
        Dragons.modifierDragonsComporteAmour(liste_Dragons, 0, "romantique");
		/*
		 * Demande d'supprimer un dragon du répertoire.
		 */
		
		
		/**
		 * remove un dragon selon son index/ sa position dans la liste
		 */
		liste_Dragons.remove(0);
		
	}

}
