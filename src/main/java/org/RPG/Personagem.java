package org.RPG;

abstract class Personagem {
    protected String nome;
    protected int nivel;
    protected int hp;
    protected int atk;
    protected int def;



    public Personagem(String nome, int nivel, int hp, int atk, int def) {
        this.nome = nome;
        this.nivel = nivel;
        this.hp = hp;
        this.atk = atk;
        this.def = def;


    }

    public String getNome() {
        return nome;
    }

    public int getDef() {
        return def;
    }

    public int getAtk() {
        return atk;
    }

    public int getHp() {
        return hp;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void atacar(Personagem inimigo) {
        int dano = calcularDano(this.atk, inimigo.def);
        inimigo.receberDano(dano);
        System.out.println(this.nome + " atacou " + inimigo.nome + " causando " + dano + " de dano.");

    }

    public void receberDano(int dano) {
        this.hp -= dano;
        if (this.hp < 0) this.hp = 0;
        System.out.println(this.nome + " agora tem " + this.hp + " pontos de vida.");
    }

    protected int calcularDano(int atk, int def) {
        int dano = atk - def;
        return Math.max(dano, 0); // Garante que o dano mínimo seja 0
    }

    public boolean estaVivo() {
        return this.hp > 0;
    }

    public void exibirStatus() {
        System.out.println(nome + " - Nível: " + nivel + " | HP: " + hp + " | ATK: " + atk + " | DEF: " + def);
    }



}