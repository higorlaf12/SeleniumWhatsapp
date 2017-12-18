package com.example.EstrururandoSelenium.EstruturandoSelenium.Whatsapp;

import com.example.EstrururandoSelenium.EstruturandoSelenium.Whatsapp.Structure.WhatsappBase;
import com.example.EstrururandoSelenium.EstruturandoSelenium.Whatsapp.Structure.WhatsappVerify;
import org.junit.*;

public class WhatsappTest {

    private static WhatsappBase whatsappBase = new WhatsappBase();

    @BeforeClass
    public static void init(){accessUrl();}

    @AfterClass
    public static void closeNavegator(){whatsappBase.closeNavegator();}


    @Test
    public void whatsappPageTest() throws Exception{
//        Thread.sleep(1000);
        primeiroTest();
    }
    @Test
    public void whatsappPageTest2() throws Exception{
//       Thread.sleep(8000);
        segundoTest();
        }


    private static void accessUrl(){
        whatsappBase.navegateTO("https://web.whatsapp.com/");
    }


    private void primeiroTest()throws Exception{
        WhatsappVerify whatsappVerify = new WhatsappVerify(WhatsappBase.getDriver());

        whatsappVerify.verifyElementScreen();
    }

    private void segundoTest()throws Exception{

        WhatsappVerify whatsappVerify = new WhatsappVerify(WhatsappBase.getDriver());

        whatsappVerify.verifyElementWhapp();
    }
}
