/**
 * @Author:Otosun Tarih :14/09/2020
 */
package Gun16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class RobotOrnekAlternatif extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://demo.guru99.com/test/upload/");
        WebElement input= driver.findElement(By.id("uploadfile_0"));
        input.sendKeys("C:\\Projeler\\Ornek.txt");

        WebElement button= driver.findElement(By.id("submitbutton"));
        button.click();

        Thread.sleep(3000);
    }
}
