package br.ufpb.dcx.allane.pessoa;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade (int idade){
        this.idade = idade;
    }

    public boolean ehDeMaior(){
        return this.idade >= 18;
    }
}
