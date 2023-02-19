package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class CountryPage {
	
	WebDriver driver;
	
    public CountryPage(){
    	
    	PageFactory.initElements(driver,this);
    }
    
    WebElement NextButton = driver.findElement(By.xpath("//*[@id=\"next-button\"]"));
    WebElement NextButton13 = driver.findElement(By.xpath("//*[@id=\"next-button\"]"));
    
    public void SelectCountry(String country) throws InterruptedException {
    	
    	try {
    	
        WebElement country1 = driver.findElement(By.xpath("//*[@value="+country+"]"));
    	
        country1.click();
        System.out.println("Country Clicked");
                
        NextButton.click();
        System.out.println("Next Button Clicked");
    	}
    	
    	catch (Exception e) {
  	      System.out.println(e);
  	    }
        
        
    }
    
    public void ScotlandInfo(String Highlands) throws InterruptedException {
    	
    	try {
    	
        WebElement LiveIn = driver.findElement(By.xpath("//*[@value="+Highlands+"]"));
    	
        LiveIn.click();
        System.out.println("Highlands and Islands Info Clicked");
                
        NextButton13.click();
        System.out.println("Next Button Clicked");
    	}
    	
    	catch (Exception e) {
  	      System.out.println(e);
  	    }
        
        
    }

    public void WithoutSelection() throws InterruptedException {

        try {

            NextButton13.click();
            System.out.println("Next Button Clicked");
        }

        catch (Exception e) {
            System.out.println(e);
        }

    }

    public void ErrorMessage() throws InterruptedException {

        try {

            WebElement Error_Message = driver.findElement(By.xpath("//*[@id=\"error-summary\"]"));
            String Message = Error_Message.getText();
            System.out.println(Message);
        }

        catch (Exception e) {
            System.out.println(e);
        }

    }

}
