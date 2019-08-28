/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Objects;

/**
 *
 * @author usuario
 */
public class Carro {

    @Override
    public String toString() {
        return "Carro{" + "color=" + color + ", peso=" + peso + ", tama\u00f1o=" + tamaño + '}';
    }
    private String color;
    private double peso;
    private double tamaño;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.color);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carro other = (Carro) obj;
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return true;
    }
    
    public Carro(){
        this.color = "";
        this.peso = 0.0;
        this.tamaño = 0.0;
    }
    
    public Carro(String color, double peso, double tamaño){
        this.color = color;
        this.peso = peso;
        this.tamaño = tamaño;
    }
    
    public String getColor(){
        return this.color;
    }
    public double getTamaño(){
        return this.tamaño;
    }
    public double getPeso(){
        return this.peso; 
    }
    
    public void setColor(String color){
        this.color = color;
    }
    public void setTamaño(double tamaño){
         this.tamaño = tamaño;
    }
    public void setPeso(double peso){
        this.peso = peso;        
    }
}
