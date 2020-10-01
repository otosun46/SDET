/**
 * @Author:Otosun Tarih :17/09/2020
 */


package Gun18;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

import java.util.Set;

public class Odev1 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://www.snapdeal.com");
        String mainPage = driver.getWindowHandle();
        WebDriverWait wt = new WebDriverWait(driver, 5);
        int index = randomNum(4);
        String urunPath = "(//div[starts-with(@class,'trendingProd') and @index='" + index + "'])";
        WebElement product = driver.findElement(By.xpath(urunPath));
        wt.until(ExpectedConditions.visibilityOf(product));
        product.click();
        WebElement urunAdi = driver.findElement(By.xpath(urunPath+"//child::div[3]//child::div[1]"));
        String UrunAdi = urunAdi.getText();
        System.out.println("Secilen Urun Adi= "+UrunAdi);
        Set<String> windowsID = driver.getWindowHandles();
        for (String IDs : windowsID) {
            // System.out.println(IDs);
            if (IDs.equals(mainPage)) continue;
            driver.switchTo().window(IDs);
        }
        WebElement uyariAllowAllButton=driver.findElement(By.id("adroll_consent_accept"));
        wt.until(ExpectedConditions.visibilityOf(uyariAllowAllButton));
        uyariAllowAllButton.click();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,420)");

        WebElement addToCart = driver.findElement(By.xpath("(//div[@id='add-cart-button-id'])[1]"));
        wt.until(ExpectedConditions.visibilityOf(addToCart));
        addToCart.click();
        //  driver.close();
        driver.switchTo().window(mainPage);
        driver.navigate().refresh();
        WebElement ToCartmain = driver.findElement(By.xpath("//div[@class='cartContainer col-xs-11 reset-padding']"));
        wt.until(ExpectedConditions.visibilityOf(ToCartmain));
        ToCartmain.click();
        WebElement cartmain = driver.findElement(By.xpath("//li[@class='clearfix cart-item']//child::div[3]//child::div//child::div//child::a"));
        wt.until(ExpectedConditions.visibilityOf(cartmain));
        String proTextMain = cartmain.getText();
        System.out.println("Sepetteki urun adi= " + proTextMain);
        Assert.assertEquals("Urun isimleri farkli",UrunAdi, proTextMain);
        System.out.println("Texts are same");
        WebElement sepetCloseButton=driver.findElement(By.xpath("//span[@class='icon-font-grey-size24 close-popup-icon']"));
        Thread.sleep(1000);
        sepetCloseButton.click();

        Thread.sleep(3000);
        driver.quit();
    }

    public static int randomNum(int max) {
        int value = 0;
        value = (int) (Math.random() * max + 1);
        return value;
    }
}
