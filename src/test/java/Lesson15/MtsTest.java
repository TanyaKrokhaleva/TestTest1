package Lesson15;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.InputEvent;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;


public class MtsTest {
    private static WebDriver driver;

    @BeforeAll
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");
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

    @DisplayName("Проверка отображения логотипов платежных систем")
    @ParameterizedTest
    @ValueSource(strings = {"Visa", "Verified By Visa", "MasterCard", "MasterCard Secure Code", "Белкарт"})
    public void checkPaymentLogos(String cardName) {
        assertTrue(driver.findElement(By.xpath("//h2[contains(text(), 'Онлайн пополнение')]/..//img[@alt='" + cardName + "']")).isDisplayed(),  "Логотип " + cardName + " не отображается на странице");
    }

    @DisplayName("Проверка работы ссылки Подробнее о сервисе")
    @Test
    public void checkLinkService() {
        WebElement checkLink = driver.findElement(By.xpath("//a[text() = 'Подробнее о сервисе']"));
        assertTrue(checkLink.isDisplayed(), "Ссылка Подробнее о сервисе не отображается на странице");
        String currentUrl = driver.getCurrentUrl();
        checkLink.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofMillis(1000));
        wait.until(ExpectedConditions.titleContains("Порядок оплаты и безопасность интернет платежей"));
        String newUrl = driver.getCurrentUrl();
        assertNotEquals(newUrl, currentUrl, "Адрес страницы не изменился после нажатия на ссылку");
        assertEquals(newUrl, "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/");
        driver.navigate().back();
        wait.until(ExpectedConditions.titleContains("МТС – мобильный оператор в Беларуси"));
    }
    @DisplayName("Проверка корректного заполнения поля суммы и кнопки \"Продолжить\"")
    @ParameterizedTest
    @ValueSource(strings = {"50"})
    public void checkFillingFieldCorrectSum(String sum) throws AWTException {
        driver.findElement(By.xpath("//input[@id = 'connection-phone']")).sendKeys("297777777");
        driver.findElement(By.xpath("//input[@id = 'connection-sum']")).sendKeys(sum);
        driver.findElement(By.xpath("//input[@id = 'connection-email']")).sendKeys("qwwwww@dfgfg.ru");
        driver.findElement(By.xpath("//form[@id = 'pay-connection']//button[text() = 'Продолжить']")).click();
        Robot robot = new Robot();
        robot.mouseMove(100, 100);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.ESCAPE).perform();
        driver.findElement(By.xpath("//input[@id = 'connection-phone']")).clear();
        driver.findElement(By.xpath("//input[@id = 'connection-sum']")).clear();
        driver.findElement(By.xpath("//input[@id = 'connection-email']")).clear();
    }
    @DisplayName("Проверка некорректного заполнения поля суммы")
    @ParameterizedTest
    @ValueSource(strings = {"0"})
    public void checkFillingFieldIncorrectSum(String sum) {
        driver.findElement(By.xpath("//input[@id = 'connection-phone']")).sendKeys("297777777");
        driver.findElement(By.xpath("//input[@id = 'connection-sum']")).sendKeys(sum);
        driver.findElement(By.xpath("//input[@id = 'connection-email']")).sendKeys("qwwwww@dfgfg.ru");
        driver.findElement(By.xpath("//form[@id = 'pay-connection']//button[text() = 'Продолжить']")).click();
        assertTrue(driver.findElement(By.xpath("//p[text() = 'Введите сумму платежа']")).isDisplayed());
        driver.findElement(By.xpath("//input[@id = 'connection-phone']")).clear();
        driver.findElement(By.xpath("//input[@id = 'connection-sum']")).clear();
        driver.findElement(By.xpath("//input[@id = 'connection-email']")).clear();
    }
    @DisplayName("Проверка некорректного заполнения email")
    @ParameterizedTest
    @ValueSource(strings = {"000"})
    public void checkFillingFieldEmail(String email) {
        driver.findElement(By.xpath("//input[@id = 'connection-phone']")).sendKeys("297777777");
        driver.findElement(By.xpath("//input[@id = 'connection-sum']")).sendKeys("28.57");
        driver.findElement(By.xpath("//input[@id = 'connection-email']")).sendKeys(email);
        driver.findElement(By.xpath("//form[@id = 'pay-connection']//button[text() = 'Продолжить']")).click();
        assertTrue(driver.findElement(By.xpath("//p[text() = 'Введите корректный адрес электронной почты.']")).isDisplayed());
        driver.findElement(By.xpath("//input[@id = 'connection-phone']")).clear();
        driver.findElement(By.xpath("//input[@id = 'connection-sum']")).clear();
        driver.findElement(By.xpath("//input[@id = 'connection-email']")).clear();
    }

}














