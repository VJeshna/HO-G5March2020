package com.pluralsight.WebDriverDemo;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	//System.setProperty("webdriver.chrome.driver", "D:\\Product\\HOSetup\\Selenium\\chromedriver_win32\\chromedriver.exe");
    	
    	//above is old way to manually download the driver and include its path
    	//below is the new which works after including the webDriver and chromeDriver dependency
    	
    	//WebDriverManager.chromedriver().setup();
    	
    	//WebDriver driver=new ChromeDriver();
    	//running on remoteServer
    	
    	WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
    			DesiredCapabilities.chrome());	
    	driver.get("http://www.google.com");
    	
    	WebElement searchField = driver.findElement(By.name("q"));
    	searchField.sendKeys("Pluralsight");
    	searchField.submit();
    	
    	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Images")));
    	
    	WebElement imageLink = driver.findElement(By.linkText("Images"));
    	imageLink.click();
    	
    	//WebElement images = driver.findElement(By.cssSelector("a[class = wXeWr islib nfEiy mM5pbd]"));
    	WebElement image = driver.findElements(By.className("rg_i")).get(0);
    	image.click();
    }
}
