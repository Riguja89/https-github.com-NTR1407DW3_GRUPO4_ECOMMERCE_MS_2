package com.productos.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity

@Table(name = "producto", schema = "productos")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idproducto;
    private String nombreproducto;
    private String marcaproducto;
    private String categoriaproducto;
    private int precioproducto;
    private int cantidadproducto;
    private String urlimagenproducto;
    public Product() {
    }

    public Product(String nombre, String marca) {
        this.nombreproducto= nombreproducto;
        this.marcaproducto = marcaproducto;
        this.categoriaproducto = categoriaproducto;
        this.precioproducto = precioproducto;
        this.cantidadproducto = cantidadproducto;
        this.urlimagenproducto = urlimagenproducto;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
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
