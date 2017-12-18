//package com.example.EstrururandoSelenium.EstruturandoSelenium;
//
//public class Report {
//
//    package com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium;
//
//import com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.MoveMouse.MoveMouse;
//import com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium.FindElement.FindElement;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//    public class PageAdministration extends PageBase {
//
//        public PageAdministration(WebDriver driver) {
//            super(driver);
//        }
//
//        public PageAdministration allMethod(String chargesname, String competencename,String departmentname) throws Exception {
//            admCharges(chargesname);
//            admCompetence(competencename);
//            admDepartment(departmentname);
//            return new PageAdministration(getDriver());
//        }
//        private void classFindVisibleClick(By element){
//            FindElement findElement = new FindElement(getDriver());
//            findElement.checkIfThisItemVisibleClick(element);
//        }
//        private void classFindVisibleClickSendKey(By element, String sendKey){
//            FindElement findElement = new FindElement(getDriver());
//            findElement.checkIfThisItemVisibleClickSendkey(element,sendKey);
//        }
//        private void classFindPresentElement(By element){
//            FindElement findElement = new FindElement(getDriver());
//            findElement.checkIfThisItemIsPresentHowClick(element);
//        }
//
//
//
//
//
//        private void admPage() throws Exception {
//            MoveMouse mouse = new MoveMouse(getDriver());
//            mouse.moveMouseMenu(By.xpath("//div/nav/div/ul[1]/li[2]/a"));
//            mouse.moveMouseClick(By.xpath("//*[@id='Menu']/li[4]/a"));
//        }
//
//        private void admCharges(String chargesname) throws Exception {
//            admPage();
////        verifyElement().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div/div/div/div[2]/div[1]/a")));
////        getDriver().findElement(By.xpath("//div/div/div/div[2]/div[1]/a")).click();
//
//            classFindPresentElement(By.xpath("//div/div/div/div[2]/div[1]/a"));
//
////        verifyElement().until(ExpectedConditions.visibilityOfElementLocated(By.id("text-input")));
////        getDriver().findElement(By.id("text-input")).click();
////        getDriver().findElement(By.id("text-input")).sendKeys(chargesname);
//
//            classFindVisibleClickSendKey(By.id("text-input"),chargesname);
//
////        verifyElement().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/form/div/div[2]/button")));
////        getDriver().findElement(By.xpath("//div/form/div/div[2]/button")).click();
//
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
//            verifyElement().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div/div/div/div[2]/div[2]/a")));
//            getDriver().findElement(By.xpath("//div/div/div/div[2]/div[2]/a")).click();
//
//            getDriver().findElement(By.id("text-input")).click();
//            getDriver().findElement(By.id("text-input")).sendKeys(competence);
//
//            verifyElement().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div/form/div[2]/button")));
//            getDriver().findElement(By.xpath("//div/form/div[2]/button")).click();
//
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
//            verifyElement().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='#/hreports/administration/department']")));
//            getDriver().findElement(By.xpath("//a[@href='#/hreports/administration/department']")).click();
//
//            getDriver().findElement(By.id("text-input")).click();
//            getDriver().findElement(By.id("text-input")).sendKeys(departmentname);
//
//            verifyElement().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div/form/div[2]/button")));
//            getDriver().findElement(By.xpath("//div/form/div[2]/button")).click();
//
//            tableLoop(generateNameList());
//
//
//        }
//
//        private void admTable() throws Exception{
//            admPage();
//        }
//
//
//
//
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
//        private static List<String> generateNameList(){
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
//
//        String[] Beginning = { "Kr", "Ca", "Ra", "Mrok", "Cru",
//        "Ray", "Bre", "Zed", "Drak", "Mor", "Jag", "Mer", "Jar", "Mjol",
//        "Zork", "Mad", "Cry", "Zur", "Creo", "Azak", "Azur", "Rei", "Cro",
//        "Mar", "Luk" };
//        String[] Middle = { "air", "ir", "mi", "sor", "mee", "clo",
//        "red", "cra", "ark", "arc", "miri", "lori", "cres", "mur", "zer",
//        "marac", "zoir", "slamar", "salmar", "urak" };
//        String[] End = { "d", "ed", "ark", "arc", "es", "er", "der",
//        "tron", "med", "ure", "zur", "cred", "mur" };
//
//        Random rand = new Random();
//
//        return Beginning[rand.nextInt(Beginning.length)] +
//        Middle[rand.nextInt(Middle.length)]+
//        End[rand.nextInt(End.length)];
//
//            String name[] = {"Desenvolvimento FE","Gerencia","Desenvolvimento BE"};
//            Random  rand = new Random();
//
//            return name[rand.nextInt(name.length)];

//
//        }
//    }
//
//
//}
