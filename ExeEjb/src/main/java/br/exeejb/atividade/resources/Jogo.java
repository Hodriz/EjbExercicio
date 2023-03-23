/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatefulEjbClass.java to edit this template
 */
package br.exeejb.atividade.resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import javax.ejb.EJB;
import javax.ejb.Stateful;
import lombok.Data;

/**
 *
 * @author Rodrigo
 */
@Data
@Stateful
public class Jogo {

    @EJB
    private RandomNum randomNum;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    List<Jogador> jogadores=new ArrayList<>();
    Jogador player=new Jogador();
    int palpite; 
    List<Integer> pontos=new ArrayList<>();
    int point;
    HashMap<String, Integer> ranking = new HashMap<>();

    
    
    public void addPlayer(Jogador player){
     jogadores.add(player);
    }
    
    public String marcarPonto(){
       
        if (randomNum.getNumero()==randomNum.getTotal()) {
            pontos.add(1);
            Optional<Integer> pontuacao=pontos.stream().reduce((n1,n2)-> n1+n2);
            System.out.println(pontuacao.get());
            point=pontuacao.get();
            randomNum.randomizar();
            return "Acertou!";       
        }else{         
            return "Errou!";}
        
    }
    
    public String finalizarJogo(){
        ranking.put(player.getNome(), point);
        System.out.println(ranking);
    return "Jogador "+player.getNome()+" fez "+point+" pontos";
    }
    
    public String finalizarJogo(){
        ranking.put(player.getNome(), point);
        System.out.println(ranking);
    return "Jogador "+player.getNome()+" fez "+point+" pontos";
    }
    
    
   
    
    public List<Jogador>listaJogador(){
    return jogadores;
    }
    
    
}
