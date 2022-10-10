package br.com.brenoxdmoon.designpatternsjava.core.desconto.cor;

import br.com.brenoxdmoon.designpatternsjava.core.domain.entity.Orcamento;

import java.math.BigDecimal;

public class DescontoQuantidadeCincoOuMaior extends Desconto {

    @Override
    protected BigDecimal efetuaCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }


    @Override
    public Boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }

}
