package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ActionsPage;

public class ActionsTests {
    WebDriver driver;
    ActionsPage actionsPage;

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://dev3.openmrs.org/openmrs/spa/login");
        driver.manage().window().maximize();
        actionsPage = new ActionsPage(driver);

    }

    @Test
    public void FirstScenario(){
        actionsPage.enter_username("admin");
        actionsPage.click_button();
        actionsPage.enter_password("Admin123");
        actionsPage.click_login();
        actionsPage.search_patient("Joshua");
        actionsPage.patient_details();
        actionsPage.patient_actions();
        actionsPage.End_Visit();
        actionsPage.End_Button();
    }

    @AfterMethod
    public void close() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}


