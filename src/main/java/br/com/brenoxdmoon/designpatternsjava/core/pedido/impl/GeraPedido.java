package br.com.brenoxdmoon.designpatternsjava.core.pedido.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeraPedido {

    private String cliente;
    private BigDecimal valorOrcamento;
    private Integer quantidadeItens;




}
