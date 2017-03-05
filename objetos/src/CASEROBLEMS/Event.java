/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CASEROBLEMS;

/**
 *
 * @author Cesar
 */
public class Event {
     static Integer invitado=35;
    static Integer Eventogrando=50;
    private Integer numerodeinvitados;
    private String numerodeevento;
    private Integer precio;

    public void setNumerodeinvitados(Integer numerodeinvitados) {
        this.numerodeinvitados = numerodeinvitados;
    }

    public void setNumerodeevento(String numerodeevento) {
        this.numerodeevento = numerodeevento;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio*this.numerodeinvitados;
    }

    public Integer getNumerodeinvitados() {
        return numerodeinvitados;
    }

    public String getNumerodeevento() {
        return numerodeevento;
    }

    public Integer getPrecio() {
        return precio;
    }
    
    
}
