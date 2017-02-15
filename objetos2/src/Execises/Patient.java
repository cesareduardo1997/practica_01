
package Execises;


public class Patient {
    private Integer ID;
    private String Nombre;
    private String [] RH;
    private String [] tipo;

     public Patient(String RH,String tipo,Integer ID, String Nombre) {

    }
    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
   
    public void Datospaciente(Integer ID,String nombre){
        System.out.println("SU ID ES: "+ID);
        System.out.println("EL NOMBRE DEL PACIENTE: "+nombre);
    }
     public void datos(String sangre, String RH) {
        this.RH = new String[4];
        this.RH[0] = "+";
        this.RH[1] = "-";
        tipo = new String[4];
        tipo[0] = "O";
        tipo[1] = "A";
        tipo[2] = "B";
        tipo[3] = "AB";
        if ((tipo[0].equals(sangre)) && (this.RH[0].equals(RH))) {
            System.out.println(tipo[0] + " " + this.RH[0]);
        } else if ((tipo[0].equals(sangre)) && (this.RH[1].equals(RH))) {
            System.out.println(tipo[0] + " " + this.RH[1]);
        } else if ((tipo[1].equals(sangre)) && (this.RH[0].equals(RH))) {
            System.out.println(tipo[1] + " " + this.RH[0]);
        } else if ((tipo[1].equals(sangre)) && (this.RH[1].equals(RH))) {
            System.out.println(tipo[1] + " " + this.RH[1]);
        } else if ((tipo[2].equals(sangre)) && (this.RH[0].equals(RH))) {
            System.out.println(tipo[2] + " " + this.RH[0]);
        } else if ((tipo[2].equals(sangre)) && (this.RH[1].equals(RH))) {
            System.out.println(tipo[2] + " " + this.RH[1]);
        } else if ((tipo[3].equals(sangre)) && (this.RH[0].equals(RH))) {
            System.out.println(tipo[3] + " " + this.RH[0]);
        } else if ((tipo[3].equals(sangre)) && (this.RH[1].equals(RH))) {
            System.out.println(tipo[3] + " " + this.RH[1]);
        }
    }
}
