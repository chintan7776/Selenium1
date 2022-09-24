import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.concurrent.TimeUnit;

public class G_RegPageEdge {
    public static void main(String [] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","C:\\software\\driver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");

        driver.manage().window().maximize();

        driver.findElement(By.className("ico-register")).click();

        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Chintan");
        driver.findElement(By.id("LastName")).sendKeys("Patel");
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("16");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("May");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1993");
        driver.findElement(By.id("Email")).sendKeys("chintanpatel16@gmail.com");
        driver.findElement(By.id("Newsletter")).click();
        driver.findElement(By.id("Password")).sendKeys("123456");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");

        Thread.sleep(1000);



        driver.findElement(By.id("register-button")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);




    }
}
