/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercises;

import java.util.Scanner;

/**
 *
 * @author Cesar
 */
public class Salary {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Cuanto te pagan por hora");
        Integer pagohora = teclado.nextInt();

        System.out.println("Cuantas horas regulares trabajaste esta semana?");
        Integer horaR = teclado.nextInt();

        System.out.println("Cuantas horas extras trabajaste en la semana?");
        Integer horasE = teclado.nextInt();

        Double total = extras(pagohora, horaR, horasE);

        System.out.println("Esta semana cobrarás en total: " + total);

    }

    public static Double extras(Integer x, Integer y, Integer z) {
        Double pago = (y * x) + (z * (x * 1.5));
        return pago;
    }

}
