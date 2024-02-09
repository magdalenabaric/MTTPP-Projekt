import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class testClass1_ME {

    public WebDriver driver;
    //Declare a test URL variable
    public String testURL = "http://www.google.com";

    @BeforeMethod
    public void setupTest() {
        System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
        driver = new EdgeDriver();
        driver.navigate().to(testURL);
    }
    @Test
    public void googleSearchTest() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys("parfemi milano");
        searchTextBox.submit();
        Thread.sleep(5000);
        WebElement testLink =
                driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")
                );

        Assert.assertEquals(testLink.getText(), "Parfemi Milano: Tvoj omiljeni parfem 90% jeftinije!");
        System.out.print(testLink.getText());
    }

    @AfterMethod
    public void teardownTest() {
        driver.quit();
    }
}
