package Execises;

import java.util.Scanner;

public class BloodData {

    private String[] RH;
    private String[] tipo;

    public BloodData(String sangre, String RH) {

    }

    public String[] getRH() {
        return RH;
    }

    public void setRH(String[] RH) {
        this.RH = RH;
    }

    public String[] getTipo() {
        return tipo;
    }

    public void setTipo(String[] tipo) {
        this.tipo = tipo;
    }

    public void datos(String sangre, String RH) {
        this.RH = new String[4];
        this.RH[0] = "+";
        this.RH[1] = "-";
        tipo = new String[4];
        tipo[0] = "O";
        tipo[1] = "A";
        tipo[2] = "B";
        tipo[3] = "AB";
        if ((tipo[0].equals(sangre)) && (this.RH[0].equals(RH))) {
            System.out.println(tipo[0] + " " + this.RH[0]);
        } else if ((tipo[0].equals(sangre)) && (this.RH[1].equals(RH))) {
            System.out.println(tipo[0] + " " + this.RH[1]);
        } else if ((tipo[1].equals(sangre)) && (this.RH[0].equals(RH))) {
            System.out.println(tipo[1] + " " + this.RH[0]);
        } else if ((tipo[1].equals(sangre)) && (this.RH[1].equals(RH))) {
            System.out.println(tipo[1] + " " + this.RH[1]);
        } else if ((tipo[2].equals(sangre)) && (this.RH[0].equals(RH))) {
            System.out.println(tipo[2] + " " + this.RH[0]);
        } else if ((tipo[2].equals(sangre)) && (this.RH[1].equals(RH))) {
            System.out.println(tipo[2] + " " + this.RH[1]);
        } else if ((tipo[3].equals(sangre)) && (this.RH[0].equals(RH))) {
            System.out.println(tipo[3] + " " + this.RH[0]);
        } else if ((tipo[3].equals(sangre)) && (this.RH[1].equals(RH))) {
            System.out.println(tipo[3] + " " + this.RH[1]);
        }
    }

   

   
}
