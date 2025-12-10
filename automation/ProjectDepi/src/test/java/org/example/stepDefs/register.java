package org.example.stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.registerPage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class register {
    registerPage register = new registerPage(Hooks.driver);// take driver from hooks file
      SoftAssert soft = new SoftAssert();
      Faker fake = new Faker();
    String name = fake.name().firstName();
    //String email = fake.internet().emailAddress();//ahmed@gmail.com
    String safeEmail = fake.internet().safeEmailAddress(); //ahmed@example.com
    String password = fake.internet().password(8,15,true,true,true);
    String weakPassword = fake.internet().password(1,7,false, false, true);
    String state = fake.address().state();
    String city = fake.address().cityName();
    String phone = fake.phoneNumber().cellPhone();
    @Given("home page is visible successfully")
    public void homePageIsVisibleSuccessfully ()
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://www.automationexercise.com/");
    }



    @When("Click on Signup \\/ Login button")
    public void clickOnSignupLoginButton() {
        register.registerButton.click();
    }

    @Then("New User Signup is visible")
    public void newUserSignupIsVisible() {
         soft.assertEquals(register.newSignUp.getText(),"New User Signup!");
    }

    @When("Enter name and email address")
    public void enterNameAndEmailAddress() {
        register.nameField.sendKeys("Ahmed");
        register.emailField.sendKeys(fake.internet().emailAddress());
    }

    @And("Click Signup button")
    public void clickSignupButton() {
        register.signUpButton.click();
    }

    @Then("ENTER ACCOUNT INFORMATION is visible")
    public void enterACCOUNTINFORMATIONIsVisible() {
        soft.assertEquals(register.enterAccountInformation.getText(),"Enter Account Information");

    }

    @When("Fill details: Title, Name, Email, Password, Date of birth")
    public void fillDetailsTitleNameEmailPasswordDateOfBirth() {
        register.title.click();
        register.registerPassword.sendKeys(password);
        register.registerNameField.sendKeys("ahmed");
        register. registerEmailField.sendKeys("Alaafayed00@gmail.com");
        register.address1.sendKeys("maadi , cairo");
        register.address2.sendKeys(" tanta , egypt");
    }

    @And("Select checkbox Sign up for our newsletter")
    public void selectCheckboxSignUpForOurNewsletter() {
        register.selectNewsLetter.click();
    }


    @And("Select checkbox Receive special offers from our partners")
    public void selectCheckboxReceiveSpecialOffersFromOurPartners() {
        register.specialOffers.click();
    }

    @And("Fill details: First name, Last name, Company, Address, Address{int}, Country, State, City, Zipcode, Mobile Number")
    public void fillDetailsFirstNameLastNameCompanyAddressAddressCountryStateCityZipcodeMobileNumber(int arg0) {

        register.FirstNameField.sendKeys("ahmed");
        register.lastName.sendKeys("Alaa");
        register.address1.sendKeys("maadi , cairo");
        register.address2.sendKeys(" tanta , egypt");
        register.state.sendKeys(state);
        register.city.sendKeys(city);
        register.zipCode.sendKeys("14578");
        register.mobileNumber.sendKeys(phone);

    }

    @And("Click Create Account button")
    public void clickCreateAccountButton() {
        register.createAccount.click();

    }

    @Then("ACCOUNT CREATED is visible")
    public void accountCREATEDIsVisible() {
        soft.assertEquals(register.accountCreated.getText(),"Account Created!");

    }

    @When("Click Continue button")
    public void clickContinueButton() {
        register.continueButton.click();
    }

    @Then("Logged in as username is visible")
    public void loggedInAsUsernameIsVisible() {
        soft.assertEquals(register.loggedAppeared.getText(),"Logout");

    }

    @When("Click Delete Account button")
    public void clickDeleteAccountButton() {
        register.accountDeleted.click();

    }

    @Then("ACCOUNT DELETED is visible and click Continue button")
    public void accountDELETEDIsVisibleAndClickContinueButton() {
        soft.assertEquals(register.accountDeletedText.getText(),"Account Deleted!");

        register.continueInAccountDelted.click();
        soft.assertAll();

    }


    @Given("home page is visible successfullyy")
    public void homePageIsVisibleSuccessfullyy() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://www.automationexercise.com/");

    }

    @When("Click on Signup \\/ Login buttonn")
    public void clickOnSignupLoginButtonn() {
        register.registerButton.click();

    }

    @Then("New User Signup is visiblee")
    public void newUserSignupIsVisiblee() {
        soft.assertEquals(register.newSignUp.getText(),"New User Signup!");

    }

    @When("Enter name and email addresss")
    public void enterNameAndEmailAddresss() {
        register.nameField.sendKeys("Ahmed");
        register.emailField.sendKeys(fake.internet().emailAddress());

    }

    @And("Click Signup buttonn")
    public void clickSignupButtonn() {
        register.signUpButton.click();

    }


    @Then("ENTER ACCOUNT INFORMATION is visiblee")
    public void enterACCOUNTINFORMATIONIsVisiblee() {
        soft.assertEquals(register.enterAccountInformation.getText(),"Enter Account Information");

    }

    }
