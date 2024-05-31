package state;

import state.situacao.EmAnalise;
import state.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class OrcamentoDesconto {

    private BigDecimal value;
    private int itensQuantity;
    private SituacaoOrcamento situacao;

    public OrcamentoDesconto(BigDecimal value, int itensQuantity) {
        this.value = value;
        this.itensQuantity = itensQuantity;
        this.situacao = new EmAnalise();
    }

    public void aplicarDescontoExtra(){
        BigDecimal valorDoDescontoExtra  = this.situacao.calcularValorDescontoExtra(this);
        this.value = this.value.subtract(valorDoDescontoExtra);
    }

    public void aprovar(){
        this.situacao.aprovar(this);
    }

    public void reprovar(){
        this.situacao.reprovar(this);
    }

    public void finalizar(){
        this.situacao.finalizar(this);
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

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }
}
