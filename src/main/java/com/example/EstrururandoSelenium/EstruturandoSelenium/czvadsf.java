//package com.example.EstrururandoSelenium.EstruturandoSelenium;
//
//public class czvadsf {
//
//    package com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium.PageAdministration;
//
//import com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.MoveMouse.MoveMouse;
//import com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium.FindElement.FindElement;
//import com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium.PageBase;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//import static org.junit.Assert.assertEquals;
//
//    public class PageAdministration extends PageBase {
//
//        public PageAdministration(WebDriver driver) {
//            super(driver);
//        }
//
//        private static List<String> generateNameList() {
//            List<String> names = new ArrayList<>();
//            names.add(generateName());
//            names.add(generateName());
//            names.add(generateName());
//
//            return names;
//
//        }
//
//        private static String generateName() {
//            String name[] = {"Desenvolvimento FE", "Gerencia", "Desenvolvimento BE"};
//            Random rand = new Random();
//
//            return name[rand.nextInt(name.length)];
//
//        }
//
//        public PageAdministration allMethod(String chargesname, String competencename, String departmentname,String user) throws Exception {
//            admCharges(chargesname);
//            admCompetence(competencename);
//            admDepartment(departmentname);
//            admTable();
//            admUser(user);
//            return new PageAdministration(getDriver());
//        }
//
//
//        private void classFindVisibleClick(By element) {
//            FindElement findElement = new FindElement(getDriver());
//            findElement.checkIfThisItemVisibleClick(element);
//        }
//
//        private void classFindVisibleClickSendKey(By element, String sendKey) {
//            FindElement findElement = new FindElement(getDriver());
//            findElement.checkIfThisItemVisibleClickSendkey(element, sendKey);
//        }
//
//        private void classFindPresentElementClick(By element) {
//            FindElement findElement = new FindElement(getDriver());
//            findElement.checkIfThisItemIsPresentHowClick(element);
//        }
//
//        private void admPage() throws Exception {
//            MoveMouse mouse = new MoveMouse(getDriver());
//            mouse.moveMouseMenu(By.xpath("//div/nav/div/ul[1]/li[2]/a"));
//            mouse.moveMouseClick(By.xpath("//*[@id='Menu']/li[4]/a"));
//        }
//
//        private void admCharges(String chargesname) throws Exception {
//            admPage();
//
//            classFindPresentElementClick(By.xpath("//div/div/div/div[2]/div[1]/a"));
//            classFindVisibleClickSendKey(By.id("text-input"), chargesname);
//            classFindVisibleClick(By.xpath("//div/form/div/div[2]/button"));
//
//            List<String> nameElement = new ArrayList<>();
//            nameElement.add("FrontEnd");
//            nameElement.add("BackEnd");
//            nameElement.add("Diretor");
//
//            tableLoop(nameElement);
//            admPage();
//        }
//
//        private void admCompetence(String competence) throws Exception {
//
//            admPage();
//
//            classFindPresentElementClick(By.xpath("//div/div/div/div[2]/div[2]/a"));
//
//            getDriver().findElement(By.id("text-input")).click();
//            getDriver().findElement(By.id("text-input")).sendKeys(competence);
//
//            classFindPresentElementClick(By.xpath("//div/form/div[2]/button"));
//
//            List<String> nameElement = new ArrayList<>();
//            nameElement.add("Comunicação");
//            nameElement.add("Pontualidade");
//            nameElement.add("Liderança");
//
//            tableLoop(nameElement);
//
//            Thread.sleep(1000);
//
//        }
//
//        private void admDepartment(String departmentname) throws Exception {
//
//            admPage();
//
//            classFindPresentElementClick(By.xpath("//a[@href='#/hreports/administration/department']"));
//
//            getDriver().findElement(By.id("text-input")).click();
//            getDriver().findElement(By.id("text-input")).sendKeys(departmentname);
//
//            classFindPresentElementClick(By.xpath("//div/form/div[2]/button"));
//
//            tableLoop(generateNameList());
//
//            Thread.sleep(1000);
//
//        }
//
//        private void tableLoop(List<String> nameElement) throws Exception {
//            List<WebElement> webElement = getDriver().findElements(By.xpath("//div/div[3]/div/table/tbody/tr"));
//
//            for (int nList = 1; nList <= webElement.size(); nList++) {
//
//                List<WebElement> webDriverElements = getDriver()
//                        .findElements(By.xpath("//div/div[3]/div/table/tbody/tr[" + Integer.toString(nList) + "]"));
//
//                for (WebElement element1 : webDriverElements) {
//
//                    Thread.sleep(1000);
//
//                    WebElement element = getDriver()
//                            .findElement(By.xpath("//div[3]/div/table/tbody/tr[" + Integer.toString(nList) + "]/td[4]/span"));
//                    element.click();
//
//                    Thread.sleep(1000);
//
//                    element1 = getDriver()
//                            .findElement(By.xpath("//div/div[3]/div/table/tbody/tr[" + Integer.toString(nList) + "]/td[2]/input"));
//                    element1.click();
//                    element1.clear();
//                    element1.sendKeys(nameElement.get(nList - 1));
//
//                    Thread.sleep(1000);
//
//                    getDriver()
//                            .findElement(By
//                                    .xpath("//div[3]/div/table/tbody/tr[" + Integer.toString(nList) + "]/td[4]/span"))
//                            .click();
//
//                    getDriver()
//                            .findElement(By
//                                    .xpath("//div/div[3]/div/table/tbody/tr[" + Integer.toString(nList) + "]/td[5]/div[1]/span"))
//                            .click();
//                    getDriver()
//                            .findElement(By
//                                    .xpath("//div/div[3]/div/table/tbody/tr[" + Integer.toString(nList) + "]/td[5]/div[2]/span"))
//                            .click();
//                }
//            }
//        }
//        private void admTable() throws Exception {
//            admPage();
//            admChargenXCompetence();
//            admTableChargeXCharge();
//        }
//
//        private void admChargenXCompetence() throws Exception {
//
//            classFindPresentElementClick(By.xpath("//a[@href='#/hreports/administration/table']"));
//
//            classFindVisibleClick(By.cssSelector(" div > div:nth-child(8) > div > div:nth-child(1) > select"));
//
//            Select select = new Select(getDriver().findElement(By.cssSelector(" div > div:nth-child(8) > div > div:nth-child(1) > select")));
//            Select select1 = new Select(getDriver().findElement(By.cssSelector(" div > div:nth-child(3) > select")));
//
//            List<WebElement> receivesElement = select.getOptions();
//            List<WebElement> webElementList = select1.getOptions();
//
//            List<String> nameElement = new ArrayList<>();
//            nameElement.add("FrontEnd");
//            nameElement.add("BackEnd");
//            nameElement.add("Diretor");
//
//            List<String> nameElement1 = new ArrayList<>();
//            nameElement1.add("Comunicação");
//            nameElement1.add("Pontualidade");
//            nameElement1.add("Liderança");
//
//            for (int varchar = 1; varchar < receivesElement.size(); varchar++) {
//                select.selectByVisibleText(nameElement.get(varchar - 1));
//
//                classFindVisibleClick(By.xpath("//div[5]/div/div[1]/select/option[" + Integer.toString(varchar) + "]"));
//
//                classFindVisibleClick(By.cssSelector(" div > div:nth-child(3) > select"));
//
//                for (int varElement = 1; varElement < webElementList.size(); varElement++) {
//                    select1.selectByVisibleText(nameElement1.get(varElement - 1));
//
//
//                    classFindVisibleClick(By.xpath("//div[5]/div/div[3]/select/option[" + Integer.toString(3) + "]"));
//
//                    WebElement elementAtextInput = getDriver().findElement(By.id("atext-input"));
//                    elementAtextInput.sendKeys(varElement == 1 ? "222" : varElement == 2 ? "333" : "444");
//
//                    classFindVisibleClick(By.xpath("//div[5]/div/div[6]/a"));
//                    elementAtextInput.clear();
//                }
//            }
//            Thread.sleep(1000);
//        }
//
//        private void admTableChargeXCharge() {
//            classFindVisibleClick(By.cssSelector("  div > div:nth-child(12) > div > div:nth-child(1) > select"));
//
//            Select select = new Select(getDriver().findElement(By.cssSelector("div > div:nth-child(12) > div > div:nth-child(1) > select")));
//            Select select1 = new Select(getDriver().findElement(By.cssSelector("div > div:nth-child(12) > div > div:nth-child(3) > select")));
//
//            List<WebElement> receivesElement = select.getOptions();
//            List<WebElement> webElementList = select1.getOptions();
//
//            List<String> nameElement = new ArrayList<>();
//            nameElement.add("FrontEnd");
//            nameElement.add("BackEnd");
//            nameElement.add("Diretor");
//
//
//            for (int varchar = 1; varchar < receivesElement.size(); varchar++) {
//
//                select.selectByVisibleText(nameElement.get(varchar - 1));
//                classFindVisibleClick(By.xpath("//div[8]/div/div[1]/select/option[" + Integer.toString(varchar) + "]"));
//
//                classFindVisibleClick(By.cssSelector(" div > div:nth-child(12) > div > div:nth-child(3) > select"));
//
//                for (int varcharElement = 1; varcharElement < webElementList.size(); varcharElement++) {
//                    select1.selectByVisibleText(nameElement.get(varcharElement - 1));
//
//                    classFindVisibleClick(By.xpath("//div[8]/div/div[3]/select/option[" + Integer.toString(varcharElement) + "]"));
//
//                    WebElement elementAtextInput = getDriver().findElement(By.id("text-input"));
//
//                    elementAtextInput.sendKeys(varcharElement == 1 ? "222" : varcharElement == 2 ? "333" : "444");
//
//                    classFindVisibleClick(By.xpath("//div[8]/div/div[6]/a"));
//
//                    elementAtextInput.clear();
//                }
//            }
//
//        }
//
//        private void admUser(String sendKey) throws Exception {
//            admPage();
//            admUserRegister(sendKey);
//            admUserRegisterNewUser();
//        }
//        private void admUserRegister(String sendKey) throws Exception{
//            classFindVisibleClick(By.xpath("//a[@href='#/hreports/administration/users']"));
//            classFindVisibleClickSendKey(By.id("m-l-search"),sendKey);
//            classFindVisibleClick(By.xpath("//div[1]/div[3]/div[2]/a"));
//            List<WebElement> allElement = getDriver().findElements(By.xpath("//div[3]/div/table/tbody/tr"));
//
//            for (int valueUser = 1; valueUser < allElement.size(); valueUser++) {
//
//                List<WebElement> webElementList = getDriver().findElements(By.xpath("//div[3]/div/table/tbody/tr[" + Integer.toString(valueUser) + "]"));
//
//                for (WebElement webelement : webElementList) {
//
//                    webelement = getDriver().findElement(By.xpath("//div/table/tbody/tr[" + Integer.toString(valueUser) + "]/td[6]/span"));
//                    webelement.click();
//                }
//
//            }
//        }
//        private void admUserRegisterNewUser() throws Exception{
//            classFindVisibleClick(By.xpath("//div[3]/div[3]/a"));
//            assertEquals("Cadastro de Usuários", getDriver().findElement(By.xpath("//div/form/div[1]/h5")).getText());
//
//            classFindVisibleClickSendKey(By.id("icon_prefix"));
//        }
//
//    }
//}

//VOLTAR PARA A CLASSE E REVISAR O CODIGO POIS PODE ESTAR ERRADO.
