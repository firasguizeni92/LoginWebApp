package test;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test5 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\developpement\\chromedriver.exe");
	  driver = new ChromeDriver();
    baseUrl = "http://localhost:8080/";
    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();; 
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test5() throws Exception {
    driver.get(baseUrl + "/LoginWebApp/");
    assertEquals("JSP Example", driver.getTitle());
   // driver.findElement(By.linkText("Register Here")).click();
   driver.findElement(By.linkText("Register Here")).click();
    assertEquals("Registration", driver.getTitle());
  //  assertEquals("Registration", driver.getTitle());
    driver.findElement(By.name("firstName")).clear();
    driver.findElement(By.name("firstName")).sendKeys("firas");
    driver.findElement(By.name("firstName")).clear();
    //driver.findElement(By.name("firstName")).sendKeys("firas");
   // driver.findElement(By.name("lastName")).clear();
    driver.findElement(By.name("lastName")).sendKeys("guizeni");
    driver.findElement(By.name("lastName")).clear();
   // driver.findElement(By.name("lastName")).sendKeys("guizeni");
   // driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("firas");
    driver.findElement(By.name("email")).clear();
   // driver.findElement(By.name("email")).sendKeys("firas");
   // driver.findElement(By.name("userName")).clear();
    driver.findElement(By.name("userName")).sendKeys("firas");
    driver.findElement(By.name("userName")).clear();
   // driver.findElement(By.name("userName")).sendKeys("firas");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("firas");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("firas");
    driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
   // driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
    assertEquals("", driver.getTitle());
   // assertEquals("", driver.getTitle());
    driver.findElement(By.linkText("Go to Login")).click();
    //driver.findElement(By.linkText("Go to Login")).click();
    assertEquals("JSP Example", driver.getTitle());
   // assertEquals("JSP Example", driver.getTitle());
    driver.findElement(By.name("userName")).clear();
    driver.findElement(By.name("userName")).sendKeys("firas");
    driver.findElement(By.name("userName")).clear();
    driver.findElement(By.name("userName")).sendKeys("firas");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("firas");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("firas");
    driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
   // driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
    assertEquals("", driver.getTitle());
   // assertEquals("", driver.getTitle());
    driver.findElement(By.linkText("Please Login")).click();
    //driver.findElement(By.linkText("Please Login")).click();
    assertEquals("JSP Example", driver.getTitle());
    //assertEquals("JSP Example", driver.getTitle());
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
