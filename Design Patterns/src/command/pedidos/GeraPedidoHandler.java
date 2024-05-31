package command.pedidos;

import command.OrcamentoDesconto;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    //Construtor com injeção de dependecias

    public void execute(GeraPedido dados){
        Pedido pedido = new Pedido(
                dados.getCliente(),
                LocalDateTime.now(),
                new OrcamentoDesconto(dados.getValorOrcamento(), dados.getQuantidadeItens()));

        System.out.println("Salvar pedido no banco de dados");
        System.out.println("Enviar email com dados do novo pedido");
    }

}
