/**
 * @Author:Otosun Tarih :08/09/2020
 */
package Gun12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.Color;
import utils.BaseStaticDriver;

public class ActionHoverOverTest extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
    driver.get("http://demo.guru99.com/test/drag_drop.html");

        WebElement btnBank=driver.findElement(By.cssSelector("#credit2 > a"));
        WebElement frame=driver.findElement(By.id("flow_close_btn_iframe"));
        driver.switchTo().frame(frame);
        WebElement kapat=driver.findElement(By.id("closeBtn"));
        Thread.sleep(500);
        kapat.click();
        driver.switchTo().parentFrame();
        Actions builder=new Actions(driver);
        Action build=builder.moveToElement(btnBank).build();

        System.out.println("Mouse Üzerine gelmeden önce renk ="+ btnBank.getCssValue("color"));
        build.perform();
        System.out.println("Mouse Üzerine geldikten sonra renk ="+btnBank.getCssValue("color"));

//flow_close_btn_iframe
//closeBtn
    Thread.sleep(3000);
    driver.close();
    }
}
