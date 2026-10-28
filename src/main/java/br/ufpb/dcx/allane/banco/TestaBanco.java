package br.ufpb.dcx.allane.banco;

import java.util.ArrayList;

public class TestaBanco {
    public static void main(String[] args){
        BancoList meuBanco = new BancoList("Ayla's Bank", "123/321", new ArrayList<Conta>());
        //meuBanco.abrirConta("111.111.111-11", "222-2", "333-3", 100);
        //meuBanco.abrirConta("222.222.361-22", "212-3", "342-3", 1000);
        System.out.println(meuBanco.consultarSaldoDeConta("222-2", "333-3"));
        meuBanco.transferir("222-2","333-3", "212-3","342-3",100 );

        ArrayList<Conta> contasNegativas = meuBanco.pesquisarContasComSaldoNegativo();
        for(Conta c : contasNegativas){
            System.out.println(c.toString());
        }
    }
}
