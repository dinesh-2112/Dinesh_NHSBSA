package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PregnancyPage {
	
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
		
	    public PregnancyPage(){
	    	
	    	PageFactory.initElements(driver,this);
	    }
	    
	    WebElement NextButton6 = driver.findElement(By.xpath("//*[@id=\"next-button\"]"));
	     
	    public void PregnancyInfo(String pregnancy){
	    	
	    	try {
	    	      
	        WebElement Pregnancy = driver.findElement(By.xpath("//*[@value="+pregnancy+"]"));
	        Pregnancy.click();
	        System.out.println("Pregnancy Clicked");
	        
	        js.executeScript("arguments[0].scrollIntoView();", NextButton6);
	        NextButton6.click();
	        System.out.println("Next Button Clicked");
	        
	    	}
	    	
	    	catch (Exception e) {
	    	      System.out.println(e);
	    	    }
	    }


	
	

}
