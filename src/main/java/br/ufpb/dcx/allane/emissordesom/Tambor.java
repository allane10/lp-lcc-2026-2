package br.ufpb.dcx.allane.emissordesom;

public class Tambor implements EmissorDeSom{
    private String tamanho;
    private String marca;

    public Tambor(String tamanho, String marca){
        this.tamanho = tamanho;
        this.marca = marca;
    }
    public String emitirSom(){
        return "tum tum tum";
    }
    public String getTamanho(){
        return this.tamanho;
    }
    public String getMarca(){
        return this.marca;
    }
    public String toString(){
        return "O tambor de tamanho "+ this.tamanho + " e marca "+
                this.marca + " faz o som: " + this.emitirSom();
    }
}
