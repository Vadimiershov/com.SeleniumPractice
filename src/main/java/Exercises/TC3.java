package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC3 {

    public static void main(String[] args) {

GetDriver chromedriver = new GetDriver();

chromedriver.driver.get("http://practice.cybertekschool.com/add_remove_elements/");

        WebElement AddElement = chromedriver.driver.findElement(By.cssSelector("button[onclick='addElement()']"));
        for(int i=1;i<=50;i++) {
            AddElement.click();
        }
            List<WebElement> listOfDeleteButtons = chromedriver.driver.findElements(By.xpath("//button[.='Delete']"));
            WebElement delete = chromedriver.driver.findElement(By.xpath("//button[.='Delete']"));
                System.out.println("Verification Passed, number of the button "+listOfDeleteButtons.size());

                for(WebElement each:listOfDeleteButtons){
                    each.click();
                }
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






    }



}
