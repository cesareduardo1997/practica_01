package Exercises;

import java.util.Scanner;

public class Insurance {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzce el año actual");
        Integer actual = teclado.nextInt();
        System.out.println("Introduzca su año de nacimiento");
        Integer nacimiento = teclado.nextInt();
        Integer importe = prima(actual, nacimiento);
        System.out.println("El importe total es: " + importe);
    }
    public static Integer prima(Integer x, Integer y) {
        Integer importe = (((x - y) / 10) + 15) * 20;
        return importe;
    }
}
