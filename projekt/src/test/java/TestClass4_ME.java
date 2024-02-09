import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass4_ME {

    public WebDriver driver;
    //Declare a test URL variable
    public String testURL = "http://www.google.com";
    //----------------------Test Setup-----------------------------------
    @BeforeMethod
    public void setupTest() {
        System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
        driver = new EdgeDriver();
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

        String linkURL = "https://parfemimilano.com/";
        driver.get(linkURL);
        WebElement testLink =
                driver.findElement(By.xpath("//*[@id=\"after_layer_slider_1\"]/div/div/div/div/section/div/p/strong")
                );

        Assert.assertEquals(testLink.getText(), "AKCIJA");
        System.out.print(testLink.getText());
    }
    @AfterMethod
    public void teardownTest() {
        driver.quit();
    }
}
