/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio;

/**
 *
 * @author AMANDA_4800
 */
public class Carro {
    String marca;
    String modelo;
    String cor;
    String combustivel;
    int portas;
    int marcha;
    double velocidade;
    
    public void Acelerar(){
        velocidade += marcha * 20;
        System.out.println("velocidade" + velocidade);
    }
    public void Frear(){
        velocidade = marcha - 5;
        System.out.println(velocidade);
    }
    public void Marcha (){
        
    }
   
}
