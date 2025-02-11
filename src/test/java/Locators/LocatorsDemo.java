package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");

        driver.manage().window().maximize();
        //name
        driver.findElement(By.name("search")).sendKeys("Mac");
        //Find elements
        List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));
        System.out.println(headerLinks.size());
        //clicking any link texts
        driver.findElement(By.linkText("Tablets")).click();


    }
}
