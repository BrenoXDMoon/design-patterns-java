package br.com.brenoxdmoon.designpatternsjava.core.desconto.cor;

import br.com.brenoxdmoon.designpatternsjava.core.domain.entity.Orcamento;

import java.math.BigDecimal;

public class DescontoValorMaiorQueQuinhentos extends Desconco {

    public DescontoValorMaiorQueQuinhentos(Desconco proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal calcula(Orcamento orcamento){
        if (orcamento.getValor().compareTo(BigDecimal.valueOf(500)) > 0){
            return orcamento.getValor().multiply(new BigDecimal("0.07"));
        }
        return proximo.calcula(orcamento);
    }

}
