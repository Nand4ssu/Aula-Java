package Escola;

public class Aluno {
    String nome;
    int idade;
    
    public void mostrarDados(){
        System.out.println("Seu nome é: "+ getNome());
        System.out.println("Sua idade é: "+ getIdade());
    }


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
    
}
