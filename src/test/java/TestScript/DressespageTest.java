package TestScript;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Package1.BasePage;
import Package1.Dressespageobject;
import Package1.HomePageObject;

public class DressespageTest {

	Dressespageobject dressespage;
	BasePage np;
	HomePageObject homepage;
	
	public DressespageTest()  {
		dressespage = new Dressespageobject();
		np = new Dressespageobject();
		homepage = new HomePageObject();
	}
	
	@Test
	
	public void verifydiscountprice() {
		homepage.clickDressestab();
		dressespage.clicklist();
		List<WebElement> product = dressespage.getproducts();
		for (WebElement pdts : product) {
			if (dressespage.discountprice(pdts) == true) {
				Assert.assertTrue(dressespage.oldprice(pdts), "old price exists");
				
			}
		}
		
	}
	
}
