package com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium.ExtendPageAdm;

import com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium.PageAdministration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium.FindElement.FindElement.checkIfThisItemVisibleClick;
import static com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium.TagSpam.Spam.spamAlertBlue;
import static com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium.TagSpam.Spam.spamAlertYellow;

public class ExtendPageAdm extends PageAdministration {

    public ExtendPageAdm(WebDriver driver) {
        super(driver);
    }

    public static ExtendPageAdm listTable(List<String> nameElement)throws Exception{
        tableLoop(nameElement);
        return new ExtendPageAdm(getDriver());
    }

    public static ExtendPageAdm chargeXCompetence(List<String>nameElement, List<String>nameElement1){
        tableChargexCompetence(nameElement,nameElement1);
        return new ExtendPageAdm(getDriver());
    }
    public static ExtendPageAdm chargeXCharge(List<String>nameElement){
        tableChargexCharge(nameElement);
        return new ExtendPageAdm(getDriver());
    }

    private static void tableLoop(List<String> nameElement) throws Exception {
        List<WebElement> webElement = getDriver().findElements(By.xpath("//div/div[3]/div/table/tbody/tr"));

        for (int nList = 1; nList <= webElement.size(); nList++) {

            List<WebElement> webDriverElements = getDriver()
                    .findElements(By.xpath("//div/div[3]/div/table/tbody/tr[" + Integer.toString(nList) + "]"));

            for (WebElement element1 : webDriverElements) {

                Thread.sleep(1000);

                WebElement element = getDriver()
                        .findElement(By.xpath("//div[3]/div/table/tbody/tr[" + Integer.toString(nList) + "]/td[4]/span"));
                element.click();

                Thread.sleep(1000);

                element1 = getDriver()
                        .findElement(By.xpath("//div/div[3]/div/table/tbody/tr[" + Integer.toString(nList) + "]/td[2]/input"));
                element1.click();
                element1.clear();
                element1.sendKeys(nameElement.get(nList - 1));

                Thread.sleep(5000);

                getDriver()
                        .findElement(By
                                .xpath("//div[3]/div/table/tbody/tr[" + Integer.toString(nList) + "]/td[4]/span"))
                        .click();
                spamAlertYellow();

                getDriver()
                        .findElement(By
                                .xpath("//div/div[3]/div/table/tbody/tr[" + Integer.toString(nList) + "]/td[5]/div[1]/span"))
                        .click();

                Thread.sleep(5000);
                getDriver()
                        .findElement(By
                                .xpath("//div/div[3]/div/table/tbody/tr[" + Integer.toString(nList) + "]/td[5]/div[2]/span"))
                        .click();
//                spamAlertBlue();

            }
        }
    }

    private static void tableChargexCompetence(List<String>nameElement, List<String>nameElement1){
        Select select = new Select(getDriver().findElement(By.cssSelector(" div > div:nth-child(8) > div > div:nth-child(1) > select")));
        Select select1 = new Select(getDriver().findElement(By.cssSelector(" div > div:nth-child(3) > select")));

        List<WebElement> receivesElement = select.getOptions();
        List<WebElement> webElementList = select1.getOptions();

        for (int varchar = 1; varchar < receivesElement.size(); varchar++) {
            select.selectByVisibleText(nameElement.get(varchar - 1));

            checkIfThisItemVisibleClick(By.xpath("//div[5]/div/div[1]/select/option[" + Integer.toString(varchar) + "]"));

            checkIfThisItemVisibleClick(By.cssSelector(" div > div:nth-child(3) > select"));

            for (int varElement = 1; varElement < webElementList.size(); varElement++) {
                select1.selectByVisibleText(nameElement1.get(varElement - 1));


                checkIfThisItemVisibleClick(By.xpath("//div[5]/div/div[3]/select/option[" + Integer.toString(3) + "]"));

                WebElement elementAtextInput = getDriver().findElement(By.id("atext-input"));
                elementAtextInput.sendKeys(varElement == 1 ? "222" : varElement == 2 ? "333" : "444");

                checkIfThisItemVisibleClick(By.xpath("//div[5]/div/div[6]/a"));
                elementAtextInput.clear();
            }
        }
    }

    private static void tableChargexCharge(List<String>nameElement){

        Select select = new Select(getDriver().findElement(By.cssSelector("div > div:nth-child(12) > div > div:nth-child(1) > select")));
        Select select1 = new Select(getDriver().findElement(By.cssSelector("div > div:nth-child(12) > div > div:nth-child(3) > select")));


        List<WebElement> receivesElement = select.getOptions();
        List<WebElement> webElementList = select1.getOptions();

        for (int varchar = 1; varchar < receivesElement.size(); varchar++) {

            select.selectByVisibleText(nameElement.get(varchar - 1));
            checkIfThisItemVisibleClick(By.xpath("//div[8]/div/div[1]/select/option[" + Integer.toString(varchar) + "]"));

            checkIfThisItemVisibleClick(By.cssSelector(" div > div:nth-child(12) > div > div:nth-child(3) > select"));

            for (int varcharElement = 1; varcharElement < webElementList.size(); varcharElement++) {
                select1.selectByVisibleText(nameElement.get(varcharElement - 1));

                checkIfThisItemVisibleClick(By.xpath("//div[8]/div/div[3]/select/option[" + Integer.toString(varcharElement) + "]"));

                WebElement elementAtextInput = getDriver().findElement(By.id("text-input"));

                elementAtextInput.sendKeys(varcharElement == 1 ? "222" : varcharElement == 2 ? "333" : "444");

                checkIfThisItemVisibleClick(By.xpath("//div[8]/div/div[6]/a"));

                elementAtextInput.clear();
            }
        }
    }
}
