package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathIntroduction {
    public static void main(String[] args) {
        /*
        Relative x path syntax
        //tagName[@Attribute='value']
         */
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");// xpath with single attribute
       // driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Iphone");
        //xpath with multiple attributes
       // driver.findElement(By.xpath("//input[@type='text'][@name='q']")).sendKeys("Iphone");
        /*
        x path with operators
        AND = both attributes should be true
        OR = one attributes should be true - operators
      */
      //  driver.findElement(By.xpath("//input[@type='text' and @name='q']")).sendKeys("Iphone");
        // x path with inner text text()
        Boolean displayed=driver.findElement(By.xpath("//button[text()='Add to cart']")).isDisplayed();
        System.out.println(displayed);

    }
}
