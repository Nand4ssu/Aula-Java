/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio14;

import java.util.Scanner;

/* Faça um algoritmo que permita ao 
usuário digitar um valor em horas e apresente em tela o valor convertido para minutos.
 */
public class Exercicio14 {
    Scanner scanner = new Scanner(System.in);
    
    void conversao(){
       System.out.println("Digite o valor em horas que deseja converter: ");
       int horas = scanner.nextInt();
       int minutos = horas * 60;
       System.out.println("O valor da conversão é: "+ minutos+"min");
   }
}
