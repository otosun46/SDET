/**
 * @Author:Otosun Tarih :10/09/2020
 */
package Odevler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

import java.util.ArrayList;
import java.util.List;

public class Odev3 extends BaseStaticDriver {
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

        int index = 0;
        do {
            for (WebElement box : boxlar) {
                try {
                    if (objeler.get(index).getCssValue("background-color").equals("rgba(0, 128, 0, 1)")) {
                        index += 1;
                    }
                    yerlestirme(objeler, box, index, 1);
                } catch (Exception e) {
                    System.out.println("Yerlestirme tamamlandi");
                    break;
                }
            }
        } while (index < 21);

        Thread.sleep(3000);
        driver.quit();
    }


    static void yerlestirme(List<WebElement> liste, WebElement box, int inx, int miktar) throws InterruptedException {
        Actions builder = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        int ind = inx;
        wait.until(ExpectedConditions.visibilityOfAllElements(liste));
        for (int i = 0; i < miktar; i++) {
            wait.until(ExpectedConditions.visibilityOf(liste.get(ind)));
            Action build = builder.clickAndHold(liste.get(ind)).moveToElement(box).release(box).build();
            wait.until(ExpectedConditions.visibilityOf(box));
            build.perform();
        }
    }
}
