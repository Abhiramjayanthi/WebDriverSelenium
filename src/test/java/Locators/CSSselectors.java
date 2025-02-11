package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselectors {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        //Tag ID
       // driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Iphone");
        //Tag cLASS
        //driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Iphone");
        // TAG Attribute
        //driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Iphone");
        //TAG CLASS ATTRIBUTE
        driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Iphone");
    }
}
