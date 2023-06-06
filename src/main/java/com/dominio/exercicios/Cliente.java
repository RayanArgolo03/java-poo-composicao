package com.dominio.exercicios;

import java.time.LocalDate;

public class Cliente {

    private String nome;
    private String email;
    private LocalDate dataNascimento;

    public Cliente(String nome, String email, LocalDate dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente: ");
        sb.append(nome);
        sb.append(" (").append(dataNascimento).append(") - ");
        sb.append(email);
        return sb.toString();
    }

}
