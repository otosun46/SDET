/**
 * @Author:Otosun Tarih :14/09/2020
 */
package Gun16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

public class RobotOrnek3 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.yogaalliance.org/");
        Actions builder=new Actions(driver);
        WebDriverWait bekle=new WebDriverWait(driver,5);

        WebElement becomeMember= driver.findElement(By.xpath("//li[@class='root haschild child-2']"));
        Thread.sleep(1000);
        Action buld=builder.moveToElement(becomeMember).build();
        buld.perform();
        Thread.sleep(1000);
        WebElement teacher= driver.findElement(By.xpath("(//a[text()='Teachers'])[2]"));
        Thread.sleep(1000);
        teacher.click();

        WebElement title= driver.findElement(By.xpath("//*[@id=\"Head\"]/title"));
        Thread.sleep(1000);
    //    bekle.until(ExpectedConditions.visibilityOf(title));
        String beklenen=title.getText();
        bekle.until(ExpectedConditions.titleContains(beklenen));
        System.out.println(beklenen);
        Thread.sleep(3000);
        driver.quit();



    }
}
