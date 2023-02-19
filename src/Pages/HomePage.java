package Pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
//import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;



public class HomePage {
	
	WebDriver driver;
	
    public HomePage(){
    	
    	PageFactory.initElements(driver,this);

    }
    
    

	WebElement startnow = driver.findElement(By.id("next-button"));
    
    public void LaunchURL(){
    	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dkumar5\\eclipse-workspace\\NHSBSA\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;	
    	
        String baseUrl = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start";
        String expectedTitle = "Check what help you could get to pay for NHS costs - NHSBSA";
        String actualTitle = "";
        driver.get(baseUrl);
        actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("We are in the HomePage");
        } else {
            System.out.println("We are not in the Homepage");
        }

    }

    public void clickStartNow(){
    	
        startnow.click();
        System.out.println("StartNow Clicked");

    }
    
    public void LaunchURL_Firefox(){
    	    	
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\dkumar5\\eclipse-workspace\\NHSBSA\\Drivers\\geckodriver-v0.32.2-win32\\GeckoDriver.exe");
        driver = new FirefoxDriver();
    	
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;	
    	
        String baseUrl = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start";
        String expectedTitle = "Check what help you could get to pay for NHS costs - NHSBSA";
        String actualTitle = "";
        driver.get(baseUrl);
        actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("We are in the HomePage");
        } else {
            System.out.println("We are not in the Homepage");
        }
	
    }
}
