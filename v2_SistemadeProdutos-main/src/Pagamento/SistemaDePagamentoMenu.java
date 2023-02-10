package Pagamento;

public class SistemaDePagamentoMenu implements GatewayDePagamento {

    private final SelecionarOpcoesPagamentosInterface selecionarOpcoesPagamentosInterface;
    private final VisualizarFormasDePagamentoInterface visualizarFormasDePagamentoInterface;

    public SistemaDePagamentoMenu(SelecionarOpcoesPagamentosInterface selecionarOpcoesPagamentosInterface, VisualizarFormasDePagamentoInterface visualizarFormasDePagamentoInterface) {
        this.selecionarOpcoesPagamentosInterface = selecionarOpcoesPagamentosInterface;
        this.visualizarFormasDePagamentoInterface = visualizarFormasDePagamentoInterface;
    }

    @Override
    public void pagar() {
        OpcaoDePagamento[] opcoesArray= visualizarFormasDePagamentoInterface.visualizarFormasDePagamento();
        OpcaoDePagamento opcaoDePagamento = selecionarOpcoesPagamentosInterface.escolherOpcao(opcoesArray);
        opcaoDePagamento.pagar();
    }
}
