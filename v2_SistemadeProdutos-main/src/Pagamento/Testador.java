package Pagamento;

public class Testador {
    public static void main(String[] args) {

        VisualizarFormasDePagamentoClasseConcreta visualizarFormasDePagamentoClasseConcreta = new VisualizarFormasDePagamentoClasseConcreta();
        SelecionarOpcaoPagamentosClasseConcreta selecionarOpcaoPagamentosClasseConcreta = new SelecionarOpcaoPagamentosClasseConcreta();

        GatewayDePagamento gatewayDePagamento = new SistemaDePagamentoMenu(selecionarOpcaoPagamentosClasseConcreta, visualizarFormasDePagamentoClasseConcreta);
        gatewayDePagamento.pagar();
    }
}


