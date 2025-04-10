/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio20;

import java.util.Scanner;

/*Construa um algoritmo que permita ao usuário digitar 4 números, 
calcule o quadrado de cada número digitado, some os valores e apresente em tela o resultado
 */
public class Exercicio20 {
    Scanner scanner = new Scanner(System.in);
    
    void quadrado (){
        System.out.println("Digite o primeiro número: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = scanner.nextInt();
        System.out.println("Digite o terceito número: ");
        int n3 = scanner.nextInt();
        System.out.println("Digite o quarto e último número: ");
        int n4 = scanner.nextInt();
        
        int res1 = n1 * n1;
        int res2 = n2 * n2;
        int res3 = n3 * n3;
        int res4 = n4 * n4;
        
        System.out.println("Os valores fornecidos ao quadrado é: primeiro valor"+ res1 + " segundo valor: "+ res2+ "terceiro valor: "+res3 +" quarto valor: "+ res4);
        int somaTotal = res1 + res2 + res3 + res4;
        
        System.out.println("A soma dos valores dados é: "+ somaTotal);
    }
}
