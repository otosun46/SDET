/**
 * @Author:Otosun Tarih :09/09/2020
 */
package Gun13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

public class Bekleme2 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://www.seleniumeasy.com/test/ajax-form-submit-demo.html");
        WebElement name=driver.findElement(By.id("title"));
        name.sendKeys("Orhan");
        WebElement aciklama=driver.findElement(By.id("description"));

        aciklama.sendKeys("Deneme");

        WebElement submitButton=driver.findElement(By.id("btn-submit"));
        submitButton.click();

        WebElement sonuc=driver.findElement(By.id("submit-control"));



        WebDriverWait wait=new WebDriverWait(driver,5);
        boolean text= wait.until(ExpectedConditions.textToBe(By.id("submit-control"),"Form submited Successfully!"));
        // Bu locator daki eleman visible olana kadar bekle.
        // Implicit ve Explicit bekleme kullanıldığında ikisini de kullanır.
        System.out.println(text);

        Thread.sleep(3000);
        driver.quit();
    }
}
