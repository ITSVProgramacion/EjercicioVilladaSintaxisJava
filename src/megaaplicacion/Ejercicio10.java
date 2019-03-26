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
public class Ejercicio10 {
    
    float radio;
    float longitud;
    
    public Ejercicio10() {
        ejecutar();
    }
    
    void ejecutar() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ejercicio 10");
        System.out.println("Ingrese el radio del cilindro: ");
        radio = scan.nextFloat();
        System.out.println("Ingrese longitud del clindro: ");
        longitud = scan.nextFloat();
        double area = Math.PI * Math.pow(radio, 2);
        double volumen = area * longitud;
        System.out.println("El volumen del cilindro es: " + volumen);
             
    }
    
}
