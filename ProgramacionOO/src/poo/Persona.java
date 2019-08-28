/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author usuario
 */
public class Persona {
    
    //atributos de instancia
    public String nombre;
    public int edad;
    public double estatura;
    public double peso;
    public String sexo;
    public String getNombre(){
        
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public double getPeso() {
        return peso;
    }

    //métodos
    public String getSexo() {
        return sexo;
    }

    public Persona(String nombre, int edad, double estatura, double peso, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
        this.sexo = sexo;
    }
    
    public void saludar(){
        System.out.println("Hola mundo...");
    } 
    
}
