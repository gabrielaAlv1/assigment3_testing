package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

public class assignment3 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Program Files/Google/Chrome/Application/chrome.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);

        driver.get("https://form.jotform.com/231097783044156");
        WebElement addName = driver.findElement(By.id("first_4"));
        addName.sendKeys("Dora");
        Thread.sleep(5000);
        WebElement addLastname = driver.findElement(By.id("middle_4"));
        addLastname.sendKeys("The");
        Thread.sleep(5000);
        WebElement lastName = driver.findElement(By.id("last_4"));
        lastName.sendKeys("Explorer");
        Thread.sleep(5000);

        //input the DOB
        WebElement monthDropdown = driver.findElement(By.id("input_24_month"));
        Select monthSelect = new Select(monthDropdown);
        monthSelect.selectByValue("January");
        Thread.sleep(3000);

        WebElement day = driver.findElement(By.id("input_24_day"));
        Select daySelect = new Select(day);
        daySelect.selectByValue("3");
        Thread.sleep(3000);

        WebElement year = driver.findElement(By.id("input_24_year"));
        Select yearSelect = new Select(year);
        yearSelect.selectByValue("2000");
        Thread.sleep(3000);

        //gender select
        WebElement gender = driver.findElement(By.id("input_3"));
        Select assumeGender = new Select(gender);
        assumeGender.selectByValue("N/A");
        Thread.sleep(3000);

        //Dora's address
        WebElement address = driver.findElement(By.id("input_23_addr_line1"));
        address.sendKeys("123 at her house");
        Thread.sleep(3000);

        //city
        WebElement city = driver.findElement(By.id("input_23_city"));
        city.sendKeys("Morelia");
        Thread.sleep(3000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(3000);

        //State
        WebElement state = driver.findElement(By.id("input_23_state"));
        state.sendKeys("Michoacán");
        Thread.sleep(3000);

        // zip code
        WebElement zip = driver.findElement(By.id("input_23_postal"));
        zip.sendKeys("66108");
        Thread.sleep(3000);

        //email
        WebElement email = driver.findElement(By.id("input_6"));
        email.sendKeys("doraandboots@gmail.com");
        Thread.sleep(3000);

        //phone #
        WebElement phone = driver.findElement(By.id("input_27_full"));
        phone.sendKeys("2391231123");
        Thread.sleep(3000);

        //company
        WebElement company = driver.findElement(By.id("input_14"));
        company.sendKeys("Dora and Boots Inc");
        Thread.sleep(3000);

        //course dropdown
        WebElement course = driver.findElement(By.id("input_46"));
        Select schoolCourse = new Select(course);
        schoolCourse.selectByValue("Math 101");
        Thread.sleep(3000);

        //additional comment
        WebElement comment = driver.findElement(By.id("input_45"));
        comment.sendKeys("This is a testing assigment for a software Testing class");
        Thread.sleep(3000);

        WebElement submit = driver.findElement(By.id("input_48"));
        submit.click();
        Thread.sleep(3000);


        driver.quit();
    }

}