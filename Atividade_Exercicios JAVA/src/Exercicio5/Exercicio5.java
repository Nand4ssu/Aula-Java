/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio5;

import java.util.Scanner;

/**
Faça um algoritmo que solicite ao usuário o seu peso e altura.
O programa deve calcular e Indice de Massa Corporal (IMC). A formula é: imc = peso/(altura2).
 */
public class Exercicio5 {
    Scanner scanner = new Scanner(System.in);
    
    void calculoPesoeAltura(){
        System.out.println("Digite o seu peso: ");
       double peso = scanner.nextDouble();
        System.out.println("Informe sua altura: ");
       double altura = scanner.nextDouble();
        double indicemassa = peso / (altura * altura);
        System.out.println("O seu Indice de Massa Corporal é: "+indicemassa);
    }
}
