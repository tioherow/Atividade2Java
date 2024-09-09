package org.example;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getCpf() {
        return cpf;
    }

    public double calcularSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
        System.out.println("Nome: " + nome);

    }

    public void setCpf(String cpf) {
        this.cpf = "111.222.333-44";
        System.out.println("Cpf: " + cpf);
    }

    public void setSalarioBase(double salario) {
        this.salario = salario;
        System.out.println("Salario Base: " + salario);

    }

    public double getSalarioBase() {
        return salario;
    }
}
