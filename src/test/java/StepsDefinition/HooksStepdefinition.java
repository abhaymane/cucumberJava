
  package StepsDefinition;
  
  import java.util.concurrent.TimeUnit;
  
  import org.openqa.selenium.By; import org.openqa.selenium.JavascriptExecutor;
  import org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement;
  import org.openqa.selenium.chrome.ChromeDriver; import
  org.openqa.selenium.interactions.Actions;
  
  import io.cucumber.java.After; 
  import io.cucumber.java.Before; 
  import io.cucumber.java.en.*;
  
  public class HooksStepdefinition { WebDriver driver;
  
  @Before public void setUp() {
  System.setProperty("webdriver.chrome.driver",".//Driver//chromedriver.exe");
  driver=new ChromeDriver(); driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
  driver.get("https://www.crmpro.com/index.html");
  
  
  }
  
  @After public void tearDown() { // driver.close();
  
  }
  
  @Given("user is on deal page") public void user_is_on_deal_page() {
  driver.findElement(By.name("username")).sendKeys("Mayuri_257");
  driver.findElement(By.name("password")).sendKeys("mayuri$257"); WebElement
  loginBtn=driver.findElement(By.xpath("//input[@type='submit']"));
  JavascriptExecutor js=(JavascriptExecutor)driver;
  js.executeScript("arguments[0].click();", loginBtn);
  driver.switchTo().frame("mainpanel"); try { Thread.sleep(5000); } catch
  (InterruptedException e) { // TODO Auto-generated catch block
  e.printStackTrace(); } Actions action=new Actions(driver);
  action.moveToElement(driver.findElement(By.xpath(
  "//a[contains(text(),'Deals')]"))).build().perform();
  
  }
  
  @When("user fills the deal form") public void user_fills_the_deal_form() {
  driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
  driver.findElement(By.id("title")).sendKeys("test");
  driver.findElement(By.id("amount")).sendKeys("5000");
  driver.findElement(By.id("probability")).sendKeys("100");
  driver.findElement(By.id("commission")).sendKeys("10"); }
  
  
  @Then("deal is created") public void deal_is_created() {
  driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
  
  }
  
  }
 