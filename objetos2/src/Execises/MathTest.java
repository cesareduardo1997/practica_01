package Execises;

import java.util.Random;

public class MathTest {

    private Integer raiz;
    private Integer coseno;
    private Integer seno;
    private String palabra;
    private Integer numero;
    private Integer numAleatorio;

    public Integer getRaiz() {
        return raiz;
    }

    public void setRaiz(Integer raiz) {
        this.raiz = raiz;
    }

    public Integer getCoseno() {
        return coseno;
    }

    public void setCoseno(Integer coseno) {
        this.coseno = coseno;
    }

    public Integer getSeno() {
        return seno;
    }

    public void setSeno(Integer seno) {
        this.seno = seno;
    }

    public Integer getNumAleatorio() {
        return numAleatorio;
    }

    public void setNumAleatorio(Integer numAleatorio) {
        this.numAleatorio = numAleatorio;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPalabra() {
        return palabra;
    }

    public Integer getNumero() {
        return numero;
    }

    public static void operaciones(Integer raiz, Integer coseno, Integer seno, String palabra, Integer numero, Integer numAleatorio) {
        Random random = new Random();
        Double opRaiz = Math.sqrt(raiz);
        System.out.println("RAIZ= " + opRaiz);
        Double opCos = Math.cos(coseno);
        System.out.println("COSENO 300 ES " + opCos);
        Double opSeno = Math.sin(seno);
        System.out.println("SENO 300 ES " + opSeno);
        Integer longitud = palabra.length();
        if (longitud > numero) {
            System.out.println("el mayor es " + palabra);
            System.out.println("el menor es " + numero);
        } else {
            System.out.println("el mayor es " + numero);
            System.out.println("el menor es " + palabra);
        }
        int numeroAleatorio = (int) (Math.random() * numAleatorio + 1);
        System.out.println("NUMERO ALEATORIO " + numeroAleatorio);
    }

    public static void main(String[] args) {
        MathTest mate = new MathTest();
        mate.setRaiz(37);
        mate.setCoseno(300);
        mate.setSeno(300);
        mate.setPalabra("D");
        mate.setNumero(71);
        mate.setNumAleatorio(20);
        operaciones(mate.getRaiz(), mate.getCoseno(), mate.getSeno(), mate.getPalabra(), mate.getNumero(), mate.getNumAleatorio());

    }
}
