package StepDefintion;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ClickCounterFunctionalitySteps {
    WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SATYA RAJESWARI\\OneDrive\\Documents\\Selenium Projects\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Given("I am on the clickCounter home page")
    public void iAmOnTheClickCounterHomePage(){
        driver.get("https://qaclickcounter.ccbp.tech/");
    }
    @When("I click on the clickMe Button")
    public void iClickOnTheClickMeButton(){
        for(int i=0;i<5;i++){
            driver.findElement(By.className("button")).click();
        }


    }
    @Then("verifying the counter text")
    public void verifyingTheCounterText(){
        String curText = driver.findElement(By.className("counter-value")).getText();
        Assert.assertEquals(curText,"5","Doesn't Match");
    }
    @After
    public void tearDown(){
        driver.quit();
    }

}
