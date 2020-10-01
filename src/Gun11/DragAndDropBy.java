/**
 * @Author:Otosun Tarih :07/09/2020
 */
package Gun11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class DragAndDropBy extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {


        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php"); // siteyi açtım
        driver.manage().window().maximize();

        WebElement slider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-state-default ui-corner-all'])[1]" +
                ""));

        Actions builder=new Actions(driver);
        Thread.sleep(500);
        Action build= builder.dragAndDropBy(slider,150,0).build();

        Thread.sleep(3000);
        driver.quit();
    }
}
