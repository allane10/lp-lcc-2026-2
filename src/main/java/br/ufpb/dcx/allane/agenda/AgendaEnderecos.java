package br.ufpb.dcx.allane.agenda;

public class AgendaEnderecos {
    //atributos
    private int maxContatos;
    private int contContatos;
    private Contato[] contatos;

    public AgendaEnderecos(int maxContatos){
        this.maxContatos = maxContatos;
        this.contContatos = 0;
        this.contatos = new Contato[maxContatos];
    }
}
