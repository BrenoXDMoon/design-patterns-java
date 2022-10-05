package br.com.brenoxdmoon.designpatternsjava.core.desconto.cor;

import br.com.brenoxdmoon.designpatternsjava.core.domain.entity.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconco {

    public SemDesconto() {
        super(null);
    }

    @Override
    public BigDecimal calcula(Orcamento orcamento){
        return BigDecimal.ZERO;
    }
}
