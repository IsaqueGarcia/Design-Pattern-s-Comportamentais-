package observer.situacao;

import observer.DomainException;
import observer.OrcamentoDesconto;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(OrcamentoDesconto orcamentoDesconto){
        return BigDecimal.ZERO;
    }

    public void aprovar(OrcamentoDesconto orcamentoDesconto){
        throw new DomainException("Orçamento não pode ser aprovado!");
    }

    public void reprovar(OrcamentoDesconto orcamentoDesconto){
        throw new DomainException("Orçamento não pode ser reprovado!");
    }

    public void finalizar(OrcamentoDesconto orcamentoDesconto){
        throw new DomainException("Orçamento não pode ser finalizado!");
    }

}
