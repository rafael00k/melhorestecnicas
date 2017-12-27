package br.com.sistema.modelo;


public class Divida {
    private double valorTotal;

    private String nomeCredor;
    private Cnpj cnpjCredor;
    private Pagamento pagamentos = new Pagamento();



    //getters e setter da divida
    public double getValorTotal() {
        return valorTotal;
    }
    public String getNomeCredor() {
        return nomeCredor;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public void setNomeCredor(String nomeCredor) {
        this.nomeCredor = nomeCredor;
    }
    public Cnpj getCnpjCredor() {return cnpjCredor;}
    public void setCnpjCredor(Cnpj cnpj) {this.cnpjCredor = cnpj;}
    // outros metodos
    public Pagamento getPagamentos (){return this.pagamentos;}



    public double valorAPagar() {
        return this.valorTotal - this.pagamentos.getValor();
    }
}
