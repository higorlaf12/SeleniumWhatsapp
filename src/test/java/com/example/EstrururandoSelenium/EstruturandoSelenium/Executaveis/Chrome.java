package com.example.EstrururandoSelenium.EstruturandoSelenium.Executaveis;

public class Chrome {

    private static final String MAP_LOGIN = "webdriver.chrome.driver";
    private static final String MAP_LOCAL = "/home/higorlucas/WhatsappTest/chromeDriver/chromedriver";
    public static final String executChrome(){ return System.setProperty(MAP_LOGIN,MAP_LOCAL); }

}
//testLink,TestComplit;