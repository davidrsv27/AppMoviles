package com.example.varios_controles;

public class Mascota {
    private String nombreM;
    private String tipoM;
    private  double costo;

    public Mascota(String nombreM, String tipoM) {
        this.nombreM = nombreM;
        this.tipoM = tipoM;
    }

    public String getNombreM() {
        return nombreM;
    }

    public void setNombreM(String nombreM) {
        this.nombreM = nombreM;
    }

    public String getTipoM() {
        return tipoM;
    }

    public void setTipoM(String tipoM) {
        this.tipoM = tipoM;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    public double pago(){
        double pago=0;
        if(getTipoM()=="perro"){
            pago=3500;
        }else {
            pago=4500;
        }
        return pago;
    }

}
