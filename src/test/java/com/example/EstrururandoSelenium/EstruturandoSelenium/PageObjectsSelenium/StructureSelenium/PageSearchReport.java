package com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium;

import com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.MoveMouse.MoveMouse;
import com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium.FindElement.FindElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium.FindElement.FindElement.checkIfThisItemIsPresentHowClick;
import static com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium.FindElement.FindElement.checkIfThisItemVisibleClick;
import static com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium.FindElement.FindElement.checkIfThisItemVisibleClickSendkey;

public class PageSearchReport extends PageBase {

    public PageSearchReport(WebDriver driver){
        super(driver);
    }

    public PageSearchReport searchReportCreateCapa(String QUESTION)throws Exception{
        createCapa(QUESTION);
        createQuestion();
        createDateInitEnd();
        createTargeQuestion();
        return new PageSearchReport(getDriver());
    }
    private void createCapa(String QUESTION) throws Exception{
        MoveMouse mouse = new MoveMouse(getDriver());
        mouse.moveMouseMenu(By.xpath("//div/nav/div/ul[1]/li[2]/a"));
        mouse.moveMouseClick(By.xpath("//*[@id='Menu']/li[1]/a"));
        mouse.moveMouseClick(By.xpath("//div/div/div[1]/div/div/div[1]/a"));

        //Titulo da questão
        checkIfThisItemVisibleClickSendkey(By.id("title"),QUESTION);

        //Descrição da questão
        checkIfThisItemVisibleClickSendkey(By.id("textarea1"),"Estou fazendo tudo que eu posso");

        //Definir usuario
        checkIfThisItemVisibleClickSendkey(By.xpath("//*[@id='input_nome']"), "Higor Freitas");

        //Departamento
        verifyElement().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(" div:nth-child(2) > div.col.s6.m5.l3.offset-m1 > select")));

        new Select(getDriver().findElement(By.cssSelector(" div:nth-child(2) > div.col.s6.m5.l3.offset-m1 > select")))
                .selectByVisibleText("Desenvolvimento BE");
        checkIfThisItemIsPresentHowClick(By.cssSelector("div.col.s6.m5.l3.offset-m1 > select > option:nth-child(2)"));

        //Cargo
        verifyElement().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-child(2) > div:nth-child(3) > select")));
        new Select(getDriver().findElement(By.cssSelector(" div:nth-child(2) > div:nth-child(3) > select")))
                .selectByVisibleText("BackEnd");
        checkIfThisItemIsPresentHowClick(By.cssSelector(" div:nth-child(3) > select > option:nth-child(3)"));

        //Buscar usuario alvo
        checkIfThisItemVisibleClick(By.xpath("//div[3]/div[2]/div[4]/a"));

        //Clicar para proxima pagina
        checkIfThisItemVisibleClick(By.xpath("//button[@type='submit']"));
    }
    private void createQuestion() throws Exception{
        Thread.sleep(1000);
        verifyElement().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/div[2]/div[1]/label")));
        //Adicionar uma nova questão
        List<WebElement> verifyElements = getDriver().findElements(By.xpath("//div/div[2]/div[1]/label"));
        for (int valueElement = 1; valueElement <= verifyElements.size();valueElement++){
            checkIfThisItemVisibleClick(By.xpath("//div/div[2]/div[1]/label[" + Integer.toString(valueElement) + "]"));
            checkIfThisItemVisibleClick(By.xpath("//div/div[2]/div[3]/a"));
        }
        Thread.sleep(2000);
        //Primeira pergunta Aberta
        checkIfThisItemVisibleClickSendkey((By.xpath("//div/form/div[2]/div/div/div[2]/div[2]/div/div/input")),
                "Aberta Deve escrever alguma coisa");
        checkIfThisItemIsPresentHowClick(By.xpath("//div/div/div[1]/div[2]/a"));
        Thread.sleep(2000);
        //Click Obrigatorio
        checkIfThisItemIsPresentHowClick(By.xpath("//div[4]/div/label"));
        Thread.sleep(1000);
        //Segunda pergunta multipla escolha
        checkIfThisItemVisibleClickSendkey(By.xpath("//div[3]/div/div/div[2]/div[2]/div/div[1]/div[1]/input"),
                "X perguntas multiplicas escolhas");
        Thread.sleep(2000);
        checkIfThisItemVisibleClickSendkey(By.xpath("//div/div[2]/div[2]/div/div[2]/div/div[1]/input"), "X = Y");
        Thread.sleep(2000);
        checkIfThisItemIsPresentHowClick(By.xpath("//div/form/div[3]/div/div/div[2]/div[2]/div/div[3]/div[2]/a"));
        Thread.sleep(2000);
        checkIfThisItemVisibleClickSendkey(By.xpath("//div/div/div[2]/div[2]/div/div[3]/div/div[1]/input"), "X<Y");
        checkIfThisItemIsPresentHowClick(By.xpath("//div[2]/div/div[3]/div/div[2]/a/i"));
        Thread.sleep(1000);
        //Click minimizar
        checkIfThisItemIsPresentHowClick(By.xpath("//div[3]/div/div/div[1]/div[2]/a/i"));
        Thread.sleep(1000);
        //Terceira pergunta multipla escolha
        checkIfThisItemVisibleClickSendkey(By.xpath("//form/div[4]/div/div/div[2]/div[2]/div/div/div/input"),
                "Texte Pergunta");
        //Deletar Terceira pergunta
        checkIfThisItemIsPresentHowClick(By.xpath("//form/div[4]/div/div/div[4]/div[3]/div/a"));
        //Proxima pagina
        checkIfThisItemIsPresentHowClick(By.xpath("//button[@type='submit']"));
        Thread.sleep(1000);
    }
    private void createDateInitEnd() throws Exception {
        checkIfThisItemVisibleClickSendkey(By.xpath("//div/div[1]/div[3]/div/div[2]/input"), "15092017");
        checkIfThisItemVisibleClickSendkey(By.xpath("//div/div[1]/div[3]/div/div[3]/input"), "20122018");

        //Clicar para proxima pagina
        checkIfThisItemVisibleClick(By.xpath("//div/div[2]/a"));

    }
    private void createTargeQuestion() throws Exception{
        //Alvos do Questionário
        checkIfThisItemVisibleClickSendkey(By.id("autocomplete-input"), "Higor Freitas");
        //Departamento
        verifyElement().until(ExpectedConditions.presenceOfElementLocated
                (By.cssSelector(" div.card-panel > div:nth-child(5) > div:nth-child(2) > select")));
        new Select(getDriver().findElement(By.cssSelector(" div.card-panel > div:nth-child(5) > div:nth-child(2) > select")))
                .selectByVisibleText("Desenvolvimento BE");
        checkIfThisItemVisibleClick(By.cssSelector("div:nth-child(2) > select > option:nth-child(2)"));

        //Cargo
        verifyElement().until(ExpectedConditions.presenceOfElementLocated
                (By.cssSelector("div.card-panel > div:nth-child(5) > div:nth-child(3) > select")));
        new Select(getDriver().findElement(By.cssSelector("div.card-panel > div:nth-child(5) > div:nth-child(3) > select")))
                .selectByVisibleText("BackEnd");
        checkIfThisItemVisibleClick(By.cssSelector("div:nth-child(3) > select > option:nth-child(3)"));

        checkIfThisItemVisibleClick(By.xpath("//div/div[1]/div[3]/div[4]/a"));

        checkIfThisItemVisibleClick(By.xpath("//div[1]/ul/li[2]/table/tbody/tr/td[1]"));

        checkIfThisItemVisibleClick(By.xpath("//div/div[3]/a"));
    }
}
