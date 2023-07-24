package com.example.jogoemjava.Cenas;

import com.example.jogoemjava.Entidade.Mago;
import com.example.jogoemjava.Entidade.Paladino;

import javax.swing.*;

public class EscolhaClasse {
    //Mago = 1
    //Paladino = 2
    private int classeJogo;

    public EscolhaClasse(int classe){this.classeJogo = classe;}

    public int getClasse() {return classeJogo;}

    public void setClasse(int classe) {this.classeJogo = classe;}

    public static int escolherClass() {
        System.out.println("Escolha a classe que deseja jogar: ");

        Object[] options = {"Mago", "Paladino"};
        int resposta = JOptionPane.showOptionDialog(null, "Escolha sua classe", "Seleção de Classe", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (resposta == 0) {
            EscolhaClasse classeJogo = new EscolhaClasse(0);
            int classe = classeJogo.classeJogo;
            classeJogo.setClasse(1);
            Mago.magoINF();
            return classeJogo.getClasse();
        } else {
            EscolhaClasse classeJogo = new EscolhaClasse(0);
            classeJogo.setClasse(2);
            Paladino.PaladinoINF();
            return classeJogo.getClasse();
        }
    }

}