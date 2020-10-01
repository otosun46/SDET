/**
 * @Author:Otosun Tarih :03/09/2020
 */
package Gun09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class GetCssValue extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.snapdeal.com/");
        WebElement btn =driver.findElement(By.id("inputValEnter"));
        Thread.sleep(300);
        System.out.println(btn.getAttribute("name"));
        System.out.println(btn.getAttribute("type"));
        System.out.println(btn.getAttribute("class"));
        btn.sendKeys("ne arayayim");


        WebElement btnAra=driver.findElement(By.className("searchformButton"));

        // Elemeanın CSS yani ekran gözüken tüm özelliklerini; font renk vs ulaşmamızı sağlar
        System.out.println(btnAra.getCssValue("color"));
        System.out.println(btnAra.getCssValue("font-size"));
        System.out.println(btnAra.getCssValue("background"));

        Thread.sleep(3000);
        driver.close();
    }
}
/*

boolean isSelected(); -> seçili mi?  checkbox, radiobutton
boolean isEnabled();  -> Kullanılabiliyor mu?
boolean isDisplayed(); -> Görünüyor mu?

isEnabled
Monday -> true
Sunday -> false

isSelected();
Tuesday -> true
Thursday -> false


isDisplayed();
Monday -> true
Sunday -> true
 */