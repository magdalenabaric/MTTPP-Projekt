import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass5 {

    public WebDriver driver;
    //Declare a test URL variable
    public String testURL = "http://www.google.com";
    //----------------------Test Setup-----------------------------------
    @BeforeMethod
    public void setupTest() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
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

        String linkURL = "https://parfemimilano.com/";
        driver.get(linkURL);
        WebElement testLink =
                driver.findElement(By.xpath("//*[@id=\"av_section_1\"]/div/div/div/div/div[1]/h2")
                );

        Assert.assertEquals(testLink.getText(), "Zašto ljudi vole naše parfeme…");
        System.out.print(testLink.getText());
    }
    @AfterMethod
    public void teardownTest() {
        driver.quit();
    }
}
