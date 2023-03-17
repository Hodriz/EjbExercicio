/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ejbatividade.modelo;


/**
 *
 * @author Rodrigo
 */
public class Jogador {
    
    private String nome;
    private int palpite;
    private int pontos;

    public Jogador(String nome, int palpite, int pontos) {
        this.nome = nome;
        this.palpite = palpite;
        this.pontos = pontos;
    }

    public Jogador() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPalpite() {
        return palpite;
    }

    public void setPalpite(int palpite) {
        this.palpite = palpite;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    @Override
    public String toString() {
        return "Jogador{" + "nome=" + nome + ", palpite=" + palpite + ", pontos=" + pontos + '}';
    }

    
    
}
