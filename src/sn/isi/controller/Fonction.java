package sn.isi.controller;

import java.util.Scanner;

public class Fonction {
	//Constante TVA 0
	private static final double TVA = 0.18;

	//Sous-programme qui saisit les informations d'un produit puis calcul et affiche le montant TTC
	public void saisirProduitCalculerEtAfficherMontantTTC() {
		//Saisie des informations du produit
		Scanner scanner = new Scanner(System.in);
		
		//Saisie du nom du produit
		System.out.print("Entrez le nom du produit : ");
		String nom = scanner.nextLine();
		
		//Saisie de la quantite du produit
		System.out.print("Entrez la quantité du produit : ");
		int quantite = Integer.parseInt(scanner.nextLine());
		
		//Saisie du prix HT du produit
		System.out.print("Entrez le prix HT du produit (€) : ");
		double prixHT;
	
		try {
		 prixHT = Double.parseDouble(scanner.nextLine());
		} catch (NumberFormatException e) {
			System.out.println ("Erreur : le prix doit être un nombre valide");
			return; //Sort de la méthode sans rien faire
		}
			
		//Calcul du montant TTC
		double montantTTC = quantite * prixHT * (1 + TVA); 
		
		//Affichage du montant TTC
		System.out.printf("Le montant TTC pour %d %s  est : %.2f €\n", quantite, nom, montantTTC);
	}
}
