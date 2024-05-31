package command.situacao;



import command.OrcamentoDesconto;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(OrcamentoDesconto orcamentoDesconto){
        return orcamentoDesconto.getValue().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finalizar(OrcamentoDesconto orcamentoDesconto) {
        orcamentoDesconto.setSituacao(new Finalizado());
    }
}
