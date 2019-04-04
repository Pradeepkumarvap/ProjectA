package TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import Package1.BasePage;
import Package1.HomePageObject;

public class HomePageTest {

	
	HomePageObject homePage;
	BasePage bp;
	
	public HomePageTest()  {
		homePage = new HomePageObject();
		bp = new HomePageObject();
		
	}
	
	@Test
	public void verifytab1() {
		Assert.assertTrue(homePage.getWomen().isDisplayed());
		Assert.assertTrue(homePage.getDresses().isDisplayed());
		Assert.assertTrue(homePage.getTShirts().isDisplayed());
	
	}
	@Test
   public void verifytab2() {
	   homePage.clickwomentab();
	   Assert.assertTrue(homePage.getpageheader().equals("WOMEN"));
	   homePage.clickDressestab();
	   Assert.assertTrue(homePage.getpageheader().equals("DRESSES"));
	   homePage.clickTshirtstab();
	   Assert.assertTrue(homePage.gettshirtsheader().equals("CATALOG"));
	}
   }
	   
