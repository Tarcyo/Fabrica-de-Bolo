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
public enum Sabor {

    ABACAXI("ABACAXI",20.0),
    CHOCOLATE("CHOCOLATE",35.0),
    MORANGO("MORANGO",15.0),
    BAUNILHA("BAUNILHA",10.0),
    COCO("COCO",15.0),
    LIMAO("LIMÃO",25.0);
    

    private String string;

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getString() {
        return string;
    }

    /**
     * Set the value of string
     *
     * @param string new value of string
     */
    public void setString(String string) {
        this.string = string;
    }
    
    private String descricao;
    private double preco;

    Sabor(String descricao,double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }
    public double getPreco() {
        return preco;
    }
    
    

}
