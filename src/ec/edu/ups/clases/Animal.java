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
public class Animal  implements Comparable<Animal>{
    private String especie;
    private String fechaNac;
    private int edad;
    private String color;
    private int codigo;

    public Animal() {
    }

    public Animal(String especie, String fechaNac, int edad, String color, int codigo) {
        this.especie = especie;
        this.fechaNac = fechaNac;
        this.edad = edad;
        this.color = color;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
   

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" + "especie=" + especie + ", fechaNac=" + fechaNac + ", edad=" + edad + ", color=" + color + ", codigo=" + codigo + '}';
    }

    
    
     public void especies(){
    
        System.out.println("especie de animales");
    }
    
    public void edad(){
    
        System.out.println("edad de los animales");
    }
    
    public void fechaNacimiento(){
    
        System.out.println("fecha de nacimiento de los animales ");
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.codigo;
        return hash;
    }
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal other = (Animal) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Animal o) {
        if(color.compareTo(o.getColor())>1){
            return 1;
        }else if(color.compareTo(o.getColor())<=-1){
            return -1;
        }else{
            return 0;
        }
    }
    
    

    
    
}
