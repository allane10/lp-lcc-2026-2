package br.ufpb.dcx.allane.emissordesom;

public class TestaCaixaDeSom {
    public static void main(String[] args){
        //criando o objeto
        CaixaDeSom caixa = new CaixaDeSom();
        caixa.adicionarEmissor(new Cachorro("Bob"));
        caixa.adicionarEmissor(new Tambor("P", "Giannini"));
        caixa.adicionarEmissor(new Gato("Sansão", "persa"));
        caixa.adicionarEmissor(new Cachorro("Luna"));
        caixa.adicionarEmissor(new Tambor("M", "Pearl"));
        //invocando o método
        caixa.tocarTodosOsEmissores();
    }
}
