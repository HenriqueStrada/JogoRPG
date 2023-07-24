package com.example.jogoemjava.Entidade;

public class Paladino {
    private int vida;
    private int defesa;
    private int defender;
    private int ataque;
    private int mana;


    public Paladino(int vida, int defesa, int defender, int ataque, int mana) {
        this.vida = vida;
        this.defesa = defesa;
        this.defender = defender;
        this.ataque = ataque;
        this.mana = mana;

    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getDefender() {
        return defender;
    }

    public void setDefender(int defender) {
        this.defender = defender;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public static void PaladinoINF(){
        System.out.println("""
                    Informações basicas do paladino:
                    Arma: Espada longa
                    Defesa: Escudo sagrado
                    
                    Vida = 130        1 - Ataque (Espadada: 20 dano)
                    Defesa = 15       2 - Defesa (Defender com escudo: + 20 defesa)
                    mana = 10         3 - Buff (Voz divina: + 10 no proximo ataque, ou defesa. Consumo de mana = 5)
                    """);
    }
}
