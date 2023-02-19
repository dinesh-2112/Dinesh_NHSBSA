package Pages;

//import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class TaxCreditPage {
	
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public String LCW_Without = "Was your take-home pay for your last Universal Credit period £435 or less?";
	public String LCW_With = "Was your take-home pay for your last Universal Credit period £935 or less?";
	
	    public TaxCreditPage(){
	    	
	    	PageFactory.initElements(driver,this);
	    }
	    
	    WebElement TakeHome = driver.findElement(By.xpath("//*[@id=\"question-heading\"]/span"));
	    WebElement Tax_Credit = driver.findElement(By.xpath("//*[@id=\"taxCredit\"]"));
	    WebElement Income_Support = driver.findElement(By.xpath("//*[@id=\"incSupport\"]"));
	    WebElement ESA = driver.findElement(By.xpath("//*[@id=\"esa\"]"));
	    WebElement JSA = driver.findElement(By.xpath("//*[@id=\"jsa\"]"));
	    WebElement Pension_Credit = driver.findElement(By.xpath("//*[@id=\"penCredit\"]"));
	    WebElement No_Benefits = driver.findElement(By.xpath("//*[@id=\"continue\"]"));
	    WebElement Error_Message = driver.findElement(By.xpath("//*[@id=\"error-summary\"]"));
	    
	    WebElement NextButton5 = driver.findElement(By.xpath("//*[@id=\"next-button\"]"));
	    WebElement NextButton14 = driver.findElement(By.xpath("//*[@id=\"next-button\"]"));
	    WebElement NextButton15 = driver.findElement(By.xpath("//*[@id=\"next-button\"]"));
	    WebElement NextButton16 = driver.findElement(By.xpath("//*[@id=\"next-button\"]"));
	    WebElement NextButton17 = driver.findElement(By.xpath("//*[@id=\"next-button\"]"));
	    
	    public void TaxCreditInfo(String TaxCredit){
	    	
	    	try {
	    		
	    		WebElement TaxCreditInformation = driver.findElement(By.xpath("//*[@value="+TaxCredit+"]"));
	    		TaxCreditInformation.click();
	            System.out.println("Tax Credit Clicked");
	           
	            js.executeScript("arguments[0].scrollIntoView();", NextButton5);
	            NextButton5.click();
	            System.out.println("Next Button Clicked");
	        
	    	}
	    	
	    	catch (Exception e) {
	    	      System.out.println(e);
	    	    }
	    }

	    public void UniversalCreditInfo(String universal){
	    	
	    	try {
	    		
	    		WebElement UniversalCredit = driver.findElement(By.xpath("//*[@value="+universal+"]"));
	    		UniversalCredit.click();
	            System.out.println("Universal Credit Clicked");
	           
	            js.executeScript("arguments[0].scrollIntoView();", NextButton14);
	            NextButton14.click();
	            System.out.println("Next Button Clicked");
	        
	    	}
	    	
	    	catch (Exception e) {
	    	      System.out.println(e);
	    	    }
	    }
	    
	    public void LCWInfoWithout(String LCW){
	    	
	    	try {
	    		
	    		WebElement LCWInformation = driver.findElement(By.xpath("//*[@value="+LCW+"]"));
	    		LCWInformation.click();
	            System.out.println("LCWInformation Clicked");
	            
	            String TakeHome_435 = TakeHome.getText();
            
	            Assert.assertEquals(TakeHome_435, LCW_Without);
	            System.out.println("Take Home Information Matched");
                    
	            js.executeScript("arguments[0].scrollIntoView();", NextButton15);
	            NextButton15.click();
	            System.out.println("Next Button Clicked");
	        
	    	}
	    	
	    	catch (Exception e) {
	    			System.out.println("Take Home Information Not Matched");
	    	    }
	    }

	    public void TakeHomeInfo(String TakeHome){
	    	
	    	try {
	    		
	    		WebElement TakeHomeInformation = driver.findElement(By.xpath("//*[@value="+TakeHome+"]"));
	    		TakeHomeInformation.click();
	            System.out.println("TakeHomeInformation Clicked");
	                       
	            js.executeScript("arguments[0].scrollIntoView();", NextButton16);
	            NextButton16.click();
	            System.out.println("Next Button Clicked");
	        
	    	}
	    	
	    	catch (Exception e) {
	    	      System.out.println(e);
	    	    }
	    }
	    
	    public void LCWInfo(String LCW){
	    	
	    	try {
	    		
	    		WebElement LCWInformation = driver.findElement(By.xpath("//*[@value="+LCW+"]"));
	    		LCWInformation.click();
	            System.out.println("LCWInformation Clicked");
	            
	            String TakeHome_935 = TakeHome.getText();
	            
	            Assert.assertEquals(TakeHome_935, LCW_With);
	            System.out.println("Take Home Information Matched");
	           
	            js.executeScript("arguments[0].scrollIntoView();", NextButton17);
	            NextButton17.click();
	            System.out.println("Next Button Clicked");
	           	        
	    	}
	    	
	    	catch (Exception e) {
    			System.out.println("Take Home Information Not Matched");
    	    }
	    }
	
	    public void DecisionInfo(){
	    	
	    	try {
	    		
	    		js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); 
	    		
	    		WebElement NextButton19 = driver.findElement(By.xpath("//*[@id=\"next-button\"]"));
	            js.executeScript("arguments[0].scrollIntoView();", NextButton19);
	            NextButton19.click();
	            System.out.println("Next Button Clicked");
	           	        
	    	}
	    	
	    	catch (Exception e) {
    			System.out.println(e);
    	    }
	    }

	    public void MultipleBenefits(){
	    	
	    	try {
	    		
	    		js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); 
	    		Tax_Credit.click();
	    		Income_Support.click();
	    		Pension_Credit.click();
	    		ESA.click();
	    		
	    		System.out.println("Multiple Benefits Clicked");
	    		
	            js.executeScript("arguments[0].scrollIntoView();", NextButton5);
	            NextButton5.click();
	            System.out.println("Next Button Clicked");
	           	        
	    	}
	    	
	    	catch (Exception e) {
    			System.out.println(e);
    	    }
	    }
	    
	    public void NoBenefitsInfo(){
	    	
	    	try {
	    		
	    		js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); 
	    		No_Benefits.click();	    		
	    		System.out.println("No Benefits Clicked");
	    		
	            js.executeScript("arguments[0].scrollIntoView();", NextButton5);
	            NextButton5.click();
	            System.out.println("Next Button Clicked");
	           	        
	    	}
	    	
	    	catch (Exception e) {
    			System.out.println(e);
    	    }
	    }
	    
	    public void ESA_JSA_Together(){
	    	
	    	try {
	    		
	    		
	    		Tax_Credit.click();
	    		Income_Support.click();
	    		Pension_Credit.click();
	    		ESA.click();
	    		JSA.click();
	    		
	    		System.out.println("ESA and JSA together Selected");
	    		js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); 
	            js.executeScript("arguments[0].scrollIntoView();", NextButton5);
	            NextButton5.click();
	            System.out.println("Next Button Clicked");
	           	        
	    	}
	    	
	    	catch (Exception e) {
    			System.out.println(e);
    	    }
	    }
	    
	    public void ErrorMessage(){
	    	
	    	try {
	    		
	    		String Error_Capture = Error_Message.getText();
	    		System.out.println(Error_Capture);           	        
	    	}
	    	
	    	catch (Exception e) {
    			System.out.println(e);
    	    }
	    }
	    
	    public void TaxCreditBenefits(String TaxCreditType){
	    	
	    	try {
	    		
	    		Tax_Credit.click();
	    		WebElement TaxCreditTypeInfo = driver.findElement(By.xpath("//*[@id="+TaxCreditType+"]"));
	    		TaxCreditTypeInfo.click();
	    		
	    		System.out.println("Tax Credit type Selected");
	    		
	    		js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); 
	    		
	            js.executeScript("arguments[0].scrollIntoView();", NextButton5);
	            NextButton5.click();
	            System.out.println("Next Button Clicked");
	            
	            WebElement Income = driver.findElement(By.xpath("//*[@id=\"radio-yes\"]"));
	            Income.click();
	            NextButton5.click();
	                   	        
	    	}
	    	
	    	catch (Exception e) {
    			System.out.println(e);
    	    }
	    }
	    
	    public void ISBenefits(){
	    	
	    	try {
	    		
	    		Income_Support.click();   		
	    		System.out.println("Income Support Selected");
	    		
	    		js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); 
	    		
	            js.executeScript("arguments[0].scrollIntoView();", NextButton5);
	            NextButton5.click();
	            System.out.println("Next Button Clicked");

	                   	        
	    	}
	    	
	    	catch (Exception e) {
    			System.out.println(e);
    	    }
	    }
	    
	    public void ESABenefits(){
	    	
	    	try {
	    		
	    		ESA.click();   		
	    		System.out.println("ESA Selected");
	    		  		
	            js.executeScript("arguments[0].scrollIntoView();", NextButton5);
	            NextButton5.click();
	            System.out.println("Next Button Clicked");
	            
	            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	            WebElement IncomeESA = driver.findElement(By.xpath("//*[@id=\"income-esa\"]"));
	            IncomeESA.click();
	            NextButton5.click();
	          	                   	        
	    	}
	    	
	    	catch (Exception e) {
    			System.out.println(e);
    	    }
	    }
	    
	    public void ESAContribution(){
	    	
	    	try {
	    		
	    		ESA.click();   		
	    		System.out.println("ESA Selected");
	    		  		
	            js.executeScript("arguments[0].scrollIntoView();", NextButton5);
	            NextButton5.click();
	            System.out.println("Next Button Clicked");
	            
	            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	            WebElement ContributionESA = driver.findElement(By.xpath("//*[@id=\"contribution-esa\"]"));
	            ContributionESA.click();
	            NextButton5.click();
	          	                   	        
	    	}
	    	
	    	catch (Exception e) {
    			System.out.println(e);
    	    }
	    }
	    public void JSABenefits(){
	    	
	    	try {
	    		
	    		JSA.click();   		
	    		System.out.println("JSA Selected");
	    		  		
	            js.executeScript("arguments[0].scrollIntoView();", NextButton5);
	            NextButton5.click();
	            System.out.println("Next Button Clicked");
	            
	            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	            WebElement IncomeJSA = driver.findElement(By.xpath("//*[@id=\"income-jsa\"]"));
	            IncomeJSA.click();
	            NextButton5.click();
	          	                   	        
	    	}
	    	
	    	catch (Exception e) {
    			System.out.println(e);
    	    }
	    }
	    
	    public void JSAContribution(){
	    	
	    	try {
	    		
	    		JSA.click();   		
	    		System.out.println("JSA Selected");
	    		  		
	            js.executeScript("arguments[0].scrollIntoView();", NextButton5);
	            NextButton5.click();
	            System.out.println("Next Button Clicked");
	            
	            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	            WebElement ContributionJSA = driver.findElement(By.xpath("//*[@id=\"contribution-jsa\"]"));
	            ContributionJSA.click();
	            NextButton5.click();
	          	                   	        
	    	}
	    	
	    	catch (Exception e) {
    			System.out.println(e);
    	    }
	    }
	    
	    public void PensionBenefits(String PensionType){
	    	
	    	try {
	    		
	    		Pension_Credit.click();
	    		WebElement PensionTypeInfo = driver.findElement(By.xpath("//*[@id="+PensionType+"]"));
	    		PensionTypeInfo.click();
	    		
	    		System.out.println("Pension Type Info Selected");
	    		
	    		js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); 
	    		
	            js.executeScript("arguments[0].scrollIntoView();", NextButton5);
	            NextButton5.click();
	            System.out.println("Next Button Clicked");
	                               	        
	    	}
	    	
	    	catch (Exception e) {
    			System.out.println(e);
    	    }
	    }
	    
	    public void PensionSavings(){
	    	
	    	try {
	    		
	    		Pension_Credit.click();   		
	    		System.out.println("Pension Selected");
	    		  		
	            js.executeScript("arguments[0].scrollIntoView();", NextButton5);
	            NextButton5.click();
	            System.out.println("Next Button Clicked");
	            
	            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	            WebElement SavingsCredit = driver.findElement(By.xpath("//*[@id=\"savingcredit\"]"));
	            SavingsCredit.click();
	            NextButton5.click();
	          	                   	        
	    	}
	    	
	    	catch (Exception e) {
    			System.out.println(e);
    	    }
	    }
	    
	    public void WorkingTax(){
	    	
	    	try {
	    		
	    		Tax_Credit.click();   		
	    		System.out.println("Tax Credit Selected");
	    		  		
	            js.executeScript("arguments[0].scrollIntoView();", NextButton5);
	            NextButton5.click();
	            System.out.println("Next Button Clicked");
	            
	            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	            WebElement workingTaxCredit = driver.findElement(By.xpath("//*[@id=\"workingTaxCredit\"]"));
	            workingTaxCredit.click();
	            NextButton5.click();
	          	                   	        
	    	}
	    	
	    	catch (Exception e) {
    			System.out.println(e);
    	    }
	    }
}
