/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package br.ejbatividade.modelo;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import javax.ejb.EJB;

/**
 *
 * @author Rodrigo
 */
@Named(value = "jsfJogador")
@SessionScoped
public class JsfJogador implements Serializable {

    @EJB
    private EjbJogador ejbJogador;

    /**
     * Creates a new instance of JsfJogador
     */
    public JsfJogador() {
    }
    
    
    
      public String listarJogador(){
       ejbJogador.showPlayerList();
        return null;
    }
    
    
    
}
