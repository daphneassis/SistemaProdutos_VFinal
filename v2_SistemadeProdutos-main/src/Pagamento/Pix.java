package Pagamento;

import Menus.MenuClienteClasseConcreta;

public class Pix implements OpcaoDePagamento {

    private MenuClienteClasseConcreta menuClienteClasseConcreta;

    @Override
    public void pagar() {
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
