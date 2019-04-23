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
public final class Vaca extends Hervivero implements Menu{

    public Vaca(String nombre, String pelaje, double peso, String especie, String fechaNac, int edad, String color, int codigo) {
        super(nombre, pelaje, peso, especie, fechaNac, edad, color, codigo);
    }
    
     public void pelaje(){
    
        System.out.println("pelaje de la vaca");
    } 
    
    public void peso(){
    
        System.out.println("peso de la vaca");
    }
    
    public void edad(){
    
        System.out.println("edad de la vaca");
    }

    @Override
    public String imprimir() {
       return "imprimir datos de la vaca";
    }

    @Override
    public String modificar() {
        return "modificar datos de la vaca";
    }

    @Override
    public String Herviveros() {
        return "clase herviveros";
    }
    
    
    
    
}
