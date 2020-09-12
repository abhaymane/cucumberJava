package StepsDefinition;
/*
 * package StepsDefinition;
 * 
 * import org.junit.Assert; import org.openqa.selenium.By; import
 * org.openqa.selenium.JavascriptExecutor; import org.openqa.selenium.WebDriver;
 * import org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.interactions.Actions;
 * 
 * import io.cucumber.java.en.*;
 * 
 * public class LoginSteps { WebDriver driver;
 * 
 * @Given("^User is on login page$") public void user_is_on_login_page() {
 * System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("https://www.crmpro.com/index.html");
 * 
 * }
 * 
 * @When("^User enters the \"(.*)\" and \"(.*)\"$") public void
 * user_entered_the_username_and_password(String user, String password) {
 * driver.findElement(By.name("username")).sendKeys(user);
 * driver.findElement(By.name("password")).sendKeys(password); }
 * 
 * // Regular Expression //1.\"(.*)\" //2.\"([^\"]*)\"
 * 
 * @Then("^User click on login button$") public void
 * user_click_on_login_button() { WebElement loginBtn =
 * driver.findElement(By.xpath("//input[@type='submit']")); JavascriptExecutor
 * js = (JavascriptExecutor) driver; js.executeScript("arguments[0].click();",
 * loginBtn); }
 * 
 * @Then("^User is on homepage$") public void user_is_on_homepage() { String
 * title = driver.getTitle(); Assert.assertEquals(title, "CRMPRO");
 * System.out.println("homepage title is: " + title);
 * 
 * }
 * 
 * @Then("^mouse over on contacts$") public void mouse_over_on_contacts() {
 * driver.switchTo().frame("mainpanel"); Actions action = new Actions(driver);
 * action.moveToElement(driver.findElement(By.xpath("//a[text()='Contacts']"))).
 * build().perform();
 * 
 * }
 * 
 * @Then("^click on new contact$") public void click_on_new_contact() {
 * driver.findElement(By.xpath("//a[text()='New Contact']")).click(); }
 * 
 * @Then("^enter the new contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
 * public void enter_the_NewContacts(String fname, String lname, String
 * position) { driver.findElement(By.id("first_name")).sendKeys(fname);
 * driver.findElement(By.id("surname")).sendKeys(lname);
 * driver.findElement(By.id("company_position")).sendKeys(position);
 * driver.findElement(By.xpath(
 * "//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/input[2]")).click();
 * 
 * }
 * 
 * @Then("close the browser") public void close_the_browser() { driver.quit(); }
 * 
 * }
 */