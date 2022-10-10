package br.com.brenoxdmoon.designpatternsjava.core.desconto.cor;

import br.com.brenoxdmoon.designpatternsjava.core.domain.entity.Orcamento;

import java.math.BigDecimal;

public class DescontoValorMaiorQueQuinhentos extends Desconto {

    @Override
    protected BigDecimal efetuaCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.07"));
    }

    @Override
    public Boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(BigDecimal.valueOf(500)) > 0;
    }

}
