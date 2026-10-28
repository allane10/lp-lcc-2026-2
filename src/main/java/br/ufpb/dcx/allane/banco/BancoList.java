package br.ufpb.dcx.allane.banco;

import java.util.ArrayList;

public class BancoList {
    private String nome;
    private String cnpj;
    private ArrayList<Conta> contas;

    public BancoList(String nome, String cnpj, ArrayList<Conta> contas) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.contas = contas;
    }

    public double consultarSaldoDeConta(String numConta, String numAgencia) {
        double saldo = 0;
        for (Conta c : contas) {
            if (c.getNumeroConta().equals(numConta) && c.getNumeroAgencia().equals(numAgencia)) {
                saldo = c.getSaldo();
                break;
            }
        }
        return saldo;
    }

    public void transferir(String numContaO, String numAgO, String numContaD, String numAgD, double valor){
        for (Conta c: this.contas){
            if(c.getNumeroConta().equals(numContaO) && c.getNumeroAgencia().equals(numAgO)){
                for (Conta d: this.contas){
                    if(d.getNumeroConta().equals(numContaD) && d.getNumeroAgencia().equals(numAgD)){
                        //transferencia, logo, retira de uma conta e coloca em outra;
                        double saldoModificado = c.getSaldo() - valor;
                        c.setSaldo(saldoModificado);
                        //colocando o valor da transferÊncia em outra conta
                        d.setSaldo(d.getSaldo() + valor);
                    }
                }
            }
        }
    }


    public ArrayList<Conta> pesquisarContasComSaldoNegativo() {
        ArrayList<Conta> contasSaldoNegativo = new ArrayList<>();
        for (Conta c : this.contas) {
            if (c.getSaldo() < 0.0) {
                contasSaldoNegativo.add(c);
            }
        }
        return contasSaldoNegativo;
    }



}

