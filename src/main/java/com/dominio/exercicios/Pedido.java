package com.dominio.exercicios;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    
    private LocalDateTime momento;
    private Status status;

    List<Item> itens = new ArrayList<>();
    private Cliente cliente;

    public Pedido(LocalDateTime momento, Status status) {
        this.momento = momento;
        this.status = status;
    }

    public Pedido() {
    }

    public LocalDateTime getMomento() {
        return momento;
    }

    public void setMomento(LocalDateTime momento) {
        this.momento = momento;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Item> getItens() {
        return itens;
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Momento do pedido: ").append(dtf.format(momento) + "\n");
        sb.append(" Status do pedido: ").append(status);
        return sb.toString();
    }

    

    public void addItens(Item item) {
        itens.add(item);
    }

    public void removerItens(Item item) {
        itens.remove(item);
    }

    public double totalPedido() {
        
        double precoTotal = 0.0d;
        
        for (Item item : itens) {
            precoTotal += item.subTotal();
        }
        
        return precoTotal;
        
    }
}
