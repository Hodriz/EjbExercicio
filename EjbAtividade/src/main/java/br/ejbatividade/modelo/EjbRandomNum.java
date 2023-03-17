/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package br.ejbatividade.modelo;

import java.util.Random;
import javax.ejb.EJB;
import javax.ejb.Stateless;


/**
 *
 * @author Rodrigo
 */
@Stateless
public class EjbRandomNum {

    @EJB
    private RandomNum randomNum;

    public RandomNum getRandomNum() {
        return randomNum;
    }

    public void setRandomNum(RandomNum randomNum) {
        this.randomNum = randomNum;
    }
     
    

    
}
