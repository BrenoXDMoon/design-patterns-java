package br.com.brenoxdmoon.designpatternsjava.core.pedido.handler;

import br.com.brenoxdmoon.designpatternsjava.core.domain.entity.Orcamento;
import br.com.brenoxdmoon.designpatternsjava.core.domain.entity.Pedido;
import br.com.brenoxdmoon.designpatternsjava.core.pedido.impl.GeraPedido;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    public void executa(GeraPedido geraPedido) {
        Orcamento orcamento = new Orcamento(geraPedido.getValorOrcamento(), 4);
        Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);

        //REALIZA ALGUMA AÇÃO COM O PEDIDO
    }
}
