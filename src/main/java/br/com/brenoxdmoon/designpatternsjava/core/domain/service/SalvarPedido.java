package br.com.brenoxdmoon.designpatternsjava.core.domain.service;

import br.com.brenoxdmoon.designpatternsjava.core.domain.entity.Pedido;
import br.com.brenoxdmoon.designpatternsjava.core.pedido.AcaoObserver;

public class SalvarPedido implements AcaoObserver {

    @Override
    public void executar(Pedido pedido){
        System.out.println("Salvando pedido");
    }

}
