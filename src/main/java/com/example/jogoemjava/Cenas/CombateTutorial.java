package com.example.jogoemjava.Cenas;

import com.example.jogoemjava.Entidade.AtrsMSG;
import com.example.jogoemjava.Entidade.EsqueletoSimples;
import com.example.jogoemjava.Entidade.Paladino;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.image.ImageView;
import java.io.File;
import javafx.scene.image.Image;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class CombateTutorial implements Initializable {
    @FXML
    private ImageView ImageView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        File file = new File("src/main/resources/PaladinoVsEsqueleto.png");
        Image PaladVsEsquel = new Image(file.toURI().toString());
        ImageView.setImage(PaladVsEsquel);
    }
    public static void main(String[] args) {
        CombateTutorial.Treino();
    }
    public static void Treino(){
        int atualizarVidaEsqueleto = 0;
        int atualizarVidaPaladino = 0;
        Scanner sc = new Scanner (System.in);
        Paladino.PaladinoINF();
        AtrsMSG.AtrasarMSGquatro();
        EsqueletoSimples.EsqueletoSimplesINF();

        Paladino paladino = new Paladino(130, 15, 20, 30, 10);
        // Acessando os valores do paladino
        int vidaPaladino = paladino.getVida();
        int defesaPaladino = paladino.getDefesa();
        int defenderPaladino = paladino.getDefender();
        int ataquePaladino = paladino.getAtaque();
        int magiaPaladino = paladino.getMana();
        AtrsMSG.AtrasarMSGquatro();

        EsqueletoSimples esqueletoSimples = new EsqueletoSimples(50, 10, 10, 20, 0);
        //Acessando os valores do esqueleto
        int vidaEsqueletoSimples = esqueletoSimples.getVida();
        int defesaEsqueletoSimples = esqueletoSimples.getDefesa();
        int defenderEsqueletoSimples = esqueletoSimples.getDefender();
        int ataqueEsqueletoSimples = esqueletoSimples.getAtacar();
        int manaEsqueletoSimples = esqueletoSimples.getMana();



        while (paladino.getVida() > 0 && esqueletoSimples.getVida() > 0){
            System.out.println("Vez do jogador, qual ação deseja fazer? (1) Atacar (2) Defender (3) Buff");
            int resposta = sc.nextInt();
            if (resposta == 1) {
                int dano = paladino.getAtaque() - esqueletoSimples.getDefesa();
                esqueletoSimples.setVida(esqueletoSimples.getVida() - dano);
                System.out.println("Paladino atacou o esqueleto e causou " + dano + " de dano!");
                System.out.println("Vida do esqueleto: " + esqueletoSimples.getVida());
            }
            if (esqueletoSimples.getVida() > 0) {
                AtrsMSG.AtrasarMSGdois();
                System.out.println("O esqueleto ira te atacar...");
                AtrsMSG.AtrasarMSGdois();
                int dano = esqueletoSimples.getAtacar() - paladino.getDefesa();
                paladino.setVida(paladino.getVida() - dano);
                System.out.println("O esqueleto atacou o jogador, e causou " + dano + " de dano!");
                System.out.println("Vida do jogador: " + paladino.getVida());
                AtrsMSG.AtrasarMSGdois();
            }
        }
        if (paladino.getVida() <= 0) {
            System.out.println("O esqueleto venceu o combate!");
        } else {
            System.out.println("O paladino venceu o combate!");
        }
    }


    }


