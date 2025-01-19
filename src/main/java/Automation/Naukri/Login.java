package Automation.Naukri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class Login {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

ChromeOptions options = new ChromeOptions();
options.addArguments("--headless");
options.addArguments("--no-sandbox");
options.addArguments("--disable-dev-shm-usage");
options.addArguments("--remote-debugging-port=9222");  // Optional but sometimes required for stability

WebDriver driver = new ChromeDriver(options);
        
            // Navigate to the login page
            driver.get("https://www.naukri.com/nlogin/login?utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad_source=1&gclid=Cj0KCQiAv628BhC2ARIsAIJIiK-gbJ6OBjtci_xwXy7GkpCnIuy8FYIpVJD55_0EJ2jiD8dXO0fQwP8aAoSHEALw_wcB&gclsrc=aw.ds");

                        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("usernameField")));
            usernameField.sendKeys("kshitijsalunkhe@gmail.com");

            // Locate the password field and enter the password
            WebElement passwordField = driver.findElement(By.id("passwordField")); // Replace "password" with the actual ID of the password field
            passwordField.sendKeys("Testingeverything");

            // Locate the login button and click it
            WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']")); // Replace "loginButton" with the actual ID of the login button
            loginButton.click();

            Thread.sleep(3000);
            
            // Add a small delay for demonstration (optional)
            driver.quit();
          

       
        
        
    }
}
