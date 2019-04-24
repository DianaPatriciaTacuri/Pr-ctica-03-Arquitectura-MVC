/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.clases.Perro;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author one
 */
public class ControladorPerro {
    private SortedSet<Perro> lista;
    private int codigo;
    public  ControladorPerro(){
        lista= new TreeSet<>();
        codigo=0;
    }
    public void crear(Perro objeto){
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }
    public  Perro read(int codigo){
        for (Perro perro : lista) {
            if(perro.getCodigo()==codigo){
                return perro;
            }
        }
        return null;
    }
    public void update(Perro objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
    }
    public void dellete(int codigo){
        for (Perro perro : lista) {
            if(perro.getCodigo()== codigo){
                lista.remove(perro);
                break;
            }
        }
    }
    public void imprimir(Perro objeto){
        
    }
    
    
}
