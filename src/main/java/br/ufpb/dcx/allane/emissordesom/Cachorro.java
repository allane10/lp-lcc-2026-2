package br.ufpb.dcx.allane.emissordesom;

public class Cachorro implements EmissorDeSom{
    private String nome;

    public Cachorro(String nome){
        this.nome = nome;
    }
    public String emitirSom(){
        return "Au au!";
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String toString(){
        return "O cachorro "+ this.nome+ " emite o som: "+
                this.emitirSom();
    }
}
