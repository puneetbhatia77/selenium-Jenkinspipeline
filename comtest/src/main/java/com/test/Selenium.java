package com.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","comtest/lib/chromedriver.exe"); // <-- Change this path
	    
	//to launch in headless mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");
        WebDriver driver = new ChromeDriver(options);
		
	//WebDriver driver = new ChromeDriver();
        String baseUrl = "https://google.com";
        String expectedTitle = "Google";
        String actualTitle = "";
        driver.get(baseUrl);
        actualTitle = driver.getTitle();
		System.out.println(actualTitle);
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("TEST PASSED!");
        } else {
            System.out.println("TEST FAILED");
	    System.exit(1);
        }
        driver.close();
    }
}
