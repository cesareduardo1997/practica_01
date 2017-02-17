package GAMEZONE;

import Exercises.*;

public class card {

    private String figura;
    private Integer numero;

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public card(String figura, Integer numero) {
        this.figura = figura;
        this.numero = numero;
    }

    public class PickTwoCard {

        private card[] cartas;

        public PickTwoCard() {
            cartas = new card[52];
            int indice = 0;
            String[] figuras = {"h", "s", "b", "c"};
            int figurita = 0;
            do {
                for (int i = 1; i < 4; i++) {
                    ajska [indice] = new card(figura[figurita]);
                    indice++;
                }
                figurita++;

            }while(figura<4);
        
        }

    }
}

