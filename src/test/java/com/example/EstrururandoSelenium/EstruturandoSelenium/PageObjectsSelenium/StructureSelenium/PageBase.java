package com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static com.example.EstrururandoSelenium.EstruturandoSelenium.Executaveis.Chrome.executChrome;

public class PageBase {

    static WebDriver driver;

    WebDriverWait verifyElement() {
        return new WebDriverWait(driver, 120);
    }

    public PageBase(WebDriver driver) {
        PageBase.driver = driver;
    }

    public PageBase() {
        executChrome();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("disable-infobars");
        driver = new ChromeDriver(chromeOptions);
    }

    public void navegateTo(String url) {
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public void closeNavegator() {
        getDriver().close();
    }
}
