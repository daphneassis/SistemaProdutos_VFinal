package Pagamento;


import Menus.MenuClienteClasseConcreta;
import Produtos.ProdutoAbstrato;

import java.util.List;
import java.util.Scanner;

public class CartaoDeCredito  implements OpcaoDePagamento  {

    protected List <ProdutoAbstrato> listaProdutos;

    protected  MenuClienteClasseConcreta menuClienteClasseConcreta = new MenuClienteClasseConcreta(null, listaProdutos);

    @Override
    public void pagar(List<ProdutoAbstrato> listaProdutosCarrinho) {
        if (analiseAntiFraude() == true) {
            System.out.println("Pagamento via Cartão de Crédito aprovado!");
        }
    }

    @Override
    public boolean analiseAntiFraude() {
        if (menuClienteClasseConcreta.precoCarrinhoParaPgto()>= 2000) {
            return false;
        } else {
            return true;
        }
    }
}