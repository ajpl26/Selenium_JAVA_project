import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class App {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\OneDrive\\Desktop\\ChDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://vprismqc.vidgyor.com/");

        driver.findElement(By.tagName("div")).click();
        System.out.println(driver.getTitle());
        driver.close();
    }
}
