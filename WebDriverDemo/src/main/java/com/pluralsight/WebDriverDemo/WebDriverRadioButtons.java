package com.pluralsight.WebDriverDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverRadioButtons {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Product\\HOSetup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/Product/training-workspace/WebDriverDemo/src/main/webapp/RadioButtonTest.html");
		List<WebElement> radioButtons = driver.findElements(By.name("color"));
		radioButtons.get(1).click();
		
		for(WebElement radioButton : radioButtons)
		{
			if(radioButton.isSelected())
				System.out.println(radioButton.getAttribute("value"));
		}
	}
}
