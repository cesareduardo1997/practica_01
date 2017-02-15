
package Execises;

import java.util.Scanner;


public class TestBloodData {
     public static void main(String[] args) {
        String sangre = null, RH = null;
        Scanner teclado = new Scanner(System.in);
        BloodData medico = new BloodData(sangre,RH);
        System.out.println("ingresa tu tipo de sangre");
        sangre = teclado.next();
        System.out.println("ingresa tu RH");
        RH = teclado.next();
        medico.datos(sangre,RH);
    }
}
