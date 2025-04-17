package CalculoScanner;

import java.util.Scanner;

public class mostrarRes{
    public static void main(String[] args) {
       CalculoScan valor = new CalculoScan();
       double x;
       double y;

       Scanner scan = new Scanner(System.in);
       System.out.println("Digite o primeiro número: ");
       x = scan.nextDouble();
       valor.setPrimeirovalor(x);
       System.out.println("Digite o segundo número: ");
       y = scan.nextDouble();
       valor.setSegundovalor(y);

       valor.mostrarResultados();


    }
    
}
