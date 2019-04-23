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
public final class Perro  extends Domestico implements Menu{

    public Perro(String nombre, double peso, String raza, String pelaje, String especie, String fechaNac, int edad, String color, int codigo) {
        super(nombre, peso, raza, pelaje, especie, fechaNac, edad, color, codigo);
    }

    public Perro() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public void razas(){
    
        System.out.println("razas de los perros");
    } 
    
    public void nombre(){
    
        System.out.println("nombre de los perros");
    }
    
    public void edad(){
    
        System.out.println("edad de los perros");
    }

    @Override
    public String imprimir() {
       return "imprimir datos del perro";
    }

    @Override
    public String modificar() {
        return "modificar datos del perro";
    }

    @Override
    public String domesticos() {
        return "clase domesticos";
    }

   
    
    
}
