package observer;

import java.math.BigDecimal;

public class TestesDescontos {

    public static void main(String[] args) {
        OrcamentoDesconto orcamentoDesconto = new OrcamentoDesconto(new BigDecimal("200"),6);
        OrcamentoDesconto orcamentoDesconto2 = new OrcamentoDesconto(new BigDecimal("1000"),1);


        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        System.out.println(calculadoraDeDescontos.calcular(orcamentoDesconto));
        System.out.println(calculadoraDeDescontos.calcular(orcamentoDesconto2));
    }

}
