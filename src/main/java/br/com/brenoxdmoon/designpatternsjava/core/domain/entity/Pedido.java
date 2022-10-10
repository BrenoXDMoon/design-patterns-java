package br.com.brenoxdmoon.designpatternsjava.core.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {

    private String cliente;
    private LocalDateTime data;
    private Orcamento orcamento;

}
