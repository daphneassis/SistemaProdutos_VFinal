package Pagamento;

public class Pix implements OpcaoDePagamento {
    @Override
    public void pagar() {
        System.out.println("Pagamento via Pix");
    }
}
