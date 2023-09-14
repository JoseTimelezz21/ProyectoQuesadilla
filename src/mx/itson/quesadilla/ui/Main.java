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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          System.out.println("Ingrese el texto a evaluar: ");
        Scanner scanner = new Scanner(System.in);{
        String oracion = scanner.nextLine();
        
  /*boolean estaUsada = oracion.startsWith("a") || oracion.startsWith("A");
        if (estaUsada){                        
            System.out.println("Si inicia con a");
          } else {
            System.out.println("No inicia con a");
        }
        if(oracion.startsWith("a")){
        System.out.println("Si inicia con a");
          } else {
        System.out.println("No inicia con a");
        
        }
        System.out.println(oracion.startsWith("a") ? "Si, inicia con a" : "No inicia con a");
        
        
        }
 */
  String nuevaOracion = oracion.replace("m", "s" ).replace("M", "s");
        System.out.println(nuevaOracion);
    }
    }
}