package presentation;

import java.util.Scanner;

import sn.isi.controller.Fonction;

public class Main {
	public static void main(String[] args) {
		//Creation d'une instance de la classe Fonction
		Fonction fonction = new Fonction();
		
		// Création d'un Scanner partagé
		Scanner scanner = new Scanner(System.in);
		
		//Appel du sous-programme pour saisir et afficher le montant TTC
		fonction.saisirProduitCalculerEtAfficherMontantTTC(scanner);
		
		
		//Appel du sous-programme pour saisir et calculer l'entier, le reel et le caractere
		fonction.saisirEntierReelCaractereEtCalculer(scanner);
		
		// Fermeture du scanner
		scanner.close();
	}
}
