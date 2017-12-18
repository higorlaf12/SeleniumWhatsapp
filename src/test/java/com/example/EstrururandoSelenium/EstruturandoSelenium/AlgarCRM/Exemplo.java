package com.example.EstrururandoSelenium.EstruturandoSelenium.AlgarCRM;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exemplo {
    private static WebDriver driver;

    @AfterClass
    public static void TestExemplo() {
        driver.close();
    }

    @Before
    public void init() {
        System.setProperty("webdriver.chrome.driver", "C:/ArquivosProgramaJava/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com.br");
    }

    @Test
    public void TestandoExemplo() throws Exception {

        //insere os dados no campo lst-ib do google
        driver.findElement(By.id("lst-ib")).sendKeys("Olá Mundo");
        Thread.sleep(1000);
        //clica na lupa para pesquisar
        WebElement element = driver.findElement(By.id("tsf"));
        element.click();

    }

}
