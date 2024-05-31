package observer.acao;

import observer.pedidos.AcaoPedido;
import observer.pedidos.Pedido;

public class SalvarPedidoBancoDeDados implements AcaoPedido {

    public void executar(Pedido pedido){
        System.out.println("Salvar pedido no banco de dados");
    }

}
