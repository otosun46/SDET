/**
 * @Author:Otosun Tarih :02/09/2020
 */
package Gun08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

/*
Senaryo
   1- https://www.facebook.com/ sitesine giriniz.
   2- Yeni hesap oluştura tıklayınız.
   3- Formdaki tüm bilgileri giriniz.
 */
public class SelectFacebook extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.facebook.com/");
        driver.manage().deleteAllCookies();
        driver.findElement(By.cssSelector("a[id^='u_'][id$='_2']")).click();

        Thread.sleep(500);
        driver.findElement(By.cssSelector("input[id^='u_'][id$='_b']")).sendKeys("Hasan");
        Thread.sleep(500);

        driver.findElement(By.cssSelector("input[id^='u_'][id$='_d']")).sendKeys("Sahan");
        Thread.sleep(500);

        driver.findElement(By.cssSelector("input[id^='u_'][id$='_g']")).sendKeys("hasan.sahan587@gmail.com");
        Thread.sleep(500);
        driver.findElement(By.cssSelector("input[id^='u_'][id$='_j']")).sendKeys("hasan.sahan587@gmail.com");
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#password_step_input")).sendKeys("A2_oto5897");
        Thread.sleep(500);
        WebElement dayBox = driver.findElement(By.id("day"));
        Select day = new Select(dayBox);
        day.selectByVisibleText("14");
        WebElement monthBox = driver.findElement(By.id("month"));
        Select month = new Select(monthBox);
        month.selectByVisibleText("Haz");
        WebElement yearBox = driver.findElement(By.id("year"));
        Select year = new Select(yearBox);
        year.selectByVisibleText("1991");
        driver.findElement(By.cssSelector("input[id^='u_'][id$='_4']")).click();
        Thread.sleep(500);

        Thread.sleep(3000);
        driver.quit();
    }
}
