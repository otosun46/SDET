/**
 * @Author:Otosun Tarih :10/09/2020
 */
package Gun14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.List;
import java.util.Set;

public class SwitchingToWindow extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.selenium.dev/");
        String anaSayfaId=driver.getWindowHandle();
        System.out.println("Ana sayfa ID si= "+anaSayfaId);
        List<WebElement> linkler=driver.findElements(By.cssSelector("a[target='_blank']"));
        for (WebElement link:linkler) {
            link.click();
        }
        Set<String> windowIdleri=driver.getWindowHandles();

        for (String id:windowIdleri) {
            if (id.equals(anaSayfaId)) continue;
            System.out.println(id);
            driver.switchTo().window(id);
            // diğer ID li sayfaya geçiş yaptı, şu an driver onu temsil ediyor.
            // Framlerden farklı olarak; framelerde diğer frame geçmeden önce ana sayfaya dönmek zorundaydık,
            // windowlarda buna gerek yok, direk istediğimiz windowdan istediğimize geçiş yapabiliyoruz.
            System.out.println("Window Title="+ driver.getTitle());
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
