
package Exercises;

public class ShowStudent2 {
     public static void main(String[] args) {
        Student estudiante1=new Student();

        System.out.println("ID:"+estudiante1.getId());
        System.out.println("Horas de crédito ganadas: "+estudiante1.getCredhours());
        System.out.println("Puntos ganados: "+estudiante1.getPoints());
        System.out.println("El Promedio de Punto de Grado es: "+estudiante1.promedio());
    }
    
}
