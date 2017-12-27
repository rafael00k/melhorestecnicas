package br.com.sistema.modelo;

import java.util.ArrayList;
import java.util.Calendar;


public class Pagamento extends ArrayList<Pagamento> {
        private String pagador;
        private String cnpjPagador;
        private double valor;
        private Calendar data;


        public String getPagador() {
            return this.pagador;
        }
        public void setPagador(String pagador) {
            this.pagador = pagador;
        }
        public String getCnpjPagador() {
            return this.cnpjPagador;
        }
        public void setCnpjPagador(String cnpjPagador) {
            this.cnpjPagador = cnpjPagador;
        }
        public double getValor() {
            return this.valor;
        }
        public void setValor(double valor) {
            this.valor = valor;
        }
        public Calendar getData() {return data;}
        public void setData(Calendar data) {this.data = data;}
    public ArrayList<Pagamento> getPagamentos() {
        return this;
    }
    public void registra(Pagamento pagamento) {
        this.add(pagamento);
        paga(pagamento.getValor());
    }
    public ArrayList<Pagamento> pagamentosAntesDe(Calendar data) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this) {
            if (pagamento.getData().before(data)) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
    public ArrayList<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this) {
            if (pagamento.getValor() > valorMinimo) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
    public ArrayList<Pagamento> pagamentosDo(String cnpjPagador) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this) {
            if (pagamento.getCnpjPagador().equals(cnpjPagador)) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
    public void paga(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor invalido para pagamento");
        }
        if (valor > 100) {
            valor = valor - 8;
        }
        this.valor += valor;
    }
    }

