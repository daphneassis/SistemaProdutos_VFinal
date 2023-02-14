package Pagamento;

import Menus.MenuClienteClasseConcreta;
import Produtos.ProdutoAbstrato;

import java.util.List;

public class Pix implements OpcaoDePagamento {

    protected List <ProdutoAbstrato> listaProdutos;
    protected  MenuClienteClasseConcreta menuClienteClasseConcreta = new MenuClienteClasseConcreta(null, listaProdutos);

    @Override
    public void pagar(List<ProdutoAbstrato> listaProdutosCarrinho) {
        if (analiseAntiFraude() == true) {
            System.out.println("Pagamento via Pix aprovado");
        }
    }

    @Override
    public boolean analiseAntiFraude() {
        if (menuClienteClasseConcreta.precoCarrinhoParaPgto()>= 1000) {
            return false;
        } else {
            return true;
        }
    }
}
