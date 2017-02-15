
package Execises;


public class Circle {
    private Double radio;
    private Double diametro;
    private Double area;
     
    public Circle(Double radio, Double diametro,Double area){
        if(radio==0.0){
        radio=1.0;
        diametro= 2*radio;
        area = Math.PI * Math.pow(radio,2);
        } else
        diametro= 2*radio;
        area = Math.PI * Math.pow(radio,2);
        this.radio=radio;
        this.diametro=diametro;
        this.area=area;
    }

    Circle() {
        
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio,Double diametro,Double area) {
        this.radio = radio;
        diametro= 2*radio;
        area = Math.PI * Math.pow(radio,2);
       this.diametro=diametro;
        this.area=area;
    }

    public Double getDiametro() {
        return diametro;
    }

    public Double getArea() {
        return area;
    }
    
     
    
}
