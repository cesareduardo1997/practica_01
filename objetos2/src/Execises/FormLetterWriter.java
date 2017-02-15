package Execises;

import java.util.Scanner;

public class FormLetterWriter {

    private String primerapeliido;
    private String segundoapeliido;
    public String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerapeliido() {
        return primerapeliido;
    }

    public void setPrimerapeliido(String primerapeliido) {
        this.primerapeliido = primerapeliido;
    }

    public String getSegundoapeliido() {
        return segundoapeliido;
    }

    public void setSegundoapeliido(String segundoapeliido) {
        this.segundoapeliido = segundoapeliido;
    }

    public static void displaySalutation(String primerapellido) {
        System.out.println("Estimado Sra o Sr " + primerapellido);
    }

    public static void displaySalutation(String primerapellido, String segundoapellido, String nombre) {
        System.out.println("Querido" + " " + nombre + " " + primerapellido + " " + segundoapellido);
        System.out.println("Gracias por su pedido reciente");
    }

    public static void main(String[] args) {
        
        FormLetterWriter datos = new FormLetterWriter();
        datos.setNombre("cesar eduardo");
        datos.setPrimerapeliido("lopez");
        datos.setSegundoapeliido("sanchez");
        displaySalutation( datos.getPrimerapeliido());
        displaySalutation( datos.getPrimerapeliido(), datos.getSegundoapeliido(), datos.getNombre());
    }

}
