package com.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","comtest/lib/chromedriver.exe"); // <-- Change this path
        WebDriver driver = new ChromeDriver();
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
        }
        driver.close();
    }
}