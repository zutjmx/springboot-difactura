package com.zutjmx.curso.springboot.di.factura.springbootdifactura.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Factura {

    @Autowired
    private Cliente cliente;

    @Value("${factura.descripcion}")
    private String descripcion;
    
    @Autowired
    private List<Item> items;
    
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public List<Item> getItems() {
        return items;
    }
    public void setItems(List<Item> items) {
        this.items = items;
    }
    public int getTotal() {
        //Forma canónica para sumar
        /* int total = 0;
        for (Item item : items) {
            total+=item.getImporte();
        } */

        //Usando el api stream
        return items.stream()
        .map(item -> item.getImporte())
        .reduce(0, (suma, importe) -> suma + importe);
    }
}
