package chainofresponsability;

import java.math.BigDecimal;

public class DescontoValorMaiorQueQuinhentos extends Desconto{

    public DescontoValorMaiorQueQuinhentos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(OrcamentoDesconto orcamento) {

        if(orcamento.getValue().compareTo(new BigDecimal("500")) > 0){
            return orcamento.getValue().multiply(new BigDecimal("0.05"));
        }

        return proximo.calcular(orcamento);
    }

}
