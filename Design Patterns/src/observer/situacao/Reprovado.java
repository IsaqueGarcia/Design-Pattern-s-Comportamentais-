package observer.situacao;



import observer.OrcamentoDesconto;

public class Reprovado extends SituacaoOrcamento {

    @Override
    public void finalizar(OrcamentoDesconto orcamentoDesconto) {
        orcamentoDesconto.setSituacao(new Finalizado());
    }
}
