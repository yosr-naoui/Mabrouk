package TestSuit;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.PageDacceuilMabrouk;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PageDacceuilStepDef {
	@Given("Utilisateur est sur la page dacceuil Mabrouk")
	public void utilisateur_est_sur_la_page_dacceuil_mabrouk() {
	    Config.driver=new ChromeDriver();
	    Config.maximizewindow();
	    Config.driver.get("https://mabrouk.tn/");
	    
	}
	@When("Utilisateur survole la souris sur le menu {string} et click sur le submenu {string}")
	public void utilisateur_survole_la_souris_sur_le_menu_et_click_sur_le_submenu(String menutitle, String submenutitle) {
		PageDacceuilMabrouk page= new PageDacceuilMabrouk();
		page.mousehoveronmenu(menutitle);
		page.clickonsubmenu(submenutitle);
				
	}
	@Then("Utilisateur est sur la page de submenu {string}")
	public void utilisateur_est_sur_la_page_de_submenu(String submenutitle) {
		PageDacceuilMabrouk page= new PageDacceuilMabrouk();
		page.verifpage(submenutitle);
		
	 

	}
}
