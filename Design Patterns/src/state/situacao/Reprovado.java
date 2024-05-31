package state.situacao;



import state.OrcamentoDesconto;

import java.math.BigDecimal;

public class Reprovado extends SituacaoOrcamento{

    @Override
    public void finalizar(OrcamentoDesconto orcamentoDesconto) {
        orcamentoDesconto.setSituacao(new Finalizado());
    }
}
