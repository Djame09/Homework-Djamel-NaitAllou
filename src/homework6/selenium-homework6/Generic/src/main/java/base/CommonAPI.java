package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver; // this is interface
  @BeforeMethod
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Julian\\IdeaProjects\\selenium-homework6\\Generic\\src\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();// this is a class
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// to make selenuim to wait for 10 second in order to give selenium time to look for needed elements.
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //driver.findElement(By.cssSelector("#widgets-view-email-modal-mount > div > div > div:nth-child(1) > div > div > div > div > button")).click();
        // String expectedTitle= "Best Buy | Official Online Store | Shop Now & Save";
        // String actualTitle= driver.getTitle();
        //Assert.assertEquals(actualTitle,expectedTitle, "title validation success");
    }

     //@AfterMethod
     // public void afterMethod() {
      // driver.quit();
    // }

    public void click(String locator) {
        try {
            driver.findElement(By.xpath(locator)).click();
        } catch (Exception e) {
            driver.findElement(By.cssSelector(locator)).click();

        }

    }

    public void type(String locator, String text) {
        try {
            driver.findElement(By.xpath(locator)).sendKeys(text);
        } catch (Exception e) {
            driver.findElement(By.cssSelector(locator)).sendKeys(text);
        }
    }

    public void selectDropdownOption(String locator, String text) {
        try {
            WebElement element = driver.findElement(By.xpath(locator));
            Select select = new Select(element);
            try {
                select.selectByVisibleText(text);
            } catch (Exception e) {
                select.selectByValue(text);
            }
        } catch (Exception e) {
            WebElement element1 = driver.findElement(By.cssSelector(locator));
            Select select1 = new Select(element1);
            try {
                select1.selectByVisibleText(text);
            } catch (Exception e1) {
                select1.selectByValue(text);
            }
        }

    }
    public void uncheckbox(String loactor){
        WebElement Option2=driver.findElement(By.xpath(loactor));
        boolean isSelected=Option2.isDisplayed();
        if(isSelected){
            Option2.click();
        }
        if(!isSelected){
            Option2.isDisplayed();
        }
    }
    public void switchHandle(){
        String parentwindow= driver.getWindowHandle();
        for (String childTab: driver.getWindowHandles()){
            driver.switchTo().window(childTab);
            driver.manage().window().maximize();
        }

    }
public void waitfor(int second) throws InterruptedException {
      Thread.sleep(second,1000);
}
}