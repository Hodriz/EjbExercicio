/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package br.exeejb.atividade.resources;

import java.util.Random;
import javax.ejb.Stateless;
import lombok.Data;

/**
 *
 * @author Rodrigo
 */
@Data
@Stateless
public class RandomNum {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    Random gerador = new Random();

    
    private int numA;
    private int numB;
    private int total;
    private int numero;
    
    public void randomizar(){
    Random gerar=new Random();
    numA=gerar.nextInt(5000);
    numB=gerar.nextInt(5000);
    total=numA+numB;
    }
    
    
}
