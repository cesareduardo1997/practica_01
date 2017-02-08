
package Exercises;

import java.util.Scanner;


public class Interest {
     public static void main(String[]args){
        
        float inversion= visualizar();
        
        float resultado= calculo(inversion);
        
        System.out.println("Al cabo de un año usted tendrá "+resultado);
        
    }
    
    public static Float visualizar(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese la cantidad Inicial de su inversión");
        float inv=teclado.nextFloat();
        return inv;
    }
    
    public static Float calculo(float cantidad){
        float a=cantidad+((5*cantidad)/100);
        return a;
    }
}
