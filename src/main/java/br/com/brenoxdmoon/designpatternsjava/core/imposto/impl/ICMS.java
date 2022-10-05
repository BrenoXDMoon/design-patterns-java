package br.com.brenoxdmoon.designpatternsjava.core.imposto.impl;

import br.com.brenoxdmoon.designpatternsjava.core.domain.entity.Orcamento;
import br.com.brenoxdmoon.designpatternsjava.core.imposto.TipoImpostoStrategy;

import java.math.BigDecimal;

public class ICMS implements TipoImpostoStrategy {

    @Override
    public BigDecimal calcula(Orcamento orcamento) {
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.05));
    }

}
