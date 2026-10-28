package br.ufpb.dcx.allane.titureco;

public class Praia extends AtrativoTuristico {
    private boolean propriaParaBanho;
    private boolean perigoTubarao;
    private String tipoOrla;

    public static final String TIPO_PISCINAS_NATURAIS = "Piscinas Naturais";
    public static final String TIPO_ONDAS_FORTES = "Ondas fortes";
    public static final String TIPO_ONDAS_MEDIAS = "Ondas Médias";

    public Praia(String nome, double latitude, double longitude, String comoChegar, String cidade, String estado, boolean propriaParaBanho,
                 boolean perigoTubarao, String tipoOrla){
        super(nome, latitude, longitude, comoChegar, cidade, estado);
        this.propriaParaBanho = propriaParaBanho;
        this.perigoTubarao = perigoTubarao;
        this.tipoOrla = tipoOrla;
    }
    public Praia(){
        this("",0.0 , 0.0, "", "", "", false, false, "");
    }
    public boolean ehPropriaParaBanho(){
        return this.propriaParaBanho;
    }
    public void setPropriaParaBanho(boolean ehPropria) {
        this.propriaParaBanho = ehPropria;
    }
    public boolean temPerigoTubarao(){
        return this.perigoTubarao;
    }
    public void setPerigoTubarao(boolean temPerigo){
        this.perigoTubarao = temPerigo;
    }
    public String getTipoOrla(){
        return this.tipoOrla;
    }
    public void setTipoOrla(String tipoOrla){
        this.tipoOrla = tipoOrla;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
