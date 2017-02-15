
package Execises;

public class Sandwich {
   private String relleno;
   private String rellenoderrelleno;
   private Integer calorias;
    public Sandwich(String relleno,String relleno2,Integer calorias){
        this.relleno=relleno;
        this.rellenoderrelleno=relleno2;
        this.calorias=calorias*2;
    }
    public Sandwich(Sandwich d, Sandwich x){
        relleno=d.relleno;
        rellenoderrelleno=d.rellenoderrelleno;
        calorias=d.calorias;
        relleno=x.relleno;
        rellenoderrelleno=x.rellenoderrelleno;
        calorias=x.calorias;
    }

    public String getRelleno() {
        return relleno;
    }

    public String getRellenoderrelleno() {
        return rellenoderrelleno;
    }

    public Integer getCalorias() {
        return calorias;
    }
    
}
