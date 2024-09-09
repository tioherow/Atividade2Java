package org.example;

public class FuncionarioMeioPeriodo {
    private String nome;
    private String cpf;
    private int  i ;
    private int ii;


    public FuncionarioMeioPeriodo(String nome, String cpf, int i, int ii) {
        this.nome = nome;
        this.cpf = cpf;
        this.i = i;
        this.ii = ii;

    }

    public String getNome() {
        return nome;
    }

    public int getI() {
        return i;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIi() {
        return ii;
    }



    public double calcularSalario() {
        return i * ii;
    }

    public void exibirInformacoes() {
    System.out.println("Nome: " + nome);
    System.out.println("CPF: " + cpf);
    System.out.println("I: " + i);
    System.out.println("II: " + ii);

    }
}
