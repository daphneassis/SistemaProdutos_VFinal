package Pagamento;

import Produtos.ProdutoAbstrato;

import java.util.List;

public class SistemaDePagamentoMenu implements GatewayDePagamento {

    private final SelecionarOpcoesPagamentosInterface selecionarOpcoesPagamentosInterface;
    private final VisualizarFormasDePagamentoInterface visualizarFormasDePagamentoInterface;

    public SistemaDePagamentoMenu(SelecionarOpcoesPagamentosInterface selecionarOpcoesPagamentosInterface, VisualizarFormasDePagamentoInterface visualizarFormasDePagamentoInterface) {
        this.selecionarOpcoesPagamentosInterface = selecionarOpcoesPagamentosInterface;
        this.visualizarFormasDePagamentoInterface = visualizarFormasDePagamentoInterface;
    }

    @Override
    public void pagar(List<ProdutoAbstrato> listaProdutosCarrinho) {
        OpcaoDePagamento[] opcoesArray= visualizarFormasDePagamentoInterface.visualizarFormasDePagamento();
        OpcaoDePagamento opcaoDePagamento = selecionarOpcoesPagamentosInterface.escolherOpcao(opcoesArray);
        opcaoDePagamento.pagar(listaProdutosCarrinho);
    }
}
