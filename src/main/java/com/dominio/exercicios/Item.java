
package com.dominio.exercicios;


public class Item {
    
    private int quantidade;
    private double preco;
    
    private Produto produto; 

    public Item(int quantidade, double preco, Produto produto) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Item() {
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(produto.getNome());
        sb.append(", ").append(produto.getPreco());
        sb.append(", Quantidade: ").append(quantidade);
        sb.append(", Subtotal: ").append(subTotal());
        return sb.toString();
    }
    
    public double subTotal(){
        return produto.getPreco() * quantidade;
    }
}
