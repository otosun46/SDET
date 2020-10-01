/**
 * @Author:Otosun Tarih :09/09/2020
 */
package Odevler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

import java.util.List;

public class Odev1_1 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
        List<WebElement> ulkeKutulari = driver.findElements(By.cssSelector("#questionDiv>.dragDropSmallBox"));
        List<WebElement> sehirler = driver.findElements(By.xpath("//div[@id='answerDiv']//div"));
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfAllElements(ulkeKutulari));
        wait.until(ExpectedConditions.visibilityOfAllElements(sehirler));
        Actions builder = new Actions(driver);


        for (int i=0;i<sehirler.size();i++) {
            for (WebElement ulke : ulkeKutulari) {
                if(sehirler.get(i).getCssValue("background-color").equals("rgba(0, 128, 0, 1)")) continue;
                wait.until(ExpectedConditions.visibilityOf(sehirler.get(i)));
                Action build = builder.clickAndHold(sehirler.get(i)).build();
                build.perform();
                wait.until(ExpectedConditions.visibilityOf(ulke));
                build = builder.moveToElement(ulke).release(ulke).build();
                build.perform();
            }
        }
        Thread.sleep(2500);


        driver.close();
    }
}
