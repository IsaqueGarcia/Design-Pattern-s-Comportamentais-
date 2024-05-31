package templatemethod;

import java.math.BigDecimal;

public class DescontoParaOrcamentoMaisDeCincoItens extends Desconto {

    public DescontoParaOrcamentoMaisDeCincoItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    protected BigDecimal efetuarCalculo(OrcamentoDesconto orcamento) {
        return orcamento.getValue().multiply(new BigDecimal("0.1"));
    }

    @Override
    protected boolean deveAplicar(OrcamentoDesconto orcamentoDesconto) {
        return orcamentoDesconto.getItensQuantity() > 5;
    }

}
