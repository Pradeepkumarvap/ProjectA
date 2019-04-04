package Package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Dressespageobject extends BasePage {

	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement Dresses;
	
	@FindBy(xpath="//*[@id='ul_layered_id_attribute_group_1']/li[1]/label")
	private WebElement smallsize;
	
	@FindBy(xpath="//*[@id='ul_layered_id_attribute_group_1']/li[2]/label")
	private WebElement mediumsize;
	
	@FindBy(xpath="//*[@id='ul_layered_id_attribute_group_1']/li[3]/label")
	private WebElement largesize;
	
	@FindBy(xpath="//*[@class='heading-counter']")
	private WebElement txtproductheader;
	
	@FindBys(@FindBy(xpath="//*[@class='product_list grid row']"))
	private List<WebElement>firstproduct;
	
	@FindBys(@FindBy(xpath="//*[@class='product-image-container']"))
	private List<WebElement>allproducts;
	
	@FindBy(xpath="//*[@id='centre_column']/ul/li[1]/div/div[2]/a[1]/span")
	private WebElement addtocart;
	
	@FindBy(xpath="//*[@id='list']//i[@class='icon-th-list']")
	private WebElement list;
	
	@FindBys(@FindBy(xpath="//*[@class='product-container']//h5/a[@class='product-name']"))
	private List<WebElement> products;
	
	public Dressespageobject ()  {
		PageFactory.initElements(driver, this);
	}
  
	public void clicklist() 
	{
	list.click();
	}
	public List<WebElement> getproducts() {
	return products;
	}

    public boolean discountprice(WebElement parent)
    {
    return elementFound(parent.findElement(By.xpath(".//[@class='discount']")));
    		
    }


    public boolean oldprice(WebElement parent)
    {
    return elementFound(parent.findElement(By.xpath(".//[@class='oldprice product-price']")));
    		
    }
}
   

