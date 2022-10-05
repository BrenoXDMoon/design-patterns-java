package br.com.brenoxdmoon.designpatternsjava.core.imposto;

import br.com.brenoxdmoon.designpatternsjava.core.domain.entity.Orcamento;

import java.math.BigDecimal;

public interface TipoImpostoStrategy {
    BigDecimal calcula(Orcamento orcamento);
}
