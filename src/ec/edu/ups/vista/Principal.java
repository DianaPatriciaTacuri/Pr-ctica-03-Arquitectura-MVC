/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.clases.Caballo;
import ec.edu.ups.clases.Gato;
import ec.edu.ups.clases.Perro;
import ec.edu.ups.clases.Vaca;
import ec.edu.ups.controlador.ControladorCaballo;
import ec.edu.ups.controlador.ControladorGato;
import ec.edu.ups.controlador.ControladorVaca;
import ec.edu.ups.controlador.ControladorPerro;
import java.util.Scanner;

/**
 *
 * @author one
 */
public class Principal {
    public static void main(String[] args) {
        ControladorCaballo con= new ControladorCaballo();
        ControladorVaca vac=new ControladorVaca();
        ControladorGato ga= new ControladorGato();
        ControladorPerro per=new ControladorPerro();
        int sub=0;
        boolean prin=true;
        do{
        Scanner obj = new Scanner(System.in);
        System.out.println("elegir una de las obciones: \n"
        + "1.CRUD Caballo :\n"
        +"2.CRUD Vaca :\n"
        +"3.CRUD Gato :\n"
        +"4.CRUD Paerro :\n"
        +"5.Salir :\n");
        int o=obj.nextInt();
        System.out.println("");
        switch (o){
            case 1:
                boolean salir =true;
                do{
                    menu();
                    sub=obj.nextInt();
                    switch(sub){
                        case 1:
                            boolean a=false,b=false;
                            System.out.println("ingrese el nombre: ");
                            String nombre=obj.next();
                            System.out.println("ingrese el pelaje ");
                            String pelaje=obj.next();
                            
                            if(pelaje.equals(("si"))){
                                a=true;
                            }
                            System.out.println("ingrese el peso");
                            double peso=obj.nextDouble();
                            System.out.println("ingrese la especie");
                            String especie=obj.next();
                            System.out.println("ingrese la decha de nacimiento");
                            String fechaNac=obj.next();
                            if(pelaje.equals("si")){
                                b=true;
                            }
                            System.out.println("ingrese la edad");
                            int edad=obj.nextInt();
                            System.out.println("ingrese el color del animal");
                            String color=obj.next();
                            System.out.println("ingresar el codigo");
                            int codigo=obj.nextInt();
                            
                            Caballo caballo= new Caballo(nombre, pelaje, peso, especie, fechaNac, edad, color, codigo);
                            con.guardar(caballo);
                            
                            break;
                        case 2:
                            System.out.println("ingrese el codigo a vericar");
                            codigo=obj.nextInt();
                            con.read(codigo);
                            break;
                        case 3:
                            a=false;
                            b=false;
                            System.out.println("ingresr tipo de pelaje");
                            pelaje=obj.next();
                            System.out.println("ingresar color ");
                            color=obj.next();
                            System.out.println("ingresar el codigo");
                            codigo=obj.nextInt();
                            if(pelaje.equals("si")){
                                a=true;
                            }
                            System.out.println("ingrese la edad");
                            edad=obj.nextInt();
                            System.out.println("ingrese la decha de nacimiento");
                            fechaNac=obj.next();
                            if(pelaje.equals("si")){
                                b=true;
                            }
                            System.out.println("ingrese el peso");
                            peso=obj.nextDouble();
                            System.out.println("ingrese la especie");
                            especie=obj.next();
                            System.out.println("ingresar el nombre");
                            nombre=obj.next();
                            
                            caballo= new Caballo(nombre, pelaje, peso, especie, fechaNac, edad, color, codigo);
                            con.update(caballo);
                            
                            break;
                        case 4:
                            System.out.println("ingrese el codigo a elimanar");
                            codigo=obj.nextInt();
                            con.delete(codigo);
                            break;
                        case 5:
                            salir = false;
                            System.out.println("saliendo......");
                            salir=true;
                            break;
                            
                    }
                    
                }while (salir == false);  
                
                break;
            case  2:
                salir= true;
                do{
                    menu();
                    sub=obj.nextInt();
                    switch(sub){
                        case 1:
                            boolean a=false, b= false,c=false;
                            System.out.println("ingresar el nombre");
                            String nombre=obj.next();
                            System.out.println("ingresar el pelaje");
                            String pelaje=obj.next();
                            System.out.println("ingresar el peso");
                            double peso=obj.nextDouble();
                            if(pelaje.equals("si")){
                                a=true;
                            }
                            System.out.println("ingresar la especie");
                            String especie=obj.next();
                            System.out.println("ingresar fecha de nacimiento");
                            String fechaNac=obj.next();
                            if(pelaje.equals("si")){
                                b=true;
                            }
                            System.out.println("ingresar la edad");
                            int edad=obj.nextInt();
                            System.out.println("ingresar el color");
                            String color=obj.next();
                            if(pelaje.equals("si")){
                                c=true;
                            }
                            System.out.println("ingresar el codigo");
                            int codigo=obj.nextInt();
                            
                            Vaca vaca= new Vaca(nombre, pelaje, peso, especie, fechaNac, edad, color, codigo);
                            vac.crear(vaca);
                            break;
                        case 2:
                            System.out.println("ingrese el codigo a vericar");
                            codigo=obj.nextInt();
                            vac.read(codigo);
                            
                            break;
                        case 3:
                            System.out.println("ingresar la especie");
                            especie=obj.next();
                            System.out.println("ingresar fecha de nacimiento");
                            fechaNac=obj.next();
                            System.out.println("ingresar el pelaje");
                            pelaje=obj.next();
                            if(pelaje.equals("si")){
                                b=true;
                            }
                            System.out.println("ingresar la edad");
                            edad=obj.nextInt();
                            System.out.println("ingresar el color");
                            color=obj.next();
                            System.out.println("ingresar el codigo");
                            codigo=obj.nextInt();
                            if(pelaje.equals("si")){
                                c=true;
                            }
                            System.out.println("ingresar el nombre");
                            nombre=obj.next();
                            System.out.println("ingresar el peso");
                            peso=obj.nextDouble();
                            if(pelaje.equals("si")){
                                a=true;
                            }
                            System.out.println("ingresar el peso");
                            peso=obj.nextDouble();
                            
                            vaca= new Vaca(nombre, pelaje, peso, especie, fechaNac, edad, color, codigo);
                            vac.update(vaca, codigo);
             
                            break;
                        case 4:
                            System.out.println("ingrese el codigo a elimanar");
                            codigo=obj.nextInt();
                            vac.delete(codigo);
                            break;
                        case 5:
                            salir = false;
                            System.out.println("saliendo......");
                            salir=true;
                            break;
                            
                            
                    }
                    
                }while(salir==true);
                break;
            case 3:
                salir= true;
                do{
                    menu();
                    sub=obj.nextInt();
                    switch(sub){
                        case 1:
                            boolean a=false,b=false,c=false,d=false;
                            System.out.println("ingresar el nombre");
                            String nombre=obj.next();
                            System.out.println("ingresaar pelage");
                            String pelaje=obj.next();
                            if(pelaje.equals("si")){
                               b=true;
                            }
                            System.out.println("ingresar el peso");
                            double peso=obj.nextDouble();
                            System.out.println("ingresar la raza");
                            String raza=obj.next();
                            if(pelaje.equals("si")){
                               a=true;
                            }
                            System.out.println("ingresar la especie");
                            String especie=obj.next();
                            System.out.println("ingresar la fecha de nacimiento");
                            String fechaNac=obj.next();
                            if(pelaje.equals("si")){
                            c=true;
                            }
                            System.out.println("ingresar la edad");
                            int edad=obj.nextInt();
                            System.out.println("ingresar el color");
                            String color=obj.next();
                            if(pelaje.equals("si")){
                               c=true;
                            }
                            System.out.println("ingresar el codigo");
                            int codigo=obj.nextInt();
                
                            Perro perro= new Perro(nombre, peso, raza, pelaje, especie, fechaNac, edad, color, codigo);
                            per.crear(perro);
                            break;
                        case 2:
                            System.out.println("ingrese el codigo a vericar");
                            codigo=obj.nextInt();
                            per.read(codigo);
                            
                            break;
                        case 3:
                            System.out.println("ingresar el nombre");
                            nombre=obj.next();
                            System.out.println("ingresaar pelage");
                            pelaje=obj.next();
                            if(pelaje.equals("si")){
                               b=true;
                            }
                            System.out.println("ingresar el peso");
                            peso=obj.nextDouble();
                            System.out.println("ingresar la raza");
                            raza=obj.next();
                            if(pelaje.equals("si")){
                               a=true;
                            }
                            System.out.println("ingresar la especie");
                            especie=obj.next();
                            System.out.println("ingresar la fecha de nacimiento");
                            fechaNac=obj.next();
                            if(pelaje.equals("si")){
                            c=true;
                            }
                            System.out.println("ingresar la edad");
                            edad=obj.nextInt();
                            System.out.println("ingresar el color");
                            color=obj.next();
                            if(pelaje.equals("si")){
                               c=true;
                            }
                            System.out.println("ingresar el codigo");
                            codigo=obj.nextInt();
                
                            perro= new Perro(nombre, peso, raza, pelaje, especie, fechaNac, edad, color, codigo);
                            per.update(perro);
                            break;
                        case 4:
                            System.out.println("ingrese el codigo a elimanar");
                            codigo=obj.nextInt();
                            per.delete(codigo);
                            break;
                        case 5:
                            salir = false;
                            System.out.println("saliendo......");
                            salir=true;
                            break;
                            
                            
                    }
                    
                }while(salir==true);
                break;
            case 4:
                salir= true;
                do{
                    menu();
                    sub=obj.nextInt();
                    switch(sub){
                        case 1:
                            boolean a=false,b=false,c=false;
                            System.out.println("ingresar el nombre");
                            String nombre=obj.next();
                            System.out.println("ingresar pelaje");
                            String pelaje=obj.next();
                            System.out.println("ingesar codigo");
                            int codigo=obj.nextInt();
                            if(pelaje.equals("si")){
                                a=true;
                            }
                            System.out.println("ingresar el peso");
                            double peso=obj.nextDouble();
                            System.out.println("ingresar la raza");
                            String raza=obj.next();
                            System.out.println("ingresar la especie");
                            String especie=obj.next();
                            if(pelaje.equals("si")){
                                b=true;
                            }
                            System.out.println("ingresar la fecha de nacimiento");
                            String fechaNac=obj.next();
                            System.out.println("ingresar el color");
                            String color=obj.next();
                            if(pelaje.equals("si")){
                                c=true;
                            }
                            System.out.println("ingresar edad");
                            int edad=obj.nextInt();
                            Gato gato= new Gato(nombre, peso, raza, pelaje, especie, fechaNac, edad, color, codigo);
                            ga.crear(gato);
                        case 2:
                            System.out.println("ingrese el codigo a vericar");
                            codigo=obj.nextInt();
                            ga.read(codigo);
                            break;
                        case 3:
                            System.out.println("ingresar el nombre");
                            nombre=obj.next();
                            System.out.println("ingresar pelaje");
                            pelaje=obj.next();
                            System.out.println("ingesar codigo");
                            codigo=obj.nextInt();
                            if(pelaje.equals("si")){
                                a=true;
                            }
                            System.out.println("ingresar el peso");
                            peso=obj.nextDouble();
                            System.out.println("ingresar la raza");
                            raza=obj.next();
                            if(pelaje.equals("si")){
                                b=true;
                            }
                            System.out.println("ingresar la especie");
                            especie=obj.next();
                            System.out.println("ingresar la fecha de nacimiento");
                            fechaNac=obj.next();
                            if(pelaje.equals("si")){
                                c=true;
                            }
                            System.out.println("ingresar el color");
                            color=obj.next();
                            System.out.println("ingresar edad");
                            edad=obj.nextInt();
                            gato= new Gato(nombre, peso, raza, pelaje, especie, fechaNac, edad, color, codigo);
                            ga.update(gato);
                            break;
                        case 4:
                            System.out.println("ingrese el codigo a elimanar");
                            codigo=obj.nextInt();
                            ga.delete(codigo);
                            break;
                        case 5:
                            salir = false;
                            System.out.println("saliendo......");
                            salir=true;
                            break;  
                    }
                    
                }while(salir==true);
                break;
            case 5:
                prin=false;
                System.out.println("saliendo");
                break;
            default:
                System.out.println("ingresar un numero del 1 al 5");
                break;
                
            
        }
        
        }while(prin==true);
    }
    
    
    public static void menu (){
        System.out.println("escojer un numero\n"
                +"1.create\n"
                +"2. read \n"
                + "3.update\n"
                + "4. delete\n"
                + "5.regresar\n"
                + "ingrese su obcion");
    }
    
}
