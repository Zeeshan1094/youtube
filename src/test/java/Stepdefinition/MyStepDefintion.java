package Stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepDefintion {
    private WebDriver driver;
    @Given("^User is on the application home page$")
    public void user_is_on_the_application_home_page() throws Throwable {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.primelocation.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"bhome\"]/div[1]/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"pl-mn-buy\"]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"forsale_price_min\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"forsale_price_min\"]/option[11]")).click();
        driver.findElement(By.xpath("//*[@id=\"forsale_price_max\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"forsale_price_max\"]/option[31]")).click();
        driver.findElement(By.xpath("//*[@id=\"property_type\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"property_type\"]/option[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"beds_min\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"beds_min\"]/option[5]")).click();
        driver.findElement(By.xpath("//*[@id=\"search-submit\"]")).click();

    }

    @When("^User select the property options$")
    public void user_select_the_property_options() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"forsale_price_min\"]")).click();
//        driver.findElement(By.xpath("//*[@id=\"forsale_price_min\"]/option[11]")).click();
//        driver.findElement(By.xpath("//*[@id=\"forsale_price_max\"]")).click();
//        driver.findElement(By.xpath("//*[@id=\"forsale_price_max\"]/option[31]")).click();
//        driver.findElement(By.xpath("//*[@id=\"property_type\"]")).click();
//        driver.findElement(By.xpath("//*[@id=\"property_type\"]/option[2]")).click();
//        driver.findElement(By.xpath("//*[@id=\"beds_min\"]")).click();
//        driver.findElement(By.xpath("//*[@id=\"beds_min\"]/option[5]")).click();

    }

    @When("^search it$")
    public void search_it() throws Throwable {
//      driver.findElement(By.xpath("//*[@id=\"search-submit\"]")).click();
    }
    @Then("^user should be ale to find the house$")
    public void user_should_be_ale_to_find_the_house() throws Throwable {

    }

}
