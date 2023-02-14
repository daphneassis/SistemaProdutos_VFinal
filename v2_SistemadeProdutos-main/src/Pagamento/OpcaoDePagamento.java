package Pagamento;

import Produtos.ProdutoAbstrato;

import java.util.List;

public interface OpcaoDePagamento {

    void pagar(List<ProdutoAbstrato> listaProdutosCarrinho);
    boolean analiseAntiFraude();
}
