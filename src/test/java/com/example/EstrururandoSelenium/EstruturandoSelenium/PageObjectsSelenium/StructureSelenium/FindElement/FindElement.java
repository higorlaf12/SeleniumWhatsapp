package com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium.FindElement;

import com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium.PageBase;
import org.hibernate.jdbc.Expectations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.test.web.client.ExpectedCount;

public class FindElement extends PageBase{

    public FindElement (WebDriver driver){
        super(driver);
    }

    public static void checkIfThisItemVisibleClickSendkey(By element,String sendKey){
        WebDriverWait wait = new WebDriverWait(getDriver(),120);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        getDriver().findElement(element).click();
        getDriver().findElement(element).sendKeys(sendKey);
    }

    public static void checkIfThisItemVisibleClick(By element){
        WebDriverWait wait = new WebDriverWait(getDriver(),120);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        getDriver().findElement(element).click();
    }

    public static void checkIfThisItemIsPresentHowClick(By element){
        WebDriverWait wait = new WebDriverWait(getDriver(),120);
        wait.until(ExpectedConditions.presenceOfElementLocated(element));
        getDriver().findElement(element).click();
    }


}
