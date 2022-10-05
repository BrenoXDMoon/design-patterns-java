package br.com.brenoxdmoon.designpatternsjava.core.desconto.cor;

import br.com.brenoxdmoon.designpatternsjava.core.domain.entity.Orcamento;

import java.math.BigDecimal;

public class DescontoQuantidadeCincoOuMaior extends Desconco{

    public DescontoQuantidadeCincoOuMaior(Desconco proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal calcula(Orcamento orcamento){
        if(orcamento.getQuantidadeItens() > 5){
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return proximo.calcula(orcamento);
    }

}
