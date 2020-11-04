package com.company;

public class Funcionario {
    // atributos - propriedades
    String nome;
    double salario;

    // métodos - sem retorno
    /*void recuperarSalario(){
        this.salario = this.salario - (this.salario * 0.1); // 10% salário
        System.out.println(this.salario);
    }*/
    // método - com retorno
    double recuperarSalario(double bonus, double descontoAdicional) {
        this.salario = this.salario - (this.salario * 0.1); // 10% salário
        return this.salario + bonus - descontoAdicional;
    }
}
