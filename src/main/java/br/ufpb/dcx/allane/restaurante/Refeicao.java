package br.ufpb.dcx.allane.restaurante;

public class Refeicao {
    private String tipoRefeicao;
    private double valorRefeicao;

    public Refeicao(String tipoRefeicao, double valorRefeicao){
        this.tipoRefeicao = tipoRefeicao;
        this.valorRefeicao = valorRefeicao;
    }
    public String getTipoRefeicao() {
        return tipoRefeicao;
    }
    public void setTipoRefeicao(String tipoRefeicao) {
        this.tipoRefeicao = tipoRefeicao;
    }
    public double getValorRefeicao() {
        return valorRefeicao;
    }
    public void setValorRefeicao(double valorRefeicao) {
        this.valorRefeicao = valorRefeicao;
    }
    @Override
    public String toString(){
        return "Refeição do tipo "+ this.tipoRefeicao + ", com valor de R$ " + this.tipoRefeicao;
    }
}
