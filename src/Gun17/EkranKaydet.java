/**
 * @Author:Otosun Tarih :15/09/2020
 */
package Gun17;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
/*
   Senaryo :
        1- https://opensource-demo.orangehrmlive.com/  sitesine gidiniz.
        2- Login işlemini yapınız.
        3- Welcome yazan sağ üst tarafta kullanıcı adının geçip geçmediğini kontrol ediniz.
        4- Eğer Kullanıcı adınız gözükmüyorsa , ekran görünütüsnü kaydedip, ilgili kişiye gönderiniz.
 */

public class EkranKaydet extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException, IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        String simdi=LocalTime.now().format(DateTimeFormatter.ofPattern("HH_mm_ss"));
        System.out.println(simdi);
        WebElement username=driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");

        WebElement password=driver.findElement(By.id("txtPassword"));
        password.sendKeys("admin123");

        WebElement btnLogin=driver.findElement(By.id("btnLogin"));
        btnLogin.click();

        WebElement welcome=driver.findElement(By.id("welcome"));
        String welcomeText = welcome.getText();

        System.out.println(welcomeText);

        if (welcomeText.contains("Admin"))
        {
            System.out.println("Test Passed");
        }
        else
        {
            System.out.println("Test Failed");
            // Ekran kaydetme işlemleri burada olacak.
            // 1. Aşama ekran görüntüsü alma değişkenimizi tanımladık.
            TakesScreenshot ts=(TakesScreenshot)driver;
            // 2. Aşama alınacak Ekran görüntü dosyası tipi seçilerek oluşturuldu.
            File ekranDosyasi=ts.getScreenshotAs(OutputType.FILE);
            // 3.Aşama ekranDosyasını bir dosyaya yazma/kopyalama işlemi yapılıyor.
            // DosyaKopyala (ekranDosyası, ekranGoruntusu.png);
            // Yukarıdaki komut JAVA nın için de yok, bunun için diğer yapılmış bir kütüphane
            // bulup AYNI SELENYUMU eklediğimiz ekleyeceğiz. bu kütüphane common.io bu apache isimli siteden indirilecek.
            FileUtils.copyFile(ekranDosyasi,new File("ekranGoruntuleri/ORANGEhrm/loginKontrol_"+simdi+".png"));
        }





        Thread.sleep(5000);
        driver.quit();
    }
}
