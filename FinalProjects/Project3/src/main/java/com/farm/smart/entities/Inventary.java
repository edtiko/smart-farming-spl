package com.farm.smart.entities;

public class Inventary {

    private String planta;
    private String modulo;
    private String region;
    private String humedad;
    private String fechaSiembra;
    private String costo;
    private String ph;
    private String timePdn;

    public Inventary(String planta, String modulo, String region, String humedad, String fechaSiembra, String costo, String ph, String timePdn){
         this.planta = planta;
        this.modulo = modulo;
        this.region = region;
        this.humedad = humedad;
        this.fechaSiembra = fechaSiembra;
        this.costo = costo;
        this.ph = ph;
        this.timePdn = timePdn;
    }

    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getHumedad() {
        return humedad;
    }

    public void setHumedad(String humedad) {
        this.humedad = humedad;
    }

    public String getFechaSiembra() {
        return fechaSiembra;
    }

    public void setFechaSiembra(String fechaSiembra) {
        this.fechaSiembra = fechaSiembra;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public String getTimePdn() {
        return timePdn;
    }

    public void setTimePdn(String timePdn) {
        this.timePdn = timePdn;
    }
}
