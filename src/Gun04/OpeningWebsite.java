/**
 * @Author:Otosun Tarih :27/08/2020
 */
package Gun04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningWebsite {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com/");
        Thread.sleep(3000);
        driver.quit();

    }
}
