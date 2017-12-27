package com.example.EstrururandoSelenium.EstruturandoSelenium.Whatsapp.Structure;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WhatsappVerify extends WhatsappBase {

    public WhatsappVerify(WebDriver driver) {
        super(driver);
    }

    private static void verifyWappPart2() throws InterruptedException {

        WebElement clickAnexar = getDriver().findElement(By.cssSelector("[title=\"Anexar\"]"));
        clickAnexar.click();

        WebElement enviandoImagem = getDriver().findElement(By.xpath("//*[@id=\"main\"]/header/div[3]/div/div[2]/span/div/div/ul/li[1]/input"));
        enviandoImagem.sendKeys("/home/higorlucas/Downloads/logo_martins.png");

        Thread.sleep(3000);
        WebElement clickButton = getDriver().findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[2]/span/div/span/div/div/div[2]/span[2]/div/div"));
        clickButton.click();

    }

    public WhatsappVerify verifyElementScreen() {
        verify();
        return new WhatsappVerify(getDriver());
    }

    public WhatsappVerify verifyElementWhapp() {
        verifyWapp();
        return new WhatsappVerify(getDriver());
    }

    public WhatsappVerify insertDate() throws InterruptedException {
        verifyWappPart1();

        return new WhatsappVerify(getDriver());
    }

    public WhatsappVerify imagenUploadWhapp() throws InterruptedException {
        verifyWappPart2();
        return new WhatsappVerify(getDriver());
    }

    private void verify() {
        assertEquals("WhatsApp", getDriver().findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[2]/div[1]"))
                .getText());
    }

    private void verifyWapp() {
        assertTrue(isElementPresent(By.xpath("//*[@id=\"side\"]/header/div[1]/div")));
    }

    private void verifyWappPart1() throws InterruptedException {

        String pessoas = "Paulin" ;
        List<String> Names = Arrays.asList(pessoas);

        Date d = GregorianCalendar.getInstance().getTime();
        SimpleDateFormat format = new SimpleDateFormat();

        for (String nomes : Names) {
            WebElement search = getDriver().findElement(By.id("input-chatlist-search"));
                search.click();
                search.sendKeys(nomes);

            Thread.sleep(1000);
            WebElement element = getDriver().findElement(By.xpath("//*[@id=\"pane-side\"]//div[@class=\"chat-body\"]"));
            element.click();

            WebElement inputWhapp = getDriver().findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div[2]/div/div[2]"));
            inputWhapp.sendKeys("Teste, por favor desconsiderar essa mensagem " + "[" + format.format(d) + "]");
            inputWhapp.sendKeys(Keys.ENTER);


            Thread.sleep(2000);

            verifyWappPart2();

            Thread.sleep(1000);
            search.clear();
        }
    }

    private boolean isElementPresent(By by) {
        try {
            getDriver().findElement(by);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
}


//

//        String filePath = System.getProperty("user.dir") + "/home/higorlucas/Downloads/logo_martins.png";
//
//        WebElement imageUpload = getDriver().findElement(By.xpath("//*[@id=\"main\"]/header/div[3]/div/div[2]/div/span"));
////        imageUpload.click();
//
////        Thread.sleep(1000);
//
//        WebElement imageUploads = getDriver().findElement(By.xpath("//*[@id=\"main\"]/header/div[3]/div/div[2]/span/div/div/ul/li[1]/button"));
////        imageUploads.click();
//        Thread.sleep(1000);
//
////        imageUploads.sendKeys(filePath);