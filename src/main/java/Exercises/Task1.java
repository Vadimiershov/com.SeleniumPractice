package Exercises;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement homebuttonXpath = driver.findElement(By.xpath("//a[@class=\"nav-link\"]"));

        WebElement homeButtonCss = driver.findElement(By.cssSelector("a[href='/']"));

        if(homebuttonXpath.isDisplayed() && homeButtonCss.isDisplayed()){
            System.out.println("Home Button is displayed");
        }else{
            System.err.println("home button is not displayed!!!!!!!!!!!!!!!");
        }

        WebElement retrievePass = driver.findElement(By.xpath("//i[contains(text(),\"Retrieve\")]"));

        WebElement retrievePassCss  = driver.findElement(By.cssSelector("button[id='form_submit']"));

        if(retrievePass.isDisplayed() && retrievePassCss.isDisplayed()){
            System.out.println("Retrieve Password button is displayed");
        }else{
            System.out.println("Retrieve Password button is NOOOT displayed!!!!!!!!!!!!!!!!");
        }







        Thread.sleep(4000);
        driver.close();





    }


}
