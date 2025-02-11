package IntroSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01Selenium {
    public static void main(String[] args) {
        /*
Step1: Open chrome browser
Step2: get https://demo.opencart.com/
Step3: Validate title should be "Open Cart"
Step4: Close the broser
         */
        //step1
        WebDriver driver = new ChromeDriver();
        //step2:
        driver.get("https://www.opencart.com/");
        //step3:
        String Actualtitle=driver.getTitle();
        String ExpectedTitle = "OpenCart - Open Source Shopping Cart Solution";
        System.out.println("Actual title is \s"+Actualtitle);
        if (Actualtitle.equals(ExpectedTitle)){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        //close the browser
        driver.close();

    }
}
