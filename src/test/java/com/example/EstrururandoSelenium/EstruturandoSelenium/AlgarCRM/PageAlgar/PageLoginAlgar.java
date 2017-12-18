package com.example.EstrururandoSelenium.EstruturandoSelenium.AlgarCRM.PageAlgar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageLoginAlgar extends PageAlgar{
    public PageLoginAlgar(WebDriver driver){super(driver);}

    public PageLoginAlgar loginPage(String username, String password){
        loginComplet(username,password);
        return new PageLoginAlgar(getDriver());
    }

    private void loginComplet(String username, String password){
        getDriver().findElement(By.id("username")).sendKeys(username);
        getDriver().findElement(By.id("password")).sendKeys(password);

        getDriver().findElement(By.id("submit")).click();
    }
}
