package src.br.com.sistema.modelo;

import java.util.ArrayList;

public class Divida {
    double valorTotal;



    double valorPago;
    String nomeCredor;
    String cnpjCredor;
    private ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();

    public boolean cnpjValido() {
        return primeiroDigitoVerificadorDoCnpj() == primeiroDigitoCorretoParaCnpj()
                && segundoDigitoVerificadorDoCnpj() == segundoDigitoCorretoParaCnpj();
    }
    private int primeiroDigitoCorretoParaCnpj() {
        // Extrai o primeiro dígito verificador do CNPJ armazenado
        // no atributo cnpj
        return 0;
    }
    private int primeiroDigitoVerificadorDoCnpj() {
        // Extrai o segundo dígito verificador do CNPJ armazenado
        // no atributo cnpj
        return 0;
    }
    public ArrayList<Pagamento> getPagamentos() {
        return this.pagamentos;
    }
    public void registra(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
        paga(pagamento.getValor());
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
    public void setValorPago(double valorPago)   {this.valorPago = valorPago;    }
    public void paga(double valor) {
        if (valor > 100) {
            valor = valor - 8;
        }
        this.valorPago += valor;
    }
}
