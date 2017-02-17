package Exercises;

public class Exercies01 {

    private Integer v;
    private Integer w;
    private Double x;

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public Integer getW() {
        return w;
    }

    public void setW(Integer w) {
        this.w = w;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public static void calculate(int x, double y) {
        System.out.println(x + " " + y);
    }

    public static void main(String[] args) {
        int w = 6;
        int v = 4;
        double x = 2.2;

        calculate(v, w);
        calculate(v, x);

        calculate(18, x);

        calculate(5, 7);

    }

}
