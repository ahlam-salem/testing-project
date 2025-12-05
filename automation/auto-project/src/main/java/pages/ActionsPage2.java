package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ActionsPage2 {
    WebDriver driver;

    public ActionsPage2(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "username")
    WebElement username;

    @FindBy(tagName = "button")
    WebElement button;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(className = "-esm-login__login__continueButton___VnN+0")
    WebElement login;

    @FindBy(xpath = "//input[@placeholder='Search this list']")
    WebElement search;

    @FindBy(tagName = "tbody")
    WebElement table;

    @FindBy(linkText = "John8629 Smith2930")
    WebElement patient;

    @FindBy(id = "custom-actions-overflow-menu-trigger")
    WebElement actions;
    @FindBy(xpath = "//*[contains(text(),\"Edit patient\")]")
    WebElement Edit;

    @FindBy(id = "givenName")
    WebElement firstName;

    @FindBy(name = "familyName")
    WebElement familyName;


    @FindBy(xpath = "//*[text()=\"Update patient\"]")
    WebElement Update;

    public void enter_username(String uname){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(username));
        username.sendKeys(uname);
    }

    public void click_button(){
        button.click();
    }

    public void enter_password(String pass){
        password.sendKeys(pass);
    }

    public void click_login(){
        login.click();
    }

    public void search_patient(String name){
        new WebDriverWait(driver, Duration.ofSeconds(100))
                .until(ExpectedConditions.visibilityOf(table));
        search.click();
        search.sendKeys(name);
    }

    public  void patient_details(){
        patient.click();
    }

    public void patient_actions(){
        new WebDriverWait(driver, Duration.ofSeconds(100))
                .until(ExpectedConditions.visibilityOf(actions));
        actions.click();
    }

    public void Edit_button(){
        Edit.click();
    }

    public void update_firstyName(){
        new WebDriverWait(driver, Duration.ofSeconds(100))
                .until(ExpectedConditions.visibilityOf(firstName));
        firstName.sendKeys(Keys.CONTROL + "a");
        firstName.sendKeys(Keys.DELETE);
        firstName.sendKeys("John");
    }

    public void update_familyName(){
        familyName.sendKeys(Keys.CONTROL + "a");
        familyName.sendKeys(Keys.DELETE);
        familyName.sendKeys("Smith");
    }

    public void update_button(){
        Update.click();
    }

}
