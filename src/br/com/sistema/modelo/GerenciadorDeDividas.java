package src.br.com.sistema.modelo;

public class GerenciadorDeDividas {
    public void efetuaPagamento(Divida divida, double valor) {
        divida.paga(valor);
    }
}
