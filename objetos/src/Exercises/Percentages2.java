package Exercises;

import java.util.Scanner;

public class Percentages2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa un número");
        double n1 = teclado.nextDouble();

        System.out.println("Ingresa otro número");
        double n2 = teclado.nextDouble();
        computePercent(n1, n2);

        computePercent(n2, n1);

    }

    public static void computePercent(double n1, double n2) {
        double porcent = (n2 * 100) / n1;
        System.out.println(n2 + " es el " + porcent + " porcentaje de " + n1);
    }
}
