package pagamento;

import Produtos.ProdutoAbstrato;

import java.util.List;

public interface OpcaoDePagamento {

    void pagar();
    boolean analiseAntiFraude();
}
