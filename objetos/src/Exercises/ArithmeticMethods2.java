
package Exercises;

import java.util.Scanner;

public class ArithmeticMethods2 {
    public static void main(String[]args){
        Scanner teclado=new Scanner(System.in);       
        System.out.println("Ingrese un número");
        Integer a= teclado.nextInt();
        System.out.println("Ingrese un número");
        Integer b=teclado.nextInt();        
        displayNumberPlus10(a, b);       
        displayNumberPlus100(a, b);       
        displayNumberPlus1000(a, b);        
    }
    
    public static void displayNumberPlus10(Integer n1, Integer n2){       
        System.out.println((n1+10)+" "+(n2+10));       
    }   
    public static void displayNumberPlus100(Integer n1, Integer n2){       
        System.out.println((n1+100)+" "+(n2+100));        
    }
    
    public static void displayNumberPlus1000(Integer n1, Integer n2){       
        System.out.println((n1+1000)+" "+(n2+1000));       
    }
}
