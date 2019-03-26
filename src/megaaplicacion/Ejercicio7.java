/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package megaaplicacion;

import java.util.Scanner;

/**
 *
 * @author nicolas.fanin
 */
public class Ejercicio7 {
    
    public Ejercicio7() {
        ejecutar();
    }
    
    void ejecutar() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ejercicio 7");
        System.out.println("Ingrese la CANTIDAD de números:");
        int cantidad = scan.nextInt();
        for(int i = 0; i <cantidad; i++){
            System.out.println("Ingrese el número: " + i);
            int numero = scan.nextInt();
            if(numero < 0) {
                System.out.println(numero + " es negativo.");
            } else {
                System.out.println(numero + " es positivo.");
            }
        }
        int i = 0;
        /*
        Otra forma de hacer esto, usando un while
        
        while (i < cantidad){            
            System.out.println("Ingrese el número: " + i);
            int numero = scan.nextInt();
            if(numero < 0) {
                System.out.println(numero + " es negativo.");
            } else {
                System.out.println(numero + " es positivo.");
            }
            i++;
        }
        */
        
        
    }
    
    
    
}
