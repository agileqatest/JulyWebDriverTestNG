import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class YahooSearch {
    WebDriver driver;
    String testurl = "https://www.yahoo.com/";

    @Test
    public void test001() {
        OpenBrowser();
        NavigateToTestPage();
        Typequery();
        SubmitSearch();
        /*AssertReault();*/
    }
    public void OpenBrowser(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\znm\\IdeaProjects\\JulyWebDriverTestNG\\src\\test\\resources\\Drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
    }
    public void NavigateToTestPage(){
        driver.get(testurl);
    }
    public void Typequery(){
        WebElement element1 = driver.findElement(By.cssSelector("#uh-search-box"));
        element1.sendKeys("Hearthstone top decks");
    }
    public void SubmitSearch(){
        WebElement element2 = driver.findElement(By.cssSelector("#uh-search-button"));
        element2.submit();
    }

}
