package br.com.sistema.modelo;

import br.com.sistema.interfaces.Documento;

import java.util.HashMap;

public class BalancoEmpresa {
    private HashMap<Documento, Divida> dividas = new HashMap<Documento, Divida>();

    public void registraDivida(String credor, Documento documentoCredor, double valor) {
        Divida divida = new Divida();
        divida.setValorTotal(valor);
        divida.setNomeCredor(credor);
        divida.setDocumento(documentoCredor);
        dividas.put(documentoCredor, divida);
    }

    public void pagaDivida(Documento documentoCredor,Pagamento pagamento) {
        Divida divida = dividas.get(documentoCredor);
        if (divida != null) {
            divida.regista(pagamento);
        }
    }
}


