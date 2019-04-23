/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.Date;

/**
 *
 * @author one
 */
public abstract class Hervivero extends Animal{
    private String nombre;
    private int edad;
    private String pelaje;
    private double peso;

    public Hervivero() {
    }

    public Hervivero(String nombre, String pelaje, double peso, String especie, String fechaNac, int edad, String color, int codigo) {
        super(especie, fechaNac, edad, color, codigo);
        this.nombre = nombre;
        this.edad = edad;
        this.pelaje = pelaje;
        this.peso = peso;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString()+"Hervivero{" + "nombre=" + nombre + ", edad=" + edad + ", pelaje=" + pelaje + ", peso=" + peso + '}';
    }
    
     public void pelaje(){
    
        System.out.println("pelajes de los animales");
    }
    
    public void peso(){
    
        System.out.println("peso de los animales");
    }
    
    public void nombre(){
    
        System.out.println("nombre de los animales");
    }
    
    public abstract String Herviveros();
    
}
