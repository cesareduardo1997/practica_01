package Exercises;

public class Percentages {

    public static void main(String[] args) {
        double n1 = 2.0;
        double n2 = 5.0;
        computePercent(n1, n2);
        computePercent(n2, n1);
    }
    public static double computePercent(double n1, double n2) {
        double porcent = (n2 * 100) / n1;
        System.out.println(n2 + " es el " + porcent + " % de " + n1);
        return porcent;
    }

}
