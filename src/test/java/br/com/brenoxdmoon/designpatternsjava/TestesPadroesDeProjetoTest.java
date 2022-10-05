package br.com.brenoxdmoon.designpatternsjava;

import br.com.brenoxdmoon.designpatternsjava.core.desconto.CalculadoraDeDescontos;
import br.com.brenoxdmoon.designpatternsjava.core.domain.entity.Orcamento;
import br.com.brenoxdmoon.designpatternsjava.core.imposto.CalculadoraDeImpostos;
import br.com.brenoxdmoon.designpatternsjava.core.imposto.impl.ICMS;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class TestesPadroesDeProjetoTest {

    @Test
    //Strategy
    void testaCalculoImpostoICMS() {
        Orcamento orcamento = new Orcamento(BigDecimal.TEN);
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        ICMS icms = new ICMS();
        System.out.println(calculadoraDeImpostos.realizaCalculo(orcamento, icms));
    }

    @Test
    //Chain of Responsibility
    void testeDesconto() {
        Orcamento orcamento = new Orcamento(BigDecimal.valueOf(200), 4);
        Orcamento orcamento2 = new Orcamento(BigDecimal.valueOf(1000), 1);

        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        System.out.println(calculadoraDeDescontos.calculaDesconto(orcamento));
        System.out.println(calculadoraDeDescontos.calculaDesconto(orcamento2));
    }


}
