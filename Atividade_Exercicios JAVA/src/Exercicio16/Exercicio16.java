/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio16;

import java.util.Scanner;

/*
 */
public class Exercicio16 {
    Scanner scanner = new Scanner(System.in);
    
    void conversao(){
       System.out.println("Digite o valor em minutos que deseja converter: ");
       int minutos = scanner.nextInt();
       int segundos = minutos * 60;
       System.out.println("O valor da conversão é: "+ segundos+"s");
   }
}
