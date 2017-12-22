package src.br.com.sistema.modelo;

import java.util.HashMap;

public class BalancoEmpresa {
    private HashMap<String, Divida> dividas = new HashMap<>();
    public void criaDivida (String nome,String cnpj , double valorTotal){
        Divida divida = new Divida ();
        divida.setValorTotal(valorTotal);
        divida.setNomeCredor(nome);
        divida.setCnpjCredor(cnpj);
        dividas.put(cnpj,divida);

    }
    public void paga (double valor,String cnpj) {
        if (cnpj == null){
            throw new NullPointerException("Valor nulo!!!!");

        }
        if ( !(cnpj instanceof String)){
            throw new IllegalArgumentException("CNPJ não está no formato certo !!!!");
        }
        Divida divida = dividas.get(cnpj);
        if(divida != null) {
            divida.paga(valor);
        }



        }

     }


