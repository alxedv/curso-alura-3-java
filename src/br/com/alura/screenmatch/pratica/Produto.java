package br.com.alura.screenmatch.pratica;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return this.nome + " - R$" + this.preco + " - " + this.quantidade;
    }
}

class ProdutoPerecivel extends Produto {
    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade){
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }
}

class Principal2 {
    public static void main(String[] args) {
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        Produto produto1 = new Produto("Leite", 6.99, 1);
        Produto produto2 = new Produto("Manteiga", 4.49, 3);
        Produto produto3 = new Produto("Biscoito", 12.90, 4);

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        System.out.println(listaDeProdutos.get(1));
        System.out.println("Lista: " + listaDeProdutos);

        ProdutoPerecivel produtoComValidade = new ProdutoPerecivel("Pão", 0.50, 1, "12/03/2025");

        System.out.println(produtoComValidade);

    }
}
