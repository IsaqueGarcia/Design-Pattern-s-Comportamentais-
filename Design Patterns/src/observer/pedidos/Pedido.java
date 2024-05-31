package observer.pedidos;

import observer.OrcamentoDesconto;

import java.time.LocalDateTime;

public class Pedido {

    private String cliente;
    private LocalDateTime data;
    private OrcamentoDesconto orcamentoDesconto;

    public Pedido(String cliente, LocalDateTime data, OrcamentoDesconto orcamentoDesconto) {
        this.cliente = cliente;
        this.data = data;
        this.orcamentoDesconto = orcamentoDesconto;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public OrcamentoDesconto getOrcamentoDesconto() {
        return orcamentoDesconto;
    }

    public void setOrcamentoDesconto(OrcamentoDesconto orcamentoDesconto) {
        this.orcamentoDesconto = orcamentoDesconto;
    }
}
