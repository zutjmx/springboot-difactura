package com.zutjmx.curso.springboot.di.factura.springbootdifactura.models;

public class Item {
    private Producto producto;
    private Integer cantidad;

    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }    
}