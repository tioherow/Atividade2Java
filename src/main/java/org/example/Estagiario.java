package org.example;

public class Estagiario {
  public String nome;
  public String cpf;
  public String instituto;
  public double salario;

    public Estagiario(String nome, String cpf, String instituto, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.instituto = instituto;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getInstituto() {
        return instituto;
    }

    public String getCpf() {
        return cpf;
    }


    public double calcularSalario() {
        return salario;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Instituto: " + instituto);
        System.out.println("Salario: " + salario);



    }

    public String getInstituicaoEnsino() {
        return "IFPR";
    }
}
