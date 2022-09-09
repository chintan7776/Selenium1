import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class C_WebDriverGo {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\software\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");


    }

}



