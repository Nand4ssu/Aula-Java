/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades;

/**
 *
 * @author AMANDA_4800
 */
public class frnCadastrar {
    public static void main(String []args){
        Aluno novo = new Aluno ();
        novo.setIdade(19); 
        novo.setNome("Fulano");
        
        System.out.println("O aluno é "+ novo.getNome() + " tem " + novo.getIdade() + " anos");
        
        Empresa fabrica = new Empresa();
        
        fabrica.funcionario = "João";
        fabrica.setor = "RH";
    }
    
}
