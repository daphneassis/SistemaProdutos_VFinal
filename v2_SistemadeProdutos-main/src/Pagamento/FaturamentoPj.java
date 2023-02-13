package Pagamento;

import Menus.MenuClienteClasseConcreta;

public class FaturamentoPj implements OpcaoDePagamento {

    private MenuClienteClasseConcreta menuClienteClasseConcreta;

    @Override
    public void pagar() {

        if (analiseAntiFraude() == true) {
            System.out.println("Pagamento via faturamento");
        }
    }
    @Override
    public boolean analiseAntiFraude() {
        return true;
    }

}
