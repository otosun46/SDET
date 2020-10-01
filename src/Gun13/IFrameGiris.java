/**
 * @Author:Otosun Tarih :09/09/2020
 */
package Gun13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;
//driver.switchTo().frame(0);  indexle de bulunabilir  (1)
// driver.switchTo().frame("frame1"); // id veya name le de bulunabilir  (2)
//WebElement cerceve1=driver.findElement(By.id("frame1")); // element olarak bulunup
//driver.switchTo().frame(cerceve1); // bu şekilde de diğer sayfaya geçilebilir. (3)
public class IFrameGiris extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://chercher.tech/practice/frames");
        // WebElement frame1=driver.findElement(By.id("frame1"));
        //driver.switchTo().frame(frame1);
        //driver.switchTo().frame(0);
        driver.switchTo().frame("iamframe");
        WebElement Topic = driver.findElement(By.xpath("//input[@type='text']"));
        Topic.sendKeys("Sverige");

        driver.switchTo().parentFrame();
       // driver.switchTo().defaultContent();

        driver.switchTo().frame("frame2");
        WebElement animals = driver.findElement(By.id("animals"));
        Select menu = new Select(animals);
        menu.selectByIndex(2);
        Thread.sleep(3000);
        driver.close();
    }
}
//animals