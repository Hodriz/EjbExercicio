/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package br.ejb.resources;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import lombok.Data;

/**
 *
 * @author Rodrigo
 */
@Named(value = "jsfJogo")
@SessionScoped
@Data
public class JsfJogo implements Serializable {

    /**
     * Creates a new instance of JsfJogo
     */
    public JsfJogo() {
    }
    
    @EJB
    private ejbJogo jogo;
    
    private List<String> listaJogador = new ArrayList<>();

    public void addJogador(String Nome) {
        listaJogador.add(Nome);
    }
    
}
