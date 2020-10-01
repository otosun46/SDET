/**
 * @Author:Otosun Tarih :08/09/2020
 */
package Gun12;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;
/*
     Interview sorusu
       - Alertleri nasıl kullanırsın (handle edersin)

          driver.switchTo().alert()   bununla kullanılır.
          komutları:
          accept -> OK, TAMAM yani olumlu butona basmak
          dismiss -> CANCEL, HAYIR yani olumsuz butona basmak
          getText -> Alertin mesaj alınır.
          SendKeys -> Alertin inputuna mesaj göndermek için kullanılır.
 */
public class AlertTest extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
       driver.get("http://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        WebElement clickMe1=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        clickMe1.click();
        Thread.sleep(500);
        driver.switchTo().alert().accept();// Alert kutucuğuna geçildi ve Tamam butonuna basıldı.
                                           // web sayfasından Alert kutucuğuna geçildi.  switchTo
        WebElement clickMe2=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        clickMe2.click();
        Thread.sleep(500);
        driver.switchTo().alert().accept();
        Thread.sleep(500);
        WebElement clickMeText=driver.findElement(By.xpath("//p[@id='confirm-demo']"));

        System.out.println(clickMeText.getText());
        WebElement clickMe3=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        clickMe3.click();
        Thread.sleep(500);
        driver.switchTo().alert().sendKeys("Hasan");
        Thread.sleep(500);
        driver.switchTo().alert().accept();
        WebElement nameMeText=driver.findElement(By.xpath("//p[@id='prompt-demo']"));
        System.out.println(nameMeText.getText());
        Thread.sleep(500);
        Assert.assertTrue(nameMeText.getText().contains("Hasan"));


       Thread.sleep(3000);
       driver.close();
    }
}
