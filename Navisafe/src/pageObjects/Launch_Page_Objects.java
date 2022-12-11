package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Launch_Page_Objects {
	@FindBy(xpath="//strong[text()='UST NaviSafe']")
	public static WebElement ustnavisafe;
	@FindBy(xpath="//*[@id=\"navbarNav\"]/ul/li[1]/a")
	public static WebElement product;
	@FindBy(xpath="//*[@id=\"navbarNav\"]/ul/li[2]/a")
	public static WebElement casestudy;
	@FindBy(xpath="//*[@id=\"navbarNav\"]/ul/li[3]/a")
	public static WebElement technology;
	@FindBy(xpath="//*[@id=\"navbarNav\"]/ul/li[4]/a")
	public static WebElement pricing;
	@FindBy(xpath="//*[@id=\"navbarNav\"]/ul/li[5]/a")
	public static WebElement request;
	@FindBy(xpath="//*[@id=\"myHeader\"]/h4/div/button")
	public static WebElement login;
	
	@FindBy(xpath="//*[@id=\"hideMenu\"]/app-launch/div/div[2]/p")
	public static WebElement findproduct;
	@FindBy(xpath="//p[text()='UST NAVISAFE FOR WORKPLACE SAFETY & WORKER HEALTH']")
	public static WebElement findlaunch;
	@FindBy(xpath="//*[@id=\"c1\"]/p[2]")
	public static WebElement findcasestudy;
	@FindBy(xpath="//*[@id=\"hideMenu\"]/app-launch/div/div[2]/div[2]/p[1]")
	public static WebElement findtechnology;
	@FindBy(xpath="//*[@id=\"hideMenu\"]/app-launch/div/div[2]/p[1]")
	public static WebElement findpricing;
	@FindBy(xpath="//*[@id=\"hideMenu\"]/app-login/div/div[2]/div[1]/div/div[1]")
	public static WebElement findlogin;
	
	@FindBy(xpath="//button[text()='Cancel']")
	public static WebElement cancel;
	@FindBy(xpath="//button[text()='Submit']")
	public static WebElement submit;
	@FindBy(xpath="(//span[@class='checkmark1'])[1]")
	public static WebElement radio;
	@FindBy(xpath="//input[@formcontrolname='name']")
	public static WebElement name;
	@FindBy(xpath="//input[@formcontrolname='email']")
	public static WebElement mail;
	@FindBy(xpath="//input[@formcontrolname='countryCode']")
	public static WebElement code;
	@FindBy(xpath="//input[@formcontrolname='phone']")
	public static WebElement number;
	@FindBy(xpath="//input[@formcontrolname='organization']")
	public static WebElement company;
	@FindBy(xpath="//textarea[@formcontrolname='message']")
	public static WebElement comment;
	
	

	
	
}
