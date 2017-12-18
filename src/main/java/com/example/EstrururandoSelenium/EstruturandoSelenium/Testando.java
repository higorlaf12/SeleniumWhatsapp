package com.example.EstrururandoSelenium.EstruturandoSelenium;

import java.util.Scanner;

import static com.example.EstrururandoSelenium.EstruturandoSelenium.test.setA;

public class Testando {
    public static void main(String[] args) {

        int x = 5;

        boolean z = false, u = true;
        int  y;
        while (z != true){
         y = 10 + x;
            x = y;
            z = u;
        }
        System.out.println(x);
    }
}
