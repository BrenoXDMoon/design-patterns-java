package br.com.brenoxdmoon.designpatternsjava.core.situacao;

import br.com.brenoxdmoon.designpatternsjava.core.domain.entity.Orcamento;
import br.com.brenoxdmoon.designpatternsjava.core.domain.exception.DomainException;

import java.math.BigDecimal;

//Classe abstrata que utiliza do padrão State para representar as situações de um orçamento.
public interface SituacaoOrcamento {

    default BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    default void aprovar(Orcamento orcamento) {
        throw new DomainException("Orçamento não pode ser aprovado");
    }

    default void reprovar(Orcamento orcamento) {
        throw new DomainException("Orçamento não pode ser reprovado");
    }

    default void finalizar(Orcamento orcamento) {
        throw new DomainException("Orçamento não pode ser finalizado");
    }
}
