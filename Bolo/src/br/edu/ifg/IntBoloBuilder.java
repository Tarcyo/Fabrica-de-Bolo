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
public interface IntBoloBuilder {

    public Sabor retornaSabor();

    public Sabor retornaCobertura();

    public Sabor retornaRecheio();

    public int retornaQuantCamadas();

    public double retornaPreco();

    public BoloBuilder defineSaborPrincipal(Sabor sabor);

    public BoloBuilder defineSaborCobertura(Sabor sabor);

    public BoloBuilder defineSaborRecheio(Sabor sabor);
    
    public BoloBuilder defineQuantCamadas(int camadas);

    public BoloBuilder definePreco();

    public BoloBuilder montaDecricao();

    default String montaBolo() {
        if(retornaSabor()==null){
            return "É necessário que o bolo possua um sabor principal!";
        }
        String descricao = "Seu bolo é do sabor " + retornaSabor() + "";
        if (retornaCobertura() != null)
        {
            descricao = descricao+"\nSeu bolo possui cobertura de " + retornaCobertura();
        }
        if (retornaRecheio() != null)
        {
            descricao = descricao+ "\nE recheio de " + retornaRecheio();
        }
        descricao = descricao + "\nO preço do bolo é " + retornaPreco();
        return descricao;
    }

    default double calculaPreco() {
        if(retornaSabor()==null){
            return 0;
        }
        double preco = 0;
        preco = preco + retornaSabor().getPreco();
        if (retornaCobertura() != null)
        {
            preco = preco + retornaCobertura().getPreco();

        }
        if (retornaRecheio() != null)
        {
            preco = preco + retornaRecheio().getPreco();

        }
        preco = preco * retornaQuantCamadas();
        return preco;
    }
}
