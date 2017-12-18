package com.example.EstrururandoSelenium.EstruturandoSelenium.Whatsapp.Structure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WhatsappVerify extends WhatsappBase {

    public WhatsappVerify(WebDriver driver) {
        super(driver);
    }


    public WhatsappVerify verifyElementScreen(){
     verify();
     return new WhatsappVerify(getDriver());
    }

    public WhatsappVerify verifyElementWhapp(){
        verifyWapp();
        return new WhatsappVerify(getDriver());
    }


    private void verify(){
        assertEquals("WhatsApp", getDriver().findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[2]/div[1]"))
                .getText());
    }

    private void verifyWapp(){
        while (!getDriver().findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[1]/div/img")).isDisplayed()){
            System.out.println(getDriver().findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[1]/div/img")).isDisplayed());
        }
        assertTrue(isElementPresent(By.xpath("//*[@id=\"side\"]/header/div[1]/div")));


    }

    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        }
        catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
}
