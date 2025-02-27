/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Amanda.Metodo;

import java.util.Scanner;

/**
 *
 * @author AMANDA_4800
 */
public class Calculadora {

     Scanner x = new Scanner(System.in);

    void adicao() {
        
        System.out.println("Digite o primeiro número: ");
        int valor1 = x.nextInt();
        System.out.println("Digite o segundo número: ");
        int valor2 = x.nextInt();
        
        int resultado = valor1 + valor2;
        System.out.println("O valor da soma é: " + resultado);
        System.out.println(" ");
    }
    void subtracao(){
        System.out.println("Digite o primeiro número: ");
        int valor1 = x.nextInt();
        System.out.println("Digite o segundo número: ");
        int valor2 = x.nextInt();
        
        int resultado = valor1 - valor2;
        System.out.println("O valor da subtração é: "+ resultado);
        System.out.println(" ");
    }
    void divisao(){
        System.out.println("Digite o primeiro número: ");
        int valor1 = x.nextInt();
        System.out.println("Digite o segundo número: ");
        int valor2 = x.nextInt();
        
        int resultado = valor1 % valor2;
        System.out.println("O valor da subtração é: "+ resultado);
        System.out.println(" ");
    }
    void multiplicacao(){
        System.out.println("Digite o primeiro número: ");
        int valor1 = x.nextInt();
        System.out.println("Digite o segundo número: ");
        int valor2 = x.nextInt();
        int resultado = valor1 * valor2;
        System.out.println("O resultado da multiplicação é: "+ resultado);
        System.out.println(" ");
    }

}
