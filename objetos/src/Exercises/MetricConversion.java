
package Exercises;

import java.util.Scanner;

public class MetricConversion {
     public static void main(String[]args){
        Scanner teclado= new Scanner(System.in);     
        System.out.println("Introduzca un valor entero");
        int numero=teclado.nextInt();       
        pcm(numero);
        galt(numero);      
    } 
    public static void pcm(int n){
        double cm=n*2.54;
        System.out.println("Hay "+cm+" centímetros en "+n+" pulgadas");
    } 
    public static void galt(int n){
        double litros=n*3.7854;
        System.out.println("Hay "+litros+" litros en "+n+" galones");
    }
}
