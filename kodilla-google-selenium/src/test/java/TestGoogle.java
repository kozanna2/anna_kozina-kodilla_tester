import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.RandomResult;
import pages.GoogleSearch;

public class TestGoogle {
    WebDriver driver;
    @Before
    public void testSetup(){
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
        WebElement acceptCookies = driver.findElement(By.id("L2AGLb"));
        acceptCookies.click();
    }
    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void testGooglePage() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
    }
    @Test
    public void testDrawResult() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        RandomResult randomResult = new RandomResult();
        googleSearch.searchResults();
        randomResult.printResult(googleSearch.getGoogleResults());
    }

}