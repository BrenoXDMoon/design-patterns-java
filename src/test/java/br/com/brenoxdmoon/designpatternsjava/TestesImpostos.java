package br.com.brenoxdmoon.designpatternsjava;

import br.com.brenoxdmoon.designpatternsjava.core.domain.entity.Orcamento;
import br.com.brenoxdmoon.designpatternsjava.core.imposto.CalculadoraDeImpostos;
import br.com.brenoxdmoon.designpatternsjava.core.imposto.impl.ICMS;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class TestesImpostos {

    @Test
    public void testaCalculoImpostoICMS() {
        Orcamento orcamento = new Orcamento(BigDecimal.TEN);
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        ICMS icms = new ICMS();
        System.out.println(calculadoraDeImpostos.realizaCalculo(orcamento, icms));
    }

}
