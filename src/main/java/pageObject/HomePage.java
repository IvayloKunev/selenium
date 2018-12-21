package pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;

public class HomePage {
    WebDriver driver;


    @FindBy(how = How.XPATH, using = "//a[@class = 'gmail-nav__nav-link gmail-nav__nav-link__sign-in']")
    private WebElement Log_in_button;

    @FindBy(how = How.XPATH, using = "//input[@type = 'email']")
    private WebElement email_field;

    @FindBy(how = How.XPATH, using = "//span[@class = 'RveJvd snByac']")
    private WebElement next_button;

    @FindBy(how = How.XPATH, using = "//input[@type = 'password']")
    private WebElement password_field;

    @FindBy(how = How.XPATH, using = "//input[@aria-label = 'Search mail' ]")
    private WebElement search_field_main_page;

    public void press_log_in_button() {
        Log_in_button.click();
    }

    public void enter_email_address(String email) {
        email_field.sendKeys(email);
    }


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateTo_HomePage() throws InterruptedException {
        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
        Thread.sleep(1000);
    }

    public void press_next_button() {
        next_button.click();
    }

    public void enter_password(String password) throws InterruptedException {
       Thread.sleep(1000);
        password_field.sendKeys(password);
    }





}
