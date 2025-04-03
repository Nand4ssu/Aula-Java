/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio13;

import java.util.Scanner;


public class Exercicio13 {
    Scanner scanner = new Scanner(System.in);
    
   void conversao(){
       System.out.println("Digite o valor em quilometros que deseja converter: ");
       double quilometros = scanner.nextDouble();
       double metros = quilometros * 1000;
       System.out.println("O valor da conversão é: "+ metros+"m");
   }
}
