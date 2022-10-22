package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class Calculator extends BaseClass{
	
	public Calculator() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//label[@for='application_type_single']")
	private WebElement singleBtn;
	
	@FindBy(xpath="//select[@title='Number of dependants']")
	private WebElement ddNoOfDependent;
	
	
	@FindBy(id="borrow_type_home")
	private WebElement homeBtn;
	
	
	@FindBy(xpath="//input[@aria-labelledby='q2q1'] ")
	private WebElement annualIncome;
	
	@FindBy(xpath="//input[@aria-labelledby='q2q2'] ")
	private WebElement OtherAnnualIncome;
	
	@FindBy(id="expenses")
	private WebElement monthlyExpences;
	
	@FindBy(id="homeloans")
	private WebElement homeLoan;
	
	@FindBy(id="otherloans")
	private WebElement otherLoan;
	
	@FindBy(xpath="//input[@aria-labelledby='q3q4'] ")
	private WebElement otherMonthlyCommit;
	
	@FindBy(id="credit")
	private WebElement creditCard;
	
	
	@FindBy(id="btnBorrowCalculater")
	private WebElement workOutBrrowBtn;
	
	@FindBy(xpath="//button[@aria-label='Start over']")
	private WebElement startOverBtn;
	
	
	public WebElement getStartOverBtn() {
		return startOverBtn;
	}


	public void setStartOverBtn(WebElement startOverBtn) {
		this.startOverBtn = startOverBtn;
	}



	@FindBy(className="borrow__error__text")
	private WebElement message;
	
	@FindBy(id="borrowResultTextAmount")
	private WebElement estimateborrow;
	
	


	public WebElement getEstimateborrow() {
		return estimateborrow;
	}


	public WebElement getSingleBtn() {
		return singleBtn;
	}


	public WebElement getDdNoOfDependent() {
		return ddNoOfDependent;
	}


	public WebElement getHomeBtn() {
		return homeBtn;
	}


	public WebElement getAnnualIncome() {
		return annualIncome;
	}


	public WebElement getOtherAnnualIncome() {
		return OtherAnnualIncome;
	}


	public WebElement getMonthlyExpences() {
		return monthlyExpences;
	}


	public WebElement getHomeLoan() {
		return homeLoan;
	}


	public WebElement getOtherLoan() {
		return otherLoan;
	}


	public WebElement getOtherMonthlyCommit() {
		return otherMonthlyCommit;
	}


	public WebElement getCreditCard() {
		return creditCard;
	}


	public WebElement getWorkOutBrrowBtn() {
		return workOutBrrowBtn;
	}



	public WebElement getMessage() {
		return message;
	}
	
	
	
	public void clickme() {

		btnClick(getSingleBtn());
		btnClick(getHomeBtn());
		btnClick(getStartOverBtn());
	}
	
	public void allCalseDetails(String numberOfDependants, String yourAnnualIncome, String yourAnnualOtherIncome, String monthlyLivingExpenses, String currentHomeLoanMonthlyRepayments, String otherLoanMonthlyRepayments, String otherMonthlyCommitments, String totalCreditCardLimits)  {

		
		selectByText(getDdNoOfDependent(), numberOfDependants);
		setText(getAnnualIncome(), yourAnnualIncome);
		setText(getOtherAnnualIncome(), yourAnnualOtherIncome);
		setText(getMonthlyExpences(), monthlyLivingExpenses);
		setText(getHomeLoan(), currentHomeLoanMonthlyRepayments);
		setText(getOtherLoan(), otherLoanMonthlyRepayments);
		setText(getOtherMonthlyCommit(), otherMonthlyCommitments);
		setText(getCreditCard(), totalCreditCardLimits);
		btnClick(getWorkOutBrrowBtn());
		
		
	}
	
	public void clickBorrowBtn() {
		
		
		
		btnClick(startOverBtn);
		
	}
	
	
	public void monthExpences(String monthlyLivingExpenses) {
		setText(getMonthlyExpences(), monthlyLivingExpenses);
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
