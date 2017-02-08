
package Exercises;

public class ShowStudent {
     public static void main(String[] args) {
        Student estudiante=new Student();
        estudiante.setId("32452");
        estudiante.setCredhours(10);
        estudiante.setPoints(20);
        estudiante.promedio();
        
        System.out.println("ID:"+estudiante.getId());
        System.out.println("Horas de crédito ganadas: "+estudiante.getCredhours());
        System.out.println("Puntos ganados: "+estudiante.getPoints());
        System.out.println("El Promedio de Punto de Grado es: "+estudiante.promedio());
    }
}
