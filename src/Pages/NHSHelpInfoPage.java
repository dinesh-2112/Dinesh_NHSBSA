package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NHSHelpInfoPage {

	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement NHSInfo = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div"));
		
	    public NHSHelpInfoPage(){
	    	
	    	PageFactory.initElements(driver,this);
	    }
	        
	    public void NHSHelpInfo(){
	    	
	    	try {
	    	      
	            String NHSGetHelpInfo = NHSInfo.getText();
	            System.out.println(NHSGetHelpInfo);
	        }
	    	
	    	catch (Exception e) {
	    	      System.out.println(e);
	    	}
	    	
	    }


}
