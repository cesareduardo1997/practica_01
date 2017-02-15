
package Execises;


public class TestSandwichFilling {
    public static void main(String[] args) {
        SandwichFilling comida1=new SandwichFilling("jamon",30);
        System.out.println("TIPO DE LLENADO: "+comida1.getTipollenado()+" CALORIAS POR PORCION: "+comida1.getCalorias());
        SandwichFilling comida2=new SandwichFilling("quesillo",10);
        System.out.println("TIPO DE LLENADO: "+comida2.getTipollenado()+" CALORIAS POR PORCION: "+comida2.getCalorias());
        SandwichFilling comida3=new SandwichFilling("milanesa con quesillo",50);
        System.out.println("TIPO DE LLENADO: "+comida3.getTipollenado()+" CALORIAS POR PORCION: "+comida3.getCalorias());
    }
}
