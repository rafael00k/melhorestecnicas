package br.com.sistema.modelo;

public class Divida {
    double valorTotal;
    double valorPago;
    String nomeCredor;
    String cnpjCredor;

    public Divida(double valorTotal, double valorPago, String nomeCredor, String cnpjCredor) {
        this.valorTotal = valorTotal;
        this.valorPago = valorPago;
        this.nomeCredor = nomeCredor;
        this.cnpjCredor = cnpjCredor;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public double getValorPago() {
        return valorPago;
    }

    public String getNomeCredor() {
        return nomeCredor;
    }

    public String getCnpjCredor() {
        return cnpjCredor;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setNomeCredor(String nomeCredor) {
        this.nomeCredor = nomeCredor;
    }

    public void setCnpjCredor(String cnpjCredor) {
        this.cnpjCredor = cnpjCredor;
    }
    public void paga (double valor){
        this.valorPago += valor;
    }
}
