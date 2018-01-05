package br.com.sistema.modelo;

import br.com.sistema.interfaces.Documento;

public class Cnpj implements Documento {
    private String cnpj;
    public Cnpj ( String cnpj){
        this.cnpj = cnpj;
    }
    public boolean ehValido() {
        return primeiroDigitoVerificadorDoCnpj() == primeiroDigitoCorretoParaCnpj()
                && segundoDigitoVerificadorDoCnpj() == segundoDigitoCorretoParaCnpj();
    }

    @Override
    public String getValor() {
        return cnpj;
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
    private int segundoDigitoCorretoParaCnpj() {
        // Calcula o primeiro dígito verificador correto para
        // o CNPJ armazenado no atributo cnpj
        return 0;
    }
    private int segundoDigitoVerificadorDoCnpj() {
        // Calcula o primeiro dígito verificador correto para
        // o CNPJ armazenado no atributo cnpj
        return 0;
    }

}
