package br.com.brenoxdmoon.designpatternsjava.core.desconto.cor;

import br.com.brenoxdmoon.designpatternsjava.core.domain.entity.Orcamento;

import java.math.BigDecimal;

public abstract class Desconco {

    protected Desconco proximo;

    protected Desconco(Desconco proximo) {
        this.proximo = proximo;
    }

    public abstract BigDecimal calcula(Orcamento orcamento);
}
