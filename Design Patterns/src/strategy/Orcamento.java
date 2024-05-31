package strategy;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal value;

    public Orcamento(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
