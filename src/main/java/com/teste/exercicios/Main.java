package com.teste.exercicios;

import com.dominio.exercicios.Cliente;
import com.dominio.exercicios.Item;
import com.dominio.exercicios.Pedido;
import com.dominio.exercicios.Produto;
import com.dominio.exercicios.Status;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dados do cliente: ");
        
        System.out.print("Nome: ");
        String nome = sc.next();
        
        System.out.print("Email: ");
        String email = sc.next();
        
        System.out.print("Data de Nascimento: (dd/mm/yyyy)");
        LocalDate dataNascimento = LocalDate.parse(sc.next(), dtf);
        
        //Novo Cliente
        Cliente c = new Cliente(nome, email, dataNascimento);
        
        System.out.println("Entre com os dados do pedido: ");
        
        System.out.print("Status: ");
        String status = sc.next().toUpperCase();
        
        //Novo Pedido
        Pedido pedido = new Pedido(LocalDateTime.now(), Status.valueOf(status));
        
        System.out.print("Quantos itens terá nesse pedido? ");
        int qtdItens = sc.nextInt();
        
        for (int i = 1; i <= qtdItens; i++) {
            
            System.out.println("Dados do #" + i + " item: ");
            
            System.out.print("Nome do produto: ");
            String nomeProduto = sc.next();
            
            System.out.print("Peço do produto: ");
            Double precoProduto = sc.nextDouble();
            
            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();
            
            //Novo Item
            Item item = new Item(quantidade, precoProduto, new Produto(nomeProduto, precoProduto));
            
            //Pedido
            pedido.addItens(item);
        }
        
        System.out.println("\nSumário do Pedido: ");
        System.out.println(pedido);
        
        //Dados do cliente
        System.out.print(c);
        
        System.out.println("\nItens do Pedido: ");
        for (Item item : pedido.getItens()) {
            System.out.println(item);
        }
        System.out.println("Preço total do pedido: " +pedido.totalPedido());
        
        sc.close();
        
    }
    
}
