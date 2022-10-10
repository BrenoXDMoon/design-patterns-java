package br.com.brenoxdmoon.designpatternsjava.core.desconto.cor;

import br.com.brenoxdmoon.designpatternsjava.core.domain.entity.Orcamento;

import java.math.BigDecimal;


//SUPER CLASSE usada para aplicar o padrão de projeto Chain of Responsibility e Method Template
public abstract class Desconto {

    protected Desconto proximo;

    //Este método é usado para criar uma cadeia de responsabilidade dada as classes que utilizam de Desconto
    public static Desconto link(Desconto proximo, Desconto... corrente) {
        //define o próximo da cadeia
        Desconto anterior = proximo;
        //para cada Desconto na corrente, é atribuído como próximo da cadeia e o anterior é atualizado
        for (Desconto desconto : corrente) {
            desconto.proximo = anterior;
            anterior = desconto;
        }
        return anterior;
    }

    //Method Template para calcular o desconto. Independente do desconto, ele sempre vai validar se deve aplicar o desconto ou não.
    public BigDecimal calcula(Orcamento orcamento) {
        if (Boolean.TRUE.equals(deveAplicar(orcamento))) {
            return efetuaCalculo(orcamento);
        }
        //Caso exista um próximo na cadeia, ele é chamado.
        if(proximo != null) {
            return proximo.calcula(orcamento);
        }
        return BigDecimal.ZERO;
    }

    protected abstract BigDecimal efetuaCalculo(Orcamento orcamento);

    public abstract Boolean deveAplicar(Orcamento orcamento);
}
