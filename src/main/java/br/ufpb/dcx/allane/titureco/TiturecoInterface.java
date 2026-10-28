package br.ufpb.dcx.allane.titureco;

import java.util.List;

public interface TiturecoInterface {
    public boolean cadastrarAtrativo(AtrativoTuristico atrativo);
    public boolean apagarAtrativo(String nomeAtrativo, String cidade, String estado);
    public List<AtrativoTuristico> getAtrativos();
    public List<AtrativoTuristico> pesquisarAtrativosDaCidade(String cidade, String estado);
}
