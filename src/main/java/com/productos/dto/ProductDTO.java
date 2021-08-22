package com.productos.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class ProductDTO {

    @NotBlank
    private String nombreproducto;
    //Notación para indicar que el tamaño minimo debe ser 0
    private String marcaproducto;
    private String categoriaproducto;
    @Min(0)
    private int precioproducto;
    @Min(0)
    private int cantidadproducto;
    private String urlimagenproducto;

    public ProductDTO() {
    }

    public ProductDTO(String nombreproducto, String marcaproducto, String categoriaproducto, int precioproducto, int cantidadproducto, String urlimagenproducto ) {
    this.nombreproducto = nombreproducto;
    this.marcaproducto = marcaproducto;
    this.categoriaproducto = categoriaproducto;
    this.precioproducto = precioproducto;
    this.cantidadproducto = cantidadproducto;
    this.urlimagenproducto = urlimagenproducto;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public String getMarcaproducto() {
        return marcaproducto;
    }

    public void setMarcaproducto(String marcaproducto) {
        this.marcaproducto = marcaproducto;
    }

    public String getCategoriaproducto() {
        return categoriaproducto;
    }

    public void setCategoriaproducto(String categoriaproducto) {
        this.categoriaproducto = categoriaproducto;
    }

    public int getPrecioproducto() {
        return precioproducto;
    }

    public void setPrecioproducto(int precioproducto) {
        this.precioproducto = precioproducto;
    }

    public int getCantidadproducto() {
        return cantidadproducto;
    }

    public void setCantidadproducto(int cantidadproducto) {
        this.cantidadproducto = cantidadproducto;
    }

    public String getUrlimagenproducto() {
        return urlimagenproducto;
    }

    public void setUrlimagenproducto(String urlimagenproducto) {
        this.urlimagenproducto = urlimagenproducto;
    }
}
