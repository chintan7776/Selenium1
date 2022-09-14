
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class A_WebDriverBasic {
    public static void main(String[] args){
        System.setProperty("webdriver.edge.driver","C:\\software\\driver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("chi@gmail.com");

        driver.findElement(By.id("Password")).sendKeys("123");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();




    }

}
