package command.situacao;



import command.OrcamentoDesconto;

public class Reprovado extends SituacaoOrcamento {

    @Override
    public void finalizar(OrcamentoDesconto orcamentoDesconto) {
        orcamentoDesconto.setSituacao(new Finalizado());
    }
}
