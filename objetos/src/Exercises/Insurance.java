package Exercises;

import java.util.Scanner;

public class Insurance {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzce el año actual");
        int actual = teclado.nextInt();

        System.out.println("Introduzca su año de nacimiento");
        int nacimiento = teclado.nextInt();

        int importe = prima(actual, nacimiento);

        System.out.println("El importe total es: " + importe);

    }

    public static int prima(int x, int y) {
        Integer importe = (((x - y) / 10) + 15) * 20;
        return importe;
    }
}
