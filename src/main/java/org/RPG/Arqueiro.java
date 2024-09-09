package org.RPG;

public class Arqueiro extends   Personagem{
    private int precisao;
    private int alcance;

    public Arqueiro(String nome, int nivel, int hp, int atk, int def, int precisao, int alcance) {
        super(nome, nivel, hp, atk, def);
        this.precisao = precisao;
        this.alcance = alcance;
    }



    public void atirarFlecha(Personagem inimigo) {
        int dano = this.getAtk() + this.precisao - inimigo.getDef() + 2 ;
            System.out.println("Ataque :" + atk);
            System.out.println("Precisao :" + precisao);
        if(dano > 0){
            inimigo.setHp(inimigo.getHp() - dano);
        }
        System.out.println(this.nome + " (Arqueiro) atirou uma flecha em " + inimigo.nome + " causando " + dano + " de dano.");
    }
}
