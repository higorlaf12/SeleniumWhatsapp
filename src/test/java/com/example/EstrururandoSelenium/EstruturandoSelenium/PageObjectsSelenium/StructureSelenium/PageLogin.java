package com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium;

import com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.MoveMouse.MoveMouse;
import com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium.FindElement.FindElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.yandex.qatools.allure.annotations.Stories;

import static org.junit.Assert.assertEquals;
@Stories(value = {"Doing user authentication","making user logoff","making user enter false data"})
public class PageLogin extends PageBase {


    public PageLogin(WebDriver driver) {
        super(driver);
    }

    @Stories(value = "User enters login")
    public PageLogin enterPageLogin(String userName, String userPassword) throws Exception {
        login(userName, userPassword);
        return new PageLogin(getDriver());
    }
    @Stories(value = "User enters login, soon after the logoff ")
    public PageLogin exitPageLogin() throws Exception {
        exit();
        return new PageLogin(getDriver());
    }
    @Stories(value = "User enters wrong login in password ")
    public PageLogin errorPageLogin(String userNameError, String userPasswordError) throws Exception{
        error(userNameError,userPasswordError);
        return new PageLogin(getDriver());
    }

    private void classFindVisbleClick(By element){
        FindElement findElement = new FindElement(getDriver());
        findElement.checkIfThisItemVisibleClick(element);
    }

    private void login(String userName, String userPassword) throws Exception {

        getDriver().findElement(By.id("loginEmail")).click();
        getDriver().findElement(By.id("loginEmail")).sendKeys(userName);
        getDriver().findElement(By.xpath("//div/form/div[2]/div/label")).click();
        getDriver().findElement(By.id("loginPassword")).sendKeys(userPassword);

        getDriver().findElement(By.xpath("//div/div/div/form/div[3]/div[1]/label")).click();
        classFindVisbleClick(By.xpath("//form/div[4]/div/button"));

    }
    private void exit() throws Exception {
        MoveMouse mouse = new MoveMouse(getDriver());
        mouse.moveMouseMenu(By.xpath("//nav/div/ul[1]/li[3]/a/i"));
        mouse.moveMouseClick(By.xpath("//*[@id='Perfil']/li[2]/a"));
    }
    private void error(String userName, String userPassword) throws Exception{
        login(userName,userPassword);
        assertEquals("  Algo deu errado",getDriver()
                .findElement(By.xpath("//*[@id='toast-container']/div/div/span")).getText());
    }

}
