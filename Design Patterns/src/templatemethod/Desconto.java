package templatemethod;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }


    public BigDecimal calcular(OrcamentoDesconto orcamento){
        if(deveAplicar(orcamento)){
            return efetuarCalculo(orcamento);
        }
        return  proximo.calcular(orcamento);
    }

    protected abstract BigDecimal efetuarCalculo(OrcamentoDesconto orcamento);
    protected abstract boolean deveAplicar(OrcamentoDesconto orcamentoDesconto);
}
