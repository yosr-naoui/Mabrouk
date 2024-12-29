package Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class PageDacceuilMabrouk {
@FindBy(xpath="/html/body/div[4]/header/div/div/div[2]/nav/div/div[3]/div[1]/ul/li/a/span")
List<WebElement> menus;
@FindBy(xpath="/html/body/div[4]/header/div/div/div[2]/nav/div/div[3]/div[1]/ul/li[3]/div/ul/li/a/span")
List<WebElement> submenus;
@FindBy(xpath="//*[@id=\"content\"]/div[2]/div[2]/div/h1")
WebElement verif;
public PageDacceuilMabrouk () {
	PageFactory.initElements(Config.driver, this);
}
public void mousehoveronmenu(String menu_name) {
	try {
	for(WebElement menu:menus) {
		if(menu.getText().contains(menu_name)) {
			Config.action=new Actions(Config.driver);
			Config.action.moveToElement(menu).perform();
			
		}
		
	}
	}catch (Exception e) {
		// TODO: handle exception
	}

}
public void clickonsubmenu(String submenu_name){
	try {
		for(WebElement submenu:submenus) {
			if(submenu.getText().contains(submenu_name)) {
				submenu.click();
			}
		}
		
	}catch (Exception e) {
		// TODO: handle exception
	
	}
	
}
public void verifpage(String page_name) {
	Config.attente(10);
	Assert.assertEquals(page_name, verif.getText());
}
}
