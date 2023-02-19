package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class GlaucomaPage {
	
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
		
	    public GlaucomaPage(){
	    	
	    	PageFactory.initElements(driver,this);
	    }
	    
	    WebElement NextButton10 = driver.findElement(By.xpath("//*[@id=\"next-button\"]"));
	     
	    public void GlaucomaInfo(String glaucoma){
	    	
	    	try {
	    	      
	        WebElement Glaucoma = driver.findElement(By.xpath("//*[@value="+glaucoma+"]"));
	        Glaucoma.click();
	        System.out.println("Glaucoma Clicked");
	        
	        js.executeScript("arguments[0].scrollIntoView();", NextButton10);
	        NextButton10.click();
	        System.out.println("Next Button Clicked");
	        
	    	}
	    	
	    	catch (Exception e) {
	    	      System.out.println(e);
	    	    }
	    }


	
	

}
