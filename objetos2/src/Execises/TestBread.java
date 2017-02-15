package Execises;

import static Execises.Bread.lema;

public class TestBread {

    public static void main(String[] args) {

        Bread pan = new Bread("centeno", 20);
        pan.getTipoP();
        pan.getRodaja();
        System.out.println("lema: " + lema + " tipo pan: " + pan.getTipoP() + " calorias por rojada: " + pan.getRodaja());
        Bread pan2 = new Bread("granola", 40);
        pan2.getTipoP();
        pan2.getRodaja();
        System.out.println("lema: " + lema + " tipo pan: " + pan2.getTipoP() + " calorias por rojada: " + pan2.getRodaja());
        Bread pan3 = new Bread("avena", 50);
        pan3.getTipoP();
        pan3.getRodaja();
        System.out.println("lema: " + lema + " tipo pan: " + pan3.getTipoP() + " calorias por rojada: " + pan3.getRodaja());
    }
}
