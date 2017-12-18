package com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium;

import com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.MoveMouse.MoveMouse;
import com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium.ExtendPageAdm.ExtendPageAdm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PageReport extends PageBase {

    public PageReport(WebDriver driver) {
        super(driver);
    }

    public PageReport clickReport() throws Exception {
        mouveMouseReport();
        verifytElements();
        return new PageReport(getDriver());
    }

    private void mouveMouseReport() throws Exception {
        MoveMouse mouse = new MoveMouse(getDriver());
        mouse.moveMouseMenu(By.xpath("//div/nav/div/ul[1]/li[2]/a"));
        mouse.moveMouseClick(By.xpath("//*[@id='Menu']/li[2]/a"));
    }
    private void moveMouseExit() throws Exception{
        MoveMouse mouse = new MoveMouse(getDriver());
        mouse.moveMouseMenu(By.xpath("//nav/div/ul[1]/li[3]/a/i"));
        mouse.moveMouseClick(By.xpath("//*[@id='Perfil']/li[2]/a"));
    }

    private void verifytElements() throws Exception {
        assertEquals("Relatorio e Acompanhamento", getDriver()
                .findElement(By.xpath("//div/div/div/div/div/div/h5")).getText());

                if (getDriver().findElements(By.xpath("//div/div/div/div/div[2]")).size() != 0) {

            List<WebElement> elementsOfListTable = getDriver().findElements(By.xpath("//div/div/div/div/table"));

            if (elementsOfListTable.size() > 0) {

                List<WebElement> elements = getDriver().findElements(By.xpath("//div/div/table/tbody/tr"));

                int x = 1;
                while (x <= elements.size()) {
                    getDriver().findElement(By.xpath("//div/table/tbody/tr[" + x + "]/td[3]/a")).click();

                    Thread.sleep(1000);

                    PageSearch pageSearch = new PageSearch(getDriver());
                    pageSearch.UsingTest();

                    mouveMouseReport();
                    x++;
                }
            }
        }else {
                    moveMouseExit();
                }
    }
}
