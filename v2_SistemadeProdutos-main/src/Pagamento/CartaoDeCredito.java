package pagamento;


import carrinhoDeCompras.CarrinhoDeCompras;

import java.util.Scanner;


public class CartaoDeCredito implements OpcaoDePagamento {

    private CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

    @Override
    public void pagar() {
        if (analiseAntiFraude() == true) {
            System.out.println("pagamento via Cartão de Crédito aprovado!");
        } else {
            System.out.println("Forma de pagamento não aceita para esse valor");
        }
    }

    @Override
    public boolean analiseAntiFraude() {
        if (carrinhoDeCompras.precoCarrinhoParaPgto()>= 2000) {
            return false;
        } else {
            return true;
        }
    }
}



