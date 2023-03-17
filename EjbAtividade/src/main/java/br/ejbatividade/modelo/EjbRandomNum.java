/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package br.ejbatividade.modelo;

import java.util.Random;
import javax.ejb.Stateless;


/**
 *
 * @author Rodrigo
 */
@Stateless
public class EjbRandomNum {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    RandomNum rdn=new RandomNum();

    int num1(){
    return rdn.getRandomNumA();
    }
    
    int num2(){
    return rdn.getRandomNumB();
    }
    
    
}
