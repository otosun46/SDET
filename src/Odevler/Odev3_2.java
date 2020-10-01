/**
 * @Author:Otosun Tarih :11/09/2020
 */
package Odevler;

import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;
import java.util.List;

public class Odev3_2 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");
        List<WebElement> objeler = driver.findElements(By.xpath("//li"));
        System.out.println("Obje sayisi= "+objeler.size());
        List<WebElement> boxlar = driver.findElements(By.xpath("//ul[starts-with(@id,'box')]"));
        System.out.println("Kutu sayisi= "+boxlar.size());
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfAllElements(boxlar));
        wait.until(ExpectedConditions.visibilityOfAllElements(objeler));
        Actions builder = new Actions(driver);
        boolean dongu = true;
        for (int i = 0; dongu; i++) {
            for (WebElement box : boxlar) {
                try {
                    if (objeler.get(i).getCssValue("background-color").equals("rgba(0, 128, 0, 1)")) continue;
                    wait.until(ExpectedConditions.visibilityOf(objeler.get(i)));
                    Action build = builder.clickAndHold(objeler.get(i)).build();
                    build.perform();
                    wait.until(ExpectedConditions.visibilityOf(box));
                    build = builder.moveToElement(box).release(box).build();
                    build.perform();
                } catch (UnhandledAlertException e) {
                    System.out.println("Yerlestirme tamamlandi.");
                    Thread.sleep(2000);
                    dongu = false;
                    break;
                }
            }
        }
        Thread.sleep(3000);
        driver.quit();
    }
}
