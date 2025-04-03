
package Exercicio1;

import java.awt.BorderLayout;
import java.util.Scanner;

public class Exercicio1 {
    Scanner x = new Scanner(System.in);
    
    void adicao(){
        System.out.println("Digite o primeiro número: ");
        int valor1 = x.nextInt();
        System.out.println("Digite o segundo número: ");
        int valor2 = x.nextInt();
        int resultadoSoma = valor1 + valor2;
        System.out.println("O valor da soma dos dois números é: "+ resultadoSoma);
        int multiplicado = valor1 * resultadoSoma; 
        System.out.println("Resultado pós multiplicado pelo primeiro número fornecido: "+ multiplicado);
    }
    
}
