package br.ufpb.dcx.allane.sistemabiblioteca;

public class SistemaLivraria {
    public static void main(String[] args){

        MeuSistemadeBiblioteca livro = new MeuSistemadeBiblioteca();
        livro.adicionarLivro(new Livro("Alice no P", "Lewis Carroll", 140));
        livro.adicionarLivro(new Livro("Dom Quixote", "Miguel de Cervantes", 250));
        livro.listarLivros();
    }
}
