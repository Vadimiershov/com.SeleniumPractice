package Exercises;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://amazon.com");

        WebElement searchBox = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        searchBox.sendKeys("iPhone 12");

        WebElement searchButton = driver.findElement(By.cssSelector("input[id='nav-search-submit-button']"));
        searchButton.click();

        String actualTitle = driver.getTitle();
        String expectedTitle=  "Amazon.com : iPhone 12";

        if(actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("Yay!!! Title equal to your text");
        }

        Thread.sleep(4000);
        driver.close();



    }



}
