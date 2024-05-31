package state.situacao;



import state.OrcamentoDesconto;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento{

    public BigDecimal calcularValorDescontoExtra(OrcamentoDesconto orcamentoDesconto){
        return orcamentoDesconto.getValue().multiply(new BigDecimal("0.05"));
    }

    public void aprovar(OrcamentoDesconto orcamentoDesconto){
        orcamentoDesconto.setSituacao(new Aprovado());
    }

    public void reprovar(OrcamentoDesconto orcamentoDesconto){
        orcamentoDesconto.setSituacao(new Reprovado());
    }

}
