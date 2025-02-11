package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsDetails {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        List<WebElement>elementsOnNavBar=driver.findElements(By.className("dropdown-content"));
        System.out.println(elementsOnNavBar.size());


    }
}
