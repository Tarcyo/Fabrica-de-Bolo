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
// CLASSE DO BUILDER:
public class BoloBuilder implements br.edu.ifg.IntBoloBuilder {

    private Sabor saborPrincipal;
    private Sabor saborRecheio;
    private Sabor saborCobertura;
    private int quantCamadas;
    private double preco;
    private String descricao;

    public Bolo build() {
        return new Bolo(saborPrincipal, saborRecheio, saborCobertura, quantCamadas, preco, descricao);
    }

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

    @Override
    public BoloBuilder defineSaborPrincipal(Sabor sabor) {
        this.saborPrincipal = sabor;
        return this;

    }

    @Override
    public BoloBuilder defineSaborCobertura(Sabor sabor) {
        this.saborCobertura = sabor;
        return this;

    }

    @Override
    public BoloBuilder defineSaborRecheio(Sabor sabor) {
        this.saborRecheio = sabor;
        return this;

    }

    @Override
    public BoloBuilder definePreco() {
        this.preco = this.calculaPreco();
        return this;
    }

    @Override
    public BoloBuilder montaDecricao() {
        this.descricao = this.montaBolo();
        return this;
    }

    @Override
    public BoloBuilder defineQuantCamadas(int camadas) {
        this.quantCamadas = camadas;
        return this;

    }

    @Override
    public Sabor retornaSabor() {
        return this.saborPrincipal;
    }

    @Override
    public Sabor retornaRecheio() {
        return this.saborRecheio;
    }

    @Override
    public Sabor retornaCobertura() {
        return this.saborCobertura;
    }

    @Override
    public int retornaQuantCamadas() {
        return this.quantCamadas;
    }

    @Override
    public double retornaPreco() {
        return this.preco;
    }

    @Override
    public String toString() {
        return this.descricao;
    }

}
