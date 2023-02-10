package Pagamento;

public class CartaoDeCredito implements OpcaoDePagamento {
    @Override
    public void pagar() {
        System.out.println("Pagamento via cartão de crédito");
    }
}
