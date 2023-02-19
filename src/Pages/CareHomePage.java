package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CareHomePage {
	
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
		
	    public CareHomePage(){
	    	
	    	PageFactory.initElements(driver,this);
	    }
	    
	    WebElement NextButton11 = driver.findElement(By.xpath("//*[@id=\"next-button\"]"));
	    WebElement NextButton12 = driver.findElement(By.xpath("//*[@id=\"next-button\"]"));
	     
	    public void CareHomeInfo(String carehome){
	    	
	    	try {
	    	      
	        WebElement CareHome = driver.findElement(By.xpath("//*[@value="+carehome+"]"));
	        CareHome.click();
	        System.out.println("CareHome Clicked");
	        
	        js.executeScript("arguments[0].scrollIntoView();", NextButton11);
	        NextButton11.click();
	        System.out.println("Next Button Clicked");
	        
	    	}
	    	
	    	catch (Exception e) {
	    	      System.out.println(e);
	    	    }
	    }
	    
	    public void CouncilPayInfo(String Council){
	    	
	    	try {
	    	      
	        WebElement CouncilPay = driver.findElement(By.xpath("//*[@value="+Council+"]"));
	        CouncilPay.click();
	        System.out.println("CouncilPay Information Clicked");
	        
	        js.executeScript("arguments[0].scrollIntoView();", NextButton12);
	        NextButton11.click();
	        System.out.println("Next Button Clicked");
	        
	    	}
	    	
	    	catch (Exception e) {
	    	      System.out.println(e);
	    	    }
	    }


}
