package br.ufpb.dcx.allane.ProgramLivraria;

import java.util.Scanner;

public class Livraria {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos livros vai cadastrar? ");
        int quantidadeDeLivros = Integer.parseInt(leitor.nextLine());
        Livro [] livros = new Livro[quantidadeDeLivros];
        for (int k = 0; k < livros.length; k++){
            Livro livro = new Livro();
            System.out.println("Título do "+ (k+1) +"º livro: ");
            livro.setTitulo(leitor.nextLine());
            System.out.println("Autor do "+ (k+1) +"º livro: ");
            livro.setAutor(leitor.nextLine());
            livro.setDisponivel(true);
            livros[k] = livro;
        }
        System.out.println("Lista dos livros cadastrados: ");
        listarLivrosDoSistema(livros);
        System.out.println("Digite um título de livro que deseja encontrar: ");
        String buscarTitulo = leitor.nextLine();
        boolean livroEncontrado = buscarLivros(livros, buscarTitulo);
        System.out.println(livroEncontrado);
        System.out.println("Quantidade de livros disponíveis: ");
        System.out.println(contarLivrosDisponiveis(livros));
        System.out.println("Digite o nome de um autor e informaremos a quantidade de livros dele: ");
        String nomeAutorPesquisarLivros = leitor.nextLine();
        int quantidadeDeLivroAutor = contarLivrosPorAutor(livros, nomeAutorPesquisarLivros);
        System.out.println("Este autor tem "+ quantidadeDeLivroAutor + " livros cadastrados aqui na livraria.");

        leitor.close();
    }

    //METODOS
    public static void listarLivrosDoSistema (Livro [] livros){
        for (int i = 0; i < livros.length; i++){
            System.out.println(livros[i].toString());
        }
    }
    public static boolean buscarLivros (Livro [] livros, String tituloProcurado){
        int k = 0;
        boolean livroEncontrado = false;
        while (k < livros.length){
            if (livros[k].getTitulo().equalsIgnoreCase(tituloProcurado)){
                livroEncontrado = true;
                break;
            }
            k++;
        }
        return livroEncontrado;
    }

    public static int contarLivrosDisponiveis(Livro [] livros){
        int quantLivrosDisp = 0;
        for (int j = 0; j< livros.length;j++){
            if (livros[j].isDisponivel() == true){
                quantLivrosDisp +=1;
            }
        }
        return quantLivrosDisp;
    }

    public static int contarLivrosPorAutor(Livro [] livros, String nomeAutor){
        int quantDeLivrosPorAutor = 0;
        for (int m = 0; m < livros.length; m++){
            if(livros[m].getAutor().equals(nomeAutor)){
                quantDeLivrosPorAutor +=1;
            }
        }
        return quantDeLivrosPorAutor;
    }
}
