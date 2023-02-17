package pagamento;

public class Boleto implements pagamento.OpcaoDePagamento {

    @Override
    public void pagar() {
        if (analiseAntiFraude()) {
            System.out.println("pagamento via Boleto aceito!");
        }
    }

    @Override
    public boolean analiseAntiFraude() {
        return true;
    }

}
