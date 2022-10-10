package br.com.brenoxdmoon.designpatternsjava.core.pedido.impl;

import br.com.brenoxdmoon.designpatternsjava.core.pedido.Command;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeraPedido implements Command {

    private String cliente;
    private BigDecimal valorOrcamento;
    private Integer quantidadeItens;




}
