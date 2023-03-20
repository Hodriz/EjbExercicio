/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatefulEjbClass.java to edit this template
 */
package br.ejb.resources;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;
import lombok.Data;

/**
 *
 * @author Rodrigo
 */
@Stateful
@Data 
public class ejbJogo implements Serializable {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    private Jogador jogador = new Jogador();
    private RandomNum num = new RandomNum();
    private List<String> listaJogador = new ArrayList<>();

    public void addJogador(String Nome) {
        listaJogador.add(Nome);
    }

    public List<String> getListaJogador() {
        return listaJogador;
    }

    public void checarAcerto(int numero) {
        if (numero == num.numA + num.numB) {
            jogador.addPonto();
            System.out.println("Acertou!");
        } else {
            System.out.println("Errou!");
        }
    }

}
