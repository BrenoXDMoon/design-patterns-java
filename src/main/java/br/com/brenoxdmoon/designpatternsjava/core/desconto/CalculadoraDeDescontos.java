package br.com.brenoxdmoon.designpatternsjava.core.desconto;

import br.com.brenoxdmoon.designpatternsjava.core.desconto.cor.DescontoQuantidadeCincoOuMaior;
import br.com.brenoxdmoon.designpatternsjava.core.desconto.cor.DescontoValorMaiorQueQuinhentos;
import br.com.brenoxdmoon.designpatternsjava.core.desconto.cor.SemDesconto;
import br.com.brenoxdmoon.designpatternsjava.core.domain.entity.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calculaDesconto(Orcamento orcamento){

        return new DescontoQuantidadeCincoOuMaior(new DescontoValorMaiorQueQuinhentos(new SemDesconto())).calcula(orcamento);
    }

}
