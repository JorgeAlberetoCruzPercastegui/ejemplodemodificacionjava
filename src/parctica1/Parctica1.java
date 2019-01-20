/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parctica1;

import java.util.Scanner;

/**
 *
 * @author Percastegui1
 */
public class Parctica1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DatosPersona dp = new DatosPersona();
        String n,pais;
        int ed;
        System.out.println("Ingresa el nombre");
        n= s.next();
        System.out.println("Ingrese la edad");
        ed= s.nextInt();
        System.out.println("Ingrese el pais");
        pais= s.next();
        System.out.println("********************");
        System.out.println("Los resultados son: ");
        
        dp.setNombre(n);
        dp.setEdad(ed);
        dp.setPais(pais);
        
        System.out.println("Nombre: "+dp.getNombre());
        System.out.println("Edad: "+dp.getEdad());
        System.out.println("País: "+dp.getPais());
        
        
        
        
    
    
    
    }
    
}
