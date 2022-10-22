package como.stepdefinition;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;
import com.page.Calculator;
import com.pageObjectManager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CalTools extends BaseClass {

	PageObjectManager pom = new PageObjectManager();


	@Given("User is an calculator and tools page")
	public void user_is_an_calculator_and_tools_page() {

		getDriver("chrome");
		loadurl("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");
		maximize();
		implicitwait();
		
	}
	
	
	@When("User should perform {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_should_perform_and(String numberOfDependants, String yourAnnualIncome, String yourAnnualOtherIncome, String monthlyLivingExpenses, String currentHomeLoanMonthlyRepayments, String otherLoanMonthlyRepayments, String otherMonthlyCommitments, String totalCreditCardLimits) {

		pom.getCalculatorPage().allCalseDetails(numberOfDependants, yourAnnualIncome, yourAnnualOtherIncome, monthlyLivingExpenses, currentHomeLoanMonthlyRepayments, otherLoanMonthlyRepayments, otherMonthlyCommitments, totalCreditCardLimits);
		pom.getCalculatorPage().clickme();
		pom.getCalculatorPage().getWorkOutBrrowBtn();
		
		
		
	}
	@Then("Click the start over")
	public void clickTheStartOver() {
		pom.getCalculatorPage().clickme();

		pom.getCalculatorPage().getStartOverBtn();	}


	
	@Then("We estimate you could borrow values {string}")
	public void we_estimate_you_could_borrow_values(String string) {

	pom.getCalculatorPage().getEstimateborrow();
	
}
	

	
	

	@When("User should perform {string}")
	public void user_should_perform(String monthlyLivingExpenses) {
		pom.getCalculatorPage().monthExpences(monthlyLivingExpenses);

	}
	
	@When("User should be verify the message as {string}")
	public void user_should_be_verify_the_message_as(String string) {

		pom.getCalculatorPage().getMessage();
	}
	








	
	
}
