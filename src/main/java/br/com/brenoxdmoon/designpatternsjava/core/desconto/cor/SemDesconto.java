package br.com.brenoxdmoon.designpatternsjava.core.desconto.cor;

import br.com.brenoxdmoon.designpatternsjava.core.domain.entity.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {


    protected BigDecimal efetuaCalculo(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    public Boolean deveAplicar(Orcamento orcamento) {
        return false;
    }
}
