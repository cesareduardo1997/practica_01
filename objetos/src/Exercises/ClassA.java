
package Exercises;


public class ClassA {
    private Integer b;
    public Integer c;
    static Integer d;
    
    public static void main(String[] args) {
        ClassA obA=new ClassA();
     
        obA.b = 12;
        obA.c = 5; 
        obA.d = 23;
        ClassA.d = 99;
    }
}
