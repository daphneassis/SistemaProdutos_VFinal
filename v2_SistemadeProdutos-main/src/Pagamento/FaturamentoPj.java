package pagamento;

public class FaturamentoPj implements OpcaoDePagamento {


    @Override
    public void pagar() {

        if (analiseAntiFraude()==true) {
            System.out.println("pagamento via faturamento");
        }
    }
    @Override
    public boolean analiseAntiFraude() {
        return true;
    }

}
