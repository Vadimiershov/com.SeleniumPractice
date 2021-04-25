package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC4 {

    public static void main(String[] args) throws InterruptedException {

        GetDriver chromedriver = new GetDriver();

        chromedriver.driver.get("https://www.apple.com");

        int emptyLinkCounter = 0;
        int linksWithText = 0;

        List<WebElement> appleHeader = chromedriver.driver.findElements(By.xpath("//ul[@class='ac-gn-list']/li/a"));

        for(int i=1;i<8;i++){
            appleHeader.get(i).click();
            Thread.sleep(1000);

            List<WebElement> listOfLinks = chromedriver.driver.findElements(By.xpath("//body//a"));

                System.out.println("NUmber of links on the page is "+chromedriver.driver.getTitle()+" "+listOfLinks.size());
                for(WebElement link:listOfLinks){
                    String textOfLinks = link.getText();
                    if(!textOfLinks.isEmpty()){
                        linksWithText++;
                    }else {
                        emptyLinkCounter++;
                    }
                }
                chromedriver.driver.navigate().back();
                appleHeader = chromedriver.driver.findElements(By.xpath("//ul[@class='ac-gn-list']/li/a"));

            System.out.println("Links with text "+linksWithText);
            System.out.println("Empty links "+ emptyLinkCounter);
        }












    }



}
