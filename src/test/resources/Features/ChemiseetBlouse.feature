#Author: Yosr
Feature: Page De Chemise & Blouse

  Background: 
    Given Utilisateur est sur la page page chemise et blouse
    When Utilisateur click sur le produit "CHEMISE ISRA"

  Scenario: Selectionner un article de page chemise & blouse
    Then Utilisateur est sur la page de produit "CHEMISE ISRA"

  Scenario: Ajouter un article de la page chemise & blouse au panier
    And Choisir le couleur "noir" de chemise et taille "M" de chemise
    And Utilisateur clique sur le bouton ajouter au panier
    Then Produit correcte "CHEMISE ISRA × 1" est ajouter au panier
