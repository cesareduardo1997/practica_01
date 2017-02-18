package Exercises;

import java.util.Scanner;

public class Interest {

    public static void main(String[] args) {

        float inversion = visualizar();

        float resultado = inversion(inversion);

        System.out.println("Al cabo de un año usted tendrá " + resultado);

    }

    public static Float visualizar() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la catidad de dienero que desea invertir");
        float inv = teclado.nextFloat();
        return inv;
    }

    public static Float inversion(float cantidad) {
        float a = cantidad + ((5 * cantidad) / 100);
        return a;
    }
}
