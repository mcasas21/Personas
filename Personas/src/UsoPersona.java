/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mario Casas Escudero
 */

public class UsoPersona {
    public static void main(String[] args){
        
        Persona[] lasPersonas=new Persona[2];
        
        lasPersonas[0]=new Empleado("Antonio",55000,2000,04,23);
        lasPersonas[1]=new Alumno("Pedro","IT Inform�tica de Gesti�n");
        
        for(Persona p:lasPersonas){
        	
        	System.out.println("Datos de empleado 2:");
            
            System.out.println(p.dameNombre() + ", " + p.dameDescripcion());
        }
        
    }
    
}
