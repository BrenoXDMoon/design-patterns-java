package br.com.brenoxdmoon.designpatternsjava.core.desconto;

import br.com.brenoxdmoon.designpatternsjava.core.desconto.cor.Desconto;
import br.com.brenoxdmoon.designpatternsjava.core.desconto.cor.DescontoQuantidadeCincoOuMaior;
import br.com.brenoxdmoon.designpatternsjava.core.desconto.cor.DescontoValorMaiorQueQuinhentos;
import br.com.brenoxdmoon.designpatternsjava.core.desconto.cor.SemDesconto;
import br.com.brenoxdmoon.designpatternsjava.core.domain.entity.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calculaDesconto(Orcamento orcamento) {

        Desconto desconto = Desconto.link(new SemDesconto(),
                new DescontoQuantidadeCincoOuMaior(),
                new DescontoValorMaiorQueQuinhentos());

        return desconto.calcula(orcamento);
    }

}
