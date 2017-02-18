
package Exercises;

public class Student {
     private String id;
    private Integer credito;
    private Integer puntos;
    
    public Student(){
        id="9999";
        credito=4;
        puntos=12;
        promedio();
    }
    
     public String getId(){
        return id; 
    }
    
    public void setId(String num){
        this.id=num;
    }
    
     public Integer getCredhours(){
        return credito; 
    }
    
    public void setCredhours(Integer cred){
        this.credito=cred;
    }
    
     public Integer getPoints(){
        return puntos; 
    }
    
    public void setPoints(Integer punt){
        this.puntos=punt;
    }
    
   public Integer promedio(){
       return puntos/credito;
   }
}
