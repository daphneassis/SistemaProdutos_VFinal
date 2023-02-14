package Menus;

import Enums.EnumCategoria;
import Interfaces.MenuClienteAcoes;
import Pagamento.GatewayDePagamento;
import Pagamento.SelecionarOpcaoPagamentosClasseConcreta;
import Pagamento.SistemaDePagamentoMenu;
import Pagamento.VisualizarFormasDePagamentoClasseConcreta;
import Produtos.ProdutoAbstrato;

import java.util.*;

public class MenuClienteAbstract implements MenuClienteAcoes {

    protected static Scanner sc;

    protected List<ProdutoAbstrato> listaProdutos = new ArrayList<>();

    private  List<ProdutoAbstrato> listaProdutosCarrinho = new ArrayList<>();

    public MenuClienteAbstract(Scanner sc, List<ProdutoAbstrato> listaProdutos) {
        this.listaProdutos = listaProdutos;
        this.sc = sc;
        this.listaProdutosCarrinho= listaProdutosCarrinho;
    }

    @Override
    public void visualizarProdutos() {
        for (ProdutoAbstrato produto : listaProdutos) {
            System.out.println(produto);
        }
    }

    @Override
    public void filtrarPorCategoria() {
        System.out.println("Filtrar pela categoria: (m)Mercado/(l)Livro/(i)Informática");
        char opcaoFiltroPorCategoria = sc.next().charAt(0);
        boolean aux = true;
        if (opcaoFiltroPorCategoria == 'm') {
            for (ProdutoAbstrato produto : listaProdutos) {
                if (produto.getCategoria().equals(EnumCategoria.MERCADO)) {
                    aux = false;
                    System.out.println(produto);
                }
            }
        }
        if (opcaoFiltroPorCategoria == 'l') {
            for (ProdutoAbstrato produto : listaProdutos) {
                if (produto.getCategoria().equals(EnumCategoria.LIVRO)) {
                    aux = false;
                    System.out.println(produto);
                }
            }
        }
        if (opcaoFiltroPorCategoria == 'i') {
            for (ProdutoAbstrato produto : listaProdutos) {
                if (produto.getCategoria().equals(EnumCategoria.INFORMATICA)) {
                    aux = false;
                    System.out.println(produto);
                }
            }
        }
        if (aux == true) {
            System.out.println("Categoria inexistente!");
        }
    }

    @Override
    public void filtrarPorMarca() {
        System.out.println("Digite a marca:");
        String opcaoFiltrarPorMarca = sc.next();
        boolean aux = true;
        for (ProdutoAbstrato produto : listaProdutos) {
            if (produto.getMarca().equals(opcaoFiltrarPorMarca)) {
                aux = false;
                System.out.println(produto);
            }
        }
        if (aux == true) {
            System.out.println("Marca não registrada!");
        }
    }

    @Override
    public void ordenarPorNome() {
        System.out.println("Ordenar a lista por nome na ordem crescente ou descrescente?(c/d)");
        char opcaoOrdemNome = sc.next().charAt(0);
        if (opcaoOrdemNome == 'c') {
            Collections.sort(listaProdutos);
            for (ProdutoAbstrato produto : listaProdutos) {
                System.out.println(produto);
            }
        }
        if (opcaoOrdemNome == 'd') {
            Collections.reverse(listaProdutos);
            for (ProdutoAbstrato produto : listaProdutos) {
                System.out.println(produto);
            }
        }
    }

    @Override
    public void ordenarPorPreco() {
        System.out.println("Ordenar a lista por preço na ordem crescente ou descrescente?(c/d)");
        char opcaoOrdemPreco = sc.next().charAt(0);
        if (opcaoOrdemPreco == 'c') {
            Collections.sort(listaProdutos, Comparator.comparing(ProdutoAbstrato::getPreco));
            for (ProdutoAbstrato produto : listaProdutos) {
                System.out.println(produto);
            }
        }
        if (opcaoOrdemPreco == 'd') {
            Collections.reverse(listaProdutos);
            for (ProdutoAbstrato produto : listaProdutos) {
                System.out.println(produto);
            }
        }

    }

    public void selecionarProdutoParaCarrinho() {
        System.out.println("Digite o nome do produto que deseja adicionar ao carrinho: ");
        String nome = sc.next();
        boolean aux = true;
        for (ProdutoAbstrato cadaProduto : listaProdutos) {
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
        VisualizarFormasDePagamentoClasseConcreta visualizarFormasDePagamentoClasseConcreta = new VisualizarFormasDePagamentoClasseConcreta();
        SelecionarOpcaoPagamentosClasseConcreta selecionarOpcaoPagamentosClasseConcreta = new SelecionarOpcaoPagamentosClasseConcreta();

        GatewayDePagamento gatewayDePagamento = new SistemaDePagamentoMenu(selecionarOpcaoPagamentosClasseConcreta, visualizarFormasDePagamentoClasseConcreta);
        gatewayDePagamento.pagar(listaProdutosCarrinho);
    }

    public List<ProdutoAbstrato> getListaProdutosCarrinho() {
        return listaProdutosCarrinho;
    }

    public void setListaProdutosCarrinho(List<ProdutoAbstrato> listaProdutosCarrinho) {
        this.listaProdutosCarrinho = listaProdutosCarrinho;
    }
}
