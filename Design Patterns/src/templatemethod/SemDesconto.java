package templatemethod;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {

    public SemDesconto() {
        super(null);
    }

    @Override
    protected BigDecimal efetuarCalculo(OrcamentoDesconto orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    protected boolean deveAplicar(OrcamentoDesconto orcamentoDesconto) {
        return true;
    }

}
