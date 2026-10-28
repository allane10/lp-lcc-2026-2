package br.ufpb.dcx.allane.titureco;

public class AtrativoTuristico {
    private String nome;
    private double latitude;
    private double longitude;
    private String comoChegar;
    private String cidade;
    private String estado;

    public AtrativoTuristico(String nome, double latitude, double longitude, String comoChegar, String cidade, String estado){
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
        this.comoChegar = comoChegar;
        this.cidade = cidade;
        this.estado = estado;
    }
    public AtrativoTuristico (){
        this("", 0.0, 0.0, "", "", "");
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getLatitude() {
        return latitude;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public double getLongitude(){
        return this.longitude;
    }
    public void setLongitude(double longitude){
        this.longitude = longitude;
    }
    public String getComoChegar() {
        return this.comoChegar;
    }
    public void setComoChegar(){
        this.comoChegar = comoChegar;
    }
    public String getCidade(){
        return this.cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return this.estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    public String toString(){
        return "ATRATIVO TURÍSTICO: "+ this.nome +", " + this.cidade + ", "+this.estado;
    }
}
