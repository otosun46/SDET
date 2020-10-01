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

public class Odev2 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");
        WebElement box1 = driver.findElement(By.cssSelector("#box1"));
        WebElement box2 = driver.findElement(By.cssSelector("#box2"));
        WebElement box3 = driver.findElement(By.cssSelector("#box3"));
        WebElement box4 = driver.findElement(By.cssSelector("#box4"));
        WebElement box5 = driver.findElement(By.cssSelector("#box5"));
        List<WebElement> students = driver.findElements(By.xpath("//li"));

        int index = 0;

        index = yerlestirme(students, box1, index, 4);
        index = yerlestirme(students, box2, index, 4);
        index = yerlestirme(students, box3, index, 4);
        index = yerlestirme(students, box4, index, 3);
        index = yerlestirme(students, box5, index, 6);


        Thread.sleep(3000);
        driver.quit();
    }

    static int yerlestirme(List<WebElement> liste, WebElement box, int inx, int miktar) throws InterruptedException {
        Actions builder = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        int index = inx;

        wait.until(ExpectedConditions.visibilityOfAllElements(liste));

        for (int i = 0; i < miktar; i++) {
            Thread.sleep(100);
            wait.until(ExpectedConditions.visibilityOf(liste.get(index)));
            Action build = builder.clickAndHold(liste.get(index)).build();
            build.perform();
            wait.until(ExpectedConditions.visibilityOf(box));
            build = builder.moveToElement(box).release(box).build();
            build.perform();
            index++;
        }
        return index;
    }
}
