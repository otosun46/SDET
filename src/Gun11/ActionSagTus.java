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

public class ActionSagTus extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://www.demoqa.com/buttons");
        WebElement sagTusClickButton= driver.findElement(By.id("rightClickBtn"));

        Actions builder=new Actions(driver); // driver üzerinden aksiyonları çalıştırmak için değişken tanımladım

        Action build= builder.moveToElement(sagTusClickButton).contextClick().build(); // aksiyonlar değişkenine bir aksiyon ekledim.
        // Henüz işlem olmadı.
        build.perform(); // Aksiyon yapılıyor.
        WebElement mesaj=driver.findElement(By.id("rightClickMessage"));
        System.out.println(mesaj.getText());
        Assert.assertTrue(mesaj.getText().equals("You have done a right click"));

        Thread.sleep(3000);
        driver.quit();

    }
}
