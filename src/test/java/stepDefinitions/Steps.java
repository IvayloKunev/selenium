package stepDefinitions;

import java.net.URL;

import cucumber.api.PendingException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageObject.HomePage;


public class Steps {
    WebDriver driver;
    HomePage home;
    PageObjectManager pageObjectManager;
    WebDriverManager webDriverManager;

    @Given("^user is on Home Page$")
    public void user_is_on_Home_Page() throws InterruptedException {
        webDriverManager = new WebDriverManager();
        driver = webDriverManager.getDriver();
        pageObjectManager = new PageObjectManager(driver);
        home = pageObjectManager.getHomePage();
        home.navigateTo_HomePage();
    }

    @When("^the user press the Log-in button$")
    public void theUserPressTheLogInButton() {
        home.press_log_in_button();

    }

    @And("^enter an email address \"([^\"]*)\"$")
    public void enterAnEmailAddress(String email) {
        home.enter_email_address(email);
    }

    @And("^press the Next button$")
    public void pressTheNextButton() {
        home.press_next_button();


    }

    @And("^enter the password \"([^\"]*)\"$")
    public void enterThePassword(String password) throws InterruptedException {
        home.enter_password(password);
    }

    @Given("^That i open BLU official home page on remote machine$")
    public void thatIOpenGoogleHomePageOnRemoteMachinte() throws Throwable {
        URL server = new URL("http://0.0.0.0:4444/wd/hub");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");

        System.out.println("Connecting to " + server);

        WebDriver driver = new RemoteWebDriver(server, capabilities);

        driver.get("https://www.blu.com/en/GB");

        driver.quit();
    }


    @And("^I'm click on confirm my age button$")
    public void iMClickOnConfirmMyAgeButton()  {
        home.press_age_button();
    }
}

