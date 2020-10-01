/**
 * @Author:Otosun Tarih :15/09/2020
 */
package Gun17;

import org.openqa.selenium.Dimension;
import utils.BaseStaticDriver;


public class WindowSize extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

        Dimension olculer = driver.manage().window().getSize();
        System.out.println(olculer);
        Dimension yeniOlcu = new Dimension(1024, 768);
        driver.manage().window().setSize(yeniOlcu);  // driver.manage().window().setSize(new Dimension(1024,768));

        Thread.sleep(3000);
        driver.quit();
    }
}
