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
public class Alumno extends Persona {
    private int boleta;
    private String contraseña;

    public Alumno(int boleta, String contraseña, String nombre, int edad, double estatura, double peso, String sexo) {
        super(nombre, edad, estatura, peso, sexo);
        this.boleta = boleta;
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public int getBoleta() {
        return boleta;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getNombre() {
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

    public String getSexo() {
        return sexo;
    }
    
    }