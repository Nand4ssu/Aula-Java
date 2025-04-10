/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio15;

import java.util.Scanner;

/*Faça um algoritmo que permita ao usuário digitar um valor em 
minutos e apresente em tela o valor convertido para horas.
 */
public class Exercicio15 {
    Scanner scanner = new Scanner(System.in);
    
    void conversao(){
       System.out.println("Digite o valor em minutos que deseja converter: ");
       int minutos = scanner.nextInt();
       double horas = minutos / 60;
       System.out.println("O valor da conversão é: "+ horas+"h");
   }
}
