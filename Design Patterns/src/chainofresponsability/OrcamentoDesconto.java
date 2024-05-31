package chainofresponsability;

import java.math.BigDecimal;

public class OrcamentoDesconto {

    private BigDecimal value;
    private int itensQuantity;

    public OrcamentoDesconto(BigDecimal value, int itensQuantity) {
        this.value = value;
        this.itensQuantity = itensQuantity;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public int getItensQuantity() {
        return itensQuantity;
    }

    public void setItensQuantity(int itensQuantity) {
        this.itensQuantity = itensQuantity;
    }
}
