/**
 * @Author:Otosun Tarih :08/09/2020
 */
package Gun12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.concurrent.TimeUnit;
/*
      Selenium Bekletme Konusu:
      Thread.sleep : bu selenium a özel değil, java ya ait yazılımın herhangi bir yerinde verilen süre kadar bekler.

       Implicit wait :
       Tüm sayfadaki elemanalr için bir keleme süresi atanıyor.Ancak eleman bulunduğu anda daha fazla beklemiyor.
       Bütüm elemanlar geçerli.NoSuchElement hatası nı vermek için verilen süre kadar  eleman bulunana kadar bekler.

                    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                    driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES)

       pageLoadTimeout :
       driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS)
       30 sn süresinde sayfanın yüklenmesini bekliyor, bu süreden sonra timeout düşerek hata verir.
       driver.get() de  driver.navigate.To
 */
public class Beklemeler extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement button=driver.findElement(By.xpath("//button[@onclick='timedText()']"));
        button.click();

        //Thread.sleep(30000);
        WebElement webDriverText=driver.findElement(By.xpath("//p[text()='WebDriver']"));

        System.out.println(webDriverText.getText());

        driver.quit();
    }
}
