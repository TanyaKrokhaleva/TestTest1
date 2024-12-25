package Lesson15;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MtsTest {
    private static WebDriver driver;

    @BeforeAll
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By cookieAccept = By.xpath("//h3[contains(text(), 'Обработка файлов cookie')]/../../..//button[text() = 'Принять']");

        if(driver.findElement(cookieAccept).isDisplayed()) {

            driver.findElement(cookieAccept).click();

        }
        }

    @AfterAll
    public static void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @DisplayName("Проверка названия блока")
    @Test
    public void openMtsByUrl() {
        String actualTitle = driver.findElement(By.xpath("//div[@class='pay__wrapper']/h2")).getText();
        assertEquals("Онлайн пополнение\nбез комиссии", actualTitle);
    }

    @DisplayName("Проверка наличия логотипов платежных систем: Visa")
    @Test
    public void visaLogoCheck() {
        WebElement visaLogo = driver.findElement(By.xpath("//h2[contains(text(), 'Онлайн пополнение ')]/..//img[@alt='Visa']"));
        assertTrue(visaLogo.isDisplayed(), "Логотип Visa не отображается на странице");

    }

    @DisplayName("Проверка наличия логотипов платежных систем: Verified by Visa")
    @Test
    public void verifiedByVisaLogoCheck() {
        WebElement visaLogo = driver.findElement(By.xpath("//h2[contains(text(), 'Онлайн пополнение ')]/..//img[@alt='Verified By Visa']"));
        assertTrue(visaLogo.isDisplayed(), "Логотип Verified by Visa не отображается на странице");

    }

    @DisplayName("Проверка наличия логотипов платежных систем: MasterCard")
    @Test
    public void MasterCardLogoCheck() {
        WebElement masterCardLogo = driver.findElement(By.xpath("//h2[contains(text(), 'Онлайн пополнение ')]/..//img[@alt='MasterCard']"));
        assertTrue(masterCardLogo.isDisplayed(), "Логотип MasterCard не отображается на странице");

    }

    @DisplayName("Проверка наличия логотипов платежных систем: MasterCard Secure Code")
    @Test
    public void MasterCardSecureCodeLogoCheck() {
        WebElement MasterCardSecureCodeLogo = driver.findElement(By.xpath("//h2[contains(text(), 'Онлайн пополнение ')]/..//img[@alt='MasterCard Secure Code']"));
        assertTrue(MasterCardSecureCodeLogo.isDisplayed(), "Логотип MasterCard Secure Code не отображается на странице");


    }

    @DisplayName("Проверка наличия логотипов платежных систем: Белкарт")
    @Test
    public void belCardLogoCheck() {
        WebElement belCardLogo = driver.findElement(By.xpath("//h2[contains(text(), 'Онлайн пополнение ')]/..//img[@alt='Белкарт']"));
        assertTrue(belCardLogo.isDisplayed(), "Логотип Белкарт не отображается на странице");

    }


}














