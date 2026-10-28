package br.ufpb.dcx.allane.titureco;

import java.util.ArrayList;
import java.util.List;

public class TiturecoList implements TiturecoInterface{
    private List<AtrativoTuristico> atrativos;

    public TiturecoList(){
        this.atrativos = new ArrayList<>();
    }
    public boolean cadastrarAtrativo(AtrativoTuristico atrativoTuristico){
        return this.atrativos.add(atrativoTuristico);
    }
    public boolean apagarAtrativo(String nomeAtrativo, String cidade, String estado){
        boolean foiRemovido = false;
        int i = 0;
        while (i < atrativos.size()){
            AtrativoTuristico a = this.atrativos.get(i);
            if(a.getNome().equalsIgnoreCase(nomeAtrativo) && a.getCidade().equalsIgnoreCase(cidade) &&
                    a.getEstado().equalsIgnoreCase(estado)){
                //removendo pelo índice
                this.atrativos.remove(i);
                foiRemovido = true;
                break;
            }
            i++;
        }
        return foiRemovido;
    }

    public List<AtrativoTuristico> getAtrativos(){
        return this.atrativos;
    }
    public List<AtrativoTuristico> pesquisarAtrativosDaCidade(String cidade, String estado){
        int cont = 0;
        List<AtrativoTuristico> atrativosDaCidade = new ArrayList<>();
        while (cont < atrativos.size()){
            AtrativoTuristico b = this.atrativos.get(cont);
            if (b.getCidade().equalsIgnoreCase(cidade) && b.getEstado().equalsIgnoreCase(estado)){
                atrativosDaCidade.add(b);
            }
            cont++;
        }
        return atrativosDaCidade;
    }


}
