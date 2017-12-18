package com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium;

import com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.MoveMouse.MoveMouse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium.ExtendPageAdm.ExtendPageAdm.*;
import static com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium.FindElement.FindElement.*;
import static com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium.TagSpam.Spam.spamAlertRed;
import static org.junit.Assert.assertEquals;

public class PageAdministration extends PageBase {

    private static final String USER_NAME = "JonhSnow";
    private static final String EMAIL_NEW = "JonhSSSnow@hotmail.com";
    private static final String CPF_NEW = "12345678912";
    private static final String PASSWORD_NEW = "549868A9SD4S";


    public PageAdministration(WebDriver driver) {
        super(driver);
    }

    private static List<String> generateNameList() {
        List<String> names = new ArrayList<>();
        names.add(generateName());
        names.add(generateName());
        names.add(generateName());
        return names;
    }

    private static String generateName() {
        String name[] = {"Desenvolvimento FE", "Gerencia", "Desenvolvimento BE"};
        Random rand = new Random();
        return name[rand.nextInt(name.length)];
    }

    public PageAdministration allMethod(String chargesname, String competencename, String departmentname, String user) throws Exception {
        admCharges(chargesname);
        admCompetence(competencename);
        admDepartment(departmentname);
        admTable();
        admUser(user, chargesname, departmentname);
        return new PageAdministration(getDriver());
    }

    public PageAdministration testTable() throws Exception {
        admChargenXCompetence();
        return new PageAdministration(getDriver());
    }

    private void admPage() throws Exception {
        MoveMouse mouse = new MoveMouse(getDriver());
        mouse.moveMouseMenu(By.xpath("//div/nav/div/ul[1]/li[2]/a"));
        mouse.moveMouseClick(By.xpath("//*[@id='Menu']/li[4]/a"));
    }

    private void admCharges(String chargesname) throws Exception {
        admPage();

        checkIfThisItemIsPresentHowClick(By.xpath("//div/div/div/div[2]/div[1]/a"));
        checkIfThisItemVisibleClickSendkey(By.id("text-input"), chargesname);
        checkIfThisItemVisibleClick(By.xpath("//div/form/div/div[2]/button"));

        spamAlertRed();

        List<String> nameElement = new ArrayList<>();
        nameElement.add("FrontEnd");
        nameElement.add("BackEnd");
        nameElement.add("Diretor");

        listTable(nameElement);
        admPage();
    }

    private void admCompetence(String competence) throws Exception {

        admPage();

        checkIfThisItemIsPresentHowClick(By.xpath("//div/div/div/div[2]/div[2]/a"));

        getDriver().findElement(By.id("text-input")).click();
        getDriver().findElement(By.id("text-input")).sendKeys(competence);

        checkIfThisItemIsPresentHowClick(By.xpath("//div/form/div[2]/button"));

        List<String> nameElement = new ArrayList<>();
        nameElement.add("Comunicação");
        nameElement.add("Pontualidade");
        nameElement.add("Liderança");

        listTable(nameElement);

        Thread.sleep(1000);

    }

    private void admDepartment(String departmentname) throws Exception {

        admPage();

        checkIfThisItemIsPresentHowClick(By.xpath("//a[@href='#/hreports/administration/department']"));

        getDriver().findElement(By.id("text-input")).click();
        getDriver().findElement(By.id("text-input")).sendKeys(departmentname);

        checkIfThisItemIsPresentHowClick(By.xpath("//div/form/div[2]/button"));

        listTable(generateNameList());

        Thread.sleep(1000);


    }

    private void admTable() throws Exception {
        admPage();
        admChargenXCompetence();
        admTableChargeXCharge();
    }

    private void admChargenXCompetence() throws Exception {

        checkIfThisItemIsPresentHowClick(By.xpath("//a[@href='#/hreports/administration/table']"));

        checkIfThisItemVisibleClick(By.cssSelector(" div > div:nth-child(8) > div > div:nth-child(1) > select"));

        List<String> nameElement = new ArrayList<>();
        nameElement.add("FrontEnd");
        nameElement.add("BackEnd");
        nameElement.add("Diretor");

        List<String> nameElement1 = new ArrayList<>();
        nameElement1.add("Comunicação");
        nameElement1.add("Pontualidade");
        nameElement1.add("Liderança");

        chargeXCompetence(nameElement, nameElement1);

    }

    private void admTableChargeXCharge() throws Exception {
        checkIfThisItemVisibleClick(By.cssSelector("  div > div:nth-child(12) > div > div:nth-child(1) > select"));

        List<String> nameElement = new ArrayList<>();
        nameElement.add("FrontEnd");
        nameElement.add("BackEnd");
        nameElement.add("Diretor");

        chargeXCharge(nameElement);

        Thread.sleep(1000);

    }

    private void admUser(String sendKey, String charges, String department) throws Exception {
        admPage();
        admUserRegister(sendKey);
        Thread.sleep(1000);
        admUserRegisterNewUser(charges, department);
    }

    private void admUserRegister(String sendKey) throws Exception {
        checkIfThisItemVisibleClick(By.xpath("//a[@href='#/hreports/administration/users']"));
        checkIfThisItemVisibleClickSendkey(By.id("m-l-search"), sendKey);
        checkIfThisItemVisibleClick(By.xpath("//div[1]/div[3]/div[2]/a"));
        List<WebElement> allElement = getDriver().findElements(By.xpath("//div[3]/div/table/tbody/tr"));

        for (int valueUser = 1; valueUser < allElement.size(); valueUser++) {

            List<WebElement> webElementList = getDriver().findElements(By.xpath("//div[3]/div/table/tbody/tr[" + Integer.toString(valueUser) + "]"));

            for (WebElement webelement : webElementList) {

                webelement = getDriver().findElement(By.xpath("//div/table/tbody/tr[" + Integer.toString(valueUser) + "]/td[6]/span"));
                webelement.click();
            }

        }
    }

    private void admUserRegisterNewUser(String charges, String department) throws Exception {
        checkIfThisItemVisibleClick(By.xpath("//div[3]/div[3]/a"));
        assertEquals("Cadastro de Usuários", getDriver().findElement(By.xpath("//div/form/div[1]/h5")).getText());

        checkIfThisItemVisibleClickSendkey(By.id("icon_prefix"), USER_NAME);
        checkIfThisItemVisibleClickSendkey(By.id("email"), EMAIL_NEW);
        checkIfThisItemVisibleClickSendkey(By.id("number"), CPF_NEW);

        verifyElement().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div > div.row.valign-botton > div:nth-child(2) > select")));
        new Select(getDriver().findElement(By.cssSelector(" div > div.row.valign-botton > div:nth-child(2) > select")))
                .selectByVisibleText(charges);

        checkIfThisItemIsPresentHowClick(By.xpath("//div[3]/div[2]/div/div[3]/div[3]/div[2]/label"));

        checkIfThisItemIsPresentHowClick(By.cssSelector("div:nth-child(2) > select > option:nth-child(2)"));
        assertEquals(department, getDriver().findElement(By.xpath("//div[3]/div[1]/label")).getText());

        checkIfThisItemVisibleClickSendkey(By.id("text"), PASSWORD_NEW);

        verifyElement().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div > div.col.s12.m3.l3 > select")));
        new Select(getDriver().findElement(By.cssSelector("div > div.col.s12.m3.l3 > select")))
                .selectByVisibleText("Administrador");

        checkIfThisItemVisibleClick(By.xpath("//div/div[3]/select/option[2]"));

        checkIfThisItemVisibleClick(By.xpath("//button[@type= 'submit']"));

    }
}


