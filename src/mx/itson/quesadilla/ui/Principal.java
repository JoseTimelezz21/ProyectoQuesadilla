/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.quesadilla.ui;

import java.util.Scanner;

/**
 *
 * @author José Alvarez
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese el texto a evaluar");
        Scanner entrada = new Scanner(System.in);
        String oracion = entrada.nextLine();
        
        
        String nuevaOracion = oracion.trim();
        System.out.println(nuevaOracion.toLowerCase());  
        System.out.println(nuevaOracion.toUpperCase());    
     
        
       
    
        char[] arrayChar = nuevaOracion.toCharArray();
       for(char a:arrayChar){
           System.out.println(a);
        
       }  
          
        
    
    }
}
