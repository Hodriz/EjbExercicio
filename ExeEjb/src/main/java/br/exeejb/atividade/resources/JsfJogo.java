/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package br.exeejb.atividade.resources;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import lombok.Data;

/**
 *
 * @author Rodrigo
 */
@Data 
@Named(value = "jsfJogo")
@SessionScoped
public class JsfJogo implements Serializable {

    @EJB
    private RandomNum randomNum;

    @EJB
    private Jogo jogo;
   

    /**
     * Creates a new instance of JsfJogo
     */
    public JsfJogo() {
        
           
    }
    

    
}
