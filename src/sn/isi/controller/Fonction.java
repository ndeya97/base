package sn.isi.controller;

import java.util.Scanner;

public class Fonction {
	//Sous-programme qui saisit les informations d'un produit puis calcul et affiche le montant TTC
	private double SaisirProduitCalculerEtAfficherMontantTTC() {
		//Saisie des informations du produit
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entrez le nom du produit : ");
		String nom = scanner.nextLine();
		
		System.out.print("Entrez la quantité du produit : ");
		String quantite = scanner.nextInt();
		
		System.out.print("Entrez le prix HT du produit : ");
		String prix = scanner.nextDouble();
		
		//Calcul du montant TTC
		//Affichage du montant TTC
	}
}
