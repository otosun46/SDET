/**
 * @Author:Otosun Tarih :11/09/2020
 */
package Odevler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

import java.util.ArrayList;
import java.util.List;

public class Odev3_1 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");
        List<WebElement> objeler = driver.findElements(By.xpath("//li"));
        System.out.println(objeler.size());
        List<WebElement> boxlar = new ArrayList<>();
        boxlar.add(driver.findElement(By.cssSelector("#box1")));
        boxlar.add(driver.findElement(By.cssSelector("#box2")));
        boxlar.add(driver.findElement(By.cssSelector("#box3")));
        boxlar.add(driver.findElement(By.cssSelector("#box4")));
        boxlar.add(driver.findElement(By.cssSelector("#box5")));
        boxlar.add(driver.findElement(By.cssSelector("#box6")));
        boxlar.add(driver.findElement(By.cssSelector("#box7")));
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfAllElements(boxlar));
        wait.until(ExpectedConditions.visibilityOfAllElements(objeler));
        Actions builder = new Actions(driver);

        for (int i = 0; i < objeler.size(); i++) {
            for (WebElement box : boxlar) {
                try {
                if (objeler.get(i).getCssValue("background-color").equals("rgba(0, 128, 0, 1)")) continue;
                wait.until(ExpectedConditions.visibilityOf(objeler.get(i)));
                Action build = builder.clickAndHold(objeler.get(i)).build();
                build.perform();
                wait.until(ExpectedConditions.visibilityOf(box));
                build = builder.moveToElement(box).release(box).build();
                build.perform();
                }catch (Exception e){
                    driver.switchTo().alert().accept();
                    System.out.println("Yerlestirme tamamlandi");
                }
            }
        }


        Thread.sleep(3000);
        driver.quit();
    }
}
