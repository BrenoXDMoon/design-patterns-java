package br.com.brenoxdmoon.designpatternsjava.core.pedido.handler;

import br.com.brenoxdmoon.designpatternsjava.core.domain.entity.Orcamento;
import br.com.brenoxdmoon.designpatternsjava.core.domain.entity.Pedido;
import br.com.brenoxdmoon.designpatternsjava.core.pedido.AcaoObserver;
import br.com.brenoxdmoon.designpatternsjava.core.pedido.impl.GeraPedido;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    List<AcaoObserver> acoes;

    public GeraPedidoHandler(List<AcaoObserver> acoes) {
        this.acoes = acoes;
    }


    public void executa(GeraPedido geraPedido) {
        Orcamento orcamento = new Orcamento(geraPedido.getValorOrcamento(), 4);
        Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);


        acoes.forEach(acao -> acao.executar(pedido));
        //REALIZA ALGUMA AÇÃO COM O PEDIDO
    }
}
