package com.github.giovannalyssa99.ufg.poo.t13;

import java.util.Scanner;

public class ConversorUnidades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Selecione o tipo de conversão que deseja realizar: \n1. Celsius para Fahrenheit\n2. Quilômetros para Milhas\n3. Metros para Pés");
        
        int opcao = scanner.nextInt();
        
        switch (opcao) {
            case 1:
                System.out.print("Digite a temperatura em Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = celsius * 9/5 + 32;
                System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
                break;
                
            case 2:
                System.out.print("Digite a distância em quilômetros: ");
                double quilometros = scanner.nextDouble();
                double milhas = quilometros * 0.621371;
                System.out.println("A distância em milhas é: " + milhas);
                break;
                
            case 3:
                System.out.print("Digite a distância em metros: ");
                double metros = scanner.nextDouble();
                double pes = metros * 3.28084;
                System.out.println("A distância em pés é: " + pes);
                break;
                
            default:
                System.out.println("Opção inválida.");
                break;
        }

        scanner.close();
    }
}