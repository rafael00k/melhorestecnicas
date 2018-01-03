package br.com.sistema.modelo;

public class GerenciadorDeDividas {
    public void efetuaPagamento(Divida divida, Pagamento pagamento) {
        divida.regista(pagamento);
    }
}
