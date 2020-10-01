/**
 * @Author:Otosun Tarih :10/09/2020
 */
package Gun14;

import org.openqa.selenium.JavascriptExecutor;
import utils.BaseStaticDriver;

public class ScrollToBottomOfThePage extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://triplebyte.com/");

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        // sayfanın sonuna kadar git.

        Thread.sleep(2000);
        js.executeScript("window.scrollTo(0, 0)");

        // scrollTo : Verilen pixele gider.
        // scrollBy : Verilen kadar daha ileri gider.

        Thread.sleep(5000);
        driver.quit();
    }
}
