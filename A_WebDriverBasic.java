
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class A_WebDriverBasic {
    public static void main(String[] args){
        System.setProperty("webdriver.edge.driver","C:\\software\\driver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");


    }

}
