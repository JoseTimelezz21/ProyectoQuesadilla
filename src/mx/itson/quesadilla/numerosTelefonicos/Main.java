/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.quesadilla.numerosTelefonicos;

import java.util.Scanner;

/**
 *
 * @author José Alvarez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
         * Importamos la clase scanner para poder ingresarle la cadena de texto mediante el metodo scanner.nextLine.        
         */
        
         System.out.println("Escribe los numeros telefonicos: ");
        Scanner scanner = new Scanner(System.in);{
        String numerosTelefonicos = scanner.nextLine();
        
        /**
         * Aquí se utiliza el método replace para decirle al programa que reemplaze los parentesis y guiones por espacios en blanco de la cadena de texto.
         */
        String datosTelefonicos = numerosTelefonicos.replace("(", "" ).replace(")", "").replace("-", "").replace(" ", "");
        
        /**
         * Aquí armamos el array string de los números para separarlos por comas.
         */
        String[] registro = datosTelefonicos.split(",");
        
        /**
         * Aquí definimos variables para guardar la cantidad de npumeros que hay en cada ciudad. 
         */
        
     int numerosGuaymas = 0;
     int numerosHermosillo = 0;
     int numerosTijuana = 0;
     int numerosDesconocidos = 0;
     
     
     
    /* for(String numero : registro ){
         if(numero.startsWith("622")){
            numerosGuaymas++;        
         }else{
             if(numero.startsWith("662")){
             numerosHermosillo++;
             }else{
             if(numero.startsWith("664")){
             numerosTijuana++;
             }else{
             numerosDesconocidos++;       
             
               
                     }
             
                     } */
    
    /**
      * Esto es un bucle for-each en el que se recorre un array de cadenas llamado
      * registro, y se utiliza el método startsWith para contar cuántas cadenas comienzan
      * con diferentes prefijos numéricos("622", "662" y "664"), y también se cuenta cuántas
      * cadenas no coinciden con ninguno de estos patrones.
      */
    for (String numero : registro) {
    if (numero.startsWith("622")) {
        numerosGuaymas++;
    } else if (numero.startsWith("662")) {
        numerosHermosillo++;
    } else if (numero.startsWith("664")) {
        numerosTijuana++;
    } else {
        numerosDesconocidos++;
    }
}
    /**
     * Aquí simplemente mandamos a imprimir las variables para que el programa nos diga cuantos números telefonicos hay en cada ciudad.
     */
                 System.out.println("Guaymas tiene: "+numerosGuaymas+ " numeros");
                 System.out.println("Hermosillo tiene: "+numerosHermosillo+ " numeros");
                 System.out.println("Tijuana tiene: "+numerosTijuana+ " numeros");
                 System.out.println("Hay: "+numerosDesconocidos+ " numeros desconocidos");     
             }
         
     }
}    
                  
     
     
        

        
    
