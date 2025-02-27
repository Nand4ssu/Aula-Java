package etecuirapuru.com.br.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lerOqueUsuarioDigita = new Scanner(System.in);
        String nomeUsuario;

        //O "lerOqueUsuarioDigita é uma variável. A classe Scanner fornece metodos e caracteristicas
        //que nos possibilita ler o código.
        System.out.println("Digite seu nome: ");
        //Uma 'saída', o que vai ser mostrado para o usuario.
        nomeUsuario = lerOqueUsuarioDigita.next();

        int rmAluno;
        System.out.println("Digite o seu RM: ");
        rmAluno = lerOqueUsuarioDigita.nextInt();
        //Por ser campo inteiro, o next precisa ter o INT.
        String isQuerIrEmboraCedo;
        System.out.println("Quer ir embora mais cedo? (S - N): ");
        isQuerIrEmboraCedo = lerOqueUsuarioDigita.next();
        
        if(isQuerIrEmboraCedo.toLowerCase().equals("s") ){
            isQuerIrEmboraCedo = "Sim";
        }else{
            isQuerIrEmboraCedo = "Não";
        }
        //Estrutura igual à do Js.

        System.out.println("");
        System.out.println("--------Informações Aluno------");
        System.out.println("");
        System.out.println("Nome: " + nomeUsuario
                + "\nRM: " + rmAluno + 
                "\nPretende sair cedo: "+ isQuerIrEmboraCedo
        );

        System.out.println("");
        System.out.println("-------- ------- ------");
        System.out.println("");
    }
}
