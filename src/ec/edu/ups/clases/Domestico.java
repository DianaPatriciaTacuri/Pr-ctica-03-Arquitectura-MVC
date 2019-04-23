/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;


/**
 *
 * @author one
 */
public  abstract class Domestico  extends Animal{
    private String nombre;
    private double peso;
    private String raza;
    private String pelaje;

    public Domestico() {
    }

    public Domestico(String nombre, double peso, String raza, String pelaje, String especie, String fechaNac, int edad, String color, int codigo) {
        super(especie, fechaNac, edad, color, codigo);
        this.nombre = nombre;
        this.peso = peso;
        this.raza = raza;
        this.pelaje = pelaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    @Override
    public String toString() {
        return super.toString()+"Domestico{" + "nombre=" + nombre + ", peso=" + peso + ", raza=" + raza + ", pelaje=" + pelaje + '}';
    }

     public void nombres(){
    
        System.out.println("nombre de los animales domesticos");
    }
    
    public void pesos(){
    
        System.out.println("peso de los animales");
    }
    
    public void Razas(){
    
        System.out.println("razas de los animales");
    }
    
    public abstract String domesticos();
    
    
    
}
