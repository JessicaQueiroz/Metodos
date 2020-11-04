package com.company;

public class Main {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Jéssica";
        funcionario.salario = 2500;

        double salarioRecuperado = funcionario.recuperarSalario(150, 50);
        System.out.println("O salário atual é: " + salarioRecuperado);
    }
}
