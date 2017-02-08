
package Exercises;


public class TestSandwich {
     public static void main(String[] args) {
    
        Sandwich comida=new Sandwich();
        comida.setIngredient("atun");
        comida.setpan("blanco");
        comida.setprecio(8.90);
        
        System.out.println(comida.getIngrediente());
        System.out.println(comida.getpan());
        System.out.println(comida.getprecio());
    }
}
