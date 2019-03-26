/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package megaaplicacion;

/**
 *
 * @author nicolas.fanin
 */
public class Ejercicio2y3 {

    double x1;
    double x2;

    public Ejercicio2y3() {
        // Ejercicio 2
        System.out.println("Ejercicio 2:");
        x1 = 2;
        x2 = 3;

        double producto = x1 * x2;
        double division = x1 / x2;
        double promedio = (x1 + x2) / 2;
        
        System.out.println("Division: " + division);

        // Ejercicio 3    
        System.out.println("Ejercicio 3:");
        if (x1 > x2) {
            System.out.println(x1 + " es mayor que " + x2);
        } else {
            System.out.println(x1 + " es menor que " + x2);
    }

}

}
