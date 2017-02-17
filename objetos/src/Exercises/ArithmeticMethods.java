package Exercises;
public class ArithmeticMethods {
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 18;
        displayNumberPlus10(n1, n2);
        displayNumberPlus100(n1, n2);
        displayNumberPlus1000(n1, n2);
    }
    public static void displayNumberPlus10(int numero1, int numero2) {
        System.out.println((numero1 + 10) + " " + (numero2 + 10));
    }

    public static void displayNumberPlus100(int numero1, int numero2) {
        System.out.println((numero1 + 100) + " " + (numero2 + 100));
    }
        public static void displayNumberPlus1000(int numero1, int numero2) {
        System.out.println((numero1 + 1000) + " " + (numero2 + 1000));
    }
}
