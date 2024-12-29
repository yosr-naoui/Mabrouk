#Author: Yosr
Feature: Page D'acceuil Mabrouk

  Scenario: Verification des menus de la page dacceuil Mabrouk
    Given Utilisateur est sur la page dacceuil Mabrouk
    When Utilisateur survole la souris sur le menu "Femme" et click sur le submenu "Chemises & Blouses"
    Then Utilisateur est sur la page de submenu "Chemises & Blouses"
