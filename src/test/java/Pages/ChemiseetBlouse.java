package Pages;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class ChemiseetBlouse {
@FindBy(xpath="/html/body/div[5]/div[4]/div[4]/div/div[4]/div/ul/li/div/div[2]/h3/a")
List<WebElement> lisproduit;
@FindBy(xpath="/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/h1")
WebElement verifproduit;
@FindBy(xpath="/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/form/div[1]/div[2]/div[3]/span")
List<WebElement> colors;
@FindBy(xpath="/html/body/div[5]/header/div/div[1]/ul[2]/li[3]/div[1]/div[2]/div/p[2]/a[1]")
WebElement voir_panier;
@FindBy(xpath="/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/form/div[1]/div[3]/div[3]/span")
List<WebElement> tailles;
@FindBy(xpath="/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/form/div[2]/div[2]/a")
WebElement ajout_panier;
@FindBy(xpath="/html/body/div[4]/div[4]/div[4]/div/div/main/article/div/div/div[2]/div/form/div[1]/div/div[2]/div[1]/div/a")
WebElement verifAjoutProduit;

public ChemiseetBlouse() {
	PageFactory.initElements(Config.driver, this);
}
public void recherchechemise (String chemise_name) throws InterruptedException{
	try {
	for(WebElement produit:lisproduit) {
		if(produit.getText().contains(chemise_name)) {
			Thread.sleep(7000);
			produit.click();
		}
	}
	}catch (Exception e) {
		// TODO: handle exception
	}
}
public void verifnomchemise (String verifchemise) {
	Config.attente(10);
	Assert.assertEquals(verifchemise, verifproduit.getText());	
}
public void choisirtaille_couleurchemise (String taillechemise, String couleurchemise) {
	try {
	for(WebElement taille:tailles) {
		if(taille.getText().contains(taillechemise)) {
			taille.click();
			Config.attente(10);
		}
	}

	}catch (Exception e) {
		// TODO: handle exception
	}
}
public void ajouteraupanier () {
	Config.attente(10);
	ajout_panier.click();
}
public void verifajoutdanspanier(String verifnamechemise) {
	WebDriverWait wait=new WebDriverWait(Config.driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(voir_panier));
	voir_panier.click();
	Assert.assertEquals(verifnamechemise, verifAjoutProduit.getText());
}
}
