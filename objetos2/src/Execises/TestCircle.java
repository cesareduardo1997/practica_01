
package Execises;


public class TestCircle {
     public static void main(String[] args) {
         Circle circulo1=new Circle();
         circulo1.setRadio(11.5,7.5,6.6);
         System.out.println("radio= "+circulo1.getRadio());
         System.out.println("diametro= "+circulo1.getDiametro());
         System.out.println("area= "+circulo1.getArea());
         Circle circulo2=new Circle(20.5,4.6,5.6);
         System.out.println("radio= "+circulo2.getRadio());
         System.out.println("diametro= "+circulo2.getDiametro());
         System.out.println("area= "+circulo2.getArea());
         Circle circulo3=new Circle(0.0,5.7,4.5);  
         System.out.println("radio= "+circulo3.getRadio());
         System.out.println("diametro= "+circulo3.getDiametro());
         System.out.println("area= "+circulo3.getArea());
     }
}
