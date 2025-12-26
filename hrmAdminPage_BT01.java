import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class hrmAdminPage_BT01 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(6000);

        WebElement txtUsername = driver.findElement(By.name("username"));
        txtUsername.sendKeys("Admin");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("admin123");

        WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
        btnLogin.click();

        Thread.sleep(4000);

        //Locator Admin

        WebElement adminMenu = driver.findElement(By.xpath("//span[text()='Admin']"));
        adminMenu.click();

        Thread.sleep(4000);

        //Locator PIM
        WebElement Pim = driver.findElement(By.xpath("//span[text()='PIM']"));
        Pim.click();


    }
}
