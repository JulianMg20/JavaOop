package com.servicios;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        if (nombre == null || nombre.isBlank())
            throw new IllegalArgumentException("Nombre inválido");
        if (precio <= 0)
            throw new IllegalArgumentException("Precio inválido");

        this.nombre = nombre;
        this.precio = precio;

    }
}