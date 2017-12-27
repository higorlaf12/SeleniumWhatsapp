package com.example.EstrururandoSelenium.EstruturandoSelenium.Whatsapp;

import com.example.EstrururandoSelenium.EstruturandoSelenium.Whatsapp.Structure.WhatsappBase;
import com.example.EstrururandoSelenium.EstruturandoSelenium.Whatsapp.Structure.WhatsappVerify;
import org.junit.BeforeClass;
import org.junit.Test;

public class WhatsappTest {

    private static WhatsappBase whatsappBase = new WhatsappBase();
    private static WhatsappVerify whatsappVerify = new WhatsappVerify(WhatsappBase.getDriver());


    @BeforeClass
    public static void init()  {
        accessUrl();

    }

//    @AfterClass
//    public static void closeNavegator(){whatsappBase.closeNavegator();}


    @Test
    public void whatsappPageTest() throws Exception{
        Thread.sleep(3000);
        primeiroTest();
    }
    @Test
    public void whatsappPageTest2() throws Exception{
//        Thread.sleep(8000);
        segundoTest();
    }
    @Test
    public void whatsappPageTest3() throws Exception{
       Thread.sleep(8000);
       terceiroTest();
    }

//    @Test
//    public void whatsappPageTest4() throws Exception{
//       Thread.sleep(8000);
//        quartoTest();
//    }



    private static void accessUrl(){
        whatsappBase.navegateTO("https://web.whatsapp.com/");
    }


    private void primeiroTest()throws Exception{
        whatsappVerify.verifyElementScreen();
    }

    private void segundoTest()throws Exception{

        whatsappVerify.verifyElementWhapp();
    }

    private void terceiroTest() throws Exception{
        whatsappVerify.insertDate();

    }

    private void quartoTest() throws Exception{
        whatsappVerify.imagenUploadWhapp();
    }

}
