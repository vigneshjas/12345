package com.baseclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {


	public static WebDriver driver;

	public WebDriver getDriver(String browser) {

		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox" :
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Invalid browser");
			break;
		}
		return driver;	

	}


	//   Waits     ===========>>>>>>>>>>>>>>


	public void implicitwait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	//   Maximize window    ==========>>>>>>>>>>>



	public void maximize() {
		driver.manage().window().maximize();

	}
	
	
	//  Load URL   ==========>>>>>>>>>>>>>>
	
			
			public void loadurl(String url) {
				driver.get(url);
			
			}
			
	
//	      Sendkeys            =============>>>>>>>>>>
			
				
				
				public  void setText(WebElement w, String name) {
					w.sendKeys(name);
				
				}
	
	
     // Button Click  &&&   Radio button ==========>>>>>>>>>>>	
				
				
				public void btnClick(WebElement w) {
					w.click();

				}
				
	
	//   Visible Text       ////////
				
				
				
				public void selectByText(WebElement w,String data) {
					Select s = new Select(w);
					s.selectByVisibleText(data);
				
				}
	
	
	
	
	
	
	
	
	
	
	

}
