/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg;

import javax.swing.JOptionPane;

/**
 *
 * @author Tarcyo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       

        // CRIANDO UM BUILDER DE BOLO:
        BoloBuilder boloBuilder = new BoloBuilder();

        //USANDO O JoPTION PANE PARA DEIXAR O USUÁRIO MONTAR O BOLO:
        int entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da sabor de bolo que deseja:\n1- Abacaxi\n2- Chocolate\n3- Morango\n4-Baunilha\n5-Coco\n6- Limão"));
        switch (entrada)
        {
            case 1:
                boloBuilder.defineSaborPrincipal(Sabor.ABACAXI);
                break;
            case 2:
                boloBuilder.defineSaborPrincipal(Sabor.CHOCOLATE);
                break;
            case 3:
                boloBuilder.defineSaborPrincipal(Sabor.MORANGO);
                break;
            case 4:
                boloBuilder.defineSaborPrincipal(Sabor.BAUNILHA);
                break;
            case 5:
                boloBuilder.defineSaborPrincipal(Sabor.COCO);
                break;
            case 6:
                boloBuilder.defineSaborPrincipal(Sabor.LIMAO);
                break;

        }
        entrada = Integer.parseInt(JOptionPane.showConfirmDialog(null, "Você deseja colocar cobertura em seu bolo?") + "");
        switch (entrada)
        {
            case 0:
                entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da sabor de cobertura que deseja:\n1- Abacaxi\n2- Chocolate\n3- Morango\n4-Baunilha\n5-Coco\n 6- Limão"));
                switch (entrada)
                {
                    case 1:
                        boloBuilder.defineSaborCobertura(Sabor.ABACAXI);
                        break;
                    case 2:
                        boloBuilder.defineSaborCobertura(Sabor.CHOCOLATE);
                        break;
                    case 3:
                        boloBuilder.defineSaborCobertura(Sabor.MORANGO);
                        break;
                    case 4:
                        boloBuilder.defineSaborCobertura(Sabor.BAUNILHA);
                        break;
                    case 5:
                        boloBuilder.defineSaborCobertura(Sabor.COCO);
                        break;
                    case 6:
                        boloBuilder.defineSaborCobertura(Sabor.LIMAO);
                        break;

                }
        }
        entrada = Integer.parseInt(JOptionPane.showConfirmDialog(null, "Você deseja colocar recheio em seu bolo?") + "");
        switch (entrada)
        {
            case 0:
                entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da sabor de recheio que deseja:\n1- Abacaxi\n2- Chocolate\n3- Morango\n4-Baunilha\n5-Coco\n 6- Limão"));
                switch (entrada)
                {
                    case 1:
                        boloBuilder.defineSaborRecheio(Sabor.ABACAXI);
                        break;
                    case 2:
                        boloBuilder.defineSaborRecheio(Sabor.CHOCOLATE);
                        break;
                    case 3:
                        boloBuilder.defineSaborRecheio(Sabor.MORANGO);
                        break;
                    case 4:
                        boloBuilder.defineSaborRecheio(Sabor.BAUNILHA);
                        break;
                    case 5:
                        boloBuilder.defineSaborRecheio(Sabor.COCO);
                        break;
                    case 6:
                        boloBuilder.defineSaborRecheio(Sabor.LIMAO);
                        break;

                }

        }
        entrada = Integer.parseInt(JOptionPane.showInputDialog("A quanntidade de camadas do bolo:"));

        // CONSTRUINDO O BOLO:
        Bolo bolo = boloBuilder.defineQuantCamadas(entrada)
                .definePreco()
                .montaDecricao()
                .build();

        // MOSTRANDO O BOLO:
        JOptionPane.showMessageDialog(null, bolo);
    }
}
