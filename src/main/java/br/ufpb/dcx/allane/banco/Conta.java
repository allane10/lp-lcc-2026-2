package br.ufpb.dcx.allane.banco;

public class Conta {
    private String cpfTitular;
    private String numeroConta;
    private String numeroAgencia;
    private double saldo;

    public Conta (String cpfTitular, String numeroConta, String numeroAgencia, double saldo){
        this.cpfTitular = cpfTitular;
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.saldo = saldo;
    }
    public Conta(){
        this("", "", "", 0.0);
    }
    public String getCpfTitular(){
        return this.cpfTitular;
    }
    public String getNumeroConta (){
        return this.numeroConta;
    }
    public String getNumeroAgencia (){
        return this.numeroAgencia;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setCpfTitular(String cpfTitular){
        this.cpfTitular = cpfTitular;
    }
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta número " + this.numeroConta + " do cliente de CPF"+ this.cpfTitular;
    }
}
