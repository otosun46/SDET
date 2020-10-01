/**
 * @Author:Otosun Tarih :08/09/2020
 */
package Gun12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class Alert2 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        WebElement idGir=driver.findElement(By.xpath("//input[@name='cusid']"));
        idGir.sendKeys("2156");
        WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
       submit.click();
       Thread.sleep(500);
       driver.switchTo().alert().accept();
        Thread.sleep(500);
       driver.switchTo().alert().accept();
        Thread.sleep(2500);
        driver.close();
    }

}
