/**
 * @Author:Otosun Tarih :10/09/2020
 */
package Gun14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.List;
import java.util.Set;


public class OpenWindows extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.selenium.dev/");
        List<WebElement> linkler=driver.findElements(By.cssSelector("a[target=_blank]"));
        for (WebElement link:linkler) {
            link.click();
        }
        Set<String> windowIdleri=driver.getWindowHandles();

        for (String id:windowIdleri) {
            System.out.println(id);
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
