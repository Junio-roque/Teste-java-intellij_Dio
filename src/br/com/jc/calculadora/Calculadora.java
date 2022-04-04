package br.com.jc.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtracao = subtracao(a, b);
        int multiplicacao = multiplicacao(a, b);
        int divisao = divisao(a, b);

        System.out.println("somar: " + somar);
        System.out.println("subtração: " + subtracao);
        System.out.println("multiplicação: " + multiplicacao);
        System.out.println("divisão: " + divisao);

    }

    public static int somar(int a, int b){
        return a + b;
    }

    public static int multiplicacao(int a, int b){
        return a * b;
    }

    public static int subtracao(int a, int b){
        return a - b;
    }

    public static int divisao(int a, int b){
        return a / b;
    }

}
