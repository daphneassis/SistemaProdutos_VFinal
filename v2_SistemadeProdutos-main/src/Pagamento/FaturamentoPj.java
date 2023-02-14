package Pagamento;

import Produtos.ProdutoAbstrato;

import java.util.List;

public class FaturamentoPj implements OpcaoDePagamento {

    protected List<ProdutoAbstrato> listaProdutosCarrinho;

    @Override
    public void pagar(List<ProdutoAbstrato> listaProdutosCarrinho) {

        if (analiseAntiFraude() == true) {
            System.out.println("Pagamento via faturamento");
        }
    }
    @Override
    public boolean analiseAntiFraude() {
        return true;
    }

}
