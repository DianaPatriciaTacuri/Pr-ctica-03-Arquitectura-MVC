/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.clases.Gato;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author one
 */
public class ControladorGato {
    private Set<Gato>lista;
    private int codigo;
    
    public ControladorGato(){
        lista = new HashSet<>();
        codigo=0;
        
    }
    public void crear(Gato objeto){
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }
    public Gato read(int codigo){
        for(Gato gato: lista){
            if(gato.getCodigo()== codigo){
                return gato;
            }
        }
        return null;
    }
    public void update(Gato objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
    }
    public void delete(int codigo){
        for(Gato gato:lista){
            if(gato.getCodigo()==codigo){
                lista.remove(gato);
                break;
            }
        }
    }
    
}
