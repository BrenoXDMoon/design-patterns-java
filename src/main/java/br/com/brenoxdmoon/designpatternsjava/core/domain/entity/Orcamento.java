package br.com.brenoxdmoon.designpatternsjava.core.domain.entity;

import br.com.brenoxdmoon.designpatternsjava.core.situacao.EmAnalise;
import br.com.brenoxdmoon.designpatternsjava.core.situacao.SituacaoOrcamento;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class Orcamento {

    private BigDecimal valor;
    private Integer quantidadeItens;
    private SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor) {
        this.valor = valor;
    }

    public Orcamento(BigDecimal valor, Integer quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.situacao = new EmAnalise();
    }


    public void aplicarDescontoExtra() {
        this.situacao.calcularValorDescontoExtra(this);
    }

    public void aprovar() {
        this.situacao.aprovar(this);
    }

    public void reprovar() {
        this.situacao.reprovar(this);
    }

    public void finalizar() {
        this.situacao.finalizar(this);
    }

}
