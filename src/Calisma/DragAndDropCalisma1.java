/**
 * @Author:Otosun Tarih :09/09/2020
 */
package Calisma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

import java.util.List;

public class DragAndDropCalisma1 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
        WebElement button1= driver.findElement(By.id("fourth"));
        List<WebElement> kutular= driver.findElements(By.xpath("//div[@class='ui-widget-content']"));
        System.out.println(kutular.size());

        Actions builder=new Actions(driver);
     //   Action build=builder.dragAndDrop(button1,kutular.get(2)).release().build();
        Action build=builder.clickAndHold(button1).moveToElement(kutular.get(1)).build();
        build.perform();
        Thread.sleep(2000);
        build=builder.clickAndHold(button1).moveToElement(kutular.get(2)).build();
        Thread.sleep(2000);
        build.perform();
        Thread.sleep(3000);
        driver.close();

    }
}
