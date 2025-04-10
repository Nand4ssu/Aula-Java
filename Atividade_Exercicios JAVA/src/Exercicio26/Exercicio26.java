/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio26;

import java.util.Scanner;

/*Crie um algoritmo que permita que o usuário digite o valor de peso de um lutador do UFC e o
valor de peso máximo permitido para sua categoria. Se o valor do peso for menor ou igual ao valor de peso máximo 
permitido, apresentar na tela a mensagem “O lutador está com peso dentro do permitido para sua categoria”. Se o 
valor do peso for maior que o valor de peso máximo permitido, apresentar na 
tela a mensagem “O lutador está com peso acima do permitido para sua categoria”. 
 */
public class Exercicio26 {
    Scanner scanner = new Scanner(System.in);
   
    void peso(){
        System.out.println("Digite o valor de peso de um lutador do UFC: ");
        double pesoLutador = scanner.nextDouble();
        System.out.println("Digite o valor de peso máximo permitido para a sua categoria: ");
        double pesMax = scanner.nextDouble();
        if(pesoLutador <= pesMax){
            System.out.println("O LUTADOR ESTÁ COM O PESO DENTRO DO PERMITIDO PARA A SUA CATEGORIA");
        } else if(pesoLutador > pesMax){
            System.out.println("O LUTADOR ESTÁ COM O PESO ACIMA DO PERMITIDO PARA SUA CATEGORIA");
        }
        
    }
}
