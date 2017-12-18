package com.example.EstrururandoSelenium.EstruturandoSelenium.AlgarCRM;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//Url: https://accounts.google.com/SignUp?hl=pt-BR
// Faça uma nova conta no gmail da google, onde preencha todos os campos
// coloque o  mês em Abril, sexo Masculino e o resto você é livre para colocar qualquer nome e número;
// Para capturar o elemento existe varios modulo como By.id,By.name,By.cssSelect,By.tagName entre outros, Use o que for melhor.
// Tente usar alguns WebDriverWait e explique para que ele serve, onde seria util usar ele.
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CriandoContaTest {

    static WebDriver driver;


    @BeforeClass
    public static void init() { // Explique cada Etapa do processo !
        System.setProperty("webdriver.chrome.driver", "C:/ArquivosProgramaJava/chromedriver_win32/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("disable-infobars");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

    }

    @AfterClass
    public static void finalizando() {








    }


    @Test
    public void nomeSobreNome() throws Exception {









    }

    @Test
    public void escolhaSeuUsuarioESenha() throws Exception {










    }

    @Test
    public void dataDeNascimento() throws Exception {








    }

    @Test
    public void escolhaSexo() throws Exception {









    }

    @Test
    public void finalCelularEmailAtualClique() throws Exception {









    }
}


//
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class CriandoContaTest {
//
//    static WebDriver driver;
//
//
//    //Resposta:
//    //System.setProperty vai pegar o drive e o arquivo onde esta o programa para abrir o chrome
//    //ChormeOPtions serve para pegar algumas opção do chrome e essa tag addArguments está servido para retirar o span que fala que o browser esta sendo executado por uma robo.
//    //drive = new ChromeDrive(chromeOptions) instancia esse objeto
//    //drive.mange().window().maximize() faz com que o browser maximize a tela.
//    @BeforeClass
//    public static void init() { // Explique cada Etapa do processo Init
//        System.setProperty("webdriver.chrome.driver", "C:/ArquivosProgramaJava/chromedriver_win32/chromedriver.exe");
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("disable-infobars");
//        driver = new ChromeDriver(chromeOptions);
//        driver.manage().window().maximize();
//
//        driver.get("https://accounts.google.com/SignUp?hl=pt-BR");
//    }
//    //Resoista:
//    //Ao acabar todos os testes ele finaliza e fecha o browser.
//    @AfterClass
//    public static void finalizando() {
//        driver.quit();
//    }
//
//    //Não irei pedir essa etapa.
//    public static void takeScreenshot(String fileName) {
//        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        Date data = new Date();
//        try {
//            FileUtils.copyFile(scrFile, new File("C:/ArquivosProgramaJava/EstruturandoSelenium/src/test/java/com/example/EstrururandoSelenium/EstruturandoSelenium/AlgarCRM/ScreenPrint" +
//                    fileName + data.getTime() + ".png"), true);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    //Resposta:
//    @Test
//    public void AnomeSobreNome() throws Exception {
//        WebDriverWait elementNome = new WebDriverWait(driver, 120);//Espera o elemento.
//        elementNome.until(ExpectedConditions.visibilityOfElementLocated(By.id("FirstName")));//Ele serve para quando o selenium entrar em alguma pagina ele não passar direto, ele espera ate o item ficar visivel.
//        //Aqui ele va inserir no campo by.id um nome qualquer
//        driver.findElement(By.id("FirstName")).sendKeys("QualquerNome");
//
//        //ELe ira inserir um sobre nome qualquer
//        WebElement elementSobreNome = driver.findElement(By.id("LastName"));
//        elementSobreNome.sendKeys("QualquerSobreNome");
//
//
//        takeScreenshot("PrimeiraEtapa");
//    }
//
//    @Test
//    public void BescolhaSeuUsuarioESenha() throws Exception {
//        WebElement elementSeuUsuario = driver.findElement(By.name("GmailAddress"));
//        elementSeuUsuario.sendKeys("QualquerEmaiaaaal@gmail.com.br");
//
//        WebElement elementSuaSenha = driver.findElement(By.cssSelector("[type=\"password\"]"));
//        elementSuaSenha.sendKeys("QualquerSenha123");
//
//        WebElement elementConfirmaSenha = driver.findElement(By.name("PasswdAgain"));
//        elementConfirmaSenha.sendKeys("QualquerSenha123");
//    }
//
//    @Test
//    public void CdataDeNascimento() throws Exception {
//        WebElement elementDia = driver.findElement(By.id("BirthDay"));
//        elementDia.sendKeys("06");
//
//        //Referente ao campo de mês de nasciometo, não teve outra alternativa a não ser o xpath, pois não apresentava nenhuma das opção de captura do selenium a não ser o xpath.
//        //Ira clicar no dropBox
//        driver.findElement(By.xpath("//*[@id='BirthMonth']/div[1]")).click();
//        //Ira selecionar o 4 elemento da Div  que é o mês abril
//        driver.findElement(By.xpath("//*[@id=':4']/div")).click();// O que você acha de usar o xpath, para que serve ?
//
//        WebElement elementAno = driver.findElement(By.id("BirthYear"));
//        elementAno.sendKeys("1997");//Tem que ser maior de 18 anos
//
//    }
//
//    @Test
//    public void EescolhaSexo() throws Exception {
//
//        //Outro dropBox mas esse e referente  ao tipo de sexo do indivíduo
//        //Ira clicar no dropBox sexo
//        driver.findElement(By.xpath("//*[@id='Gender']/div[1]")).click();// Porque não é uma boa pratica usar o Xpath ? E quando usar ele ?
//        //Ira selecionar o elemento f que é o Masculino na tabela desse dropBox
//        driver.findElement(By.xpath("//*[@id=':f']/div")).click();
//    }
//
//    @Test
//    public void FfinalCelularEmailAtualClique() throws Exception {
//
//        WebElement elementCelular = driver.findElement(By.id("RecoveryPhoneNumber"));
//        elementCelular.sendKeys("34988757489");
//
//        WebElement elementEmailAtual = driver.findElement(By.id("RecoveryEmailAddress"));
//        elementEmailAtual.sendKeys("neppoadm@neppoadm.com.br");
//
//        takeScreenshot("Finalizando");
//        WebElement elementCliqueProximaEtapa = driver.findElement(By.id("submitbutton"));
//        elementCliqueProximaEtapa.click();
//    }
//}
