/*
 * package StepsDefinition;
 * 
 * import java.util.List; import java.util.Map;
 * 
 * import org.junit.Assert; import org.openqa.selenium.By; import
 * org.openqa.selenium.JavascriptExecutor; import org.openqa.selenium.WebDriver;
 * import org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.interactions.Actions;
 * 
 * import io.cucumber.datatable.DataTable; import io.cucumber.java.en.Given;
 * import io.cucumber.java.en.Then; import io.cucumber.java.en.When;
 * 
 * public class dealwithMapDefinition { WebDriver driver;
 * 
 * @Given("^User is on login page$") public void user_is_on_login_page() {
 * System.setProperty("webdriver.chrome.driver",".//Driver//chromedriver.exe");
 * driver=new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("https://www.crmpro.com/index.html");
 * 
 * }
 * 
 * @When("^User enters the username and password$") public void
 * user_entered_the_username_and_password(DataTable crendential) {
 * List<Map<String, String>>list=crendential.asMaps(String.class, String.class);
 * for(Map<String, String> data:list) {
 * driver.findElement(By.name("username")).sendKeys(data.get("Username"));
 * driver.findElement(By.name("password")).sendKeys(data.get("Password")); }}
 * 
 * @Then("^User click on login button$") public void
 * user_click_on_login_button() { WebElement loginBtn =
 * driver.findElement(By.xpath("//input[@type='submit']")); JavascriptExecutor
 * js=(JavascriptExecutor)driver;
 * js.executeScript("arguments[0].click();",loginBtn); }
 * 
 * 
 * 
 * @Then("^User is on homepage$") public void user_is_on_homepage() { String
 * title=driver.getTitle(); Assert.assertEquals(title, "CRMPRO");
 * System.out.println("homepage title is: "+title);
 * 
 * }
 * 
 * @Then("^mouse over on deals$") public void mouse_over_on_contacts() {
 * driver.switchTo().frame("mainpanel"); Actions action=new Actions(driver);
 * action.moveToElement(driver.findElement(By.xpath("//a[text()='Deals']"))).
 * build().perform();
 * 
 * }
 * 
 * @Then("^click on new deal$") public void click_on_new_contact() {
 * driver.findElement(By.xpath("//a[text()='New Deal']")).click(); }
 * 
 * @Then("^enter the new deal details$") public void
 * enter_the_NewDeals(DataTable dealdata) {
 * 
 * List<Map<String, String>>list=dealdata.asMaps(String.class, String.class);
 * 
 * for(Map<String, String> data:list) {
 * driver.findElement(By.id("title")).sendKeys( data.get("Title"));
 * driver.findElement(By.id("amount")).sendKeys(data.get("Amount"));
 * driver.findElement(By.id("probability")).sendKeys(data.get("Probability"));
 * driver.findElement(By.id("commission")).sendKeys(data.get("Commission"));
 * driver.findElement(By.xpath("//input[@type='submit'and @value='Save']")).
 * click(); Actions action=new Actions(driver);
 * action.moveToElement(driver.findElement(By.xpath("//a[text()='Deals']"))).
 * build().perform();
 * driver.findElement(By.xpath("//a[text()='New Deal']")).click(); } }
 * 
 * @Then("close the browser") public void close_the_browser() { driver.quit(); }
 * 
 * 
 * 
 * }
 */