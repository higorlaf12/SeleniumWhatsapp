package com.example.EstrururandoSelenium.EstruturandoSelenium.AlgarCRM;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
        import org.junit.Test;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Url : "https://algarcrmhom.network.ctbc/crm/#/"
//Faça um algoritmo que entre no algarcrm e autentique na página.
//Responda todas as perguntas
//Não precisa se preocupar com os imports, só será avaliado o seu codigo.

public class AvaliaçãoTest {

    static WebDriver driver;


    @Before // Qual é a diferença entre o Before é o BeforeClass? Resposta : É porque ele executa somente uma vez então se tiver varios testes para um unico site e melhor usar ele
    public void init() {
        System.setProperty("webdriver.chrome.driver", "C:/ArquivosProgramaJava/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://algarcrmhom.network.ctbc/crm/#/");
    }

    @AfterClass// Qual é a diferença entre o AfterClass e o After ? é que o aflter executa no final de cada teste e o afterClasse somente no final de todos os teste
    public static void Testando() {

        driver.quit();

    }

    @Test
    //throws Exception não precisa
    public void Login()throws Exception  {
        WebElement crm = driver.findElement(By.id("username"));
            crm.sendKeys("vitor_oliveira");
        Thread.sleep(1000);
         WebElement crm2 = driver.findElement(By.id("password"));
            crm2.sendKeys("Algar123");
        Thread.sleep(1000);
         driver.findElement(By.id("submit")).click();
        Thread.sleep(1000);
        Assert.assertEquals("Senha incorreta!",driver.findElement(By.xpath("//*[@id='loginForm']/div[3]/span[2]")).getText());

    }
}




































//
//driver.findElement(By.id("username")).sendKeys("xxxxxxx");
//        Thread.sleep(1000);// Não precisa
//        driver.findElement(By.id("password")).sendKeys("yyyyyyyy");
//        Thread.sleep(1000);// Não precisa
//        driver.findElement(By.cssSelector("[type='submit']")).click();