package Produtos;

import enums.EnumCategoria;

import java.util.ArrayList;
import java.util.List;

public abstract class ProdutoAbstrato implements Comparable<ProdutoAbstrato> {

    private String nome;
    private Double preco;
    private String marca;
    private EnumCategoria categoria;

    public static List<ProdutoAbstrato> listaProdutos = new ArrayList<>();

    public ProdutoAbstrato(){}
    public ProdutoAbstrato(String nome, Double preco, String marca, EnumCategoria categoria) {
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public EnumCategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(EnumCategoria categoria) {
        this.categoria = categoria;
    }

    public List<ProdutoAbstrato> getListaProdutos() {
        return listaProdutos;
    }

}
