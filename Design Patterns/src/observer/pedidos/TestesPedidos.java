package observer.pedidos;

import observer.acao.EnviarEmail;
import observer.acao.SalvarPedidoBancoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedidos {

    public static void main(String[] args) {
        String cliente = "Isaque";
        BigDecimal valorOrcamento = new BigDecimal("500");
        int quantidadeItens = Integer.parseInt("4");

        GeraPedido gerador = new GeraPedido(cliente,valorOrcamento,quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(new SalvarPedidoBancoDeDados(), new EnviarEmail())
        );
        handler.execute(gerador);
    }

}
