/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package br.ejbatividade.modelo;

import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Rodrigo
 */
@Named(value = "jsfRandomNum")
@RequestScoped
public class JsfRandomNum {

    @EJB
    private RandomNum randomNum;

    public RandomNum getRandomNum() {
        return randomNum;
    }

    public void setRandomNum(RandomNum randomNum) {
        this.randomNum = randomNum;
    }
    
    


    
}
