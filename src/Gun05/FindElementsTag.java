/**
 * @Author:Otosun Tarih :29/08/2020
 */
package Gun05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.List;

public class FindElementsTag extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://www.practiceselenium.com/");
        Thread.sleep(1000);
        List<WebElement> liste=driver.findElements(By.tagName("li"));
        for (WebElement e:liste) {
            System.out.println(e.getText());
        }
        Thread.sleep(1000);
        driver.close();
    }
}
