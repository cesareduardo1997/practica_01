
package CASEROBLEMS;

import java.util.Scanner;

public class CarlysEventPrice {
    
    public static int numerodeinvitados() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese los numeros de invitados a la fiesta");
        int invitados = teclado.nextInt();
        return invitados;
    }

    public static void mostrarlema(String lema) {
        System.out.println("el lema de la empresa es de: " + lema);
    }

    public static void precioenvento(int invitados) {
        int precioporpersona = 35;
        int precio = 35 * invitados;
        int eventogrande = 50;
        if (invitados > eventogrande) {
            System.out.println("el precio del evento es de: " + precio + " pesos");
            System.out.println("el envento es muy grande");
        } else {
            System.out.println("el precio del evento es de:" + precio + " pesos");
        }

    }

    public static void main(String[] args) {
        int invitados = numerodeinvitados();
        int preciodelenvento;
        String lemaempresa = "LEMA";
        System.out.println("el numero de invitados fue de: " + invitados + " personas");
        mostrarlema(lemaempresa);
        precioenvento(invitados);
    }
}
