/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaz.Menu;
import java.util.Date;

/**
 *
 * @author one
 */
public final class Caballo extends Hervivero implements Menu{

    public Caballo(String nombre, String pelaje, double peso, String especie, String fechaNac, int edad, String color, int codigo) {
        super(nombre, pelaje, peso, especie, fechaNac, edad, color, codigo);
    }
     public void codigos(){
    
        System.out.println("godigo animales  hervivoros");
    } 
    
    public void edades(){
    
        System.out.println("edades de los animales");
    }
    
    public void pesos(){
    
        System.out.println("peso");
    }
    @Override
    public String imprimir() {
        return "imprimir datos de el caballo";
    }

    @Override
    public String modificar() {
        return "madificar datos de el caballo";
    }

    @Override
    public String Herviveros() {
        return "clase herviveros";
    }
    
   
    
    
    
}
