package Pagamento;

public class VisualizarFormasDePagamentoClasseConcreta implements VisualizarFormasDePagamentoInterface {

    public VisualizarFormasDePagamentoClasseConcreta() {
    }

    @Override
    public OpcaoDePagamento[] visualizarFormasDePagamento() {
        OpcaoDePagamento[] opcoesArray = new OpcaoDePagamento[4];
        opcoesArray[0] = new Boleto();
        opcoesArray[1] = new CartaoDeCredito();
        opcoesArray[2] = new FaturamentoPj();
        opcoesArray[3] = new Pix();
        System.out.println("Opções de Pagamento: ");
        for (int i = 0; i < opcoesArray.length; i++) {
            System.out.println(i + " "+ opcoesArray[i].getClass().getSimpleName());
        }
        return opcoesArray;
    }
}

