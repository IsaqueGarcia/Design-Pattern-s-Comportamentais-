package strategy;

import java.math.BigDecimal;

public class ICMS implements Imposto{
    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValue().multiply(new BigDecimal("0.1"));
    }
}
