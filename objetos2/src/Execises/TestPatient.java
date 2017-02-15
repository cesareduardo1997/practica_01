package Execises;

import java.util.Scanner;

public class TestPatient {

    public static void main(String[] args) {
        String sangre = null, RH = null, nombre = null;
        Integer ID = null;
        Scanner teclado = new Scanner(System.in);
        Patient paciente = new Patient(RH, sangre, ID, nombre);
        System.out.println("ingresa tu tipo de sangre");
        sangre = teclado.next();
        System.out.println("ingresa tu RH");
        RH = teclado.next();
        System.out.println("ingresa tu ID");
        ID = teclado.nextInt();
        System.out.println("ingresa el nombre del paciente");
        nombre = teclado.next();
        paciente.Datospaciente(ID, nombre);
        paciente.datos(sangre, RH);
    }
}
