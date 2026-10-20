package br.ufpb.dcx.allane.emissordesom;

public class Gato implements EmissorDeSom{
    private String nome;
    private String raca;

    public Gato(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
    }
    public String emitirSom(){
        return "Miauu!";
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String toString(){
        return "O(A) gato(a) "+ this.nome + " com raça "+this.raca+
                " emite o som: " +this.emitirSom();
    }
}
