package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DiabetesPage {

	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
		
	    public DiabetesPage(){
	    	
	    	PageFactory.initElements(driver,this);
	    }
	    
        WebElement NextButton8 = driver.findElement(By.xpath("//*[@id=\"next-button\"]"));
        WebElement NextButton9 = driver.findElement(By.xpath("//*[@id=\"next-button\"]"));
	     
	    public void DiabetesInfo(String Diabetes){
	    	
	    	try {
	    	      
	        WebElement DiabetesInformation = driver.findElement(By.xpath("//*[@value="+Diabetes+"]"));
	        DiabetesInformation.click();
	        System.out.println("Diabetes Clicked");

	        js.executeScript("arguments[0].scrollIntoView();", NextButton8);
	        NextButton8.click();
	        System.out.println("Next Button Clicked");
	        
	    	}
	    	
	    	catch (Exception e) {
	    	      System.out.println(e);
	    	    }
	    }

	    public void DiabetesInfo_Medication(String BloodSugar){
	    	
	    	try {
	    	      
	        WebElement BloodSugarInformation = driver.findElement(By.xpath("//*[@value="+BloodSugar+"]"));
	        BloodSugarInformation.click();
	        System.out.println("Blood Sugar Medication Information Clicked");

	        js.executeScript("arguments[0].scrollIntoView();", NextButton9);
	        NextButton9.click();
	        System.out.println("Next Button Clicked");
	        
	    	}
	    	
	    	catch (Exception e) {
	    	      System.out.println(e);
	    	    }
	    }

}
