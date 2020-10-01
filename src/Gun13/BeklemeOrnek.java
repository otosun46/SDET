/**
 * @Author:Otosun Tarih :09/09/2020
 */
package Gun13;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

public class BeklemeOrnek extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.demoblaze.com/index.html");
        WebElement s6 = driver.findElement(By.xpath("//a[@class='hrefch']"));
        s6.click();
        WebElement addToCart = driver.findElement(By.xpath("//a[@onclick='addToCart(1)']"));

       addToCart.click();


        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.alertIsPresent());
        // Bu locator daki eleman visible olana kadar bekle.
        // Implicit ve Explicit bekleme kullanıldığında ikisini de kullanır.

        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        driver.quit();
    }
}
