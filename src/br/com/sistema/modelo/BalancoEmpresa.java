package br.com.sistema.modelo;

import java.util.HashMap;

public class BalancoEmpresa {
    private HashMap<Cnpj, Divida> dividas = new HashMap<Cnpj, Divida>();

    public void registraDivida(String credor, Cnpj cnpjCredor, double valor) {
        Divida divida = new Divida();
        divida.setValorTotal(valor);
        divida.setNomeCredor(credor);
        divida.setCnpjCredor(cnpjCredor);
        dividas.put(cnpjCredor, divida);
    }

    public void pagaDivida(Cnpj cnpjCredor,Pagamento pagamento) {
        Divida divida = dividas.get(cnpjCredor);
        if (divida != null) {
            divida.regista(pagamento);
        }
    }
}


