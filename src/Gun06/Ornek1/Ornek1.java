/**
 * @Author:Otosun Tarih :31/08/2020
 */
package Gun06.Ornek1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class Ornek1 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://formsmarts.com/form/yu?mode=h5");
        WebElement selectRadio1=driver.findElement(By.cssSelector("input#u_Hc4_4586_0"));
        selectRadio1.click();
        WebElement selectMenu1=driver.findElement(By.cssSelector("select#u_Hc4_4588"));
        selectMenu1.click();
        WebElement selectMenu2=driver.findElement(By.cssSelector("option[value='Online Advertising']"));
        selectMenu2.click();
        WebElement selectRadio2=driver.findElement(By.cssSelector("input#u_Hc4_89585_0"));
        selectRadio2.click();
        WebElement selectRadio3=driver.findElement(By.cssSelector("input#u_Hc4_4589_0"));
        selectRadio3.click();
        WebElement selectMenu3=driver.findElement(By.cssSelector("select#u_Hc4_4597"));
        selectMenu3.click();
        WebElement selectMenu4=driver.findElement(By.cssSelector("select#u_Hc4_4597>*:nth-child(4)"));
        selectMenu4.click();
        WebElement textAria1=driver.findElement(By.cssSelector("textarea#u_Hc4_89597"));
        textAria1.click();
        textAria1.sendKeys("Sony WH-1000XM3");

        Thread.sleep(2000);
        driver.close();
    }
}
