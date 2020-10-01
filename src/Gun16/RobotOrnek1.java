/**
 * @Author:Otosun Tarih :14/09/2020
 */
package Gun16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class RobotOrnek1 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException, AWTException {
        driver.get("http://demo.guru99.com/test/upload/");
        WebDriverWait bekle = new WebDriverWait(driver, 5);
        /*    Aşağıdaki bölüm açılan reklamı kapatıyor... */
        //bekle.until(ExpectedConditions.visibilityOf()) bu kullanılamadı çünkü WebElement istiyor, halbuki zaten element yok.
        // o yüzden yukarıda locator dan yola çıktık.
        System.out.println(driver.getTitle());
     //   bekle.until(ExpectedConditions.visibilityOfElementLocated(By.id("flow_close_btn_iframe")));
        Thread.sleep(500);
        driver.switchTo().frame(2);//frame("flow_close_btn_iframe");
        String title1= driver.getTitle();
        System.out.println(title1);
        Thread.sleep(500);
        WebElement kapatButonu = driver.findElement(By.id("closeBtn"));
        kapatButonu.click();
        driver.switchTo().defaultContent();
        /********/
/*
        WebElement btnUpload = driver.findElement(By.id("file_wraper0"));
        btnUpload.click();
        Thread.sleep(2000);

        // Stringi hafızaya-clipboard a kopyalama kodu
        StringSelection stringSelection = new StringSelection("C:\\Users\\TechnoStudy\\Desktop\\ornek.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        // Verilen stringi clipboard a set ediyor.

        Robot rbt = new Robot();
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);

        Thread.sleep(2000);

        rbt.keyRelease(KeyEvent.VK_CONTROL);
        rbt.keyRelease(KeyEvent.VK_V);

        rbt.keyPress(KeyEvent.VK_ENTER);
*/
        Thread.sleep(3000);
        driver.quit();
    }

}

