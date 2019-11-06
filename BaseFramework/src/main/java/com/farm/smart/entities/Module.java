package com.farm.smart.entities;

public class Module {
    private String name;
    private int Id;
    private String ubicacion;

    public Module(String name, int Id, String ubicacion){
        this.name = name;
        this.Id = Id;
        this.ubicacion = ubicacion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String region) {
        this.ubicacion = ubicacion;
    }
}
