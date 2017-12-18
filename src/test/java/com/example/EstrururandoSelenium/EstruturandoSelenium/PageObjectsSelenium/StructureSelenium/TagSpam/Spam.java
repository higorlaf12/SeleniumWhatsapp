package com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium.TagSpam;

import com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium.PageBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class Spam extends PageBase{
    public Spam(WebDriver driver){
        super(driver);
    }

    public static Spam spamAlertRed(){
        spamRed();
        return new Spam(getDriver());
    }
    public static Spam spamAlertYellow(){
        spamYellow();
        return new Spam(getDriver());
    }
    public static Spam spamAlertBlue(){
        spamBlue();
        return new Spam(getDriver());
    }

    private static void spamRed(){
        assertEquals("  Cargo já cadastrado!",
                getDriver().findElement(By.xpath("//*[@id='toast-container']/div/div/span")).getText());
    }
    private static void spamYellow(){
        assertEquals("  Você está tentando gravar um nome já existente!",
                getDriver().findElement(By.xpath("//*[@id='toast-container']/div/div/span")).getText());
    }
    private static void spamBlue(){
        assertEquals("  Cargo Ativado no sistema!",
                getDriver().findElement(By.xpath("//*[@id='toast-container']/div/div/span")).getText());
    }
}
