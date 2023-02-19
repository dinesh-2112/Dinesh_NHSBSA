package StepDefinition;

import org.junit.BeforeClass;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;


import Pages.CareHomePage;
import Pages.CountryPage;
import Pages.DOBPage;
import Pages.DentalPracticePage;
import Pages.DiabetesPage;
import Pages.GPPracticePage;
import Pages.GlaucomaPage;
import Pages.HomePage;
import Pages.NHSHelpInfoPage;
import Pages.OtherConditionsPage;
import Pages.PartnerPage;
import Pages.PregnancyPage;
import Pages.SavingsInfoPage;
import Pages.ServingArmedForcePage;
import Pages.TaxCreditPage;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class StepDefinition{
	
	WebDriver driver;
	
    public StepDefinition(){
    	
    	PageFactory.initElements(driver,this);
    }

	@Parameterized.Parameters(name = "browser")

	@BeforeTest

	public void beforeTest(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			System.out.println("chrome");

			System.setProperty("webdriver.chrome.driver","C:\\Users\\dkumar5\\eclipse-workspace\\NHSBSA\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			System.out.println("Chrome Bowser launched");

		} else if (browser.equalsIgnoreCase("firefox")) {

			System.out.println("firefox");

			System.setProperty("webdriver.gecko.driver", "C:\\Users\\dkumar5\\eclipse-workspace\\NHSBSA\\Drivers\\geckodriver-v0.32.2-win32\\GeckoDriver.exe");
			driver = new FirefoxDriver();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			System.out.println("Firefox Bowser launched");
		}
	}
   	HomePage homepage = new HomePage();
   	CountryPage countrypage = new CountryPage();
   	GPPracticePage gppracticepage = new GPPracticePage();
   	DentalPracticePage dentalpracticepage = new DentalPracticePage();
   	DOBPage dobpage = new DOBPage();
   	PartnerPage partnerpage = new PartnerPage();
   	TaxCreditPage taxcreditpage = new TaxCreditPage();
   	PregnancyPage pregnancypage = new PregnancyPage();
   	ServingArmedForcePage servingarmedforcepage = new ServingArmedForcePage();
   	DiabetesPage diabetespage = new DiabetesPage();
   	OtherConditionsPage otherconditionspage = new OtherConditionsPage();
   	GlaucomaPage glaucomapage = new GlaucomaPage();
   	CareHomePage carehomepage = new CareHomePage();
	SavingsInfoPage savingsinfopage = new SavingsInfoPage();
	NHSHelpInfoPage nhshelpinfopage = new NHSHelpInfoPage();
   	

   	@When("User clicks on Startnow option")
   	public void ClicksOnStartnow() throws InterruptedException {
   		homepage.clickStartNow();
		throw new io.cucumber.java.PendingException();
   	}

   	@And("^User enters \"([^\"]*)\" information$")
   	public void EntersCountryInfo(String country) throws InterruptedException {
   		countrypage.SelectCountry(country);
   	}
   	
   	@And("^User enters \"([^\"]*)\" practice information$")
   	public void EntersGPPractice(String GP) throws InterruptedException {
   		gppracticepage.GPPraticeInfo(GP);
   	}
   	
   	@And("^User enters Dental (.*) practice information$")
   	public void EntersDentalPractice(String Dental) throws InterruptedException {
   		dentalpracticepage.DentalPraticeInfo(Dental);
   	}

   	@And("^User enters Date of Birth (.*) (.*) (.*)$")
   	public void EntersDOB(String Date, String Month, String Year) throws InterruptedException {
   		dobpage.DOBInfo(Date,Month,Year);
   	}
	
   	@And("^User enters partner (.*) information$")
   	public void EntersPartnerInfo(String partner) throws InterruptedException {
   		partnerpage.PartnerInfo(partner);
   	}
   	
   	@And("^User enters TaxCredit (.*) information$")
   	public void EntersTaxCreditInfo(String TaxCredit) throws InterruptedException {
   		taxcreditpage.TaxCreditInfo(TaxCredit);
   	}
   	
   	@And("^User enters pregnancy (.*) information$")
   	public void EntersPregnancyInfo(String pregnancy) throws InterruptedException {
   		pregnancypage.PregnancyInfo(pregnancy);
   	}
   	
   	@And("^User enters serving in \"([^\"]*)\" information$")
	public void EntersArmedForcesInfo(String armedforces) throws InterruptedException {
   		servingarmedforcepage.ArmedForceInfo(armedforces);
   	}
   	
   	
   	@And("^User enters Diabetes (.*) information$")
	public void EntersDiabetesInfo(String Diabetes) throws InterruptedException {
   		diabetespage.DiabetesInfo(Diabetes);
	}
   	
   	@And("^User enters otherconditions (.*) information$")
   	public void EntersOtherConditionsInfo(String otherconditions) throws InterruptedException {
   		otherconditionspage.OtherConditionsInfo(otherconditions);
   	}
	
   	@And("^User enters glaucoma (.*) information$")
   	public void EntersGlaucomaInfo(String glaucoma) throws InterruptedException {
   		glaucomapage.GlaucomaInfo(glaucoma);
   	}
   	
   	@And("^User enters carehome (.*) information$")
   	public void EntersCareHomeInfo(String carehome) throws InterruptedException {
   		carehomepage.CareHomeInfo(carehome);
   	}
   	
   	@And("^User enters savings (.*) information$")
   	public void EntersSavingsInfo(String savings) throws InterruptedException {
   		savingsinfopage.SavingsInfo(savings);
   	}
	
   	@Then("^User displayed with information from NHS cost successfully$")
   	public void DisplayNHSHelpInfo() throws InterruptedException {
   		nhshelpinfopage.NHSHelpInfo();
   	}
   	
   	@And("^User enters \"([^\"]*)\" level information$")
   	public void EntersBloodSugarInfo(String BloodSugar) throws InterruptedException {
		diabetespage.DiabetesInfo_Medication(BloodSugar);
   	}
   	
   	@And("^User enters \"([^\"]*)\" help for Care home information$")
   	public void EntersCouncilPayInfo(String Council) throws InterruptedException {
   		carehomepage.CouncilPayInfo(Council);
   	}
   	
   	@And("^User enters \"([^\"]*)\" and Islands information$")
   	public void EntersScotlandInfo(String Highlands) throws InterruptedException {
   		countrypage.ScotlandInfo(Highlands);
   	}
   	
   	@And("^User enters \"([^\"]*)\" credit information$")
   	public void EntersUniversalCreditInfo(String universal) throws InterruptedException {
   		taxcreditpage.UniversalCreditInfo(universal);
   	}
   	
   	@And("^User enters \"([^\"]*)\" information$")
   	public void EntersLCWInfo(String LCW) throws InterruptedException {
   		taxcreditpage.LCWInfo(LCW);
   	}
   	
   	@And("^User enters \"([^\"]*)\" Pay information$")
   	public void EntersTakeHomeInfo(String TakeHome) throws InterruptedException {
   		taxcreditpage.TakeHomeInfo(TakeHome);
   	}
   	
   	@And("^User reads Decision information and clicks on Next$")
   	public void ReadsDecisionInfo() throws InterruptedException {
   		taxcreditpage.DecisionInfo();
   	}
   	
   	@And("^User enters multiple benefits information$")
   	public void MultipleBenefitsInfo() throws InterruptedException {
   		taxcreditpage.MultipleBenefits();
   	}
   	
   	@And("^User enters no benefits information$")
   	public void EntersNoBenefitsInfo() throws InterruptedException {
   		taxcreditpage.NoBenefitsInfo();
   	}
   	
   	@And("^User enters ESA and JSA information together$")
   	public void EntersESAJSATogether() throws InterruptedException {
   		taxcreditpage.ESA_JSA_Together();
   	}
   	
   	@Then("^User displayed with error message$")
   	public void DisplayedErrorMessage() throws InterruptedException {
   		taxcreditpage.ErrorMessage();
   	}
   	
   	
   	@And("^User selects \"([^\"]*)\" information$")
   	public void EntersTaxCreditType(String TaxCreditType) throws InterruptedException {
   		taxcreditpage.TaxCreditBenefits(TaxCreditType);
   	}
   	
   	@And("^User selects Income Support information$")
   	public void EntersIncomeSupport() throws InterruptedException {
   		taxcreditpage.ISBenefits();
   	}
   	
   	@And("^User selects ESA information$")
   	public void EntersESA() throws InterruptedException {
   		taxcreditpage.ESABenefits();
   	}
   	
   	@And("^User selects contribution based ESA information$")
   	public void EntersContributionESA() throws InterruptedException {
   		taxcreditpage.ESAContribution();
   	}
   	
   	@And("^User selects JSA information$")
   	public void EntersJSA() throws InterruptedException {
   		taxcreditpage.JSABenefits();
   	}
   	
   	@And("^User selects contribution based JSA information$")
   	public void EntersContributionJSA() throws InterruptedException {
   		taxcreditpage.JSAContribution();
   	}

   	@And("^User selects PensionType (.*) information$")
   	public void EntersPensionType(String PensionType) throws InterruptedException {
   		taxcreditpage.PensionBenefits(PensionType);
   	}
   	
   	@And("^User selects pension based savings information$")
   	public void EntersPensionSavings() throws InterruptedException {
   		taxcreditpage.PensionSavings();
   	}
   	
   	@And("^User selects TaxCredit based working tax information$")
   	public void EntersWorkingTax() throws InterruptedException {
   		taxcreditpage.WorkingTax();
   	}

	@And("^User clicks on Next Button without selecting any options$")
	public void ClicksNextButtonWithoutAnySelection() throws InterruptedException {
		countrypage.WithoutSelection();
	}

	@Then("^User displayed with error information$")
	public void DisplayedWithErrorInformation() throws InterruptedException {
		countrypage.ErrorMessage();
	}


	@AfterTest

	public void afterTest() throws Exception {

		Thread.sleep(10);
		driver.quit();

	}


}
