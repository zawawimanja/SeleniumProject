import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWeb {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\zawawi.manja\\Downloads\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.get(("http://demowebshop.tricentis.com/"));
        driver.quit();

    }
}
