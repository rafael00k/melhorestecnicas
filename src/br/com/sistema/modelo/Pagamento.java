package br.com.sistema.modelo ;

import br.com.sistema.interfaces.Documento;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;


public class Pagamento implements Iterable<Pagamento>  {
        private String pagador;
        private Documento documentoPagador;
        private double valor;
        private Calendar data;
        private Collection<Pagamento> pagamentos = new ArrayList<>();


        public String getPagador() {
            return this.pagador;
        }
        public void setPagador(String pagador) {
            this.pagador = pagador;
        }
        public Documento getDocumentoPagador() {
            return this.documentoPagador;
        }
        public void setDocumentoPagador(Documento documentoPagador) {
            this.documentoPagador = documentoPagador;
        }
        public double getValor() {
            return this.valor;
        }
        public void setValor(double valor) {
            this.valor = valor;
        }
        public Calendar getData() {return data;}
        public void setData(Calendar data) {this.data = data;}
    public Collection<Pagamento> getPagamentos() {
        return this.pagamentos;
    }

    public void registra(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
        paga(pagamento.getValor());
    }
    public Collection<Pagamento> pagamentosAntesDe(Calendar data) {
        Collection<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this) {
            if (pagamento.getData().before(data)) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
    public Collection<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this.pagamentos) {
            if (pagamento.getValor() > valorMinimo) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
    public Collection<Pagamento> pagamentosDo(Documento documentoPagador) {
        Collection<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this.pagamentos) {
            if (pagamento.getDocumentoPagador().getValor() == documentoPagador.getValor()) {
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

    @Override
    public Iterator iterator() {
        return pagamentos.iterator();
    }
}

