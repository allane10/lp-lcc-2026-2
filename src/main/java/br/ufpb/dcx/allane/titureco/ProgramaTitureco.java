package br.ufpb.dcx.allane.titureco;

import java.util.List;

public class ProgramaTitureco {
    public static void main(String[] args){
        TiturecoInterface sistemaAtrativo = new TiturecoList();
        Praia p1 = new Praia("Praia de Tambaú", -7.115153, -34.821902,
                "Av. Almirante Tamandaré", "João Pessoa", "PB",
                true, false, Praia.TIPO_ONDAS_MEDIAS);
        AtrativoTuristico b = new AtrativoTuristico("Praia do Jacaré", -7.033000, -34.853000,
                "Região da Av. Pôr do Sol", "Cabedelo", "PB");
        AtrativoTuristico c = new AtrativoTuristico("Parque Solon de Lucena", -7.1235, -34.8731,
                "Centro de João Pessoa", "João Pessoa", "PB");
        AtrativoTuristico d = new AtrativoTuristico( "Cristo Redentor", -22.951937, -43.210942,
                "Acesso pelo Trem do Corcovado ou vans oficiais", "Rio de Janeiro", "RJ");
        AtrativoTuristico e = new AtrativoTuristico("Pelourinho", -12.97194, -38.50806,
                "Centro Histórico de Salvador", "Salvador", "BA");
        sistemaAtrativo.cadastrarAtrativo(b);
        sistemaAtrativo.cadastrarAtrativo(c);
        sistemaAtrativo.cadastrarAtrativo(d);
        sistemaAtrativo.cadastrarAtrativo(e);
        sistemaAtrativo.cadastrarAtrativo(p1);

        List<AtrativoTuristico> pesquisaCidade = sistemaAtrativo.pesquisarAtrativosDaCidade("Salvador", "BA");
        System.out.println("Atrativos encontrados em Salvador-BA");
        System.out.println(pesquisaCidade.size());
        for (AtrativoTuristico p: pesquisaCidade){
            System.out.println(p.toString());
        }
        System.out.println(sistemaAtrativo.getAtrativos().size());

        for(AtrativoTuristico atra: sistemaAtrativo.getAtrativos()){
            System.out.println(atra.toString());
        }

        sistemaAtrativo.apagarAtrativo("Praia de Tambaú", "João Pessoa", "PB");
        System.out.println(sistemaAtrativo.getAtrativos().size());

        for(AtrativoTuristico atra: sistemaAtrativo.getAtrativos()){
            System.out.println(atra.toString());
        }

    }
}
