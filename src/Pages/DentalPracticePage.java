package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DentalPracticePage {
	
WebDriver driver;
JavascriptExecutor js = (JavascriptExecutor) driver;
	
    public DentalPracticePage(){
    	
    	PageFactory.initElements(driver,this);
    }
    
    WebElement NextButton2 = driver.findElement(By.xpath("//*[@id=\"next-button\"]"));
     
    public void DentalPraticeInfo(String Dental){
    	
    	try {
    	      
        WebElement DentalPractice = driver.findElement(By.xpath("//*[@value="+Dental+"]"));
        DentalPractice.click();
        System.out.println("Dental Practice Clicked");
        
        
        js.executeScript("arguments[0].scrollIntoView();", NextButton2);
        NextButton2.click();
        System.out.println("Next Button Clicked");
        
    	}
    	
    	catch (Exception e) {
    	      System.out.println(e);
    	    }
    }



}
