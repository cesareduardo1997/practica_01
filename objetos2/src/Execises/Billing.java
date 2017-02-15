package Execises;

public class Billing {

    private Integer plibro1;
    private Integer cantidad;
    private Integer cupon;

    public Integer getPlibro1() {
        return plibro1;
    }

    public void setPlibro1(Integer plibro1) {
        this.plibro1 = plibro1;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getCupon() {
        return cupon;
    }

    public void setCupon(Integer cupon) {
        this.cupon = cupon;
    }

    public static void computeBill(Integer precio1) {
        Integer total;
        Integer impuesto = (precio1/100)*8;
        total = precio1+impuesto;
        System.out.println("Usted debe " + total);
    }

    public static void computeBill(Integer precio1, Integer cantidad) {
        Integer total;
        Integer impuesto = (precio1/100)*8;
        total = (cantidad * precio1)+ impuesto;
        System.out.println("Usted debe " + total);
    }

    public static void computeBill(Integer precio, Integer cantidad, Integer cupon) {
        Integer total;
        Integer impuesto = (precio/100)*8;
        total = ((cantidad * precio) - cupon)+impuesto;
        System.out.println("Usted debe " + total);
    }

    public static void main(String[] args) {
        Billing libros = new Billing();
        libros.setCantidad(2);
        libros.setCupon(100);
        libros.setPlibro1(200);
        computeBill(libros.getPlibro1());
        computeBill(libros.getPlibro1(), libros.getCantidad());
        computeBill(libros.getPlibro1(), libros.getCantidad(),libros.getCupon());
    }
}
