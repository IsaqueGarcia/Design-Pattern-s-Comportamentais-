package templatemethod;

import java.math.BigDecimal;

public class DescontoValorMaiorQueQuinhentos extends Desconto {

    public DescontoValorMaiorQueQuinhentos(Desconto proximo) {
        super(proximo);
    }

    @Override
    protected BigDecimal efetuarCalculo(OrcamentoDesconto orcamento) {
        return orcamento.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    protected boolean deveAplicar(OrcamentoDesconto orcamentoDesconto) {
        return orcamentoDesconto.getValue().compareTo(new BigDecimal("500")) > 0;
    }

}
