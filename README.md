# base - Java SE 

Ce dépôt contient le code pour le TP1 du cours **"les bases en Java"** du Bootcamp Java & outils Devops dispensé par monsieur Ngor SECK CEO de Samane Corporation. Le but de ce TP est de se familiariser avec la création de projets Java en utilisant des packages et des sous-programmes. De plus cette application est codée de manière robustre et ergonomique afin de limiter au maximum les erreurs de saisie et d'améliorer l'expérience utilisateur.

## Structure du projet

Le projet est structuré en deux packages principaux :

- **sn.isi.controller** : Contient la logique métier.
  - `Fonction.java` : Contient des méthodes pour la gestion des produits et des calculs.
  
- **presentation** : Contient le point d'entrée du programme.
  - `Main.java` : Point de démarrage du programme qui utilise les méthodes définies dans `Fonction.java`.

## Instructions du TP

### 1. Créer un projet Java nommé `base`

- **Package `sn.isi.controller`** : Contient la classe `Fonction.java`.
- **Package `presentation`** : Contient la classe `Main.java`.

### 2. Dans `Fonction.java`, créer les sous-programmes suivants :

#### a) Calcul du montant TTC d’un produit

Un sous-programme qui permet de :
- Saisir les informations d’un produit : le nom, la quantité et le prix HT.
- Calculer et afficher le montant TTC en utilisant une TVA de 18% (0.18).

**Formule** :  
Montant TTC = Quantité * Prix HT * (1 + TVA)

#### b) Calcul basé sur un entier, un réel et un caractère

Un sous-programme qui permet de :
- Saisir un entier, un réel et un caractère.
- Si le caractère est `A`, `a`, `B` ou `b` :
  - Si la partie décimale du réel est supérieure à l'entier, calculer et afficher le produit de l'entier et du réel.
  - Sinon, calculer et afficher le produit de la partie décimale du réel et de l'entier.

### 3. Classe `Main.java`

Dans la classe `Main`, vous allez appeler les méthodes définies dans `Fonction.java` pour tester leur bon fonctionnement.

## Instructions d'exécution

1. Clonez ce dépôt Git :
   ```bash
   git clone https://github.com/username/base.git
   ```

2. Ouvrez le projet dans votre IDE Java préféré (par exemple IntelliJ IDEA ou Eclipse).

3. Exécutez la classe `Main.java` pour tester le programme.

## Exemples d'exécution

#### Exemple 1 : Calcul du montant TTC

```
Entrez le nom du produit : Ordinateur
Entrez la quantité : 2
Entrez le prix HT : 50000
Montant TTC : 118000.0
```

#### Exemple 2 : Calcul avec un entier, un réel et un caractère

```
Entrez un entier : 4
Entrez un réel : 5.6
Entrez un caractère : a
Produit entier * réel = 22.4
```

## Contributeurs

- Ndeye Awa DIOP - Développeuse


