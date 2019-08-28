/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionoo;

import poo.Alumno;
import poo.Banda;
import poo.Bolsa;
import poo.Botella;
import poo.Calculadora;
import poo.Carpeta;
import poo.Carro;
import poo.Casa;
import poo.Chancla;
import poo.Computadora;
import poo.Gato;
import poo.Persona;
import poo.Lapicera;
import poo.Libro;
import poo.Mochila;
import poo.Pantalla;
import poo.Peluche;
import poo.Perro;
import poo.Planta;
import poo.Usuario;
import poo.Videojuego;

/**
 *
 * @author usuario
 */
public class ProgramacionOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona arturo = new Persona("Arturo Diaz",
                                   19, 1.8, 80.2,
                                   "Masculino"); //New se refiere a un nuevo objeto 
        /*Ctrl + shift + down/up permite duplicar la línea  
        //Los breakpoint se ponen en especifico donde se necesita detener el código*/
        arturo.nombre = "Atudo";
        
        //Objetos
        Alumno a1 = new Alumno(202032453, "123456", "Toño Cruz", 19, 1.85, 85.2, "Masculino");
        
        Banda b1 = new Banda(5, "Hola", "La Arrolladora Banda el Limon");
        
        Bolsa bol1 = new Bolsa("Chica", "Redonda", "Azul");
        
        Botella bote1 = new Botella("Amarillo", 14.5, 34.5);
        
        Calculadora c1 = new Calculadora(500.45, 34.5, 234.2);
        
        Carpeta carpeta = new Carpeta("Negra", "Rectangular", 0.54);
        
        Carro audi = new Carro("Rojo", 1000.34, 400.3);
        
        Casa cabaña = new Casa(2, 1, 400.54);
        
        Chancla sandalia = new Chancla("ovalada", "amarillo", 20.4);
        
        Computadora hp = new Computadora(14567.34, 45, 12);
        
        Gato cacerola = new Gato("Cacerola", "Siamés", "Pequeño");
        
        Lapicera princeso = new Lapicera("Plata", "Pequeño", "CCEP");
        
        Libro colera = new Libro(300, 230.3, "novela romantica");
        
        Mochila jansport = new Mochila("Axul", 45.6, 23.3);
        
        Pantalla lg = new Pantalla("negro", 30.3, "mediana");
        
        Peluche oso = new Peluche("blanco", "GuauGuau", 234.3);
        
        Perro copita = new Perro("Shihuahua", 23.4, "Callejero");
        
        Planta rosal = new Planta(56.5, 300.3, "Rosal");
        
        Usuario artur = new Usuario("arturo@gmail.com", "nenahermosa123", "arturo@outlook.com");
        
        Videojuego fifa = new Videojuego(323.5, 10, "mesi chikito"); 
        /*  -Un método constructor crea un objeto en memoria 
            -Inicializa valores */
        
       
     
        System.out.println("Hey");
        
 
                
    }
    
}
