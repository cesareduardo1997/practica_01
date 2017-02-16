
package Execises;


public class Patient {
  private String id;
  private Integer age;
  private BloodData sangre;

    public Patient() {
        id="0";
        age=0;
        sangre=new BloodData();
    }
    
     public Patient(String id,Integer age,BloodData sangre) {
        this.id=id;
        this.age=age;
        this.sangre=sangre; 
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BloodData getSangre() {
        return sangre;
    }

    public void setSangre(BloodData sangre) {
        this.sangre = sangre;
    }
     
     
    
  
    
}
