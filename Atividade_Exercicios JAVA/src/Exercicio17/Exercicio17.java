/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio17;

import java.util.Scanner;

/**
 *
 * @author AMANDA_4800
 */
public class Exercicio17 {
    Scanner scanner = new Scanner(System.in);
    
    void conversao(){
       System.out.println("Digite o valor em segundos que deseja converter: ");
       int segundos = scanner.nextInt();
       double minutos = segundos / 60;
       System.out.println("O valor da conversão é: "+ minutos+"min");
   }

}
