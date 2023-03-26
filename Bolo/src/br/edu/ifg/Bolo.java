/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg;

/**
 *
 * @author Tarcyo
 */
public class Bolo {

    // O CONSTRUTOR SERÁ CHAMADO NO BUILDER
    public Bolo(Sabor saborPrincipal, Sabor saborRecheio, Sabor saborCobertura, int quantCamadas, double preco, String descricao) {
        this.saborPrincipal = saborPrincipal;
        this.saborRecheio = saborRecheio;
        this.saborCobertura = saborCobertura;
        this.quantCamadas = quantCamadas;
        this.preco = preco;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return this.descricao;
    }
    private Sabor saborPrincipal;
    private Sabor saborRecheio;
    private Sabor saborCobertura;
    private int quantCamadas;
    private double preco;
    private String descricao;

    public Sabor getSaborPrincipal() {
        return saborPrincipal;
    }

    public void setSaborPrincipal(Sabor saborPrincipal) {
        this.saborPrincipal = saborPrincipal;
    }

    public Sabor getSaborRecheio() {
        return saborRecheio;
    }

    public void setSaborRecheio(Sabor saborRecheio) {
        this.saborRecheio = saborRecheio;
    }

    public Sabor getSaborCobertura() {
        return saborCobertura;
    }

    public void setSaborCobertura(Sabor saborCobertura) {
        this.saborCobertura = saborCobertura;
    }

    public int getQuantCamadas() {
        return quantCamadas;
    }

    public void setQuantCamadas(int quantCamadas) {
        this.quantCamadas = quantCamadas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
