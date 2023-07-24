package com.example.jogoemjava.Entidade;

public class AtrsMSG {
    public static void AtrasarMSGquatro(){
        try {
            Thread.sleep(4000); // Atraso de 4 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void AtrasarMSGdois(){
        try {
            Thread.sleep(2000); // Atraso de 4 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

