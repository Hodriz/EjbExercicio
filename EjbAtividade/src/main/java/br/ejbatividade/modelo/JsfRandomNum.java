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
    private EjbRandomNum ejbRandomNum;

    /**
     * Creates a new instance of JsfRandomNum
     */
    public JsfRandomNum() {
    }

    public EjbRandomNum getEjbRandomNum() {
        return ejbRandomNum;
    }

    public void setEjbRandomNum(EjbRandomNum ejbRandomNum) {
        this.ejbRandomNum = ejbRandomNum;
    }
    
    
}
