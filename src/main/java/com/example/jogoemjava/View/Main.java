package com.example.jogoemjava.View;

import com.example.jogoemjava.Cenas.EscolhaClasse;
import com.example.jogoemjava.Cenas.Tuto;
import com.example.jogoemjava.Entidade.AtrsMSG;

import javax.swing.*;

import static com.example.jogoemjava.Cenas.EscolhaClasse.escolherClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                ######     ######   ##    ##              ##       ##   ##   ##   ##   ######       ####      ##
                ##    ##   ##       ###  ###               ##     ##         ###  ##   ##    ##   ##    ##    ##
                ##    ##   ##       ## ## ##                ##   ##     ##   ## # ##   ##    ##   ##    ##    ##
                ######     ######   ##    ##   ########      ## ##      ##   ##  ###   ##    ##   ##    ##    ##
                ##    ##   ##       ##    ##                  ###       ##   ##   ##   ##    ##   ##    ##    ##
                ##    ##   ##       ##    ##                   #        ##   ##   ##   ##    ##   ##    ##     
                ######	   ######   ##	  ##                   #        ##   ##   ##   ######       ####      ##     
                """);
        AtrsMSG.AtrasarMSGdois();
        int resposta = JOptionPane.showConfirmDialog(null, "Você deseja fazer o tutorial?", "Tutorial", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            Tuto.Tutorial();
        } else {
            escolherClass();
        }

        int classeEscolhida = escolherClass();
        int resp = JOptionPane.showConfirmDialog(null, "Tem certeza de sua escolha?", "Confirmar escolha classe", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            System.out.println("Classe escolhida: " + classeEscolhida);
        } else {
            escolherClass();
        }

    }
}
