package br.com.sistema.modelo;


import br.com.sistema.interfaces.Documento;

public class Divida {
    private double valorTotal;

    private String nomeCredor;
    private Documento documento;
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
    public Documento getDocumento() {return this.documento;}
    public void setDocumento( Documento documento) {this.documento = documento;}
    // outros metodos
   public double valorAPagar() {
        return this.valorTotal - this.pagamentos.getValor();
    }

    public void regista(Pagamento pagamento) {
        this.pagamentos.registra(pagamento);
    }
}
