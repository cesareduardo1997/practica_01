package Execises;

import static Execises.Bread.lema;

public class TestBread {

    public static void main(String[] args) {

        Bread pan = new Bread("centeno", 20);

        System.out.println("lema: " + lema + " tipo pan: " + pan.getTipoP() + " calorias por rojada: " + pan.getRodaja());
        Bread pan2 = new Bread("granola", 40);

        System.out.println("lema: " + lema + " tipo pan: " + pan2.getTipoP() + " calorias por rojada: " + pan2.getRodaja());
        Bread pan3 = new Bread("avena", 50);

        System.out.println("lema: " + lema + " tipo pan: " + pan3.getTipoP() + " calorias por rojada: " + pan3.getRodaja());
    }
}
