/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.clases.Perro;
import ec.edu.ups.clases.Vaca;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author one
 */
public class ControladorVaca {
     private Map<Integer,Vaca> mapa;
    private int codigo;
    
    public ControladorVaca(){
        mapa = new HashMap<>();
        codigo = 0;
    }
    public void crear(Vaca vaca){
        codigo++;
        vaca.setCodigo(codigo);
        mapa.put(codigo,vaca);
    }
    public  Vaca read(int codigo){
        for (Entry<Integer,Vaca> vaca :mapa.entrySet() ) {
            if(vaca.getKey()==codigo){
                System.out.println(vaca);
                
            }
        }
        return null;
    }
    public void update(Vaca vaca,int codigo){
        if(mapa.containsKey(codigo)){
            mapa.remove(codigo,vaca);
            mapa.put(codigo, vaca);
        }
    }
    public void delete(int codigo){
        for (Entry<Integer,Vaca> vaca:mapa.entrySet()) {
            if(vaca.getKey()== codigo){
                mapa.remove(codigo);
                break;
            }
        }
    }
    public void leer(){
        for (Entry<Integer, Vaca> vaca:mapa.entrySet()){
            System.out.println(" codigo "+vaca.getKey()+"= Informacion  " +vaca.getValue());
            
        }
        
    }
    
}
