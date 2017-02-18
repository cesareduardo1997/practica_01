
package Exercises;


public class Painting {
    private String pintura;
    private String artista;
    private Integer precio;
    private Integer comision;
    
    public Painting(String pintura, String artista, Integer precio) {
        this.pintura = pintura;
        this.artista = artista;
        this.precio = precio;
        this.comision = (precio*20)/100;
    }
    
    public Painting(){
        this.pintura ="oleo";
        this.artista = "tipo de acuarela";
        this.precio = 30;
        this.comision = (this.precio*20)/100;
    }

    public String getPintura() {
        return pintura;
    }

    public void setPintura(String pintura) {
        this.pintura = pintura;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getComision() {
        return comision;
    }

    public void setComision(Integer comision) {
        this.comision = comision;
    }
    
    
}
