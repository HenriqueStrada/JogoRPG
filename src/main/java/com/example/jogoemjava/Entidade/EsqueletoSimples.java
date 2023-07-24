package com.example.jogoemjava.Entidade;

public class EsqueletoSimples {

    private int vida;
    private int defesa;
    private int defender;
    private int atacar;
    private int mana;

    public EsqueletoSimples(int vida, int defesa, int defender, int atacar, int mana){
        this.vida = vida;
        this.defesa = defesa;
        this.defender = defender;
        this.atacar = atacar;
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

    public int getAtacar() {
        return atacar;
    }

    public void setAtacar(int atacar) {
        this.atacar = atacar;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public static void EsqueletoSimplesINF(){
        System.out.println("""
                    Informações basicas do Esqueleto:
                    Arma: Espada enferrujada.
                    Vida = 50        1 - Ataque (Espadada: 15 dano)
                    Defesa = 5       2 - Defesa (Defender com espada: + 5 defesa)
                    mana = 0         
                    """);
    }


}
