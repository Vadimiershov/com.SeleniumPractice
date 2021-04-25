package Exercises;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
        Thread.sleep(2000);

        WebElement addElement = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addElement.click();

        WebElement delete = driver.findElement(By.xpath("//button[.='Delete']"));
        if(delete.isDisplayed()){
            System.out.println("Delete button is displayed. Verification Passed!!!");
        }else {
            System.out.println("Delete button is not displayed. Verification Failed");
        }

        delete.click();


        try {
            if (!delete.isDisplayed()) {
                System.out.println("Delete button is not displayed after clicking. Verification passed!!!");
            } else {
                System.out.println("Delete button is displayed. Verification failed!!!");
            }
        }catch (StaleElementReferenceException exception){
            System.out.println("StaleElementReferenceException has been thrown");
            System.out.println("Element is not present on the page");
            System.out.println("Verification passed");
        }

driver.close();




    }




}
