package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import dataProvider.ConfigFileReader;
import managers.FileReaderManager;
import pageObject.HomePage;

public class Steps {
    WebDriver driver;
    HomePage home;
    ConfigFileReader configFileReader;

    @Given("^user is on Home Page$")
    public void user_is_on_Home_Page() {
        configFileReader = new ConfigFileReader();
        System.setProperty("webdriver.chrome.driver", FileReaderManager.getInstance().getConfigReader().getDriverPath());
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1440, 900));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://google.com");
    }

    @When("^he enter \"([^\"]*)\" site$")
    public void heEnterSite(String site) {
        home = new HomePage(driver);
        home.navigateTo_HomePage(site);
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
}
