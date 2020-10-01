/**
 * @Author:Otosun Tarih :07/09/2020
 */
package Gun11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class ActionDoubleClick extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://www.demoqa.com/buttons");
        WebElement doubleClickButton= driver.findElement(By.id("doubleClickBtn"));

        Actions builder=new Actions(driver); // driver üzerinden aksiyonları çalıştırmak için değişken tanımladım

        Action build= builder.moveToElement(doubleClickButton).doubleClick().build(); // aksiyonlar değişkenine bir aksiyon ekledim.
        // Henüz işlem olmadı.

        build.perform(); // Aksiyon yapılıyor.

        Thread.sleep(3000);
        driver.quit();

    }
}
