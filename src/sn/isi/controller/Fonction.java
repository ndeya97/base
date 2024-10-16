package sn.isi.controller;

import java.util.Scanner;

public class Fonction {
	//Constante TVA 0
	private static final double TVA = 0.18;

	/** Sous-programme qui saisit les informations d'un produit puis calcul et affiche le montant TTC	 */
	public void saisirProduitCalculerEtAfficherMontantTTC(Scanner scanner) {
		
		//Saisie du nom du produit
		System.out.print("Entrez le nom du produit : ");
		String nom = scanner.nextLine();
		
		//Saisie de la quantite du produit
		System.out.print("Entrez la quantité du produit : ");
		int quantite;
		try {
			quantite = Integer.parseInt(scanner.nextLine());
		} catch (NumberFormatException e) {
			System.out.println ("Erreur : le quantite doit être un nombre entier.");
			return; //Sortie en cas d'erreur
		}
		
		//Saisie du prix HT du produit
		System.out.print("Entrez le prix HT du produit (€) : ");
		double prixHT;
		try {
		 prixHT = Double.parseDouble(scanner.nextLine());
		} catch (NumberFormatException e) {
			System.out.println ("Erreur : le prix doit être un nombre valide.");
			return; //Sortie en cas d'erreur
		}
			
        
		//Calcul du montant TTC
		double montantTTC = calculerMontantTTC(prixHT, quantite);
		
		//Affichage du montant TTC
		System.out.printf("Le montant TTC pour %d %s  est : %.2f €\n", quantite, nom, montantTTC);

	}
	
	// Méthode pour calculer le montant TTC
	private double calculerMontantTTC(double prixHT, int quantite) {
		return quantite * prixHT * (1 + TVA); 
	}	
	
	
	/** Sous-programme qui saisit un entier, un réel et un caractère.
	 *  Si le caractère est ‘A’ ou ‘a’ ou ‘B’ ou ‘b’ alors 
	 *  la méthode calcule puis affiche entier * réel si la partie décimal du réel est supérieur à entier.
	 *  Sinon, la méthode calcule puis affiche partie décimal réel * entier.
	 */
	
	public void saisirEntierReelCaractereEtCalculer(Scanner scanner) {
		
		//Saisie d'un caractère
		System.out.print("Entrez un caractère : ");
		char caractere = scanner.nextLine().charAt(0);	
		
		//Saisie d'un entier
		System.out.print("Entrez un entier :");
		int entier;
		try {
			//Ajout de netLine() et trim() pour gérer les erreurs de saisie respectivement capture de la ligne et complète et suppression des espaces
		 entier = Integer.parseInt(scanner.nextLine().trim());
		} catch (NumberFormatException e) {
			System.out.println ("Erreur : l'entier doit être un nombre valide.");
			return; //Sortie en cas d'erreur
		}
		
		//Saisie d'un reel
		System.out.print("Entrez un reel :");
		double reel;
		try {
		 reel = Double.parseDouble(scanner.nextLine());
		} catch (NumberFormatException e) {
			System.out.println ("Erreur : le reel doit être un nombre valide.");
			return; //Sortie en cas d'erreur
		}
		
		if (caractere == 'A' || caractere == 'a' || caractere == 'B' || caractere == 'b') {
			// Obtenir la partie entière du réel
            int partieEntiere = (int) reel;
            // Calculer la partie décimale
            double partieDecimale = reel - partieEntiere;
            // Si la partie décimale est supérieure à l'entier
            if (partieDecimale > entier) {
            	System.out.println("Resultat : " + (entier * reel));       	
            } else {
            	System.out.println("Resultat : " + (partieDecimale * entier));       	
            }
		} else {
			System.out.println("Caractère non pris en charge.");
		}
		
		
	}

}
