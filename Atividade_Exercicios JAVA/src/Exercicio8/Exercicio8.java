/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio8;

import java.util.Scanner;

/*Faça um algoritmo que o usuário digite dois valores e apresente na tela o resultado 
das seguintes operações: soma, subtração, divisão e produto.(Multplicação)
 */
public class Exercicio8 {
    Scanner scanner = new Scanner(System.in);
    
    void adicao(){
        System.out.println("Digite o primeiro número: ");
        int valor1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int valor2 = scanner.nextInt();
        
        int resultadoSoma = valor1 + valor2;
        System.out.println("O resultado da soma é: "+ resultadoSoma);
        
        
    } void subtracao(){
        System.out.println("Digite o primeiro número: ");
        int valor1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int valor2 = scanner.nextInt();
        
        int resultadoSub = valor1 - valor2;
        System.out.println("O resultado da subtração é: "+ resultadoSub);

    }  void divisao(){
        System.out.println("Digite o primeiro número: ");
        int valor1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int valor2 = scanner.nextInt();
        
        int resultadoDiv = valor1 / valor2;
        System.out.println("O resultado da divisão é: "+ resultadoDiv);
        
    } void multiplicacao(){
        System.out.println("Digite o primeiro número: ");
        int valor1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int valor2 = scanner.nextInt();
        
        int resultadoMult = valor1 * valor2;
       System.out.println("O resultado da divisão é: "+ resultadoMult);
    }
}