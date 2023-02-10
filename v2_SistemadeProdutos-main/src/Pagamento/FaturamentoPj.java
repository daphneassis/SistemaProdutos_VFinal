package Pagamento;

public class FaturamentoPj implements OpcaoDePagamento {
    @Override
    public void pagar() {
        System.out.println("Pagamento via cartão de crédito");
    }
}
