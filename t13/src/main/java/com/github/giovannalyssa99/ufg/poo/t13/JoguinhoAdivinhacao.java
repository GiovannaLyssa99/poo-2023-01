package com.github.giovannalyssa99.ufg.poo.t13;

import java.util.Random;
import java.util.Scanner;

public class JoguinhoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int resposta = random.nextInt(100) + 1;
        int tentativas = 0;
        int palpite = 0;
        
        System.out.println("O sistema sorteou um número entre 1 e 100, tente acertá-lo com o menor número de tentativas possível.");
        
        while (palpite != resposta) {
            System.out.print("Digite o seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;
            
            if (palpite < resposta) {
                System.out.println("A resposta é um número maior. Tente novamente.");
            } else if (palpite > resposta) {
                System.out.println("A resposta é um número menor. Tente novamente.");
            }
        }
        
        System.out.println("Parabéns! A resposta é " + resposta + ", você acertou o número em " + tentativas + " tentativas.");

        scanner.close();
    }
}