package com.productos.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class ProductDTO {

    @NotBlank
    private String nombre;
    //Notación para indicar que el tamaño minimo debe ser 0
    @Min(0)
    private String marca;

    public ProductDTO() {
    }

    public ProductDTO(String nombre, String marca) {
        this.nombre =nombre;
        this.marca=marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
