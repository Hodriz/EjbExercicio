/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ejb.resources;

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
    
    Random gerador=new Random();
    
    int numA=gerador.nextInt(5000);
    int numB=gerador.nextInt(5000);
    int total=numA+numB;
    
    
    public void conferir(int num){
    if (num==total){System.out.println("Acertou!");} else {System.out.println("Errou!");}
    
    }
    
    
}
