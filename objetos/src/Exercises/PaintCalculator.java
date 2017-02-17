
package Exercises;

import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[]args){
        Scanner teclado=new Scanner(System.in);        
        Double precio;        
        System.out.println("Introduzca la longitud en pies del cuarto a pintar");
        Float longitud= teclado.nextFloat();
        System.out.println("Introduzca la ancho en pies del cuarto a pintar");
        Float ancho= teclado.nextFloat();
        System.out.println("Introduzca la altura en pies del cuarto a pintar");
        Float altura= teclado.nextFloat();      
        precio=calculos(longitud, ancho, altura);
        System.out.println("el costo de pintar un Sala de "+longitud+" por "+ancho+" pies con techos de "+altura+" pies es de $ "+precio);
        
    }
    
    public static Double calculos(Float a, Float b, Float c){
        Float area=(c*b)+(a*c);
        Float galones=cantgal(area);
        System.out.println("Se necesitan "+galones+" galones para pintar dicho cuarto");
        Double precio=(Math.ceil(galones))*32;
        return precio;
    }
    
    public static Float cantgal(Float a){
        Float cant=a/350;
        return cant;
    }
}
