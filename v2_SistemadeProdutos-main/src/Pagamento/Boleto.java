package Pagamento;

import Menus.MenuClienteAbstract;
import Menus.MenuClienteClasseConcreta;
import Produtos.ProdutoAbstrato;

import java.util.List;

public class Boleto implements OpcaoDePagamento {

    private MenuClienteClasseConcreta menuClienteClasseConcreta;
    @Override
    public void pagar() {
        if (analiseAntiFraude() == true) {
            System.out.println("Pagamento via Boleto aceito!");
        }
    }

    @Override
    public boolean analiseAntiFraude() {
        return true;
    }

}
