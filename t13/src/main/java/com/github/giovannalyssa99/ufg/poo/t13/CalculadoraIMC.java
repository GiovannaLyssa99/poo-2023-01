package com.github.giovannalyssa99.ufg.poo.t13;

import java.util.Scanner;

public class CalculadoraIMC {

    public static double calculaIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String analisaStatus(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o peso (em Kg) de uma pessoa para calcular o seu IMC: ");
        double peso = scanner.nextDouble();
        
        System.out.print("Digite a altura (em metros) da pessoa: ");
        double altura = scanner.nextDouble();
        
        double imc = calculaIMC(peso, altura);
        String statusPeso = analisaStatus(imc);
        
        System.out.println("O IMC da pessoa é: " + imc);
        System.out.println("Isso significa que a pessoa se escontra na classificação: " + statusPeso);

        scanner.close();
    }
}