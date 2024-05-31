package observer.acao;

import observer.pedidos.AcaoPedido;
import observer.pedidos.Pedido;

public class EnviarEmail implements AcaoPedido {

    public void executar(Pedido pedido){
        System.out.println("Enviando e-mail com dados do pedido");
    }

}
