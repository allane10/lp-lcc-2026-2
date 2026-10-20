package br.ufpb.dcx.allane.pessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaPessoa {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        int cont = 0;
        while(cont < 5){
            System.out.println("Digite o nome da " + (cont+1) + "º pessoa: ");
            String nome = leitor.nextLine();
            System.out.println("Digite a idade: ");
            int idade = Integer.parseInt(leitor.nextLine());
            //inicializo/instancio o objeto com os argumentos que foram recebidos acima
            Pessoa pessoa = new Pessoa(nome, idade);
            //adiciono ao arrayList
            pessoas.add(pessoa);
            cont++;
        }

        for (Pessoa pessoa: pessoas) {
            boolean resultadoIdade = pessoa.ehDeMaior();
            if (resultadoIdade == true){
                System.out.println(pessoa.getNome() + " é de maior");
            } else {
                System.out.println(pessoa.getNome() + " é de menor");

            }
        }


    }
}
