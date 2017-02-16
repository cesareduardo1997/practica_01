
package Execises;

import Execises.Enum.Blood;
import Execises.Enum.Rhfactor;
import java.util.Scanner;


public class TestBloodData {
     public static void main(String[] args) {
      BloodData sangre = new BloodData();
      
      BloodData sangre2=new BloodData(Blood.A,Rhfactor.POSITIVO);
      System.out.println(sangre.getTipo()+" "+sangre.getRh());
      System.out.println(sangre2.getRh()+" "+sangre2.getTipo());
    }
}
