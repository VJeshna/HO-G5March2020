package com.pluralsight.WebDriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Product\\HOSetup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Product/training-workspace/WebDriverDemo/src/main/webapp/TableTest.html");
		
		//BruteForce Approach
		
//		WebElement outerTable = driver.findElement(By.tagName("table"));
//		WebElement innerTable = outerTable.findElement(By.tagName("table"));
//		WebElement row = innerTable.findElements(By.tagName("td")).get(1);
//		
//		System.out.println(row.getText());
		
		//Xpath approach
		
		WebElement row = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr[2]/td"));
		System.out.println(row.getText());

	}

}
