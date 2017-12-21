package br.com.sistema.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class BalancoEmpresa {
    Collection<Divida> dividas = new ArrayList<>();
    public void criaDivida (String nome,String cnpj , double valorTotal){
        dividas.add(new Divida(valorTotal, 0,nome,cnpj));
    }
    public void paga (double valor,String cnpj) {
        for (Divida divida: dividas) {
            if (divida.getCnpjCredor()==cnpj){
                divida.paga(valor);
            }

        }
    }
}
