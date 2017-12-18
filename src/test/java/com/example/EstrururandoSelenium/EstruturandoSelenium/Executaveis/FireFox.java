package com.example.EstrururandoSelenium.EstruturandoSelenium.Executaveis;

public class FireFox {

    private static String MAP_LOGIN = "webdriver.gecko.driver";
    private static String MAP_lOCAL= "/home/higorlucas/WhatsappTest/firefoxDriver/geckodriver";
    public static final String executFireFox(){ return System.setProperty(MAP_LOGIN,MAP_lOCAL); }
}
