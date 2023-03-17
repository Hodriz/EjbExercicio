/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ejbatividade.modelo;

import java.util.Random;
import javax.ejb.Stateless;

/**
 *
 * @author Rodrigo
 */
@Stateless
public class RandomNum {
    
    Random gerador = new Random();

    private int randomNumA=gerador.nextInt(5000);
    private int randomNumB=gerador.nextInt(5000);
    

    public RandomNum() {
    }

    public RandomNum(int randomNumA, int randomNumB) {
        this.randomNumA = randomNumA;
        this.randomNumB = randomNumB;
    }
    

    public int getRandomNumA() {
        return randomNumA;
    }

    public void setRandomNumA(int randomNumA) {
        this.randomNumA = gerador.nextInt(5000);
    }

    public int getRandomNumB() {
        return randomNumB;
    }

    public void setRandomNumB(int randomNumB) {
        this.randomNumB = gerador.nextInt(5000);
    }
    
    
    
}
