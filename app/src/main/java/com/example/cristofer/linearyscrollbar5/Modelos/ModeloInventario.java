package com.example.cristofer.linearyscrollbar5.Modelos;

public class ModeloInventario {
    private int id;
    private String nombre;
    private String habilidad;
    private int nivelMax;
    private String slot;
    private String rarity;
    private int inventario;
    private String estado;
    private int falta;

    public ModeloInventario() {
    }

    public ModeloInventario(int id, String nombre, String habilidad, int nivelMax, String slot, String rarity, int inventario, String estado, int falta) {
        this.id = id;
        this.nombre = nombre;
        this.habilidad = habilidad;
        this.nivelMax = nivelMax;
        this.slot = slot;
        this.rarity = rarity;
        this.inventario = inventario;
        this.estado = estado;
        this.falta = falta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public int getNivelMax() {
        return nivelMax;
    }

    public void setNivelMax(int nivelMax) {
        this.nivelMax = nivelMax;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getFalta() {
        return falta;
    }

    public void setFalta(int falta) {
        this.falta = falta;
    }
}
