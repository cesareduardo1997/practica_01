
package Exercises;

public class ShowStudent2 {
     public static void main(String[] args) {
        Student estudiante=new Student();
        estudiante.setId("9999");
        estudiante.setCredhours(3);
        estudiante.setPoints(12);
        estudiante.promedio();
        
        System.out.println("ID:"+estudiante.getId());
        System.out.println("Horas de crédito ganadas: "+estudiante.getCredhours());
        System.out.println("Puntos ganados: "+estudiante.getPoints());
        System.out.println("El Promedio de Punto de Grado es: "+estudiante.promedio());
    }
    
}
