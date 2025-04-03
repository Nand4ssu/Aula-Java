/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio12;

import java.util.Scanner;

/**
 *
 * @author AMANDA_4800
 */
public class Exercicio12 {
    Scanner scanner = new Scanner(System.in);
    
   void conversao(){
       System.out.println("Digite o valor em centimetros que deseja converter: ");
       double centimetros = scanner.nextDouble();
       double metros = centimetros / 100;
       System.out.println("O valor da conversão é: "+ metros+"m");
   }
}
