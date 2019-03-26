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
public class Ejercicio8 {
    
    public Ejercicio8(){
        ejecutar();
    }
    
    void ejecutar() {
        System.out.println("Ejercicio 8");
        int a = 2;
        int x = 1;
        
        switch(a) {
            case 1 : x += 5;
                    break;
            case 2: x += 10;
                     break;
            case 3: x += 16;
                    break;
            case 4: 
            case 5:
            case 6:
                x += 34;
                    break;
            default:
                     x = x + 60;
                     break;
        }
        
    }
    
}
