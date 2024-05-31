package observer.pedidos;

import observer.OrcamentoDesconto;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoPedido> acoes;

    public GeraPedidoHandler(List<AcaoPedido> acoes) {
        this.acoes = acoes;
    }

    public void execute(GeraPedido dados){
        Pedido pedido = new Pedido(
                dados.getCliente(),
                LocalDateTime.now(),
                new OrcamentoDesconto(dados.getValorOrcamento(), dados.getQuantidadeItens()));

        acoes.forEach(acao -> acao.executar(pedido));

    }

}
