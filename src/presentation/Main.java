package presentation;

import sn.isi.controller.Fonction;

public class Main {
	public static void main(String[] args) {
		//Creation d'une instance de la classe Fonction
		Fonction fonction = new Fonction();
		
		//Appel du sous-programme pour saisir et afficher le montant TTC
		fonction.saisirProduitCalculerEtAfficherMontantTTC();			
	}
}
