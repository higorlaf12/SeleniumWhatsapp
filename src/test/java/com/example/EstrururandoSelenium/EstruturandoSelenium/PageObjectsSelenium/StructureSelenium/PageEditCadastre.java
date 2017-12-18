package com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium;

import com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.MoveMouse.MoveMouse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class PageEditCadastre extends PageBase {

    public PageEditCadastre(WebDriver driver){super(driver);}


    public PageEditCadastre enterEditCadastre() throws Exception{
        clickConfigurationEditCadastre();
        return new PageEditCadastre(getDriver());
    }
    public PageEditCadastre setUpPersonalData(String userName, String email, String cpf)throws Exception{
        insertDataPeersonal(userName,email,cpf);
        Thread.sleep(1000);
        selectElement();
        return new PageEditCadastre(getDriver());
    }
    public PageEditCadastre profileUser(String userName, String passwordAge, String newpassword)throws Exception{
        searchThisStore(userName,passwordAge,newpassword);
        return new PageEditCadastre(getDriver());
    }



    private void clickConfigurationEditCadastre() throws Exception{
        MoveMouse mouse = new MoveMouse(getDriver());
        mouse.moveMouseMenu(By.xpath("//nav/div/ul[1]/li[3]/a/i"));
        mouse.moveMouseClick(By.xpath("//*[@id='Perfil']/li[1]/a"));
    }
    private void insertDataPeersonal(String userName, String email, String cpf) throws Exception{

        verifyElement().until(ExpectedConditions.presenceOfElementLocated(By.id("complet-name")));
        getDriver().findElement(By.id("complet-name")).sendKeys(userName);

        verifyElement().until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
        getDriver().findElement(By.id("email")).sendKeys(email);

        verifyElement().until(ExpectedConditions.presenceOfElementLocated(By.id("cpf")));
        getDriver().findElement(By.id("cpf")).sendKeys(cpf);
    }
    private void selectElement()throws Exception{
        verifyElement().until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("select.browser-default")));

        getDriver().findElement(By.cssSelector("select.browser-default")).click();
        new Select(getDriver().findElement(By.cssSelector("select.browser-default")))
                .selectByVisibleText("Administração");
        getDriver().findElement(By.cssSelector("option[value='1']")).click();
        Thread.sleep(1000);

        verifyElement()
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[1]/div[3]/div[2]/div[5]/select")));

        getDriver().findElement(By.xpath("//div[1]/div[3]/div[2]/div[5]/select")).click();
        new Select(getDriver().findElement(By.xpath("//div[1]/div[3]/div[2]/div[5]/select")))
                .selectByVisibleText("Desenvolvedor");
        getDriver().findElement(By.cssSelector("option[value='1']")).click();
    }

    private void searchThisStore(String userName, String passwordAge, String newpassword)throws Exception{

        getDriver().findElement(By.id("icon_prefix")).click();
        getDriver().findElement(By.id("icon_prefix")).sendKeys(userName);

        Thread.sleep(1000);

        getDriver().findElement(By.id("Password")).click();
        getDriver().findElement(By.id("Password")).sendKeys(passwordAge);

        Thread.sleep(1000);

        getDriver().findElement(By.id("New_Password")).click();
        getDriver().findElement(By.id("New_Password")).sendKeys(newpassword);

        Thread.sleep(1000);

        getDriver().findElement(By.id("Confirm_Password")).click();
        getDriver().findElement(By.id("Confirm_Password")).sendKeys(newpassword);

        Thread.sleep(1000);

        getDriver().findElement(By.xpath("//div[2]/div[2]/button")).click();
    }
}
