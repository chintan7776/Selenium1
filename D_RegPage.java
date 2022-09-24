



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;


public class D_RegPage {
    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver", "C:\\software\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Chintan");
        driver.findElement(By.id("LastName")).sendKeys("Patel");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement ddown = driver.findElement(By.name("DateOfBirthDay"));
        Select select = new Select(ddown);

        select.selectByValue("16");
        select.selectByIndex(16);



        WebElement ddown1 = driver.findElement(By.name("DateOfBirthMonth"));
        Select select1 = new Select(ddown1);


//        select1.selectByValue("5");
//        select1.selectByIndex(5);
        select1.selectByVisibleText("May");

        WebElement ddown2 = driver.findElement(By.name("DateOfBirthYear"));
        Select select2 = new Select(ddown2);

        select2.selectByValue("1993");
        select2.selectByIndex(82);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.findElement(By.id("Email")).sendKeys("chintanpatel74@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("123456");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
        driver.findElement(By.id("register-button")).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,+1000)");


    }
}