package carrinhoDeCompras;

import Produtos.ProdutoAbstrato;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarrinhoDeCompras implements AcoesCarrinhoDeCompras{

    private Scanner sc = new Scanner(System.in);

    private static List<ProdutoAbstrato>listaProdutosCarrinho = new ArrayList<>();

    public void selecionarProdutoParaCarrinho() {
        System.out.println("Digite o nome do produto que deseja adicionar ao carrinho: ");
        String nome = sc.next();
        boolean aux = true;
        for (ProdutoAbstrato cadaProduto : ProdutoAbstrato.listaProdutos) {
            if (cadaProduto.getNome().equals(nome)) {
                System.out.println("Produto adicionado ao carrinho: " + cadaProduto.getNome() + " , R$" + cadaProduto.getPreco());
                listaProdutosCarrinho.add(cadaProduto);
                aux = false;
            }
        }
        if (aux == true) {
            System.out.println("Produto não encontrado!");
        }
    }
    public void verListaProdutosCarrinho() {
        for (ProdutoAbstrato cadaProduto : listaProdutosCarrinho) {
            System.out.println(cadaProduto);
        }
    }
    public double precoCarrinhoParaPgto() {
        double valor = 0;
        for (ProdutoAbstrato cadaProduto : listaProdutosCarrinho) {
            valor += cadaProduto.getPreco();
        }
        System.out.println("O preço total do carrinho é de:R$ " + valor);
        return valor;
    }

    public void pagamento(){
        pagamento.VisualizarFormasDePagamentoClasseConcreta visualizarFormasDePagamentoClasseConcreta = new pagamento.VisualizarFormasDePagamentoClasseConcreta();
        pagamento.SelecionarOpcaoPagamentosClasseConcreta selecionarOpcaoPagamentosClasseConcreta = new pagamento.SelecionarOpcaoPagamentosClasseConcreta();

        pagamento.GatewayDePagamento gatewayDePagamento = new pagamento.SistemaDePagamentoMenu(selecionarOpcaoPagamentosClasseConcreta, visualizarFormasDePagamentoClasseConcreta);
        gatewayDePagamento.pagar();
    }

    public List<ProdutoAbstrato> getListaProdutosCarrinho() {
        return listaProdutosCarrinho;
    }

}
