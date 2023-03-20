/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ejb.resources;

import lombok.Data;

/**
 *
 * @author Rodrigo
 */
@Data
public class Jogador {
    
    private String nome;
    private int pontos;
    
    
    public void addPonto(){
    pontos=+1;
    }
    
    
    
    
}
