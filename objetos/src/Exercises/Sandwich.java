
package Exercises;

public class Sandwich {
    private String ingrediente;
    private String pan;
    private Double precio;
   
    public String getIngrediente(){
        return ingrediente; 
    }
    
    public void setIngrediente(String i){
        this.ingrediente=i;
    }
    
    public String getpan(){
        return pan; 
    }
    
    public void setpan(String p){
        this.pan=p;
    }
    
    public Double getprecio(){
        return precio; 
    }
    
    public void setprecio(Double r){
        this.precio=r;
    }
}

