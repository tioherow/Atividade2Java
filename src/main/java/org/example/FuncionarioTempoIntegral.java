package org.example;

public class FuncionarioTempoIntegral {
    private String nome;
    private String cpf;
   private double salario;
   private int tempo;

    public FuncionarioTempoIntegral(String nome, String cpf, double salario,int tempo) {
        this.nome = nome;
        this.salario = salario;
        this.cpf = cpf;
        this.tempo = tempo;
    }

    public String getNome() {
        return nome;
    }

    public int getTempo() {
        return tempo;
    }

    public double getSalario() {
        return salario;
    }

    public String getCpf() {
        return cpf;
    }


    public double calcularSalario() {
       double  restoSalario  = this.salario / this.tempo; //=500
        return this.salario + restoSalario;

    }

    public void exibirInformacoes() {

        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Salario: " + calcularSalario());

    }


}
