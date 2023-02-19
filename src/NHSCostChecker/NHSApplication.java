package NHSCostChecker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;

public class NHSApplication {
	
	public static void main(String[] args) throws InterruptedException {
        // declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dkumar5\\eclipse-workspace\\NHSBSA\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
    	
        String baseUrl = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start";
        String expectedTitle = "Check what help you could get to pay for NHS costs - NHSBSA";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();
        
        System.out.println(actualTitle);

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        
        WebElement startnow = driver.findElement(By.id("next-button"));
        startnow.click();
        System.out.println("StartNow Clicked");
        
        WebElement country = driver.findElement(By.xpath("//*[@value=\"ENGLAND\"]"));
        country.click();
        System.out.println("Country Clicked");
             
        WebElement NextButton = driver.findElement(By.xpath("//*[@id=\"next-button\"]"));
        NextButton.click();
        System.out.println("Next Button Clicked");
        
        WebElement GPPractice = driver.findElement(By.xpath("//*[@value=\"Yes\"]"));
        GPPractice.click();
        System.out.println("GP Practice Clicked");
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement NextButton1 = driver.findElement(By.xpath("//*[@id=\"next-button\"]"));
        js.executeScript("arguments[0].scrollIntoView();", NextButton1);
        NextButton1.click();
        System.out.println("Next Button Clicked");
        
        WebElement DentalPractice = driver.findElement(By.xpath("//*[@value=\"ENGLAND\"]"));
        DentalPractice.click();
        System.out.println("Dental Practice Clicked");
        WebElement NextButton2 = driver.findElement(By.xpath("//*[@id=\"next-button\"]"));
        js.executeScript("arguments[0].scrollIntoView();", NextButton2);
        NextButton2.click();
        System.out.println("Next Button Clicked");
        
        WebElement DOBDate = driver.findElement(By.id("dob-day"));
        DOBDate.sendKeys("21");
        WebElement DOBMonth = driver.findElement(By.id("dob-month"));
        DOBMonth.sendKeys("12");
        WebElement DOBYear = driver.findElement(By.id("dob-year"));
        DOBYear.sendKeys("1987");
        WebElement NextButton3 = driver.findElement(By.xpath("//*[@id=\"next-button\"]"));
        js.executeScript("arguments[0].scrollIntoView();", NextButton3);
        NextButton3.click();
        System.out.println("Next Button Clicked");
        
        WebElement Partner = driver.findElement(By.xpath("//*[@value=\"Yes\"]"));
        Partner.click();
        System.out.println("Partner Info Clicked");
        WebElement NextButton4 = driver.findElement(By.xpath("//*[@id=\"next-button\"]"));
        js.executeScript("arguments[0].scrollIntoView();", NextButton4);
        NextButton4.click();
        System.out.println("Next Button Clicked");
        
        WebElement TaxCredit = driver.findElement(By.xpath("//*[@value=\"No\"]"));
        TaxCredit.click();
        System.out.println("Tax Credit Clicked");
        WebElement NextButton5 = driver.findElement(By.xpath("//*[@id=\"next-button\"]"));
        js.executeScript("arguments[0].scrollIntoView();", NextButton5);
        NextButton5.click();
        System.out.println("Next Button Clicked");
        
        WebElement Pregnancy = driver.findElement(By.xpath("//*[@value=\"No\"]"));
        Pregnancy.click();
        System.out.println("Pregnancy Clicked");
        WebElement NextButton6 = driver.findElement(By.xpath("//*[@id=\"next-button\"]"));
        js.executeScript("arguments[0].scrollIntoView();", NextButton6);
        NextButton6.click();
        System.out.println("Next Button Clicked");
        
        WebElement ServingArmedForce = driver.findElement(By.xpath("//*[@value=\"No\"]"));
        ServingArmedForce.click();
        System.out.println("ServingArmedForce Clicked");
        WebElement NextButton7 = driver.findElement(By.xpath("//*[@id=\"next-button\"]"));
        js.executeScript("arguments[0].scrollIntoView();", NextButton7);
        NextButton7.click();
        System.out.println("Next Button Clicked");
        
        WebElement Diabetes = driver.findElement(By.xpath("//*[@value=\"No\"]"));
        Diabetes.click();
        System.out.println("Diabetes Clicked");
        WebElement NextButton8 = driver.findElement(By.xpath("//*[@id=\"next-button\"]"));
        js.executeScript("arguments[0].scrollIntoView();", NextButton8);
        NextButton8.click();
        System.out.println("Next Button Clicked");
        
        
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        WebElement OtherConditions = driver.findElement(By.xpath("//*[@value=\"No\"]"));
        OtherConditions.click();
        System.out.println("Other Conditions Clicked");
        WebElement NextButton9 = driver.findElement(By.xpath("//*[@id=\"next-button\"]"));
        js.executeScript("arguments[0].scrollIntoView();", NextButton9);
        NextButton9.click();
        System.out.println("Next Button Clicked");
        
        WebElement Glaucoma = driver.findElement(By.xpath("//*[@value=\"No\"]"));
        Glaucoma.click();
        System.out.println("Glaucoma Clicked");
        WebElement NextButton10 = driver.findElement(By.xpath("//*[@id=\"next-button\"]"));
        js.executeScript("arguments[0].scrollIntoView();", NextButton10);
        NextButton10.click();
        System.out.println("Next Button Clicked");
        
        WebElement CareHome = driver.findElement(By.xpath("//*[@value=\"No\"]"));
        CareHome.click();
        System.out.println("CareHome Clicked");
        WebElement NextButton11 = driver.findElement(By.xpath("//*[@id=\"next-button\"]"));
        js.executeScript("arguments[0].scrollIntoView();", NextButton11);
        NextButton11.click();
        System.out.println("Next Button Clicked");
        
        WebElement Savings = driver.findElement(By.xpath("//*[@value=\"Yes\"]"));
        Savings.click();
        System.out.println("Savings Clicked");
        WebElement NextButton12 = driver.findElement(By.xpath("//*[@id=\"next-button\"]"));
        js.executeScript("arguments[0].scrollIntoView();", NextButton12);
        NextButton12.click();
        System.out.println("Next Button Clicked");
        
        WebElement NHSInfo = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div"));
        String NHSGetHelpInfo = NHSInfo.getText();
        System.out.println(NHSGetHelpInfo);

        
        //close Fire fox
        driver.close();
    }
	

}
