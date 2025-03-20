/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio;

/**
 *
 * @author AMANDA_4800
 */
public class Exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Carro carroA = new Carro();
        Carro carroB = new Carro ();
        
        carroA.cor= "Rosa";
        carroA.marca = "Mercedes";
        carroA.modelo = "AMG A 35 4MATIC";
        carroA.combustivel = "Diesel";
        
       
        System.out.println(carroA.combustivel+"\n"+carroA.cor+"\n"+carroA.marca+"\n"+carroA.modelo);
        
        System.out.println("===========================");
        
        carroB.combustivel = "Gasolina";
        carroB.cor = "Preto";
        carroB.marca = "Honda";
        carroB.modelo = "Civic";
        
        carroB.velocidade = 15;
        carroB.marcha = 40;
        carroB.Frear();
        
        System.out.println(carroB.combustivel+"\n"+carroB.cor+"\n"+carroB.marca+"\n"+carroB.modelo);
    }
    
}
