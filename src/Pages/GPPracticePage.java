package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class GPPracticePage {
	
WebDriver driver;
JavascriptExecutor js = (JavascriptExecutor) driver;
	
    public GPPracticePage(){
    	
    	PageFactory.initElements(driver,this);
    }
    
    WebElement NextButton1 = driver.findElement(By.xpath("//*[@id=\"next-button\"]"));
     
    public void GPPraticeInfo(String GP){
    	
    	try {
    	      
        WebElement GPPractice = driver.findElement(By.xpath("//*[@value="+GP+"]"));
        GPPractice.click();
        System.out.println("GP Practice Clicked");  
        
        js.executeScript("arguments[0].scrollIntoView();", NextButton1);
        NextButton1.click();
        System.out.println("Next Button Clicked");
        
    	}
    	
    	catch (Exception e) {
  	      System.out.println(e);
  	    }
        
        
    }


}
