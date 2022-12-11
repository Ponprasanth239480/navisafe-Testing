package testCases;





import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.Launch_Page_Objects;

public class Launch_Page_TestCases extends CommonFunctions{
	String actualMessage=null;
	
	public void checkProducts(){
		PageFactory.initElements(driver,Launch_Page_Objects.class);
		Launch_Page_Objects.product.click();
		actualMessage=Launch_Page_Objects.findproduct.getText();
	}

	@Test
	public void verifyProducts(){
		
		checkProducts();
		
		Assert.assertEquals(actualMessage, "Solution Components");
		
		Launch_Page_Objects.ustnavisafe.click();
	}
	
	public void checkcasestudy(){
		PageFactory.initElements(driver,Launch_Page_Objects.class);
		Launch_Page_Objects.casestudy.click();
		actualMessage=Launch_Page_Objects.findcasestudy.getText();
	}
	@Test
	public void verifyCasestudy(){
		
		checkcasestudy();
		
		Assert.assertEquals(actualMessage, "Ensuring Employee connectivity");
		
		Launch_Page_Objects.ustnavisafe.click();
	}
	public void checkTechnology(){
		PageFactory.initElements(driver,Launch_Page_Objects.class);
		Launch_Page_Objects.technology.click();
		actualMessage=Launch_Page_Objects.findtechnology.getText();
	}
	@Test
	public void verifyTechnology(){
		
		checkTechnology();
		
		Assert.assertEquals(actualMessage, "UST NaviSafe Solution Components");
		
		Launch_Page_Objects.ustnavisafe.click();
	}
	public void checkPricing(){
		PageFactory.initElements(driver,Launch_Page_Objects.class);
		Launch_Page_Objects.pricing.click();
		actualMessage=Launch_Page_Objects.findpricing.getText();
	}
	@Test(enabled = false)
	public void verifyPricing(){
		
		checkPricing();
		
		Assert.assertEquals(actualMessage, "Flexible Pricing Models");
		
		Launch_Page_Objects.ustnavisafe.click();
	}
	public void checkLogin(){
		PageFactory.initElements(driver,Launch_Page_Objects.class);
		Launch_Page_Objects.login.click();
		actualMessage=Launch_Page_Objects.findlogin.getText();
	}
	@Test
	public void verifyLogin(){
		
		checkLogin();
		
		Assert.assertEquals(actualMessage, "Login");
		
		driver.navigate().back();
		
		
	}
	@Test(priority = 7)
	public void verifyRequestSubmit(){
		
		
		PageFactory.initElements(driver,Launch_Page_Objects.class);
		Launch_Page_Objects.request.click();
		
		Launch_Page_Objects.radio.click();
		Launch_Page_Objects.name.sendKeys("sri");
		Launch_Page_Objects.mail.sendKeys("sri@gmail.com");
		Launch_Page_Objects.code.sendKeys("91");
		Launch_Page_Objects.number.sendKeys("9874563210");
		Launch_Page_Objects.company.sendKeys("UST");
		Launch_Page_Objects.comment.sendKeys("No comments");
		Launch_Page_Objects.submit.click();
		actualMessage=Launch_Page_Objects.findlaunch.getText();
		Assert.assertEquals(actualMessage, "UST NAVISAFE FOR WORKPLACE SAFETY & WORKER HEALTH");
		
	}
	@Test(priority = -1)
	public void verifyRequestCancel(){
		
		
		PageFactory.initElements(driver,Launch_Page_Objects.class);
		Launch_Page_Objects.request.click();
		Launch_Page_Objects.cancel.click();
	}
	
	
		
		
	
}
