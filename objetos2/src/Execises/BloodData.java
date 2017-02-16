package Execises;

import Execises.Enum.Blood;
import Execises.Enum.Rhfactor;


public class BloodData {

    private Blood tipo;

    public Blood getTipo() {
        return tipo;
    }

    public void setTipo(Blood tipo) {
        this.tipo = tipo;
    }

    public Rhfactor getRh() {
        return rh;
    }

    public void setRh(Rhfactor rh) {
        this.rh = rh;
    }
    private Rhfactor rh;

    public BloodData() {
    tipo=Blood.O;
    rh=Rhfactor.POSITIVO;
    }

    public BloodData(Blood t, Rhfactor rh) {
        tipo = t;
        this.rh = rh;
    }
    
    
    
}
