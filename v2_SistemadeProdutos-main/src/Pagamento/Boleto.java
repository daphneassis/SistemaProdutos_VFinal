package Pagamento;

public class Boleto implements OpcaoDePagamento {
    @Override
    public  void pagar() {
        System.out.println("Pagamento Via Boleto");
    }

}
