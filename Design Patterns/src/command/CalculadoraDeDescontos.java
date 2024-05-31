package command;


import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(OrcamentoDesconto orcamento) {

        Desconto desconto = new DescontoParaOrcamentoMaisDeCincoItens(
                new DescontoValorMaiorQueQuinhentos(
                        new SemDesconto()));


        return desconto.calcular(orcamento);
    }

}
