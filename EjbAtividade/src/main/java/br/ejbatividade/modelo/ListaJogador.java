/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ejbatividade.modelo;

import java.util.ArrayList;

/**
 *
 * @author Rodrigo
 */
public class ListaJogador {
    
    ArrayList<Jogador>listaJogador=new ArrayList<>();
            
    Jogador player=new Jogador();

    public Jogador getPlayer() {
        return player;
    }

    public void setPlayerNome(Jogador player) {
        this.player = player;
    }
    
    public void addPlayer(){
     listaJogador.add(player);
    }
    
    public void showPlayerList(){
     for(int i=0;i<listaJogador.size();i++){
         System.out.println(i);
     }
    }
    
    
    
}
