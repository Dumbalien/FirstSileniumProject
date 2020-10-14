
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestOpenChrome {
    WebDriver wd;


    @Test
    public void testChrome() {
        wd = new ChromeDriver();
        //wd.get("https://www.google.com/");
        wd.navigate().to("https://www.google.com/");
    }
}
