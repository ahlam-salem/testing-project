package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerPage {
    public registerPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy (xpath = "//a[@href=\"/login\"]")
    public WebElement registerButton;
    @FindBy (xpath = "//*[@class=\"signup-form\"]/h2")
    public WebElement newSignUp;
    @FindBy(xpath = "//input[@data-qa=\"signup-name\"]")
    public WebElement nameField;
    @FindBy (xpath =  "//input[@data-qa=\"signup-email\"]")
    public WebElement emailField;
    @FindBy (xpath = "//*[@data-qa=\"signup-button\"]")
    public WebElement signUpButton;
    @FindBy (id = "id_gender1")
    public WebElement title;
    @FindBy (xpath = "//input[@data-qa=\"name\"]")
    public WebElement registerNameField;
    @FindBy (xpath = "//input[@data-qa=\"email\"]")
    public WebElement registerEmailField;
    @FindBy (xpath = "//input[@type=\"password\"]")
    public WebElement registerPassword;
    @FindBy (xpath = "//select[@data-qa=\"days\"]")
    public WebElement daysSelect;
    @FindBy (xpath = "//select[@data-qa=\"months\"]")
    public WebElement monthsSelect;
    @FindBy (xpath = "//select[@data-qa=\"years\"]")
    public WebElement yearsSelect;
    @FindBy (xpath = "//input[@id=\"newsletter\"]")
    public WebElement selectNewsLetter;
    @FindBy (xpath = "//input[@name=\"optin\"]")
    public WebElement specialOffers;
    @FindBy (xpath = "//input[@id=\"first_name\"]")
    public WebElement FirstNameField;
    @FindBy (xpath = "//input[@id=\"last_name\"]")
    public WebElement lastName;
    @FindBy (xpath = "//input[@id=\"company\"]")
    public WebElement company;
    @FindBy (xpath = "//input[@id=\"address1\"]")
    public WebElement address1;
    @FindBy (xpath = "//input[@name=\"address2\"]")
    public WebElement address2;
    @FindBy (xpath = "//select[@data-qa=\"country\"]")
    public WebElement country;
    @FindBy (xpath = "//input[@data-qa=\"state\"]")
    public WebElement state;
    @FindBy (xpath = "//input[@data-qa=\"city\"]")
    public WebElement city;
    @FindBy (xpath = "//input[@data-qa=\"zipcode\"]")
    public WebElement zipCode;
    @FindBy (xpath = "//input[@data-qa=\"mobile_number\"]")
    public WebElement mobileNumber;
    @FindBy (xpath = "//button[@data-qa=\"create-account\"]")
    public WebElement createAccount;
    @FindBy (xpath = "//h2[b[text()='Enter Account Information']]")
    public WebElement enterAccountInformation;
    @FindBy (xpath = "//h2[b[text()='Account Created!']]")
    public WebElement accountCreated;
    @FindBy (xpath = "//a[@data-qa=\"continue-button\"]")
    public WebElement continueButton;
    @FindBy (xpath = "//a[@href=\"/logout\"]")
    public WebElement loggedAppeared;
    @FindBy (xpath = "//a[@href=\"/delete_account\"]")
    public WebElement accountDeleted;
    @FindBy (xpath = "//h2[b[text()='Account Deleted!']]")
    public WebElement accountDeletedText;
    @FindBy (xpath = "//a[@data-qa=\"continue-button\"]")
   public WebElement continueInAccountDelted;
}
