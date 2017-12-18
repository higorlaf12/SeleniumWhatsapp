package com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium.VariablesStrings;

import java.util.Random;

public class VariablesStrings {

    public static String EMAIL_LOGIN = "higor.freitas@neppoadm.com.br";
    public static String PASSWORD_LOGIN = "1234567890";
    public static String EMAIL_LOGIN_ERROR = "higorrr.frrreitas@neppoadm.com.br";
    public static String PASSWORD_LOGIN_ERROR = "1556684585";
    public static String EDIT_NAME = "Higor Freitas";
    public static String EDIT_EMAIL = "higorlafe@xxxx.com.br";
    public static String EDIT_CPF = "15478963201";
    public static String PASSWRD_NEW = "11111144455566";
    public static String FRONT_END = "FrontEnd";
    public static String COMPETENCE = "Comunicação";
    public static String DEPARTMENT = "Desenvolvimento BE";
    public static String USER_NAME = "Higor Lucas";
    public static String QUESTION = "Analizando é testando com o " + generateName();


    private static String generateName() {

        String[] Beginning = {"Kr", "Ca", "Ra", "Mrok", "Cru",
                "Ray", "Bre", "Zed", "Drak", "Mor", "Jag", "Mer", "Jar", "Mjol",
                "Zork", "Mad", "Cry", "Zur", "Creo", "Azak", "Azur", "Rei", "Cro",
                "Mar", "Luk"};
        String[] Middle = {"air", "ir", "mi", "sor", "mee", "clo",
                "red", "cra", "ark", "arc", "miri", "lori", "cres", "mur", "zer",
                "marac", "zoir", "slamar", "salmar", "urak"};
        String[] End = {"d", "ed", "ark", "arc", "es", "er", "der",
                "tron", "med", "ure", "zur", "cred", "mur"};

        Random rand = new Random();

        return Beginning[rand.nextInt(Beginning.length)] +
                Middle[rand.nextInt(Middle.length)] +
                End[rand.nextInt(End.length)];
    }
}
