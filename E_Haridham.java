import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class E_Haridham {
    public static void main(String[] args ) {
        System.setProperty("webdriver.chrome.driver","C:\\software\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ydsuk.org//");
        driver.findElement(By.xpath("//*[@id=\"page-container\"]/div[1]/div/div/div/div[1]/div/div/div/a")).click();

        //get title
        System.out.println(driver.getTitle());
        String Title = driver.getTitle();
        System.out.println("Page Title:" +Title);

        // back page
        driver.navigate().back();

        // close window
        driver.quit();



    }

}
