/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio25;

import java.util.Scanner;

/*Crie um algoritmo que simule o funcionamento de um radar eletrônico de velocidade. O algoritmo deve permitir ao 
usuário digitar um valor de velocidade, apresentar em tela a mensagem “REGISTRO DE INFRAÇÃO POR EXCESSO DE 
VELOCIDADE AO PERMITIDO NA VIA!”, se a velocidade for maior que 90 quilômetros por hora (km/h) ou “VELOCIDADE DO 
AUTOMÓVEL ESTÁ ABAIXO DO LIMITE DA VIA”, se 
a velocidade for menor ou igual a 90 quilômetros por hora (km/h).
 */
public class Exercicio25 {
    Scanner scanner = new Scanner(System.in);
    
    void excessoV(){
        System.out.println("Digite um valor de velocidade!: ");
        int velocidade = scanner.nextInt();
        
        if(velocidade > 90){
            System.out.println("REGISTRO DE INFRAÇÃO POR EXCESSO DE VELOCIDADE AO PERMITIDO NA VIA!");
        } else if(velocidade <= 90){
            System.out.println("VELOCIDADE DO AUTOMÓVEL ESTÁ ABAIXO DO LIMITE DA VIA");
    }
    } 
        
}
