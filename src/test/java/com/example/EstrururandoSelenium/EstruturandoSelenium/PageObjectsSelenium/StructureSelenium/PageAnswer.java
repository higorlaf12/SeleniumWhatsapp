package com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium;

import com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium.FindElement.FindElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium.FindElement.FindElement.checkIfThisItemIsPresentHowClick;
import static com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium.FindElement.FindElement.checkIfThisItemVisibleClick;
import static com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium.FindElement.FindElement.checkIfThisItemVisibleClickSendkey;
import static org.junit.Assert.assertEquals;

public class PageAnswer extends PageBase{

    public PageAnswer (WebDriver driver){
        super(driver);
    }

    public PageAnswer answer()throws Exception{
        answerTable();
        answerTablePizzaEndBer();
        return new PageAnswer(getDriver());
    }
    private void corretionPage(){
        assertEquals("Atividades no Sistemas",getDriver().findElement(By.xpath("//div[1]/div[1]/h5")).getText());
        checkIfThisItemIsPresentHowClick(By.xpath("//div/table/tbody/tr[1]"));
    }

    private void answerTablePizzaEndBer()throws Exception{
        corretionPage();

        if (getDriver().findElement(By.xpath("//div/div[1]/div/h4")).getText().equals("Pizza and Beer")) {

            checkIfThisItemVisibleClick(By.xpath("//div[3]/div[1]/div/div/div[1]/label"));

            checkIfThisItemVisibleClickSendkey(By.xpath("//div[3]/div[2]/div/div[2]/textarea"), "Test Selenium");

            checkIfThisItemIsPresentHowClick(By.xpath("//div[3]/div[3]/div/div/div[6]/label"));

            checkIfThisItemIsPresentHowClick(By.xpath("//div/div[4]/div/a"));

            Thread.sleep(1000);

            checkIfThisItemIsPresentHowClick(By.xpath("//div[3]/div/div[2]/div/a"));
        }else
            checkIfThisItemVisibleClickSendkey(By.xpath("//div[3]/div[1]/div/div[2]/textarea"),"Test Selenium");
        checkIfThisItemIsPresentHowClick(By.xpath("//div/div[3]/div[2]/div/div/div/label"));
        Thread.sleep(1000);
        checkIfThisItemIsPresentHowClick(By.xpath("//div/div/div/div/div[4]/div/a"));

    }
    private void answerTable()throws Exception{
        corretionPage();

        checkIfThisItemVisibleClickSendkey(By.xpath("//div[3]/div[1]/div/div[2]/textarea"),"Test Selenium");
        checkIfThisItemIsPresentHowClick(By.xpath("//div/div[3]/div[2]/div/div/div/label"));
        Thread.sleep(1000);
        checkIfThisItemIsPresentHowClick(By.xpath("//div/div/div/div/div[4]/div/a"));
    }
}
