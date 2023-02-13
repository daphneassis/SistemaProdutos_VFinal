package Pagamento;

import Menus.MenuClienteAbstract;
import Menus.MenuClienteClasseConcreta;
import Produtos.ProdutoAbstrato;

import java.util.List;
import java.util.Scanner;

public class CartaoDeCredito implements OpcaoDePagamento  {
    private MenuClienteClasseConcreta menuClienteClasseConcreta;

    @Override
    public void pagar() {
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