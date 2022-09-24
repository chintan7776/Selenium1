import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;

public class H_RegPageFir {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\software\\driver\\geckodriver.exe");
        FirefoxDriver WebDriver = new FirefoxDriver();

        WebDriver.get("https://demo.nopcommerce.com/");
        WebDriver.findElement(By.className("ico-register")).click();
        WebDriver.findElement(By.id("gender-male")).click();
        WebDriver.findElement(By.id("FirstName")).sendKeys("Chintan");
        WebDriver.findElement(By.id("LastName")).sendKeys("patel");
        WebDriver.findElement(By.name("DateOfBirthDay")).sendKeys("16");
        WebDriver.findElement(By.name("DateOfBirthMonth")).sendKeys("May");
        WebDriver.findElement(By.name("DateOfBirthYear")).sendKeys("1993");
        WebDriver.findElement(By.id("Email")).sendKeys("Chintanpatel777@gmail.com");
        WebDriver.findElement(By.id("Password")).sendKeys("123456");
        WebDriver.findElement(By.id("ConfirmPassword")).sendKeys("123456");

        Thread.sleep(1000);

        WebDriver.findElement(By.id("register-button")).click();




    }
}
