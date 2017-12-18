package com.example.EstrururandoSelenium.EstruturandoSelenium.AlgarCRM;

import com.example.EstrururandoSelenium.EstruturandoSelenium.AlgarCRM.PageAlgar.PageAlgar;
import com.example.EstrururandoSelenium.EstruturandoSelenium.AlgarCRM.PageAlgar.PageLoginAlgar;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class AlgarTest {

    private static PageAlgar pageAlgar = new PageAlgar();
    private static PageLoginAlgar pageLoginAlgar;

    private void accessUrl(){
        pageAlgar.navegateTo("https://algarcrmhom.network.ctbc/crm/#/");
    }

    @Before
    public void init(){
        accessUrl();
    }

    @AfterClass
    public static void finishingProject(){
        pageAlgar.closeNavegator();
    }

    @Test
    public void TestandoESSE(){
        userPageLoginAlgar();
    }

    private void userPageLoginAlgar(){
        pageLoginAlgar = new PageLoginAlgar(PageAlgar.getDriver());
        pageLoginAlgar.loginPage("consult_vendas_1","ctbc2014@");
    }
}
