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
public class Ejercicio6 {
    
    int numero1;
    int numero2;
    
    public Ejercicio6() {
        ejecutar();
    }
    
    void ejecutar() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ejercicio 6");
        System.out.println("Ingrese dos numeros entre 1 y 10: ");
        System.out.println("Numero 1: ");
        numero1 = scan.nextInt();
        System.out.println("Numero 2:");
        numero2 = scan.nextInt();
        if(numero1 == numero2) {
            System.out.println("Los números son iguales.");
            System.out.println("Ingrese nuevamente número 2: ");
            numero2 = scan.nextInt();
        }
        if(numero1 > 10 || numero1 < 1){
            System.out.println("Número 1 no estan dentro del rango, ingrese nuevamente");
            numero1 = scan.nextInt();
        }
        if(numero2 > 10 || numero2 < 1){
            System.out.println("Número 2 no estan dentro del rango, ingrese nuevamente");
            numero2 = scan.nextInt();
        }
        System.out.println("Suma: " + (numero1+numero2));
        
    }
    
}
