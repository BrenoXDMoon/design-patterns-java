package br.com.brenoxdmoon.designpatternsjava;

import br.com.brenoxdmoon.designpatternsjava.core.desconto.CalculadoraDeDescontos;
import br.com.brenoxdmoon.designpatternsjava.core.domain.entity.Orcamento;
import br.com.brenoxdmoon.designpatternsjava.core.domain.service.EnviarEmail;
import br.com.brenoxdmoon.designpatternsjava.core.domain.service.SalvarPedido;
import br.com.brenoxdmoon.designpatternsjava.core.imposto.CalculadoraDeImpostos;
import br.com.brenoxdmoon.designpatternsjava.core.imposto.impl.ICMS;
import br.com.brenoxdmoon.designpatternsjava.core.pedido.handler.GeraPedidoHandler;
import br.com.brenoxdmoon.designpatternsjava.core.pedido.impl.GeraPedido;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

class TestesPadroesDeProjetoTest {

    @Test
    //Strategy
    void testaCalculoImpostoICMS() {
        Orcamento orcamento = new Orcamento(BigDecimal.TEN);
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        ICMS icms = new ICMS();
        Assertions.assertNotNull(calculadoraDeImpostos.realizaCalculo(orcamento, icms));
    }

    @Test
    //Chain of Responsibility e Method Template
    void testeDesconto() {
        Orcamento orcamento = new Orcamento(BigDecimal.valueOf(200), 4);
        Orcamento orcamento2 = new Orcamento(BigDecimal.valueOf(1000), 1);

        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        Assertions.assertNotNull(calculadoraDeDescontos.calculaDesconto(orcamento));
        Assertions.assertNotNull(calculadoraDeDescontos.calculaDesconto(orcamento2));
    }

    @Test
    void testePedidos() {
        String cliente = "Breno";
        BigDecimal valorOrcamento = BigDecimal.valueOf(1000);
        Integer quantidadeItens = 1;

        GeraPedido geraPedido = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(List.of(new EnviarEmail(), new SalvarPedido()));
        handler.executa(geraPedido);

    }


}
