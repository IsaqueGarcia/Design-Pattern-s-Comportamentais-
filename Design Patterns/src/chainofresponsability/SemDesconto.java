package chainofresponsability;

import java.math.BigDecimal;

public class SemDesconto extends Desconto{

    public SemDesconto() {
        super(null);
    }

    public BigDecimal calcular(OrcamentoDesconto orcamento) {
        return BigDecimal.ZERO;
    }

}
