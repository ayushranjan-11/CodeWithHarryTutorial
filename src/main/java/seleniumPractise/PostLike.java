package seleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PostLike {

    public static void main(String[] args) throws InterruptedException {
        String url = "https://www.hashtagkalakar.net/post/artwork-by-tanvi-priya?fbclid=PAAab5UIYnCPm9789smWScgyq8VFgRHn9KMOcNX0ZH8bYCeuMD8Rg-604e4vE";
            browserSetupAndLinkOpen(url);

    }

    public static void browserSetupAndLinkOpen(String url) throws InterruptedException {

        int min =500;
        int max = 1000;
        int randomNum = min + (int)(Math.random() * ((max-min)+1));
        System.out.println(randomNum);
        for(int i =0;i<=randomNum;i++) {

            //WHen we have to close and open browser repeatedly then we have to create WebDriver instance everytime that's why WebDriver driver = new ChromeDriver();
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));  //maximum amount of time that the WebDriver instance should wait for a web page to fully load before timing out and throwing an exception

            driver.get(url);
            driver.manage().window().maximize();
            identifyAndLike(driver);

            Thread.sleep(2000);
                driver.quit();

        }

    }

    public static void identifyAndLike(WebDriver driver) throws InterruptedException {
        //Find heart icon in page and click it.
        Thread.sleep(3000);
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[class='Kh5HMz']")));
        System.out.println(firstResult.getText());
        firstResult.click();
    }
}
