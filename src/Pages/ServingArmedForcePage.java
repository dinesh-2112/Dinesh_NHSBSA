package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ServingArmedForcePage {

	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
		
	    public ServingArmedForcePage(){
	    	
	    	PageFactory.initElements(driver,this);
	    }
	    
	    WebElement NextButton7 = driver.findElement(By.xpath("//*[@id=\"next-button\"]"));
	     
	    public void ArmedForceInfo(String armedforces){
	    	
	    	try {
	    	      
	        WebElement ServingArmedForce = driver.findElement(By.xpath("//*[@value="+armedforces+"]"));
	        ServingArmedForce.click();
	        System.out.println("ServingArmedForce Clicked");
	        
	        js.executeScript("arguments[0].scrollIntoView();", NextButton7);
	        NextButton7.click();
	        System.out.println("Next Button Clicked");
	        
	    	}
	    	
	    	catch (Exception e) {
	    	      System.out.println(e);
	    	    }
	    }


}
