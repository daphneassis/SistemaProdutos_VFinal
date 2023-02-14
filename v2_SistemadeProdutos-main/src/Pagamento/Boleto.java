package Pagamento;

import Produtos.ProdutoAbstrato;

import java.util.List;

public class Boleto implements OpcaoDePagamento {

@Override
    public void pagar(List<ProdutoAbstrato> listaProdutosCarrinho) {
        if (analiseAntiFraude() == true) {
            System.out.println("Pagamento via Boleto aceito!");
        }
    }

    @Override
    public boolean analiseAntiFraude() {
        return true;
    }

}
