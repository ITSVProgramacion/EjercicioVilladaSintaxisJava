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
public class Ejercicio9 {
    
    public Ejercicio9() {
        ejecutar();
    }
    
    void ejecutar() {
        System.out.println("Ejercicio 9");
        System.out.println("Ingrese número para calcular:");
        int numero = new Scanner(System.in).nextInt();
        long factorial = 1;
        while(numero != 0){
            factorial = factorial * numero;
            numero--;
        }
        
        System.out.println("El factorial es: " + factorial);
        
    }
    
    
    
}
