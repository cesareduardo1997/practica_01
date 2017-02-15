package Execises;

public class TestSandwich {

    public static void main(String[] args) {

        Sandwich pedido1 = new Sandwich("lechuga", "quesillo", 12);
        System.out.println(pedido1.getRelleno());
        System.out.println(pedido1.getRellenoderrelleno());
        System.out.println(pedido1.getCalorias());

        Sandwich pedido2 = new Sandwich("arroz", "quesillo con jamon", 10);
        System.out.println(pedido2.getRelleno());
        System.out.println(pedido2.getRellenoderrelleno());
        System.out.println(pedido2.getCalorias());

        Sandwich pedido3 = new Sandwich(pedido1, pedido2);

    }
}
