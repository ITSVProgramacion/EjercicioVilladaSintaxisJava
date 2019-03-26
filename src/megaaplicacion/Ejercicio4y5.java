/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package megaaplicacion;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author nicolas.fanin
 */
public class Ejercicio4y5 {
    
    String nombre;
    
    public Ejercicio4y5() {
        ejecutar();
    }
    
    void ejecutar() {
        //Ejercicio 4
        System.out.println("Ejercicio 4");
        System.out.println("Ingrese su nombre!");
        Scanner scan = new Scanner(System.in);
        nombre = scan.next();
        System.out.println("Hola " + nombre + ", lo voy a saludar según la hora del día:");
        
        //Ejercicio 5
        System.out.println("Ejercicio 5");
        Calendar c = Calendar.getInstance();
        int hora = c.get(Calendar.HOUR_OF_DAY);
        
        if(hora < 12) {
            System.out.println("Buen día " + nombre + "!");
        } else if(hora < 19) {
            System.out.println("Buenas tardes" + nombre + "!");
        } else {
            System.out.println("Buenas noches " + nombre);
        }  
        
    }
    
}
