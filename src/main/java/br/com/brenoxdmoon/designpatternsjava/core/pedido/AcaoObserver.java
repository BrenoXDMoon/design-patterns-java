package br.com.brenoxdmoon.designpatternsjava.core.pedido;

import br.com.brenoxdmoon.designpatternsjava.core.domain.entity.Pedido;

public interface AcaoObserver {

    void executar(Pedido pedido);

}
