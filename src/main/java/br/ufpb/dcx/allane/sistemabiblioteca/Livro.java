package br.ufpb.dcx.allane.sistemabiblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private int quantPaginas;

    public Livro(String titulo, String autor, int quantFolhas){
        this.titulo = titulo;
        this.autor = autor;
        this.quantPaginas = quantFolhas;
    }

    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public int getQuantPaginas(){
        return this.quantPaginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setQuantPaginas(int quantPaginas){
        this.quantPaginas = quantPaginas;
    }
    public String toString(){
        return "Dados do livro\n" +
                "Título: " + this.titulo + ", Autor: "+this.autor+ ", quantidade de páginas: "+this.quantPaginas;
    }
}
