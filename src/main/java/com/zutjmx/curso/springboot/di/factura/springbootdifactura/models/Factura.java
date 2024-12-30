package com.zutjmx.curso.springboot.di.factura.springbootdifactura.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.zutjmx.curso.springboot.di.factura.springbootdifactura.comun.DataFaker;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Factura {

    @Autowired
    private Cliente cliente;

    @Value("${factura.descripcion}")
    private String descripcion;
    
    @Autowired
    private List<Item> items;

    public Factura() {
        System.out.println("Factura.Factura()");
        System.out.println("Pasando por el constructor de Factura");
        System.out.println("cliente = " + cliente);
        System.out.println("descripcion = " + descripcion);
    }

    @PostConstruct
    public void init() {
        DataFaker dataFaker = new DataFaker();
        cliente = dataFaker.generaCliente();
        descripcion = dataFaker.generaNombreComercio();
        System.out.println("nombre: " + cliente.getNombre());
        System.out.println("paterno: " + cliente.getPaterno());
        System.out.println("materno: " + cliente.getMaterno());
        System.out.println("rfc: " + cliente.getRfc());
        System.out.println("nss: " + cliente.getNss());
        System.out.println("descripcion: " + descripcion);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Factura.destruir()");
        System.out.println("Factura destruida: " + this);
    }
    
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
