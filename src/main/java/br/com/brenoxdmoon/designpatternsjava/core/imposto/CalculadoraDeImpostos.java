package br.com.brenoxdmoon.designpatternsjava.core.imposto;

import br.com.brenoxdmoon.designpatternsjava.core.domain.entity.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal realizaCalculo(Orcamento orcamento, TipoImpostoStrategy imposto) {

        return imposto.calcula(orcamento);
    }

}
