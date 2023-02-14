package Pagamento;

import Produtos.ProdutoAbstrato;

import java.util.List;

public interface GatewayDePagamento {

    void pagar(List<ProdutoAbstrato> listaProdutosCarrinho);
}
