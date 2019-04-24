/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.clases.Caballo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author one
 */
public class ControladorCaballo {
     private List<Caballo> lista;

    int contador=0;

    public ControladorCaballo() {
        lista=new ArrayList<>();
    
    }
    
    public void guardar(Caballo objeto){
        lista.add(objeto);
    }
    public Caballo read(int codigo){
        for (Caballo caballo : lista) {
            if (caballo.getCodigo()==codigo) {
                return caballo; 
            }
        }
        return null;
    } 

public void update(Caballo objeto){
    for (int i = 0; 1 < lista.size(); i++) {
        Caballo elemento= lista.get(i);
        if(elemento.equals(objeto)){
            lista.set(i, objeto);
            break;
        }
        
    }

}
public void delete (int codigo){
        for (int i = 0; i < lista.size(); i++) {
            Caballo elemento= lista.get(i);
             if(elemento.getCodigo()==codigo){
            lista.remove(i);
            break;
        }
            
        }
    }
    
}
