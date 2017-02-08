package Exercises;

import java.util.Scanner;

public class GasPrices {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("introduce el valor del barril");
        int pricePerBarrel = teclado.nextInt();

        precio(pricePerBarrel);

    }

    public static void precio(double x) {
        double a = (3.5 * x) / 100;
        double b = (4 * x) / 100;
        System.out.println("Si el precio por barril es de " + x + " el precio por galón va estar entre " + a + " y " + b);
    }

}
