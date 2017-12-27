package com.example.EstrururandoSelenium.EstruturandoSelenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Testando {
    public static void main(String[] args) {

//        int[] numeroSorteado = new int[61];
//
//        Random gerador = new Random();
//        int  x ;
//
//        for (int i = 0; i < 6; i++) {
//            x =  gerador.nextInt(61);
//            numeroSorteado[i] = 0;
//            numeroSorteado[x]++;
//        }
//
//        ArrayList<Integer> res = new ArrayList<>();
//
//        for (int i = 0; i < numeroSorteado.length ; i++){
//            if(numeroSorteado[i] > 0){
//                res.add(i);
//            }else{
//                x =  gerador.nextInt(61);
//                numeroSorteado[i] = 0;
//                numeroSorteado[x]++;
//            }
//        }
//        System.out.println(res);


            System.out.println(Arrays.toString(vetor()));


    }

    private static int[] vetor() {
        int[] v = new int[6];

        int valor = 0;
        for (int i = 0; i < v.length; i++) {

            while (exist(valor, v)) {
                valor = (int) (Math.random() * 60);
            }

            v[i] = valor;
        }
        return v;
    }

    private static boolean exist(int v, int[] coll) {
        for (int i : coll) {
            if (i == v) {
                return true;
            }
        }
        return false;
    }

    }

