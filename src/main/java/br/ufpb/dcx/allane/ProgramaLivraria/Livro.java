package br.ufpb.dcx.allane.ProgramaLivraria;

public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor, boolean disponivel){
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }
    public Livro(){
        this("", "", true);
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public boolean isDisponivel(){
        return this.disponivel;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Livro (" +
                "titulo ='" + this.titulo + '\'' +
                ", autor ='" + this.autor + '\'' +
                ", disponível =" + this.disponivel +
                ')';
    }
}
