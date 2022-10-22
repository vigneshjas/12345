package com.pageObjectManager;

import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;
import com.page.Calculator;



public class PageObjectManager extends BaseClass{
	
	public PageObjectManager() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	private Calculator calculatorPage;

	public Calculator getCalculatorPage() {
		return (calculatorPage==null)?calculatorPage=new Calculator():calculatorPage;
	}
}
