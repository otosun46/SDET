/**
 * @Author:Otosun Tarih :07/09/2020
 */
package Gun11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

import java.util.List;

public class ActionDragAndDropTest3 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {


        driver.get("http://demo.guru99.com/test/drag_drop.html"); // siteyi açtım
        driver.manage().window().maximize();

        WebElement krediButton=driver.findElement(By.id("credit1"));
        WebElement kutu=driver.findElement(By.id("loan"));

        Actions builder=new Actions(driver);

        //1.Yöntem
//        Action build=builder.dragAndDrop(krediButton, kutu).build();
//        build.perform();

        Action build=builder.clickAndHold(krediButton).moveToElement(kutu).release().build();
        build.perform();
        // kredi butonuna tıklat ve eline al, sonra hedefe git yani
        // bırakacağın yere git, ve release yani gerçekleştir, yani bırak.

        Thread.sleep(3000);
        driver.quit();
    }
}
