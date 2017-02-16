package Execises;

import Execises.Enum.Blood;
import Execises.Enum.Rhfactor;
import java.util.Scanner;

public class TestPatient {

    public static void main(String[] args) {
       Patient paciente1=new Patient();
       BloodData sangre=new BloodData(Blood.AB,Rhfactor.NEGATIVO);
       Patient paciente2=new Patient("5",18,sangre);
       System.out.println(sangre.getTipo());
       System.out.println(paciente2.getSangre().getTipo());
       sangre.setTipo(Blood.O);
       System.out.println(paciente2.getSangre().getTipo());
    }
}
