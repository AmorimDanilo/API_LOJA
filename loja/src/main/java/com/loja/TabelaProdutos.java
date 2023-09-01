package com.loja;

import java.util.ArrayList;
import java.util.List;

public class TabelaProdutos {
    List<Produto> produtos = new ArrayList<>();

    /**
     * No construtor a lista de produtos será preenchida
     */

    public TabelaProdutos() {
        Produto caneta = new Produto(1, "Caneta BIC", "Caneta BIC na cor azul", 1.99);
        Produto borracha = new Produto(2, "Borracha Branca", "Borracha branca comum", 3.99);
        Produto lapis = new Produto(3, "Lápis Faber Castell", "Lapis Faber Castell Comum", 2.99);
        Produto apontador = new Produto(4, "Apontador", "Apontador comum com reservatório", 7.99);
        Produto caderno = new Produto(5, "Caderno espiral", "Caderno espiral de 96 folhas", 15.99);
        Produto pastaL = new Produto(6, "Pasta L", "Pasta L em plástico", 1.99);
        Produto papelSulfite = new Produto(7, "Papel Sulfite", "Pacote de 500 folhas de papel sulfite A4", 35.99);
        Produto compasso = new Produto(8, "Compasso", "Compasso em metal", 8.99);
        Produto lapiseira = new Produto(9, "Lapiseira", "Lapiseira 0.7 Faber Castell", 9.99);
        Produto mouse = new Produto(10, "Mouse", "Mouse de escritório Multilaser", 25.99);

        this.produtos.add(caneta);
        this.produtos.add(borracha);
        this.produtos.add(lapis);
        this.produtos.add(apontador);
        this.produtos.add(caderno);

    }
    /**
     * Método que retorna todos os produtos da lista
     */
    public List<Produto> getProdutos() {return produtos;}

    public List<Produto> buscarTodosOsProdutos() {
        return this.getProdutos();
    }
    public Produto buscarProdutoPeloId(int produtoId) {
        Produto produtoProcurado = null;
        for (Produto p: this.produtos) {
            if (p.getId()== produtoId) {
                produtoProcurado = p;
                break;
            }
        }
        return produtoProcurado;
    }
}
