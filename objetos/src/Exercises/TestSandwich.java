
package Exercises;


public class TestSandwich {
     public static void main(String[] args) {
    
        Sandwich desayuno=new Sandwich();
        desayuno.setIngrediente("atun");
        desayuno.setpan("blanco");
        desayuno.setprecio(4.99);
        
        System.out.println(desayuno.getIngrediente());
        System.out.println(desayuno.getpan());
        System.out.println(desayuno.getprecio());
    }
}
