package com.example.jogoemjava.Cenas;

import com.example.jogoemjava.Entidade.AtrsMSG;

import javax.swing.*;

public class Tuto {
    public static void Tutorial(){
        int refazertutorial = 1;
        while (refazertutorial == 1){
        System.out.println("Este jogo utiliza de um sistema RPG baseado em turnos, onde o jogador tera que escolher entre 3 acoes: \n");
        AtrsMSG.AtrasarMSGquatro();
        System.out.println("""
                1 - Atacar. Cada classe tera um ataque padrao e unico para a mesma onde tera suas especificacoes.
                Cada ataque baseado em magia utiliza uma porcentagem de mana.
                
                """);
        AtrsMSG.AtrasarMSGquatro();
        System.out.println("""
                2 - Defender. Cada classe tera uma porcentagem de defesa, porem magos podem utilizar magias como invocar paredes de gelo
                Enquanto paladinos usam seu escudo. Cada habilidade baseada em magia utiliza uma porcentagem de mana.
                
                """);
        AtrsMSG.AtrasarMSGquatro();
        System.out.println("""
                3 - Buff. Cada classe tera uma habilidade especial com custo especifico de mana.
                A rodada de buff eh contabilizada como rodada, ou seja, o jogador ainda pode escolher atacar ou defender apos sofrer um buff.
                
                """);
        AtrsMSG.AtrasarMSGdois();
        System.out.println("Agora vamos fazer um exemplo de luta. Sua classe sera a de paladino e irá lutar contra um esqueleto simples. \n");
            AtrsMSG.AtrasarMSGdois();
            CombateTutorial.Treino();
            AtrsMSG.AtrasarMSGdois();


            int resposta = JOptionPane.showConfirmDialog(null, "Você quer refazer o tutorial?", "Tutorial", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                refazertutorial = 1;
            } else {
                refazertutorial = 2;

            }
        AtrsMSG.AtrasarMSGquatro();
        }
    }
}

