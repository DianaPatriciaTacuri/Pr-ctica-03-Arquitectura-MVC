/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.prueba;

import ec.edu.ups.clases.Gato;
import ec.edu.ups.clases.Animal;
import ec.edu.ups.clases.Caballo;
import ec.edu.ups.clases.Perro;
import ec.edu.ups.clases.Vaca;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Estudiante
 */
public class Prueba {
    public static void main(String[] args) {
        Gato g= new Gato();
        //g.setCodigo(2);
        //g.setNombre("tcl");
        g.setColor("tlc");
        
        Gato g1= new Gato();
        //g1.setCodigo(3);
        //g1.setNombre("sony");
        g1.setColor("sony");
        
        Perro p= new Perro();
        p.setCodigo(5);
        
        Animal an= new Animal();
        an.setEspecie("pepito");
        Animal an1= new Animal();
        an1.setEspecie("juanito");
        "pepito".compareTo("juanito");
        
        if( g.equals(g1)){
            System.out.println("son iguales"); 
        }else{
            System.out.println("no son iguales");
        }
        if(p.equals(g)){
            System.out.println(" son iguales");
        }else{
            System.out.println(" no son iguales");
        }
        Set<Gato> lista = new HashSet<>();
        lista.add(g);
        lista.add(g);
        
        for (Gato gato : lista) {
            System.out.println(" gato" + gato.getNombre());   
        }
        if(lista.contains(g1)){
            System.out.println(" si existe ");
        }
        SortedSet<Gato>listaOrdenada= new  TreeSet<>();
        listaOrdenada.add(g);
        listaOrdenada.add(g1);
         for (Gato gato : listaOrdenada) {
             System.out.println(" gato   :"+ gato.getColor());
        }
        
    }
    
    
}
