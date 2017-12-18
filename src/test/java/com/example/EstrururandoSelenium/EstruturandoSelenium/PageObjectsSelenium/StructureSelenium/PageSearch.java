package com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium;

import com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.MoveMouse.MoveMouse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium.FindElement.FindElement.checkIfThisItemIsPresentHowClick;
import static com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium.FindElement.FindElement.checkIfThisItemVisibleClickSendkey;

public class PageSearch extends PageBase{

    public PageSearch(WebDriver driver){
        super(driver);
    }

    public PageSearch searchInProgress(String namesearch)throws Exception{
        search(namesearch);
        searchTable();
        return new PageSearch(getDriver());
    }
    private void pageSearch() throws Exception{
        MoveMouse mouse = new MoveMouse(getDriver());
        mouse.moveMouseMenu(By.xpath("//div/nav/div/ul[1]/li[2]/a"));
        mouse.moveMouseClick(By.xpath("//*[@id='Menu']/li[1]/a"));
    }
    private void search(String namesearch) throws Exception{
        pageSearch();

        checkIfThisItemVisibleClickSendkey(By.id("search"),namesearch);
        Thread.sleep(1000);

        checkIfThisItemIsPresentHowClick(By.xpath("//div[3]/div[2]/div/div[2]/a[1]"));
        Thread.sleep(1000);

        checkIfThisItemIsPresentHowClick(By.cssSelector(" div > div:nth-child(4) > div.offset-l1.offset-m1.col.s12.m3.l3 > select"));
        Thread.sleep(1000);

        new Select(getDriver().findElement(By.cssSelector(
                "div > div:nth-child(4) > div.offset-l1.offset-m1.col.s12.m3.l3 > select")))
                .selectByVisibleText("Andrey 1");
        checkIfThisItemIsPresentHowClick(By.xpath("//div[3]/div[3]/div/div[2]/div[1]/select/option[2]"));
        Thread.sleep(1000);

        checkIfThisItemIsPresentHowClick(By.cssSelector("div > div:nth-child(4) > div:nth-child(2) > select"));
        new Select(getDriver().findElement(By.cssSelector(
                " div > div:nth-child(4) > div:nth-child(2) > select"))).selectByVisibleText("Andrey 2");
        checkIfThisItemIsPresentHowClick(By.xpath("//div[3]/div[3]/div/div[2]/div[2]/select/option[3]"));
        Thread.sleep(1000);

        new Select(getDriver().findElement(By.xpath("//div[3]/select"))).selectByVisibleText("Aberta");
        getDriver().findElement(By.cssSelector("option[value=\"true\"]")).click();

        getDriver().findElement(By.xpath("//input[@type='date']")).sendKeys("10/04/2018");
        getDriver().findElement(By.xpath("(//input[@type='date'])[2]")).sendKeys("10/08/2018");

        checkIfThisItemIsPresentHowClick(By.xpath("//div[3]/div[2]/div/div[2]/a[2]"));

    }

    void searchTable() throws Exception{
        List<WebElement> elements = getDriver().findElements(By.xpath("//div[4]/div/div/table/tbody/tr"));

        for (int var = 1; var <= elements.size();var++){
          List<WebElement> elementList = getDriver().findElements(By.xpath
                  ("//div[4]/div/div/table/tbody/tr[" +
                          var + "]"));

          for (WebElement allElementList : elementList){
              allElementList = getDriver().findElement(By.xpath
                      ("//div[4]/div/div/table/tbody/tr[" +
                              var + "]"));
              allElementList.click();
              UsingTest();
            }
            pageSearch();
        }

    }
    void UsingTest() throws Exception{

        getDriver().findElement((By.xpath("//div[@id='individual']/div/div/select"))).click();

        Select select = new Select(getDriver().findElement(By.xpath("//*[@id='individual']/div/div/select")));
        select.getAllSelectedOptions();


        List<WebElement> element = select.getOptions();

        for(int varchar = 1; varchar <= element.size(); varchar++){
            List<WebElement> allElement = getDriver().findElements(By.xpath("//div[@id='individual']/div/div/select"));

            for (WebElement allElements : allElement){
                allElements = getDriver().findElement(By.xpath("//*[@id=\"individual\"]/div[1]/div[1]/select/option[" +
                        Integer.toString(varchar) + "]"));
                allElements.click();

                getDriver().findElement(By.xpath("//a[@href= '#resumido']")).click();

                for (int i = 0;i < 2;i++){
                    getDriver().findElement(By.xpath("//*[@id=\"Corpo-Impressao2\"]/div[6]/div/div[1]/div[2]/a/i")).click();
                    getDriver().findElement(By.xpath("//*[@id=\"Corpo-Impressao2\"]/div[8]/div/div[1]/div[2]/a/i")).click();
                    getDriver().findElement(By.xpath("//*[@id=\"Corpo-Impressao2\"]/div[10]/div/div[2]/div[2]/a/i")).click();
                    getDriver().findElement(By.xpath("//*[@id=\"Corpo-Impressao2\"]/div[10]/div/div[4]/div[2]/a")).click();

                }
                getDriver().findElement(By.xpath("//a[@href= '#individual']")).click();
            }

        }
    }

}
