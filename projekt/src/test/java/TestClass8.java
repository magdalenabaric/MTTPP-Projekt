import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass8 {

    public WebDriver driver;
    //Declare a test URL variable
    public String testURL = "http://www.google.com";
    //----------------------Test Setup-----------------------------------
    @BeforeMethod
    public void setupTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to(testURL);
    }
    @Test
    public void googleSearchTest() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys("parfemi milano");
        searchTextBox.submit();
        Thread.sleep(2000);

        WebElement targetLink = driver.findElement(By.partialLinkText("milano"));
        targetLink.click();
        WebElement targetLink2 = driver.findElement(By.partialLinkText("SHOP"));
        targetLink2.click();
        WebElement targetLink3 = driver.findElement(By.partialLinkText("Ženski"));
        targetLink3.click();

        String currentURL = driver.getCurrentUrl();
        Assert.assertTrue(currentURL.contains("https://parfemimilano.com/kategorije-proizvoda/zenski-parfemi/"), "Nije uspjelo");
    }
    @AfterMethod
    public void teardownTest() {
        driver.quit();
    }
}
