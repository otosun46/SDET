/**
 * @Author:Otosun Tarih :07/09/2020
 */
package Gun11;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class ActionDragAndDropTest extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {


     driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
     WebElement washington = driver.findElement(By.id("box3"));
        WebElement Usa = driver.findElement(By.id("box103"));

        Actions builder1 = new Actions(driver);

        Action build1 = builder1.dragAndDrop(washington,Usa).build();
        Thread.sleep(3000);
        build1.perform();

        Thread.sleep(3000);
        driver.quit();
}
}
