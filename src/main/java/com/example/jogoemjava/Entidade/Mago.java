package com.example.jogoemjava.Entidade;

public class Mago {

    private int vida;
    private int defesa;
    private int defender;
    private int ataque;
    private int mana;

    public Mago(int vida, int defesa, int defender, int ataque, int mana){
        this.vida = vida;
        this.defesa = defesa;
        this.defender = defender;
        this.ataque = ataque;
        this.mana = mana;
    }

    public int getVida() {return vida;}
    public void setVida(int vida) {this.vida = vida;}
    public int getDefesa() {return defesa;}
    public void setDefesa(int defesa) {this.defesa = defesa;}
    public int getDefender() {return defender;}
    public void setDefender(int defender) {this.defender = defender;}
    public int getAtaque() {return ataque;}
    public void setAtaque(int ataque) {this.ataque = ataque;}
    public int getMana() {return mana;}
    public void setMana(int mana) {this.mana = mana;}



    public static void magoINF(){
        System.out.println("""
                    Informações basicas do mago:
                    Arma: Cajado Magico
                    Defesa: Parede de gelo
                    
                    Vida = 60        1 - Ataque (Explosão: 35 dano - 5 mana)
                    Defesa = 5       2 - Defesa (Defender com parede de gelo: + 35 defesa - 10 mana)
                    mana = 60         3 - Buff (Conjuração sagrada: + 15 no proximo ataque, ou defesa. Consumo de mana 15)\n
                    """);
    }

    public static void historiaMago(){
        System.out.println("Você era um mago dedicado aos seus estudos, porém sempre viveu de forma solitária, com medo de ser julgado pelos seus poderes");
        AtrsMSG.AtrasarMSGdois();
        System.out.println("Um dia você decidiu ir a uma caverna para testar feitiços novos, para qual lado você deseja ir?");
    }
}
