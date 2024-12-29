package TestSuit;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.ChemiseetBlouse;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChemiseetBlouseStepDef {


@Given("Utilisateur est sur la page page chemise et blouse")
public void utilisateur_est_sur_la_page_page_chemise_et_blouse() {
    Config.driver=new ChromeDriver();
    Config.maximizewindow();
    Config.driver.get("https://mabrouk.tn/categorie-produit/vetements-femmes/chemises-blouses/");
    Config.attente(10);
}

@When("Utilisateur click sur le produit {string}")
public void utilisateur_click_sur_le_produit(String produit) throws InterruptedException {
	ChemiseetBlouse chemise_blouse =new ChemiseetBlouse();
	chemise_blouse.recherchechemise(produit);
	
}

@Then("Utilisateur est sur la page de produit {string}")
public void utilisateur_est_sur_la_page_de_produit(String produit_name) {
	ChemiseetBlouse chemise_blouse =new ChemiseetBlouse();
	chemise_blouse.verifnomchemise(produit_name);
}

@When("Choisir le couleur {string} de chemise et taille {string} de chemise")
public void choisir_le_couleur_de_chemise_et_taille_de_chemise(String taille_chemise, String couleur_chemise) {
	ChemiseetBlouse chemise_blouse =new ChemiseetBlouse();
	chemise_blouse.choisirtaille_couleurchemise(taille_chemise, couleur_chemise);
}

@When("Utilisateur clique sur le bouton ajouter au panier")
public void utilisateur_clique_sur_le_bouton_pour_ajouter_au_panier() {
	ChemiseetBlouse chemise_blouse =new ChemiseetBlouse();
	chemise_blouse.ajouteraupanier();
}

@Then("Produit correcte {string} est ajouter au panier")
public void produit_correcte_est_ajouter_au_panier(String chemise_name) {
	ChemiseetBlouse chemise_blouse =new ChemiseetBlouse();
	chemise_blouse.verifajoutdanspanier(chemise_name);
}
}
