package state;

import java.math.BigDecimal;

public class DescontoParaOrcamentoMaisDeCincoItens extends Desconto {

    public DescontoParaOrcamentoMaisDeCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(OrcamentoDesconto orcamento) {

        if (orcamento.getItensQuantity() > 5) {
            return orcamento.getValue().multiply(new BigDecimal("0.1"));
        }

        return proximo.calcular(orcamento);
    }

}
