
package GAMEZONE;


public class Die {
    private Integer numAleatorio;

  
    public Integer getNumAleatorio() {
        return numAleatorio;
    }

 
    public static void ValorDado( ){
      Integer  numero = (int)(Math.random() * 100) % 6 + 1;
       System.out.println(numero);
    }

    @Override
    public String toString() {
        return "Die{" + "numAleatorio=" + numAleatorio + '}';
    }
    
}
