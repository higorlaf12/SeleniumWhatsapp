package com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.MoveMouse;

import com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MoveMouse extends PageBase {

    public MoveMouse(WebDriver driver){
        super(driver);
    }

    public void moveMouseMenu(By element) throws InterruptedException{
        Actions builder = new Actions(getDriver());
        WebElement buttonMenu = getDriver().findElement(element);
        Action mouseOverHome= builder.moveToElement(buttonMenu).build();
        mouseOverHome.perform();
        Thread.sleep(1000);
        System.out.println("move mouse menu");
    }

    public void moveMouseClick(By element){
        Actions builder = new Actions(getDriver());
        WebElement buttonNew = getDriver().findElement(element);
        Action mouseOverHome= builder.moveToElement(buttonNew).click(buttonNew).build();
        mouseOverHome.perform();
    }
}
