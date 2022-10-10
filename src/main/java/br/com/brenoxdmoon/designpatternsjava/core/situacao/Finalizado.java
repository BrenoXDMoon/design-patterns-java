package br.com.brenoxdmoon.designpatternsjava.core.situacao;

import br.com.brenoxdmoon.designpatternsjava.core.domain.entity.Orcamento;

public class Finalizado implements SituacaoOrcamento {

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
