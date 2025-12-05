package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ActionsPage2;

public class ActionsTest2 {
    WebDriver driver;
    ActionsPage2 actionsPage2;

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://dev3.openmrs.org/openmrs/spa/login");
        driver.manage().window().maximize();
        actionsPage2 = new ActionsPage2(driver);

    }

    @Test
    public void SecondScenario(){
        actionsPage2.enter_username("admin");
        actionsPage2.click_button();
        actionsPage2.enter_password("Admin123");
        actionsPage2.click_login();
        actionsPage2.search_patient("John");
        actionsPage2.patient_details();
        actionsPage2.patient_actions();
        actionsPage2.Edit_button();
        actionsPage2.update_firstyName();
        actionsPage2.update_familyName();
        actionsPage2.update_button();
    }

    @AfterMethod
    public void close() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }

}
