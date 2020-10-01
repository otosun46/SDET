/**
 * @Author:Otosun Tarih :27/08/2020
 */
package Gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class FindBynotId {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com/");
        WebElement e=driver.findElement(By.id("Bulamadiginda ne olacak"));
        System.out.println(e.getText());
        Thread.sleep(3000);
        driver.quit();

    }
}
//Exception in thread "main" org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#Bulamadiginda\ ne\ olacak"}
//  (Session info: chrome=84.0.4147.135)