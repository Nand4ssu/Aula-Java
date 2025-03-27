
package atividades;

public class Aluno {

    private String nome;
    private int idade;
    
    
    public String getNome() {
        return nome;
    }

 
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void enviarDados(){
        System.out.println("Aluno, seu nome é: "+ nome);
        System.out.println("Aluno, sua idade é: "+ idade);
    }
    
}
