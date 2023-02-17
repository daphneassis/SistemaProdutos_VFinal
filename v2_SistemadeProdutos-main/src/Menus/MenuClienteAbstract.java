package menus;

import enums.EnumCategoria;
import acoesMenu.MenuClienteAcoes;
import Produtos.ProdutoAbstrato;

import java.util.*;

public class MenuClienteAbstract implements MenuClienteAcoes {

    protected static Scanner sc;
    public  MenuClienteAbstract(Scanner sc) {
        this.sc = sc;
    }

    @Override
    public void visualizarProdutos() {
        for (ProdutoAbstrato produto : ProdutoAbstrato.listaProdutos) {
            System.out.println(produto);
        }
    }

    @Override
    public void filtrarPorCategoria() {
        System.out.println("Filtrar pela categoria: (m)Mercado/(l)Livro/(i)Informática");
        char opcaoFiltroPorCategoria = sc.next().charAt(0);
        boolean aux = true;
        if (opcaoFiltroPorCategoria == 'm') {
            for (ProdutoAbstrato produto : ProdutoAbstrato.listaProdutos) {
                if (produto.getCategoria().equals(EnumCategoria.MERCADO)) {
                    aux = false;
                    System.out.println(produto);
                }
            }
        }
        if (opcaoFiltroPorCategoria == 'l') {
            for (ProdutoAbstrato produto : ProdutoAbstrato.listaProdutos) {
                if (produto.getCategoria().equals(EnumCategoria.LIVRO)) {
                    aux = false;
                    System.out.println(produto);
                }
            }
        }
        if (opcaoFiltroPorCategoria == 'i') {
            for (ProdutoAbstrato produto : ProdutoAbstrato.listaProdutos) {
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
        for (ProdutoAbstrato produto : ProdutoAbstrato.listaProdutos) {
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
            Collections.sort(ProdutoAbstrato.listaProdutos);
            for (ProdutoAbstrato produto : ProdutoAbstrato.listaProdutos) {
                System.out.println(produto);
            }
        }
        if (opcaoOrdemNome == 'd') {
            Collections.reverse(ProdutoAbstrato.listaProdutos);
            for (ProdutoAbstrato produto : ProdutoAbstrato.listaProdutos) {
                System.out.println(produto);
            }
        }
    }

    @Override
    public void ordenarPorPreco() {
        System.out.println("Ordenar a lista por preço na ordem crescente ou descrescente?(c/d)");
        char opcaoOrdemPreco = sc.next().charAt(0);
        if (opcaoOrdemPreco == 'c') {
            Collections.sort(ProdutoAbstrato.listaProdutos, Comparator.comparing(ProdutoAbstrato::getPreco));
            for (ProdutoAbstrato produto : ProdutoAbstrato.listaProdutos) {
                System.out.println(produto);
            }
        }
        if (opcaoOrdemPreco == 'd') {
            Collections.reverse(ProdutoAbstrato.listaProdutos);
            for (ProdutoAbstrato produto : ProdutoAbstrato.listaProdutos) {
                System.out.println(produto);
            }
        }

    }

}

