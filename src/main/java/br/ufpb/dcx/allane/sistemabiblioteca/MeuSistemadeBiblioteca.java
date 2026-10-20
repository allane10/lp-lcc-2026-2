package br.ufpb.dcx.allane.sistemabiblioteca;

import java.util.ArrayList;

public class MeuSistemadeBiblioteca implements SistemaBiblioteca{

    private ArrayList<Livro> livros;

    public MeuSistemadeBiblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void listarLivros() {
        for (Livro l : this.livros) {
            System.out.println(l);
        }
    }

}
